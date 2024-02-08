package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="announcement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="announcement_id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="announcement_date")
    private Date announcementDate;

    @Column(name="announcement_day")
    private String announcementDay;

    @ManyToOne
    @JoinColumn(name="passed_by_emp_id")
    private Employee announcedEmployee;

    @ManyToOne
    @JoinColumn(name="approved_by_emp_id")
    private Employee approvedEmployee;

    public Announcement(String title, String content, Date announcementDate, Employee announcedEmployee, Employee approvedEmployee) {
        this.title = title;
        this.content = content;
        this.announcementDate = announcementDate;
        this.announcedEmployee = announcedEmployee;
        this.approvedEmployee = approvedEmployee;
    }
}
