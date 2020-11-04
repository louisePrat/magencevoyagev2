package com.mreservation;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mreservation.entities.Reservation;
import com.mreservation.repositories.ReservationRepository;

@SpringBootApplication
public class MicroserviceReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceReservationApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ReservationRepository reservationRepo) {
		return (args) -> {
			Stream.of(new Reservation()).forEach((v) -> {
				reservationRepo.save(v);
			});
		};

	}

	
}
