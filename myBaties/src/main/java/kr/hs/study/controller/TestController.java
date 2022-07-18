package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.DataBean;
import kr.hs.study.service.ServiceInterface;


@Controller
public class TestController {

	@Autowired
	private ServiceInterface service;
	
	@GetMapping("/input_data")
	public String test1() {
		return "input";
	}
	
	
	@PostMapping("/re_input")
	public String re_input(DataBean bean) {
		service.insert(bean);
		return "result";	
	}
	@GetMapping("/read_data")
	public String read_data(Model model) {
		 List<DataBean> list=service.select();
		 model.addAttribute("list", list);
		 return "result2";
	}
	
	@GetMapping("/update_data")
	public String update() {
		return "update_data";
	}
	
	@PostMapping("/result3")
	public String re_update(DataBean bean) {
		service.update(bean);
		return "result3";
		
	}
	
	
}
