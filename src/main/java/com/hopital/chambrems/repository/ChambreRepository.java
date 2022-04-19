package com.hopital.chambrems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hopital.chambrems.model.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long>{

}
