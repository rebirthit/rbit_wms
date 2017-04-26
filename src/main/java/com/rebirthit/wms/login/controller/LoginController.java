package com.rebirthit.wms.login.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rebirthit.wms.login.service.LoginService;
import com.rebirthit.wms.login.vo.LoginVO;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Resource(name = "loginService")
	private LoginService loginService;
	
	@RequestMapping(value="/login")
	public String login() throws Exception {
		logger.info("testPostgreSQL || " + loginService.testPostgreSQL());
		
		return "/login/login";
	}
	
	@RequestMapping(value="/loginProc")
	public String loginProc(@ModelAttribute("loginVO") LoginVO loginVO, HttpServletRequest request) throws Exception {
		return "/login/login";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) throws Exception {
		return "/login/login";
	}
}
