package com.jsp.Table.Hibernate2DAO;
//ONE TO ONE MAPPING TABLE RELATION-->In same table multiple recored with 1 recored i.e many to one relation but it
//will work in same table in one to one relation in 2 tables one to one not work.
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Table.Hibernate2DTO.employeeDTO;

public class employeeDAO 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private static void OpenConnection() 
	{
	       entityManagerFactory=Persistence.createEntityManagerFactory("tablesrelation");
	       entityManager=entityManagerFactory.createEntityManager();
	       entityTransaction=entityManager.getTransaction();
		
	}
	private static void closeConnection()
	{
		entityManagerFactory.close();
		entityManager.close();
		try {
			entityTransaction.rollback();
			
		} catch (Exception e) {
			System.out.println("The Transaction is Commited");
		}
	}

	public static void main(String[] args)
	{
		OpenConnection();
		
		entityTransaction.begin();
		
		employeeDTO emp1=new employeeDTO();
		emp1.setId(1);
		emp1.setName("Siddhi");
		emp1.setEmail("sidhu@gmail.com");
		emp1.setPhno(8765678765L);
		emp1.setSalary(45000);
		
		entityManager.persist(emp1);
		
		employeeDTO emp2=new employeeDTO();
		emp2.setId(2);
		emp2.setName("Namrata");
		emp2.setEmail("abc123@gmail.com");
		emp2.setPhno(9874567898L);
		emp2.setSalary(23000);
		emp2.setManager(emp1);
		
		entityManager.persist(emp2);
		
		employeeDTO emp3=new employeeDTO();
		emp3.setId(3);
		emp3.setName("Raksha");
		emp3.setEmail("rk123@gmail.com");
		emp3.setPhno(9878654567L);
		emp3.setSalary(16000);
		emp3.setManager(emp1);
         entityManager.persist(emp3);		
         
         entityTransaction.commit();
         closeConnection();
	}

	

	

}
