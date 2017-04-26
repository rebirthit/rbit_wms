package com.rebirthit.wms.login.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rebirthit.wms.login.dao.LoginDao;
import com.rebirthit.wms.login.service.LoginService;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("loginService")
public class LoginServiceImpl extends EgovAbstractServiceImpl implements LoginService {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Resource(name = "loginDao")
	private LoginDao loginDao;
	
	@Override
	public String testPostgreSQL() throws Exception {
		logger.info("testPostgreSQL");
		// TODO Auto-generated method stub
		return loginDao.testPostgreSQL();
	}

}
