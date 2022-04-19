package com.hopital.chambrems.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "constituer", uniqueConstraints= @UniqueConstraint(columnNames={"id_chambre", "id"}))

public class Constituer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ConstituerKey constituerId;

	@MapsId("chambreId")
	@JoinColumn(name = "id_chambre")
	@ManyToOne(optional = false, targetEntity = Chambre.class, fetch = FetchType.EAGER)
    private Chambre chambre;
	
	@MapsId("litId")
	@JoinColumn(name = "id")
	@ManyToOne(optional = false, targetEntity = Lit.class, fetch = FetchType.EAGER)
	private Lit lit;
	
	@Column(name = "date_transfert")
	private Date dateTransfert;
	
	@Column(name = "actif")
	private Boolean actif;
	

	public Constituer() {
		super();
	}

	public ConstituerKey getConstituerId() {
		return constituerId;
	}

	public Date getDateTransfert() {
		return dateTransfert;
	}

	public void setDateTransfert(Date dateTransfert) {
		this.dateTransfert = dateTransfert;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public void setConstituerId(ConstituerKey constituerId) {
		this.constituerId = constituerId;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Lit getLit() {
		return lit;
	}

	public void setLit(Lit lit) {
		this.lit = lit;
	}

}
