package com.tour.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class PlanDAO {
	

	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) throws Exception{
		this.sessionTemplate = sessionTemplate;
	}	
	
}
