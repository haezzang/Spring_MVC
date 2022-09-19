package kr.hs.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.dto.memberDTO;


@Service
public interface boardInterface {
	public void insert(boardDTO dto);
	public List<boardDTO> select();
	public void update(boardDTO dto);
	public boardDTO read(int idx);
	public boardDTO delete(int idx);
}
