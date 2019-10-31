package com.aula24.aula24.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Veiculo {
	@Id
	@GeneratedValue
	private int id_veiculo;

	@OneToOne
	@JoinColumn (name = "id_placa",nullable = false)
	

	private Placa placa;

	public Placa getPlaca() {
		return placa;
	}

	public void setPlaca(Placa placa) {
		this.placa = placa;
	}

	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	@Override
	public String toString() {
		return "Veiculo [id_veiculo=" + id_veiculo + ", placa=" + placa + "]";
	}
	

}
