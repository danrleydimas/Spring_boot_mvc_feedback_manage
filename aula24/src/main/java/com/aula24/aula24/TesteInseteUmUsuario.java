package com.aula24.aula24;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.aula24.aula24.model.beans.Usuario;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteInseteUmUsuario {

	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario();
		u.setNome("Danrley Motta");
		u.setEmail("danrley-dimas@hotmail.com");
		u.setFone("96876-5421");
		entityManager.persist(u);
		transaction.commit();
		entityManager.close();
		JPAUtil.close();
		
	}

}
