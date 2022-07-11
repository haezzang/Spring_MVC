package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	
	@GetMapping("input_data")
	public String test1() {
		return "input";
	}
	
	
	@PostMapping("/re_input")
	@GetMapping("read_data")
	public String test2() {
		return "read";
	}
	
	
	
}
