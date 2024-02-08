package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employement_mode")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Mode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "mode",cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Mode(String name) {
        this.name = name;
    }
}
