package kr.hs.study.controller;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;

@Controller
public class TestController {

	@GetMapping("/sum")
	public String test1(Model model) {
		int sum=0;
		
		for(int i=1; i<=10; i++)
			sum+=i;
		model.addAttribute("sum", sum);
		return "sum";
	}
	
	
	@GetMapping("/multi_table")
	public String test2() {
		return "multi_table";
	}
	
	@GetMapping("/multi")
	public String test3(Model model,@RequestParam int num) {

		String res="";
		
		for(int i=1; i<10; i++) {
			res+=num+" * "+i+" = "+(num*i)+"<br>";
		}
		model.addAttribute("res", res);
		return "multi";
	}
	
	
	@GetMapping("/score")
	public String test4() {
		return "score";
	}
	
	
	@PostMapping("/score_res")
	public String test5(DataBean bean, Model model) {

		 model.addAttribute("dto", bean);

		return "score_res";
	}
	
	
}
