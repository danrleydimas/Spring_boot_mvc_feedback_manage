package com.aula24.aula24;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.aula24.aula24.model.beans.Perfil;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteRemovePerfilComUsuarioAssociado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil perfil = manager.find(Perfil.class,1L);
		manager.remove(perfil);
		manager.close();
		transaction.commit();
		

	}

}
