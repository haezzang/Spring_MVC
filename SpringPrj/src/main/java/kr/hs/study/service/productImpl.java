package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.productDAO;
import kr.hs.study.dto.productDTO;


@Service
public class productImpl implements productInterface{

	@Autowired
	productDAO dao;
	
	public void insert(productDTO dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);

	}
	
	public List<productDTO> select(){
		return dao.select();
	}
	
	public void update(productDTO dto) {
		dao.update(dto);
	}

	public productDTO read(int product_id) {
		return dao.read(product_id);
	}
	
	public productDTO delete(int product_id) {
		return dao.delete(product_id);
	}


}
