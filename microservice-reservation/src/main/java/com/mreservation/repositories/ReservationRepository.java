package com.mreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mreservation.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
