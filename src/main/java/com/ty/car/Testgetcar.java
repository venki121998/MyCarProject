package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Testgetcar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Query query=entityManager.createQuery("SELECT u FROM Car u WHERE u.brand=?1 AND u.type=?2");
		query.setParameter(1, "Audi-16");
		query.setParameter(2, "ac");
		List<Car> cars =query.getResultList();
		if(cars.size()>0){
			
			for(Car car : cars){
				
				
				System.out.println("brand is: "+car.getBrand());
				System.out.println("email is: "+car.getName());
				
		}
			
		}
		else
		{
			System.out.println("sorry no car");
		}
	}

}
