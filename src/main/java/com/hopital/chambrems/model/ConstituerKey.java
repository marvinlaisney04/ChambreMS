package com.hopital.chambrems.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConstituerKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_chambre")
	private Long chambreId;

	@Column(name="id")
	private Long litId;

	public ConstituerKey() {
		super();
	}

	public Long getChambreId() {
		return chambreId;
	}

	public void setChambreId(Long chambreId) {
		this.chambreId = chambreId;
	}

	public Long getLitId() {
		return litId;
	}

	public void setLitId(Long litId) {
		this.litId = litId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chambreId, litId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConstituerKey other = (ConstituerKey) obj;
		return Objects.equals(chambreId, other.chambreId) && Objects.equals(litId, other.litId);
	}

	
}
