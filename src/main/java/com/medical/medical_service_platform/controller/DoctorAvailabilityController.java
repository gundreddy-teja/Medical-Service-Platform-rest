package com.medical.medical_service_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.medical.medical_service_platform.model.DoctorAvailability;
import com.medical.medical_service_platform.service.DoctorAvailabilityService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/availability")
public class DoctorAvailabilityController {

    @Autowired
    private DoctorAvailabilityService service;

    @PostMapping
    public DoctorAvailability addAvailability(@RequestBody DoctorAvailability availability) {
        return service.addAvailability(availability);
    }

    @GetMapping
    public List<DoctorAvailability> getAvailability() {
        return service.getAllAvailability();
    }
}