package com.aula24.aula24.model.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_feedback")
public class Feedback {
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	

	public Feedback() {
		super();
	}

	@OneToMany(mappedBy = "feedback")
	private List<Consumo> consumo;

	public List<Consumo> getConsumo() {
		return consumo;
	}


	public void setConsumo(List<Consumo> consumo) {
		this.consumo = consumo;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
