package com.javassem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cate")
public class CateController {
	
	@RequestMapping("temp.do")
	public String test()
	{
		return "home";
	}

}
