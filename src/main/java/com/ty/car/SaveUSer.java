package com.ty.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUSer {

public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	User user= new User();
	user.setName("yash");
	user.setEmail("yash@gmail.com");
	user.setPassword(123456);
	user.setGender("male");
	entityTransaction.begin();
	entityManager.persist(user);
	entityTransaction.commit();
	
}

}

