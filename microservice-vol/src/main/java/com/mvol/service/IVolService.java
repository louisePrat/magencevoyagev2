package com.mvol.service;


import java.util.List;
import java.util.Optional;

import com.mvol.entities.Vol;

public interface IVolService {
	List<Vol> findAll();
	Optional<Vol> findOne(Long id);
	Vol saveVol(Vol vol);
	void deleteVol(Vol vol);
}
