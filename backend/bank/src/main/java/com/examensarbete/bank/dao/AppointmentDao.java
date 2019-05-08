package com.examensarbete.bank.dao;

import com.examensarbete.bank.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();

    Appointment findAppointmentById(Long Id);
   // Appointment findOne(Long id);
}
