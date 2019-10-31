package com.aula24.aula24;

import javax.persistence.EntityManager;

import com.aula24.aula24.model.beans.Perfil;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteBuscaPerfilComUsuarioAssociado {

	public static void main(String[] args) {
		EntityManager manager =JPAUtil.getEntityManager();
		Perfil perfil = manager.find(Perfil.class,1L);
		System.out.println("Nome do lima viado:"+ perfil.getUsuario().getNome());
		manager.close();
		JPAUtil.close();

	}

}
