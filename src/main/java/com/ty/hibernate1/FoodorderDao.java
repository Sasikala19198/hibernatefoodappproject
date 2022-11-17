package com.ty.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hibernatereal.FoodOrder;

public class FoodorderDao {
	public FoodOrder saveMenu(FoodOrder foodOrder) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("um");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();

		return foodOrder;
	}

}



