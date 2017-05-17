package com.rebirthit.wms.login.dao.impl;

import org.springframework.stereotype.Repository;

import com.rebirthit.util.dao.AbstractDAOPostgreSQL;
import com.rebirthit.wms.login.dao.LoginDao;

@Repository("loginDao")
public class LoginDaoImpl extends AbstractDAOPostgreSQL implements LoginDao {

	@Override
	public String testPostgreSQL() throws Exception {
		return (String) selectOne("postgresql.login.getOne");
	}
}
