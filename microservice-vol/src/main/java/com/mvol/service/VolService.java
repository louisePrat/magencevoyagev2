package com.mvol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvol.entities.Vol;
import com.mvol.repositories.VolRepository;

@Service
public class VolService implements IVolService {
	@Autowired
	VolRepository volRepository;

	@Override
	public List<Vol> findAll() {
		return volRepository.findAll();
	}

	@Override
	public Optional<Vol> findOne(Long id) {
		return volRepository.findById(id);
	}

	@Override
	public Vol saveVol(Vol vol) {
		return volRepository.save(vol);
	}

	@Override
	public void deleteVol(Vol vol) {
		volRepository.delete(vol);
	}

}
