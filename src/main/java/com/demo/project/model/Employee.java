package com.demo.project.model;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 320,nullable = false)
	private String name;
}
