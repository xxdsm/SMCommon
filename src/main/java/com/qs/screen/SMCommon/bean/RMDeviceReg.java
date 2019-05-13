package com.qs.screen.SMCommon.bean;

public class RMDeviceReg {
	public int rmd_id;
	/**
	 * 设备识别码
	 */
	public String identify;
	/**
	 * 安装注册人员id
	 */
	public int operator_reg;
	public String operator_reg_name;
	/**
	 * 系统配置员id
	 */
	public int operator_cfg;
	public String operator_cfg_name;
	/**
	 * 设备位置经度
	 */
	public double gpsx;
	/**
	 * 设备位置纬度
	 */
	public double gpsy;
	/**
	 * 设备安装时间
	 */
	public String create_date;
	/**
	 * 强制覆盖原有数据
	 */
	public int force_override;
}
