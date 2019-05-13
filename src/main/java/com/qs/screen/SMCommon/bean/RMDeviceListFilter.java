package com.qs.screen.SMCommon.bean;

public class RMDeviceListFilter {
	public int offset;
	public int limit;
	public int province;
	public int city;
	public int county;
	public int town;
	public int community;
	public int livingarea;
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof RMDeviceListFilter)) return false;
		RMDeviceListFilter filter = (RMDeviceListFilter) obj;
		boolean notequal = this.offset != filter.offset
				|| this.province != filter.province || this.city != filter.city
				|| this.county != filter.county || this.town != filter.town
				|| this.community != filter.community || this.livingarea != filter.livingarea;
		return !notequal;
	}
}
