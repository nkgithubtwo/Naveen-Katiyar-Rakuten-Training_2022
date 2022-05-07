package com.tracker.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository repository;

	public void newAppointment(Appointment appointment) {
		float amount;
		if (appointment.getType().ordinal() == 0) {
			amount = appointment.getWeeks() * 500;
		} else if (appointment.getType().ordinal() == 1) {
			amount = appointment.getWeeks() * 1600;
		} else {
			amount = appointment.getWeeks() * 1500;
		}
		appointment.setAmount(amount);
		repository.save(appointment);
	}

	public List<Appointment> getAllAppointments() {
		List<Appointment> appointments = repository.findAll();
		if (appointments.isEmpty()) {
			throw new IndexOutOfBoundsException("No appointment scheduled yet.");
		}
		return appointments;
	}

	public List<Appointment> getAppointmentsByEmail(String email) {
		List<Appointment> appointments = repository.findAllByEmail(email);
		if (appointments.isEmpty()) {
			throw new IndexOutOfBoundsException("No appointment scheduled yet.");
		}
		return appointments;
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}

	public void updateAppointmentById(int id, Appointment appointment) {
		Appointment newAppointment = repository.findById(id).get();

		if (appointment.getName() != null) {
			newAppointment.setName(appointment.getName());
		}
		if (appointment.getAge() != 0) {
			newAppointment.setAge(appointment.getAge());
		}
		if (appointment.getEmail() != null) {
			newAppointment.setEmail(appointment.getEmail());
		}

		if (appointment.getMobileNumber() != null) {
			newAppointment.setMobileNumber(appointment.getMobileNumber());
		}

		if (appointment.getAddress() != null) {
			newAppointment.setAddress(appointment.getAddress());
		}

		if (appointment.getCity() != null) {
			newAppointment.setCity(appointment.getCity());
		}

		if (appointment.getState() != null) {
			newAppointment.setState(appointment.getState());
		}

		if (appointment.getCountry() != null) {
			newAppointment.setCountry(appointment.getCountry());
		}

		if (appointment.getPincode() != null) {
			newAppointment.setPincode(appointment.getPincode());
		}

		repository.save(newAppointment);

	}

}
