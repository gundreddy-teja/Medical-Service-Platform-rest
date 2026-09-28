package com.medical.medical_service_platform.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medical_service_platform.exception.ResourceNotFoundException;
import com.medical.medical_service_platform.model.Doctor;
import com.medical.medical_service_platform.repo.DoctorRepository;
import com.medical.medical_service_platform.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id:" +id));
    }

    @Override
    public Doctor updateDoctor(Long id, Doctor doctorDetails) {

        Doctor doctor = getDoctorById(id);

        doctor.setName(doctorDetails.getName());
        doctor.setSpecialization(doctorDetails.getSpecialization());
        doctor.setEmail(doctorDetails.getEmail());
        doctor.setPhone(doctorDetails.getPhone());
        doctor.setExperience(doctorDetails.getExperience());
        doctor.setHospitalName(doctorDetails.getHospitalName());

        return doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
    
    @Override
    public List<Doctor> getDoctorBySpecialization(String specialization) {
        return doctorRepository.findBySpecialization(specialization);
    }
}