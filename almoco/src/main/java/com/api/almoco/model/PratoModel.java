package com.api.almoco.model;

import com.api.almoco.dto.PratoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PratoCliente")
public class PratoModel {
	
 private String proteina,carboidrato,fibra,bebida,gordura,sobremesa;
public PratoModel() {
	
}
public PratoModel(PratoDTO plate) {
	
	this.proteina = plate.proteina() ;
	this.carboidrato = plate.carboidrato();
	this.fibra = plate.fibra();
	this.bebida = plate.bebida();
	this.gordura = plate.gordura();
	this.sobremesa = plate.sobremesa();
}

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	public String getProteina() {
		return proteina;
	}


	public void setProteina(String proteina) {
		this.proteina = proteina;
	}


	public String getCarboidrato() {
		return carboidrato;
	}


	public void setCarboidrato(String carboidrato) {
		this.carboidrato = carboidrato;
	}


	public String getFibra() {
		return fibra;
	}


	public void setFibra(String fibra) {
		this.fibra = fibra;
	}


	public String getBebida() {
		return bebida;
	}


	public void setBebida(String bebida) {
		this.bebida = bebida;
	}


	public String getGordura() {
		return gordura;
	}


	public void setGordura(String gordura) {
		this.gordura = gordura;
	}


	public String getSobremesa() {
		return sobremesa;
	}


	public void setSobremesa(String sobremesa) {
		this.sobremesa = sobremesa;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
}
