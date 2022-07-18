package kr.hs.study.service;

import java.util.List;

import kr.hs.study.model.DataBean;

public interface ServiceInterface  {

	public void insert(DataBean bean);
	public List<DataBean> select();
	public void update(DataBean bean);
}
