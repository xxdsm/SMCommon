package com.qs.screen.SMCommon.ld;

import java.io.Serializable;

import com.qs.screen.SMCommon.bean.SMUser;

/**
 *设备初始化配置信息
 */
public class LDInitInfo implements Serializable {
	public int rmd_id;
	public SMUser user;
	public String areacode;
	public int town_id;
	public int com_id;
	public int liv_id;
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof LDInitInfo)) return false;
		LDInitInfo eqInfo = (LDInitInfo) obj;
		if(this.user != null && !this.user.equals(eqInfo.user)) return false;
		if(this.areacode != null && !this.areacode.equals(eqInfo.areacode)) return false;
		return this.town_id == eqInfo.town_id && this.com_id == eqInfo.com_id && this.liv_id == eqInfo.liv_id;
	}
}
