package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@ResponseBody
	//타입+메서드 매핑
	@RequestMapping("/joinform")
	public String joinform(){
		return "UserController:joinform";
	}
	
	@ResponseBody
	//타입+메서드 매핑
	//URL두개  매핑
	@RequestMapping({"/join","/dojoin"})//value="/join" value생략된것
	public String doJoin(){
		return "UserController:doJoin";
	}
	

	//타입+메서드 매핑
	@RequestMapping(value="/login",method = RequestMethod.GET )
	public String login(){
		//forwording
		return "/WEB-INF/views/login.jsp";
	}
	
	/*@ResponseBody
	//타입+메서드 매핑
	@RequestMapping(value="/login",method = RequestMethod.POST )
	public String login(String email, String password){
		return "UserController:login(String,String)";
	}//URL이 같지만 방식에따라 오버로딩 
	*/
	

	//타입+메서드 매핑
	@RequestMapping(value="/login",method = RequestMethod.POST )
	public String login(@ModelAttribute UserVo userVo){
		//파라미터로 넘어온 이메일과 패스워드를 UserVo객체의 변수와 매칭(이름 동일)
		System.out.println(userVo);
		return "redirect:/main";
	}


}
