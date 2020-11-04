package com.mvol.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvol.configurations.ApplicationPropertiesConfiguration;
import com.mvol.entities.Vol;
import com.mvol.service.IVolService;

@RestController
public class VolController {
	@Autowired
	IVolService volService;
	@Autowired
	ApplicationPropertiesConfiguration applicationPropertiesConfiguration;

	@GetMapping("/vols")
	public List<Vol> findAll() {
		List<Vol> vols=volService.findAll();
		List<Vol> listeLimitee=vols.subList(0, applicationPropertiesConfiguration.getLimitDeVols());
		return listeLimitee;
	}

	@GetMapping("/vols/{idVol}")
	public Optional<Vol> findOne(@PathParam("idVol") Long id) {
		return volService.findOne(id);
	}

	@PostMapping("/vols")
	public Vol saveVol(@RequestBody Vol vol) {
		return volService.saveVol(vol);
	}

	@DeleteMapping("/vols")
	public void deleteVol(Vol vol) {
		volService.deleteVol(vol);
	}
}
