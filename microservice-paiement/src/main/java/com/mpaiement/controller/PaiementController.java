package com.mpaiement.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mpaiement.entities.Paiement;
import com.mpaiement.service.IPaiementService;


@RestController
public class PaiementController {
	@Autowired
	IPaiementService paiementService;

	@GetMapping("/paiements")
	public List<Paiement> findAll() {
		return paiementService.findAll();
	}

	@GetMapping("/paiements/{idPaiement}")
	public Optional<Paiement> findOne(@PathParam("idPaiement") Long id) {
		return paiementService.findOne(id);
	}

	@PostMapping("/paiements")
	public Paiement savePaiement(@RequestBody Paiement paiement) {
		return paiementService.savePaiement(paiement);
	}
    @DeleteMapping("/paiements")
	public void deletePaiement(Paiement paiement) {
		paiementService.deletePaiement(paiement);
	}
}
