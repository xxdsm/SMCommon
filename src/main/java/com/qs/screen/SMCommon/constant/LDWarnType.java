package com.qs.screen.SMCommon.constant;

/**
 * 设备告警信息类别，与数据表"dictionary"."warn_type"对应
 * @author docyp
 */
public interface LDWarnType {
	/**
	 * 未指定
	 */
	int WARN_TYPE_UNDEFINE=0;
	/**
	 * 监控告警系统状态
	 */
	int WARN_TYPE_SYS_STATE=1;
	/**
	 * 工作温度
	 */
	int WARN_TYPE_TEMP=2;
	/**
	 * 工作电流
	 */
	int WARN_TYPE_ELEC=3;
	/**
	 * 门锁
	 */
	int WARN_TYPE_LOCK=4;
	/**
	 * 触摸屏工作
	 */
	int WARN_TYPE_SCREEN=5;
	/**
	 * 刷卡器工作
	 */
	int WARN_TYPE_CARD_READER=6;
	/**
	 * 控制器故障
	 */
	int WARN_TYPE_SP_CTL=7;
	/**
	 * LCD开启关闭状态
	 */
	int WARN_TYPE_LCD=8;
	/**
	 * 风冷系统启停状态
	 */
	int WARN_TYPE_FAN=9;
	/**
	 * 工作电压
	 */
	int WARN_TYPE_VOLT=10;
	/**
	 * 设备振动告警
	 */
	int WARN_TYPE_VIBRATE=11;
	/**
	 * 设备照明
	 */
	int WARN_TYPE_LIGHT=12;
}
