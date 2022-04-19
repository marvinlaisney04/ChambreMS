package com.hopital.chambrems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hopital.chambrems.model.Chambre;
import com.hopital.chambrems.repository.ChambreRepository;

@Service
public class ChambreService {
   @Autowired
   private ChambreRepository chambreRepository;

   
   public Chambre saveChambre(Chambre chambre) {
	    Chambre savedchambre = chambreRepository.save(chambre);
	       return savedchambre;
	}

}
