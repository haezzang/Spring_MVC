package kr.hs.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hs.study.dto.memberDTO;


@Service
public interface memberInterface {
	
	public void insert(memberDTO dto);
	public List<memberDTO> select();
	public void update(memberDTO dto);
	public memberDTO read(String userid);
	public memberDTO delete(String userid);
}
