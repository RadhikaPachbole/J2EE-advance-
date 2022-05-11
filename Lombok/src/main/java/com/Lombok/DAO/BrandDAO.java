package com.Lombok.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.Lombok.DTO.BrandDTO;

public class BrandDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void OpenConnection() {
		entityManagerFactory=Persistence.createEntityManagerFactory("lombok");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		}
	private static void closeConnections() {
		entityManagerFactory.close();
		entityManager.close();
		try {
			entityTransaction.rollback();
		} catch (Exception e) {
			System.out.println("Transaction Commited.");
		}
		
	}
	
	private static void display(BrandDTO dto, int pk) {
		dto=entityManager.find(BrandDTO.class,pk);
		System.out.println(dto);
		
	}



	public static void main(String[] args) {
		OpenConnection();
		
		entityTransaction.begin();
		 
		 
		  
		  BrandDTO  dto1=new BrandDTO();
		  dto1.setBrandId(6);
		  dto1.setBname("Action");
		  dto1.setContact(9996734676L);
		  
		  BrandDTO  dto2=new BrandDTO();
		  dto2.setBrandId(7);
		  dto2.setBname("Ponds");
		  dto2.setContact(8765687676L);
		  
		  BrandDTO  dto3=new BrandDTO();
		  dto3.setBrandId(8);
		  dto3.setBname("alovira");
		  dto3.setContact(9975644876L);
		  
		  BrandDTO  dto4=new BrandDTO();
		  dto4.setBrandId(9);
		  dto4.setBname("Patanjali");
		  dto4.setContact(7895644676L);
		  
		  BrandDTO  dto5=new BrandDTO();
		  dto5.setBrandId(10);
		  dto5.setBname("Lorial");
		  dto5.setContact(8767864676L);
		  
		 
		  entityManager.persist(dto1);
		  entityManager.persist(dto2);
		  entityManager.persist(dto3);
		  entityManager.persist(dto4);
		  entityManager.persist(dto5);
		  entityTransaction.commit();
		  
		  //Display Record After Insert
		  display(dto1,6);
		  display(dto2,7);
		  display(dto3,8);
		  display(dto4,9);
		  display(dto5,10);
		  
		  //Update 2 Records
		  entityTransaction.begin();
		  dto1.setBname("Oriflame");
		  dto3.setBname("Suger");
		  entityManager.persist(dto1);
		  entityManager.persist(dto3);
		  entityTransaction.commit();
		  
		  //Display All Record along with Updated Record
		  display(dto1,6);
		  display(dto2,7);
		  display(dto3,8);
		  display(dto4,9);
		  display(dto5,10);
		  System.out.println();
		  
		  //Delete One Record
		  entityTransaction.begin();
		  entityManager.remove(dto5);
		  entityTransaction.commit();
		  
		  //Display Record After Delete
		  display(dto1,6);
		  display(dto2,7);
		  display(dto3,8);
		  display(dto4,9);
		  System.out.println();
		  
		  closeConnections();
		  
		  
		  
	}

}
