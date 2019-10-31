package com.aula24.aula24;

import javax.persistence.EntityManager;

import com.aula24.aula24.model.beans.Usuario;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteBuscaPorIdComGetReference {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.getReference(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();

	}

}
