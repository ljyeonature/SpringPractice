package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.basic.model.MemberVO;

@Controller
@RequestMapping("re")
//@RequestMapping("/re")
public class RequestMappingController {
	
	@RequestMapping(value={"/a.do", "/b.do"})
	public String test() {
		System.out.println("re/a.do과 re/b.do 요청받음22");
//		뷰페이지 리턴
		return "hello";
	}
	/******
	 * 스프링컨트롤러에서 리턴값이 String인 경우
	 * - 문자열 전송이 아니라
	 * - 뷰 페이지 지정 
	 */
//	파라미터가 있을 때만
	@RequestMapping(value="/c.do", params= {"id=kim"})
	public void test2(String id) 
	{
		// ****************************
		// 이전화면에서 넘어오는 파라미터 받기
		// 함수의 인자로 지정
		System.out.println("re/c.do?id=kim 요청받음");
		System.out.println("파라미터값 : " + id);
	}
	/*******
	 * 스프링 컨트롤러에서 리턴값이 void인 경우 
	 * - 자동 뷰 페이지 지정
	 * - 요청명과 동일한 경로
	 */
	
//	form의 name부분과 VO 클래스의 멤버변수 이름과 같음 => MemberVO로 가져옴
	@RequestMapping(value="/request.do", method=RequestMethod.GET)
	public void test3(MemberVO vo) 
	{
		System.out.println("request.do GET 요청");
		System.out.println(vo.toString());
	}
	
//	form의 name부분과 VO 클래스의 멤버변수 이름과 같음 => MemberVO로 가져옴
	@RequestMapping(value="/request.do", method=RequestMethod.POST)
	public void test4(@ModelAttribute("vo") MemberVO vo) 
	{
		System.out.println("request.do POST 요청");
		System.out.println(vo.toString());
	}
	
}
