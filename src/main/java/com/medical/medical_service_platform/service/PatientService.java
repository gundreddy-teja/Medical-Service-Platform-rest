package com.medical.medical_service_platform.service;

import java.util.List;
import java.util.Optional;

import com.medical.medical_service_platform.model.Patient;

public interface PatientService {

    Patient createPatient(Patient patient);

    List<Patient> getAllPatients();

    Patient getPatientById(Long id);

    void deleteById(Long id);

    Optional<Patient> findById(Long id);

    Patient save(Patient patient);
}