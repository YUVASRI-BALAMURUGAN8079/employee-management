package com.example.Input;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Date;

@Getter
@Setter
public class AnnouncementInput {
    private Long id;
    private String title;
    private String content;
    private Date announcementDate;
    private String announcementDay;
    private Long announcedEmployeeId;
    private Long approvedEmployeeId;
}
