package com.rebirthit.wms.login.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginVO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 545611624290598039L;

	/**
	 * 회원ID
	 */
	private String memId;
	
	/**
	 * 회원비밀번호
	 */
	private String memPwd;
	
	/**
	 * 암호화된 회원비밀번호
	 */
	private String encMemPwd;
	
	/**
	 * 회원명
	 */
	private String memNm;
	
	/**
	 * 사이트코드
	 */
	private String siteCd;
	
	/**
	 * 로그인 후 이동할 URL
	 */
	private String forwardURL;
}
