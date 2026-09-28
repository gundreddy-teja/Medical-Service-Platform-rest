package com.medical.medical_service_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="doctoravailability")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day; // MONDAY, TUESDAY, etc

    private String startTime; // 09:00
    private String endTime;   // 05:00

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}