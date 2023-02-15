package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/* DAO classes are used to write database logic
 * @Repository is used for them .
 DAO(Data Access object)
 
   *
   */
@Repository
public class MyDao 
{

	@Autowired
	SessionFactory factory;
	
	Session session;
	
	
	public List<Question> getQuestion()
	{
		session=factory.openSession();
		System.out.println("session created..");
		List<Question> allQuestions=session.createQuery("from Question").list();
		
		return allQuestions;
	}
	

	public String getPassword(String name) {
		
		session=factory.openSession();
		System.out.println("session created..");
		
		System.out.println(name);
		User user=session.get(User.class,name);  
		if(user==null)
			return null;
		else
			
		return user.getPass();
	}

	public void insert(User user) {
				
		session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
				session.save(user);
		
		tx.commit();
		
		
	}
	
}
