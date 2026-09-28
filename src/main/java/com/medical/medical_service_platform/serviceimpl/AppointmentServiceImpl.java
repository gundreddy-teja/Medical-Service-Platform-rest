package com.medical.medical_service_platform.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.medical_service_platform.model.Appointment;
import com.medical.medical_service_platform.repo.AppointmentRepository;
import com.medical.medical_service_platform.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment bookAppointment(Appointment appointment) {
        appointment.setStatus("BOOKED");
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    @Override
    public void cancelAppointment(Long id) {
        Appointment appointment = getAppointmentById(id);
        appointment.setStatus("CANCELLED");
        appointmentRepository.save(appointment);
        
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {

        Appointment existing = appointmentRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setAppointmentDate(appointment.getAppointmentDate());
            existing.setAppointmentTime(appointment.getAppointmentTime());
            existing.setStatus(appointment.getStatus());
            return appointmentRepository.save(existing);
        }

        return null;
    }
}