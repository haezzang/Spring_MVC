package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.DataBean;

@Repository
public class daoImp1 implements daoInterface{
	
	
	
	@Autowired
	private SqlSessionTemplate sqlsession;
	
	//얘가 실제로 디베에 접속해서 mapper.xml있는 쿼리 날리는 애
	public void insert(DataBean dto) {
		sqlsession.insert("test.insert_data",dto);
	}

	

	public List<DataBean> select(){
		return sqlsession.selectList("test.select_data");
	}
	
	public void update(DataBean dto) {
		sqlsession.insert("test.update_data",dto);
	}

}
