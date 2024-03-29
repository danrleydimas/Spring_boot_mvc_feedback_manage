package com.aula24.aula24.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
      private static EntityManagerFactory factory;
      
      static {
    	  factory = Persistence.createEntityManagerFactory("bossiniPU");
      }
      
      public static EntityManager getEntityManager() {
    	  return factory.createEntityManager();
      }
      
      public static void close() {
    	  factory.close();
      }
}
