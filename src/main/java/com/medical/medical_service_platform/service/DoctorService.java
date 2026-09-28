package com.medical.medical_service_platform.service;

import java.util.List;
import com.medical.medical_service_platform.model.Doctor;

public interface DoctorService {

    Doctor createDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Doctor getDoctorById(Long id);

    Doctor updateDoctor(Long id, Doctor doctor);

    void deleteDoctor(Long id);
    
    List<Doctor> getDoctorBySpecialization(String specialization);
}