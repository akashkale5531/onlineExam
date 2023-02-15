package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	
	@RequestMapping("hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping("hi")
	public String hi()
	{
		return "hi";
	}
	
	
	
	
	@RequestMapping("show")
	ModelAndView show()
	{
		ModelAndView  mv = new ModelAndView();
		
		mv.setViewName("show");
		
		List<String> list=Arrays.asList("Spring","MVC","is","easy");
		
		mv.addObject("data",list); // data is model attribute name
		
		return mv;
		
		// int a=10;
	}

	

}
