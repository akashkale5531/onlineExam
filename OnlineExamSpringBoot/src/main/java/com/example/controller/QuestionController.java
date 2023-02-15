package com.example.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.dao.Answer;
import com.example.dao.Question;

// HashMap hashmap = new HashMap();
// hashmap.put(1,90)
// hashmap.put(1,80);
// LoginController ===>  session.setAttribute("qno",-1);

// QuestionControlller ===> int x= session.getAttribute("qno") + 1;
// session.setAttribute("qno",x);


@Controller
public class QuestionController {
	
	@RequestMapping("/next")
	public ModelAndView next(HttpServletRequest req,HttpServletResponse res)
	{
		
		ModelAndView mv = new ModelAndView();
		
try {
		
		HttpSession session=req.getSession();
		
		int nextQno=(Integer)session.getAttribute("qno") + 1; // 3
			
		ArrayList<Question> al=(ArrayList<Question>)session.getAttribute("questions");
		
		if(nextQno==al.size())
		{			
			
			mv.addObject("message","Question are over . click on previous or click on end exam");
					
		}	
		
		// [qno=2] Session object
		// nextQno=3
		
		
	//ModelAndView mv = new ModelAndView();
		
		mv.setViewName("questions");
		
		if(nextQno<al.size())
		{
			Question question=al.get(nextQno);
	
			mv.addObject("question",question);
				
			System.out.println(question);
			
			session.setAttribute("qno",nextQno);//updating qno from session object
		
			return mv;
		}
		else
		{
			
			Question question=al.get(al.size()-1);
			
			mv.addObject("question",question);
			
			return mv;
		}
}


catch(Exception e)
{
	e.printStackTrace();
}

return mv;
		

}
		
		
		
	
	//submitAns ? qno=2 & submittedAnswer=true & originalAnswer=true & questionText=what is java
	
	@RequestMapping("submitAns")
	public void submitAnswer(Answer answer , HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Inside submitAnswer");
		
		HttpSession session=req.getSession();
				
		System.out.println(answer);
		
		//  Key      Value
		// Qno     Answer
		// 	1      AnswerObject 
		//  2      AnswerObject
		//   HashMap Object
		
		//1  retrieve hashmap object from session getAttribute()
		//2  update or add new entry
		//3  add updated HashMap object in session again using setAttribute()
		
		HashMap<Integer, Answer> hm=(HashMap<Integer, Answer>)session.getAttribute("submittedDetails");
	
		hm.put(answer.qno,answer);
		
		session.setAttribute("submittedDetails",hm);
		
		
	  }
	
	
	
	
	@RequestMapping("/endExam")
	public ModelAndView endExam(HttpServletRequest req,HttpServletResponse res)
	
	{
		HttpSession session=req.getSession();
		
		HashMap<Integer, Answer> hm=(HashMap<Integer, Answer>)session.getAttribute("submittedDetails");
		Collection<Answer> c=hm.values();
		
		for(Answer ans:c)
		{
			System.out.println(ans.submittedAnswer + " " + ans.originalAnswer);
		}
				
		for(Answer obj : c)
		{
			if(obj.originalAnswer.equals(obj.submittedAnswer))
			{
							
				session.setAttribute("score",(Integer)session.getAttribute("score") + 1);
				
			}
		}
		
		String show="Your Score is " + (Integer)session.getAttribute("score");
		System.out.println(show);
	
		return new ModelAndView("Result","userscore", show);
		
		
	}
	
	
	
	@RequestMapping("/previous")
	public ModelAndView previous(HttpServletRequest req,HttpServletResponse res)
	{
		
		
		HttpSession session=req.getSession();
		
		ArrayList<Question> al=(ArrayList<Question>)session.getAttribute("questions");
		
		int preQno=(Integer)session.getAttribute("qno") - 1;
		
		
		if(preQno<0)
			preQno=al.size()-1;
		
		session.setAttribute("qno",preQno);

		
		Question question=al.get(preQno);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("question",question);
		mv.setViewName("questions");
		
		System.out.println(question);
		return mv;
		


		
	}
	
	
	

}
