package com.mpaiement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpaiement.entities.Paiement;
import com.mpaiement.repositories.PaiementRepository;



@Service
public class PaiementService implements IPaiementService {
	@Autowired
	PaiementRepository paiementRepository;

	@Override
	public List<Paiement> findAll() {
		return paiementRepository.findAll();
	}

	@Override
	public Optional<Paiement> findOne(Long id) {
		return paiementRepository.findById(id);
	}

	@Override
	public Paiement savePaiement(Paiement paiement) {
		return paiementRepository.save(paiement);
	}

	@Override
	public void deletePaiement(Paiement paiement) {
		paiementRepository.delete(paiement);
	}

}
