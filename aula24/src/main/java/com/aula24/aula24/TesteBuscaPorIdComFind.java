package com.aula24.aula24;

import javax.persistence.EntityManager;

import com.aula24.aula24.model.beans.Usuario;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Usuario u = entityManager.find(Usuario.class, 1L);
		System.out.println(u);
		entityManager.close();
		JPAUtil.close();
	}

}
