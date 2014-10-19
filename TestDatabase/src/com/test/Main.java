package com.test;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("test-pu");
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();
		entityManager.getTransaction().begin();
		Test test = new Test();
		test.setLoginDate(new Timestamp(System.currentTimeMillis()));
		test.setName("Toni");
		test.setPassword("login");
		test.setSurname("Borisov");
		test.setUserId(1);
		test.setUserName("Vlado chikidjiqta");
		entityManager.persist(test);
		entityManager.getTransaction().commit();
	}

}
