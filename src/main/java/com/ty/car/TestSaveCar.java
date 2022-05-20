package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Car car= new Car();
//		car.setId(101);
		car.setName("Audi");
		car.setBrand("Audi-16");
		car.setType("non ac");
		car.setCost(5000000);
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("...............................DOne");
		
	}
}