package com.aula24.aula24.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Placa {
	@Id
	@GeneratedValue
	
	private String indetificador;
	private String cidade;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indetificador == null) ? 0 : indetificador.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placa other = (Placa) obj;
		if (indetificador == null) {
			if (other.indetificador != null)
				return false;
		} else if (!indetificador.equals(other.indetificador))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Placa [indetificador=" + indetificador + ", cidade=" + cidade + "]";
	}
	
	

}
