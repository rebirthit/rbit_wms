package com.rebirthit.wms.code.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/login")
public class GrpCodeController {
	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory.getLogger(GrpCodeController.class);
	
	public String getGrpCodeList() throws Exception {
		return "/code/grpCode";
	}	
}
