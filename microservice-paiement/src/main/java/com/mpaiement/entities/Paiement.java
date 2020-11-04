package com.mpaiement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paiement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaiement;

	public Paiement() {
	}

	
	public Long getIdPaiement() {
		return idPaiement;
	}


	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}


}
