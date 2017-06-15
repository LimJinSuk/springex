package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	/*
	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam("name")String name){// ~/write?name=
		System.out.println("name : "+name);
		return "BoardController:write";
	}*/
	
	@ResponseBody
	@RequestMapping("/write")
	//값을 넣지않을경우 에러페이지를 보여주는 것이 아닌 디폴드값을 설정하여 어떻게든 넘겨주는게 좋음
	//어노테이션 전부 String값으로만 받을 수 있음 ->형변환 필요
	public String write(@RequestParam(value="n",required=true,defaultValue="")String name,
			@RequestParam(value="age",required=true,defaultValue="10")int age){// ~/write?name=
							//변수명,필수입력,초기값,자동 형변환
		System.out.println("name : "+name +"  age : "+age);
		return "BoardController:write";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam String name){// ~/write?name=
		//name,name 같은 이름으로 들어올 경우 생략가능 ("name")
		System.out.println("name : "+name);
		return "BoardController:update";
	}
	
	@ResponseBody
	@RequestMapping("/view/{vo}")
	public String view(@PathVariable(value="no") Long no){
		return "BoardController:view("+no+")";
	}
}
