package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="holiday")
@Getter
@Setter
@NoArgsConstructor
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="holiday_id")
    public Long id;

    @Column(name="holiday_name")
    public String holidayName;

    @Column(name="holiday_date")
    public Date holidayDate;


    @Column(name="holiday_day")
    public String holidayDay;


    @Column(name="is_floater")
    public boolean isFloater;

    public Holiday(String holidayName, Date holidayDate, boolean isFloater) {
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.isFloater = isFloater;
    }
}
