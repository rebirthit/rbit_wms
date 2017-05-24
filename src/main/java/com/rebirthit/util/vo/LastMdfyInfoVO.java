package com.rebirthit.util.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LastMdfyInfoVO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9220050548782011653L;
	
	/**
	 * 최종수정자ID
	 */
	private String LastMdsrId;
	
	/**
	 * 최종수정자명
	 */
	private String LastMdsrNm;
	
	/**
	 * 최종수정일시
	 */
	private String LastMdfyDt;
	
	/**
	 * 최종수정IP
	 */
	private String LastMdfyIp;
}
