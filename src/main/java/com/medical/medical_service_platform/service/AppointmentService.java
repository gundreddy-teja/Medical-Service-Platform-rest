package com.medical.medical_service_platform.service;

import java.util.List;
import com.medical.medical_service_platform.model.Appointment;

public interface AppointmentService {

    Appointment bookAppointment(Appointment appointment);

    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(Long id);

    void cancelAppointment(Long id);
    
    Appointment updateAppointment(Long id, Appointment appointment);
}