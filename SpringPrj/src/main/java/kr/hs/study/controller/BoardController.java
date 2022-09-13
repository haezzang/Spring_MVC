package kr.hs.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.dto.memberDTO;
import kr.hs.study.service.boardInterface;
import kr.hs.study.service.memberInterface;

@Controller
public class BoardController {
	@Autowired
	private boardInterface boardService;
	
	//¸®½ºÆ®
	@GetMapping("board")
	public String list() {	
		return "board/index";
	}
	
	@GetMapping("write")
	public String insert() {	

		return "board/write_form";
	}
	
	@PostMapping("insert")
	public String register(boardDTO dto) {
		System.out.print(dto.getWriter());
		boardService.insert(dto);

		return "result";
		
	}
}
