package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.memberDTO;



@Repository
public class memberDAOImpl implements memberDAO {
	
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	public void insert(memberDTO dto) {
		sqlsession.insert("member.insert_data",dto);

	}
	public List<memberDTO> select(){
		return sqlsession.selectList("member.select_data");
	}
	
	public void update(memberDTO dto) {
		sqlsession.update("member.update_data",dto);
	}
	public memberDTO read(String userid){
		
		return sqlsession.selectOne("member.read_data",userid);
		
	}
	
	public memberDTO delete(String userid){
		
		return sqlsession.selectOne("member.delete_data",userid);
		
	}
	

	

}
