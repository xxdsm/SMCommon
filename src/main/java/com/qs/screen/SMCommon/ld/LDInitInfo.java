package com.qs.screen.SMCommon.ld;

import java.io.Serializable;

import com.qs.screen.SMCommon.SMUser;

/**
 *设备初始化配置信息
 */
public class LDInitInfo implements Serializable {
	public int rmd_id;
	public SMUser user;
	public String areacode;
	public int com_id;
	public int liv_id;
}
