package com.medical.medical_service_platform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medical.medical_service_platform.model.DoctorAvailability;

public interface DoctorAvailabilityRepository extends JpaRepository<DoctorAvailability, Long> {

}