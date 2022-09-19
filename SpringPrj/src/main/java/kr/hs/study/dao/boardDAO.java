package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.boardDTO;


public interface boardDAO {
	public void insert(boardDTO dto);
	public List<boardDTO> select();
	public void update(boardDTO dto);
	public boardDTO read(int idx);
	public boardDTO delete(int idx);

}
