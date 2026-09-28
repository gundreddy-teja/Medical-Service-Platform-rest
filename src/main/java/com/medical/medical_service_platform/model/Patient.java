package com.medical.medical_service_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private int age;
    private String gender;
    private String address;
    
	public Patient orElseThrow() {
		// TODO Auto-generated method stub
		return null;
	}
}