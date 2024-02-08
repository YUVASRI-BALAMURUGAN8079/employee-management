package com.example.aspect;


import com.example.Service.DetailsService;
import com.example.Service.EmployeeService;
import com.example.annotation.All;
import com.example.annotation.RestrictEmployee;
import com.example.entity.Details;
import com.example.entity.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class SecurityAspect {

    @Autowired
    private DetailsService userService;

    @Autowired
    private EmployeeService employeeService;

    @Before("execution(* com.example.mutation.*.*(..))")
    public void beforeMutation(JoinPoint joinPoint){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Details user = userService.findByEmail(authentication.getName());
        Employee employee = employeeService.findEmployeeByEmployeeId(user.getEmployee().getId());
        if (employee.isWorkingStatus()) {
            System.out.println("User Roles: " + authentication.getAuthorities());
            if (!authentication.getAuthorities().stream().anyMatch(authority -> authority.getAuthority().equals("ROLE_ADMIN"))) {
                System.out.println("Role admin");
                throw new IllegalArgumentException("Access denied for users to edit this content");
            }
        }
        else{
            throw new IllegalArgumentException("The user doesnt exist");
        }
    }

    @Before("execution(* com.example.query.*.*(..))")
    public void beforeQuery(JoinPoint joinPoint){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Details user = userService.findByEmail(authentication.getName());
        if(user!=null) {
            Employee employee = employeeService.findEmployeeByEmployeeId(user.getEmployee().getId());
            System.out.println(employee.isWorkingStatus());
            if (employee.isWorkingStatus()) {
                System.out.println("User Roles: " + authentication.getAuthorities());
                if (authentication.getAuthorities().stream().anyMatch(authority -> authority.getAuthority().equals("ROLE_EMPLOYEE"))) {
                    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
                    Method method = signature.getMethod();
                    if (method.isAnnotationPresent(RestrictEmployee.class)) {
                        Long userId = (Long) joinPoint.getArgs()[0];
//                    Details user = userService.findByEmail(authentication.getName());
                        System.out.println(userId + "/n" + user.getEmployee().getId() + "/n");
                        if (user == null || user.getEmployee().getId().longValue() != userId.longValue()) {
                            throw new IllegalArgumentException("Access denied for viewing the content of other users");
                        }
                    } else if (!method.isAnnotationPresent(All.class)) {
                        throw new IllegalArgumentException("Access denied to view this content");
                    }
                }
            } else {
                throw new IllegalArgumentException("The user is not a current working employee");
            }
        }
        else{
            throw new IllegalArgumentException("The user doesnt exist");
        }
    }
}