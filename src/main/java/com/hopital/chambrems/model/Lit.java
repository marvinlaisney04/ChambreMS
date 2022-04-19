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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lit")
public class Lit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero")
	private Integer numero;
	

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "lit", orphanRemoval = true)
	private List<Constituer> chambreList = new ArrayList<Constituer>();
	

	public List<Constituer> getChambreList() {
		return chambreList;
	}

	public void setChambreList(List<Constituer> chambreList) {
		this.chambreList = chambreList;
	}

	public Lit(Long id, Integer numero) {
		super();
		this.id = id;
		this.numero = numero;
	}

	public Lit() {
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
	
	
	
}
