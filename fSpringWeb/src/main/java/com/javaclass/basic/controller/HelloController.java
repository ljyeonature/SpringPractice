package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("start.do")
	public ModelAndView start() {
		System.out.println("start.do 요청");
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/WEB-INF/views/hello.jsp");
		mv.setViewName("hello");
		mv.addObject("dbvalue", "[추후에디비값]");
		mv.addObject("login", "[추후에 사용자 아이디값]");
		
		return mv;
	}

}
