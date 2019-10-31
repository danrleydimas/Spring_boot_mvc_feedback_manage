package com.aula24.aula24;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.aula24.aula24.model.beans.Consumo;
import com.aula24.aula24.model.beans.Feedback;
import com.aula24.aula24.persistence.JPAUtil;

public class TesteInsereDoisConsumoUmFeedback {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Feedback f = new Feedback();
		f.setDescricao("curti");
		List <Consumo> consumos = new ArrayList<>();
		Consumo c1 = new Consumo();
		c1.setDatahora(new Date());
		c1.setFeedback(f);
		Consumo c2 = new Consumo();
		c2.setDatahora(new Date());
		c2.setFeedback(f);
		consumos.add(c1);
		consumos.add(c2);
		f.setConsumo(consumos);
		manager.persist(f);
		transaction.commit();
		manager.close();
		JPAUtil.close();

	}

}
