package com.aula24.aula24;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.aula24.aula24.model.beans.Usuario;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteRemoveUsuario {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = manager.find(Usuario.class, 1L);
		manager.remove(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		
	}

}
