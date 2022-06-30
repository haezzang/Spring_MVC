package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	

	@RequestMapping(value="/",method=RequestMethod.GET)
	//get방식으로 /로 접속했을 때 아래 home()함수를 실행해라
	
	public String home() {
		System.out.println("home");
		return "index";
		
	}
	
	
	/*
	 * @RequestMapping(value="/test",method=RequestMethod.GET) //get방식으로 /로 접속했을 때
	 * 아래 test()함수를 실행해라
	 * 
	 * public String test() { System.out.println("test"); return null;
	 * 
	 * }
	 */

}
