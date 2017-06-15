package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	//메서드 단독 매핑
	@ResponseBody //이부분때문에 가능 없으면 리턴의 뷰이름을 찾기때문에? 오류남 바로 바디로 가져가겠다 하는게 필요
	@RequestMapping("/main")
	public String main(){
		
		return "MainController:main";
	}
	
	@ResponseBody 
	@RequestMapping("/main2/a/b/c")
	public String main2(){
		
		return "MainController:main2";
	}
	
	
}
