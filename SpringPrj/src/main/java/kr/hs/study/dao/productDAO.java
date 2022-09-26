package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.dto.productDTO;


public interface productDAO {
	public void insert(productDTO dto);
	public List<productDTO> select();
	public void update(productDTO dto);
	public productDTO read(int product_id);
	public productDTO delete(int product_id);

}
