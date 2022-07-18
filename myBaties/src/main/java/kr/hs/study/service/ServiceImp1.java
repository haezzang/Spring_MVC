package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.model.DataBean;


@Service
public class ServiceImp1 implements ServiceInterface {
	
	@Autowired

	private daoInterface dao;
	
	public void insert(DataBean dto) {
		dao.insert(dto);
		
	}
	
	public List<DataBean> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}
	public void update(DataBean dto) {
		dao.update(dto);
		
	}

}
