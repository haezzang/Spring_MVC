package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.memberDTO;

import kr.hs.study.service.memberInterface;

@Controller
public class FormController {
	
	@GetMapping("result")
	public String list() {

		return "include/menu";
	}
	

	@Autowired
	private memberInterface memberService;
	
	@GetMapping("/register")
	public String home() {

		return "member/login_form";
	}
	
	@PostMapping("/register")
	public String register(memberDTO dto) {
		System.out.print(dto.getUserid());
		System.out.print(dto.getUpw());
		memberService.insert(dto);

		return "result";
		
	}
	
	@GetMapping("member")
	public String list(Model model) {
		 List<memberDTO> list=memberService.select();
		 model.addAttribute("list",list);
		 return "list";
	}
	
	
	@GetMapping("update")
	   public String update_form(@RequestParam String userid,Model model) {
	      memberDTO list = memberService.read(userid);
	      model.addAttribute("list",list);
	 	 return "update_form";
	   }



	@PostMapping("update")
	   public String update(memberDTO dto) {
		memberService.update(dto);
			return "result";
	   }
	

	@GetMapping("delete")
	   public String delete(@RequestParam String userid) {
	     memberService.delete(userid);
	 	 return "result";
	   }
}

