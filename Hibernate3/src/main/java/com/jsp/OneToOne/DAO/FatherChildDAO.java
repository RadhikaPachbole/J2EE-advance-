package com.jsp.OneToOne.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OneToOne.DTO.ChildDTO;
import com.jsp.OneToOne.DTO.FatherDTO;



public class FatherChildDAO 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection()
	{ 
		entityManagerFactory=Persistence.createEntityManagerFactory("lombok");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	private static void closeConnection() {
		entityManagerFactory.close();
		entityManager.close();
		try {
			entityTransaction.rollback();
		} catch (Exception e) {
			System.out.println("Transaction Commited");
		}
		
	}

	public static void main(String[] args)
	{
		openConnection();
		
		entityTransaction.begin();
		
		ChildDTO child=new ChildDTO();
		child.setName("Radhika");
		child.setAge(22);
		
		ChildDTO child1=new ChildDTO();
		child1.setName("Pallavi");
		child1.setAge(20);
		
		FatherDTO father=new FatherDTO();
		father.setName("Sahadev");
		father.setAge(53);
		father.setChild(child);
		
		FatherDTO father1=new FatherDTO();
		father1.setName("Mahesh");
		father1.setAge(50);
		father1.setChild(child1);
		
		entityManager.persist(child);
		entityManager.persist(father);
		entityManager.persist(child1);
         entityManager.persist(father1);
         
         entityTransaction.commit();
         closeConnection();
	}

}
