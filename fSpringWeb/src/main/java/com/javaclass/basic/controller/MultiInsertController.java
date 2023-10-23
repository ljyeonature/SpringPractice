package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.basic.model.MemberList;
import com.javaclass.basic.model.MemberVO;

@Controller
public class MultiInsertController {
	
	@RequestMapping("multiInsert.do")
	public String test(MemberList memberList) 
	{
		for(MemberVO vo :memberList.getList()) {
			System.out.println(vo.toString());
		}
		
//		다른 이름으로 뷰페이지 이름 지정
		// ModelAndView로 지정 가능
		return "listResult";
	}

}
