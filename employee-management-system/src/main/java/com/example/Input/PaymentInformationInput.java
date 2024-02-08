package com.example.Input;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class PaymentInformationInput {
    private Long paymentInformationId;
    private Long employeeId;
    private String salaryPaymentMode;
    private String bankName;
    private String accountNumber;
    private String ifscCode;
    private String nameOfTheAccount;
    private boolean pfStatus;
    private String pfNumber;
    private Date pfJoinDate;
    private String nameOnThePFAccount;
}

