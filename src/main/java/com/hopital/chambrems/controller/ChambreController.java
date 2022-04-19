package com.hopital.chambrems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hopital.chambrems.model.Chambre;
import com.hopital.chambrems.repository.ChambreRepository;

@RestController
@RequestMapping
public class ChambreController {
	
	@Autowired
	private ChambreRepository chambreRepository;
	
	@PostMapping("/chambre")
	public Chambre createChambre(@RequestBody Chambre chambre) {
		return this.chambreRepository.save(chambre);
	}

}
