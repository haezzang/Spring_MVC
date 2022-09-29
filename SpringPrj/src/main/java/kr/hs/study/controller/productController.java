package kr.hs.study.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.productDTO;
import kr.hs.study.service.productInterface;

@Controller
public class productController {

	@Autowired
	private productInterface service;

	@GetMapping("/shop")
	public String shop() {
		return "shop";

	}

	@GetMapping("/insert_product")
	public String insert_form() {
		return "shop/insert_product";

	}

	@PostMapping("product/insert")
	public String insert(productDTO dto) {
		String filename = dto.getProductImage().getOriginalFilename();
		String path = "C:\\Springprj\\images\\";

		System.out.print(filename);
		System.out.print(dto.getProductId());
		try {
			new File(path).mkdirs();
			dto.getProductImage().transferTo(new File(path + filename));

		} catch (Exception e) {

			System.out.print(e);
		}
		dto.setProductUrl(filename);
		service.insert(dto);
		return "result";

	}

	@GetMapping("list")
	public String list(Model model) {

		List<productDTO> list = service.select();
		model.addAttribute("list", list);
		return "shop/list";
	}
	
	@GetMapping("product/detail") 
	public String detail(@RequestParam int productId,Model model) { 
		productDTO list = service.read(productId);
		model.addAttribute("list",list); 
		return "shop/detail"; 
		}
	 
	
	
	
}
