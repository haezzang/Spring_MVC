package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberDAO {
	public void insert(memberDTO dto);

	public List<memberDTO> select();
	public void update(memberDTO dto);

}
