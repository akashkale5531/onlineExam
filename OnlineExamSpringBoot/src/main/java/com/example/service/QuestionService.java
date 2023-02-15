package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MyDao;
import com.example.dao.Question;
import com.example.dao.User;

/* Business logic methods should be written in Service Class , 
 * which is annonated with @Service annotation
 * 
 * In service class , we define reference of DAO class .
 * 
 * */
@Service
public class QuestionService {

	@Autowired
	MyDao dao;
		
	public List<Question> getAllQuestions()
	{
		return dao.getQuestion();
		
	}
	
	
	public boolean validate(User user)
	{
		String dbPassword=dao.getPassword(user.getName());
		
		if(dbPassword==null)
			return false;
		
		if(dbPassword.equals(user.getPass()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	public void insert(User user) {
		dao.insert(user);
		
	}
}
// Browser ==> Controller==> Service==> DAO