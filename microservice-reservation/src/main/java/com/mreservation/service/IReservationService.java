package com.mreservation.service;


import java.util.List;
import java.util.Optional;

import com.mreservation.entities.Reservation;

public interface IReservationService {
	List<Reservation> findAll();
	Optional<Reservation> findOne(Long id);
	Reservation saveReservation(Reservation reservation);
	void deleteReservation(Reservation reservation);
}
