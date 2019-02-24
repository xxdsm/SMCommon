package com.qs.screen.SMCommon.ld;

/**
 *设备PLC模拟量数据
 */
public class LDPlcData {
	/**
	 * 温度
	 */
	public float temp;
	/**
	 * 电流
	 */
	public float elec;
	/**
	 * lcd屏，1为开
	 */
	public int lcd_on;
	/**
	 * 照明，1为开
	 */
	public int light_on;
	/**
	 * 风扇，1为开
	 */
	public int fan_on;
	/**
	 * 设备锁，1为开
	 */
	public int lock;
}
