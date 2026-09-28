package com.medical.medical_service_platform.service;

import java.util.List;
import com.medical.medical_service_platform.model.DoctorAvailability;

public interface DoctorAvailabilityService {

    DoctorAvailability addAvailability(DoctorAvailability availability);

    List<DoctorAvailability> getAllAvailability();

}