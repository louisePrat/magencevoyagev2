package com.mreservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mreservation.entities.Reservation;
import com.mreservation.repositories.ReservationRepository;




@Service
public class ReservationService implements IReservationService {
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public Optional<Reservation> findOne(Long id) {
		return reservationRepository.findById(id);
	}

	@Override
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public void deleteReservation(Reservation reservation) {
		reservationRepository.delete(reservation);
	}

}
