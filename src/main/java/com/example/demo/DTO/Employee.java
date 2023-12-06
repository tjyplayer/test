package com.example.demo;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String name;
    private String gender;
    private LocalDate birthday;
    private String mail;
    private String tel;
    private String address;

}
