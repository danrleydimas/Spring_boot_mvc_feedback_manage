package com.aula24.aula24;

import javax.persistence.EntityManager;

import com.aula24.aula24.model.beans.Usuario;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteBuscaUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close(); 
	}

}
