package com.medical.medical_service_platform.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.medical_service_platform.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecialization(String specialization);

}