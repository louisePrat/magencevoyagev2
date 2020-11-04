package com.mreservation.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mreservation.entities.Reservation;
import com.mreservation.service.IReservationService;


@RestController
public class ReservationController {
	@Autowired
	IReservationService paiementService;

	@GetMapping("/reservations")
	public List<Reservation> findAll() {
		return paiementService.findAll();
	}

	@GetMapping("/reservations/{idReservation}")
	public Optional<Reservation> findOne(@PathParam("idReservation") Long id) {
		return paiementService.findOne(id);
	}

	@PostMapping("/reservations")
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		return paiementService.saveReservation(reservation);
	}
    @DeleteMapping("/reservations")
	public void deleteReservation(Reservation reservation) {
		paiementService.deleteReservation(reservation);
	}
}
