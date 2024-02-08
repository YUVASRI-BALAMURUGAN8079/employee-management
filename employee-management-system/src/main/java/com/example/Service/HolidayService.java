package com.example.Service;

import com.example.Input.HolidayInput;
import com.example.entity.Holiday;
import com.example.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class HolidayService {

    public HolidayRepository holidayRepository;

    @Autowired

    public HolidayService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }
    public List<Holiday>  findAllHolidays(){
        return holidayRepository.findAll();
    }

    public Holiday findHolidayById(Long id){
        return holidayRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
    }

    public Holiday addHoliday(HolidayInput holidayInput){
        String holidayName=holidayInput.getHolidayName();
        Date holidayDate=holidayInput.getHolidayDate();
        //public String holidayDay;
        boolean isFloater=holidayInput.isFloater();
        Holiday newHoliday=new Holiday(holidayName,holidayDate,isFloater);
        return holidayRepository.save(newHoliday);
    }

    public Holiday updateHoliday(HolidayInput holidayInput){
        Holiday newHoliday=holidayRepository.findById(holidayInput.getId()).orElse(null);
        if(newHoliday!=null){
            if(holidayInput.getHolidayName()!=null)newHoliday.setHolidayName(holidayInput.getHolidayName());
            if(holidayInput.getHolidayDate()!=null)newHoliday.setHolidayDate(holidayInput.getHolidayDate());
            if(newHoliday.isFloater()!=holidayInput.isFloater) newHoliday.setFloater(holidayInput.isFloater());
        }
        return holidayRepository.save(newHoliday);
    }

    public void deleteHolidayById(Long id){
        holidayRepository.deleteById(id);
    }
}
