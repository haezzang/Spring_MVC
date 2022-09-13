package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.dto.memberDTO;



@Repository
public class boardDAOImpl implements boardDAO {
	
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	public void insert(boardDTO dto) {
		sqlsession.insert("board.insert_data",dto);

	}

	
	

	

}
