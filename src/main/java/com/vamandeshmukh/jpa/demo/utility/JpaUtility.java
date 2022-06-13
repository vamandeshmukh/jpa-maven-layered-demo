package com.vamandeshmukh.jpa.demo.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
	private static EntityManager entityManager;

	public static EntityManager getEntityManager() {
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
			System.out.println("entityManager object created.");
		}
		return entityManager;
	}

}
