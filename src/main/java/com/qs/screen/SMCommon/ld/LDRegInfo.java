package com.qs.screen.SMCommon.ld;

/**
 *设备注册提交数据
 */
public class LDRegInfo {
	public String serial_no;
	public String mac;
	public String getSerial_no() {
		return serial_no == null?"":serial_no;
	}
	public String getMac() {
		return mac == null?"":mac;
	}
}
