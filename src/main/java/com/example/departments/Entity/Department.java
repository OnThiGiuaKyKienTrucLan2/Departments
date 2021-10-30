package com.example.departments.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Departments")
public class Department {
    @Id
    @GeneratedValue
    private Long departmentId;
    private String departmentName;
}
