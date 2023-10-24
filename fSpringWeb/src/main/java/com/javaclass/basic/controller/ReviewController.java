package com.javaclass.basic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	
	/****************
	 * 스프링웹에서 뷰 페이지 지정하는 방식
	 * 1) ModelAndView 지정해서 리턴
	 * 2) 뷰페이지명을 String 리턴
	 * 3) 자동지정 : 리턴형이 void인 경우
	 */
	
	/************************
	 * 컨트롤러에서 뷰페이지로 데이터 보내는 방식
	 * 1) ModelAndView에 지정하고 리턴하는 방법
	 * 2) Model 객체에 지정하는 방식
	 */
	
	@RequestMapping("/test1.do")
	public ModelAndView test1() {
		// 1) ModelAndView 지정해서 리턴
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		// 1) ModelAndView에 지정하고 리턴하는 방법
		mv.addObject("dbvalue", "중요한디비값");
		mv.addObject("login", "홍길동");
		return mv;
	}
	
	@RequestMapping("/test2.do")
	public String test2(Model m) {
		// 2) Model 객체에 지정하는 방식(인자)
		// 2) 뷰페이지명을 String 리턴
		m.addAttribute("dbvalue", "중요한값");
		return "select";
	}
	// 세션 처리 : 로그인할 때
	@RequestMapping("/test3.do")
	public void test3(Model m, HttpSession session) {
		// 3) 자동지정 : 리턴형이 void인 경우
		m.addAttribute("message", "오늘도 화이팅!");
		session.setAttribute("myid", "홍길동");
	}

}
