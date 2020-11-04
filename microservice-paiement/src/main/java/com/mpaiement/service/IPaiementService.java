package com.mpaiement.service;


import java.util.List;
import java.util.Optional;

import com.mpaiement.entities.Paiement;

public interface IPaiementService {
	List<Paiement> findAll();
	Optional<Paiement> findOne(Long id);
	Paiement savePaiement(Paiement paiement);
	void deletePaiement(Paiement paiement);
}
