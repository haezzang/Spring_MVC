package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.productDTO;

public interface productInterface {
	
	public void insert(productDTO dto);
	public List<productDTO> select();
	public void update(productDTO dto);
	public productDTO read(int product_id);
	public productDTO delete(int product_id);
}



