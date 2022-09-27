package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.dto.memberDTO;
import kr.hs.study.dto.productDTO;



@Repository
public class productDAOImpl implements productDAO {
	
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	public void insert(productDTO dto) {
		sqlsession.insert("product.insert_data",dto);

	}
	
	public List<productDTO> select(){
		return sqlsession.selectList("product.select_data");
	}
	
	public void update(productDTO dto) {
		sqlsession.update("product.update_data",dto);
	}
	public productDTO read(int productId){
		
		return sqlsession.selectOne("product.read_data",productId);
		
	}
	
	public productDTO delete(int productId){
		
		return sqlsession.selectOne("product.delete_data",productId);
		
	}

	
	

	

}
