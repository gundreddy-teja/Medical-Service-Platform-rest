package com.medical.medical_service_platform.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medical_service_platform.model.DoctorAvailability;
import com.medical.medical_service_platform.repo.DoctorAvailabilityRepository;
import com.medical.medical_service_platform.service.DoctorAvailabilityService;

@Service
public class DoctorAvailabilityServiceImpl implements DoctorAvailabilityService {

    @Autowired
    private DoctorAvailabilityRepository repository;

    @Override
    public DoctorAvailability addAvailability(DoctorAvailability availability) {
        return repository.save(availability);
    }

    @Override
    public List<DoctorAvailability> getAllAvailability() {
        return repository.findAll();
    }
}