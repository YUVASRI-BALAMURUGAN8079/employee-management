package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="events")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long id;

    @Column(name="event_name")
    private String eventName;

    @Column(name="event_date")
    private Date eventDate;

    @Column(name="event_day")
    private String eventDay;

    @Column(name="event_location")
    private String eventLocation;

    @Column(name="event_description")
    private String eventDescription;

    @Column(name="allocated_funds")
    private Long allocatedFunds;

    @ManyToOne
    @JoinColumn(name="organizer_id")
    private Employee employee;

    public Event(String eventName, Date eventDate, String eventDay, String eventLocation, String eventDescription, Long allocatedFunds, Employee employee) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDay = eventDay;
        this.eventLocation = eventLocation;
        this.eventDescription = eventDescription;
        this.allocatedFunds = allocatedFunds;
        this.employee = employee;
    }
}
