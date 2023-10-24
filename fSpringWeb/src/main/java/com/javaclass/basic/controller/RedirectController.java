package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

//	게시글 작성하기
	@RequestMapping(value="insert.do")
	public String insert() {

		System.out.println("insert.do 요청");
		/*************************
		 * 스프링에서 리다이렉팅 하려면
		 * 	- return 문자열 할 때 지정
		 */
//		return "select"; // 이것은 안됨 => 뷰페이지 지정(insert.do)
		// 이렇게 하면, DB의 데이터가 들어가지 않음 => 왜? => 바로 페이지를 지정했으니깐
		return "redirect:select.do"; // redirect =>  (select.do)
		// 이렇게 하면 select.do로 가게 되어 아래의 select()를 통한 다음 db 데이터가 들어감. 
		// 그 다음 => select.jsp페이지로 이동
	}
//	게시글 리스트 보여주기
	@RequestMapping(value="select.do")
	public void select(Model m) {
		
		System.out.println("select.do 요청");
		/*
		 * 뷰페이지로 모델(데이터) 보내는 방식
		 * 1. ModelAndView 지정하여 리턴
		 * 2. 리턴값이 void/String인 경우 
		 * 	  ====> Model 객체 이용
		 */
		m.addAttribute("dbvalue", "추후에 디비값");
	}

}
