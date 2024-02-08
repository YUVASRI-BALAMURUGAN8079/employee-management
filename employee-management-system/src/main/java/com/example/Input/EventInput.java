package com.example.Input;

import com.example.entity.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Getter
@Setter
public class EventInput {
    private Long id;
    private String eventName;
    private Date eventDate;
    private String eventDay;
    private String eventLocation;
    private String eventDescription;
    private Long allocatedFunds;
    private Long organizerId;
}
