package com.ty.car;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestReviewCar {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	Review review = new Review();
	review.setSubject("worth for money");
	review.setContent("product is good .I am using past six month and no complaints");
	review.setWriteName("Venki");
	entityTransaction.begin();
	entityManager.persist(review);
	entityTransaction.commit();
}
}
