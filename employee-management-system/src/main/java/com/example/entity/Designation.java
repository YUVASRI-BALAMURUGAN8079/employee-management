package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "designation",cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Designation(String name) {
        this.name = name;
    }
}
