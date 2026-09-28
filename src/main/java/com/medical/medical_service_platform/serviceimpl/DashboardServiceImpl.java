package com.medical.medical_service_platform.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medical_service_platform.repo.PatientRepository;
import com.medical.medical_service_platform.repo.DoctorRepository;
import com.medical.medical_service_platform.repo.AppointmentRepository;
import com.medical.medical_service_platform.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Map<String, Long> getDashboardStats() {

        Map<String, Long> stats = new HashMap<>();

        try {
            stats.put("patients", patientRepository.count());
            stats.put("doctors", doctorRepository.count());
            stats.put("appointments", appointmentRepository.count());
        } catch (Exception e) {
            throw new RuntimeException("Error fetching dashboard stats: " + e.getMessage());
        }

        return stats;
    }
}