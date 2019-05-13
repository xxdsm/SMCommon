package com.qs.screen.SMCommon.bean;

public class SMUserConfig {
	public SMUser user;
	public AddressList address;
	public String surname;
	public String phone;
	public int sex;
	public String avatar;
	/**
	 * 用户类型（用于权限控制）
	 * 参见{@link #SMUserType}
	 */
	public int type;
}
