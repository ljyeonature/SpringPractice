package com.javaclass.basic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.basic.model.MemberVO;

@Controller
public class ParameterController {
	
	/*
	 * request url : param.do
	 * parameter   : id, age
	 * view page   : 자동으로 param.jsp
	 */
	@RequestMapping(value="/param.do")
	public void test1(String id, Integer age) 
	{
		System.out.println(id);
		System.out.println(age);
	}
	
	/*
	 * request url : paramForm.do
	 * parameter   : id/name/age
	 * view page   : 자동으로 formResult.jsp
	 */
	@RequestMapping(value="/paramForm.do")
	public String test2(MemberVO vo, HttpSession session) 
	{
		
		/*****************
		 * 스프링에서 세션을 사용하려면
		 * 인자에 HttpSession 변수만 선언
		 */
		
		String dbid 	= "javajjang";
		String dbname 	= "홍길동";
		
		if(vo.getId().equals(dbid) && vo.getName().equals(dbname)) {
			session.setAttribute("login",dbid);
		}
		System.out.println(vo.toString());
		return "formResult";
	}

}
