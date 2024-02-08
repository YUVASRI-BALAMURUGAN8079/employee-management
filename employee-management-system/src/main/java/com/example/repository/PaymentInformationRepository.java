package com.example.repository;

import com.example.entity.PaymentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInformationRepository extends JpaRepository<PaymentInformation,Long> {

    PaymentInformation findByEmployeeId(Long id);

}
