package com.ty.car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Testgetuser {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Query query=entityManager.createQuery("SELECT u FROM User u WHERE u.name=?1 AND u.email=?2");
		query.setParameter(1, "venki");
		query.setParameter(2, "vkvenkatesh");
		List<User> user =query.getResultList();
		if(user.size()>0){
		for(User user1 : user){
			System.out.println("name is: "+user1.getName());
			System.out.println("email is"+user1.getEmail());	
			}
		}else{
			System.out.println("invalidusername and email");
			
			
		}
	}
}
