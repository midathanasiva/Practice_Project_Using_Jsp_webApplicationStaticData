package com.example.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller



public class Controller1 {
	@RequestMapping("/add")
	public String add()
	{
		System.out.println("this si Siva");
		/* return "course.jsp"; */
		return "course"; 
	}

}
