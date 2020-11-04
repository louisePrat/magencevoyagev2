package com.mpaiement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpaiement.entities.Paiement;


@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long>{

}
