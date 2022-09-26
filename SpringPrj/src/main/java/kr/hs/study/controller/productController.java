package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class productController {

	
	
	@GetMapping("/shop")
	public String shop() {
			return "shop";
		
	}
	
	
	@GetMapping("/insert_form")
	public String insert_form() {
			return "shop/insert_form";
		
	}
	
	
	@PostMapping("/insert")
	public String insert() {
		
		System.out.print("home");
			return "result";
		
	}
}
