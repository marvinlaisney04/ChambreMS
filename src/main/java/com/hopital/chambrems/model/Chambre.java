package com.hopital.chambrems.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "chambre")
public class Chambre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "nombre_lits")
	private Integer nombreLits;
	
	@Column(name = "id_service")
	private Long idService;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "chambre", orphanRemoval = true)
	private List<Constituer> litList = new ArrayList<Constituer>();

	public List<Constituer> getLitList() {
		return litList;
	}

	public void setLitList(List<Constituer> litList) {
		this.litList = litList;
	}

	public Chambre(Long id, Integer numero, Integer nombreLits, Long idService) {
		super();
		this.id = id;
		this.numero = numero;
		this.nombreLits = nombreLits;
		this.idService = idService;
	}

	public Chambre() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNombreLits() {
		return nombreLits;
	}

	public void setNombreLits(Integer nombreLits) {
		this.nombreLits = nombreLits;
	}

	public Long getIdService() {
		return idService;
	}

	public void setIdService(Long idService) {
		this.idService = idService;
	}

}
