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

	public productDTO read(int productId) {
		return dao.read(productId);
	}
	
	public productDTO delete(int productId) {
		return dao.delete(productId);
	}


}
