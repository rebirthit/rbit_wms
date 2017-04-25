package com.rebirthit.wms.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rebirthit.wms.login.vo.LoginVO;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login")
	public String login() throws Exception {
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
