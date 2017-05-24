package com.rebirthit.wms.code.vo;

import java.io.Serializable;

import com.rebirthit.util.vo.LastMdfyInfoVO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class GrpCodeVO extends LastMdfyInfoVO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3893078501516842163L;

	/**
	 * 사이트코드
	 */
	private String siteCd;
	
	/**
	 * 그룹코드
	 */
	private String grpCd;
	
	/**
	 * 사용여부
	 */
	private String useYn;
}
