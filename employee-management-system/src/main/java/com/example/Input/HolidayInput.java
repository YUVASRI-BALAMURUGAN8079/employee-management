package com.example.Input;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Date;

@Getter
@Setter
public class HolidayInput {
    public Long id;
    public String holidayName;
    public Date holidayDate;
    public String holidayDay;
    public boolean isFloater;
}
