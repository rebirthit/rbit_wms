package com.rebirthit.wms.code.vo;

import java.io.Serializable;

import com.rebirthit.util.vo.LastMdfyInfoVO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class DetlCodeVO extends LastMdfyInfoVO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2071572571114542363L;
	
	private String siteCd;
	private String grpCd;
	private String detlCd;
	private String useYn;
}