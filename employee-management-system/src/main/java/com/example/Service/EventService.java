package com.example.Service;

import com.example.Input.EventInput;
import com.example.entity.Employee;
import com.example.entity.Event;
import com.example.repository.EmployeeRepository;
import com.example.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class EventService {

    public EventRepository eventRepository;
    public EmployeeRepository employeeRepository;

    @Autowired
    public EventService(EventRepository eventRepository, EmployeeRepository employeeRepository) {
        this.eventRepository = eventRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Event> findAllEvents(){
        return eventRepository.findAll();
    }

    public List<Event> findEventsByOrganiserId(Long id){
        return eventRepository.findByEmployeeId(id);
    }

    public Event findEventById(Long id){
        return eventRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid ID"));
    }

    public Event addEvent(EventInput eventInput){
        String eventName=eventInput.getEventName();
        Date eventDate=eventInput.getEventDate();
        String eventDay=eventInput.getEventDay();
        String eventLocation=eventInput.getEventLocation();
        String eventDescription=eventInput.getEventDescription();
        Long allocatedFunds=eventInput.getAllocatedFunds();
        Long organizerId=eventInput.getOrganizerId();
        Employee employee=employeeRepository.findById(organizerId)
                .orElseThrow(()-> new IllegalArgumentException("Invalid Organiser ID"));

        Event newEvent=new Event(eventName,eventDate,eventDay,eventLocation,eventDescription,allocatedFunds,employee);
        return eventRepository.save(newEvent);

    }

    public Event updateEvent(EventInput eventInput){
        Event event=eventRepository.findById(eventInput.getId()).orElseThrow(()-> new IllegalArgumentException("Invalid Event ID"));
        if(event!=null){
            if(eventInput.getEventName()!=null)event.setEventName(eventInput.getEventName());
            if(eventInput.getEventDate()!=null)event.setEventDate(eventInput.getEventDate());
            if(eventInput.getEventLocation()!=null)event.setEventLocation(eventInput.getEventLocation());
            if(eventInput.getEventDescription()!=null)event.setEventDescription(eventInput.getEventDescription());
            if(eventInput.getAllocatedFunds()!=null)event.setAllocatedFunds(eventInput.getAllocatedFunds());
            Long organizerId=eventInput.getOrganizerId();
            Employee organizer = employeeRepository.findById(organizerId)
                        .orElseThrow(() -> new IllegalArgumentException("Invalid Organiser ID"));

            event.setEmployee(organizer);
        }
        return eventRepository.save(event);
    }

    public void deleteEventById(Long id){
        eventRepository.deleteById(id);
    }


}
