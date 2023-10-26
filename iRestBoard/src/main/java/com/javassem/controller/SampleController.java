package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

//@Controller
@RestController // @Controller + @ResponseBody
public class SampleController {
	
//	@RequestMapping(value="getText", method=RequestMethod.GET)
//	@ResponseBody
	@GetMapping(value="getText",produces="text/plain;charset=UTF-8")
	public String getText() {
		return "컨트롤러에서 보냄";
	}
	
	@GetMapping(value="getObject")
	public SampleVO getObject() {
		SampleVO vo = new SampleVO("홍길동", 25, "오늘도 즐깁시다");
		return vo;
	}
	
	@GetMapping(value="getList")
	public List<SampleVO> getList() {
		List<SampleVO> list = new ArrayList<SampleVO>();
		list.add(new SampleVO("홍길동", 22, "우리조화이팅"));
		list.add(new SampleVO("홍길자", 32, "맛점"));
		list.add(new SampleVO("홍길숙", 42, "우리조..."));
		return list;
	}
	
	@GetMapping(value="sample/{cate}/{cno}")
	public String getPath(@PathVariable String cate, @PathVariable Integer cno) {
		return cate + "[" + cno + "]" + " fighting";
	}
	
	@PostMapping(value="sample/data")
	public SampleVO post(SampleVO vo) {
		System.out.println("[확인]" + vo);
		return vo;
	}
}
