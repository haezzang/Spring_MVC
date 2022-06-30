package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	// get방식으로 /로 접속했을 때 아래 home()함수를 실행해라

	public String home() {
		System.out.println("home");
		return "index";

	}

	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}

	@GetMapping("/test3")
	public String test3(HttpServletRequest request) {
		request.setAttribute("data1", 300);
		request.setAttribute("data2", 400);
		return "test3";
	}
}
