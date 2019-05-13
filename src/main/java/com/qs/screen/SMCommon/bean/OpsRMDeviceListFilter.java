package com.qs.screen.SMCommon.bean;

public class OpsRMDeviceListFilter {
	public int offset;
	public int limit;
	public String identify;
	public int operator_reg;
	
	public String getIdentify() {
		if(identify == null) identify = "";
		return identify;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof OpsRMDeviceListFilter)) return false;
		OpsRMDeviceListFilter filter = (OpsRMDeviceListFilter) obj;
		boolean notequal = this.offset != filter.offset
				|| !this.getIdentify().equals(filter.getIdentify())
				|| this.operator_reg != filter.operator_reg;
		return !notequal;
	}
}
