package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.memberDAO;
import kr.hs.study.dto.memberDTO;

@Service
public class memberImpl implements memberInterface {

	
	
	@Autowired
	memberDAO dao;
	
	public void insert(memberDTO dto) {
		// TODO Auto-generated method stub
		dao.insert(dto);

	}
	
	public List<memberDTO> select(){
		return dao.select();
	}
	
	public void update(memberDTO dto) {
		dao.update(dto);
	}

	public memberDTO read(String userid) {
		return dao.read(userid);
	}
	
	public memberDTO delete(String userid) {
		return dao.delete(userid);
	}

}
