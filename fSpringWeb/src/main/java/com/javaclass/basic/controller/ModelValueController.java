package com.javaclass.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.basic.model.MemberVO;

@Controller
public class ModelValueController {
	
	@Autowired
	private MemberVO memberVO;
	
	@RequestMapping("modelValue.do")
	public ModelAndView modelValue() {
		System.out.println("modelValue.do 요청");
		
		ModelAndView mv = new ModelAndView();
//		views 폴더에 해당 view 이름을 가진 jsp 파일이 있어야 함.
		mv.setViewName("modelValue");
		mv.addObject("vo", memberVO);
		
		return mv;
	}
	
	

}
