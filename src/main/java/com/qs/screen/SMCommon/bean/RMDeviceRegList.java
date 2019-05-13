package com.qs.screen.SMCommon.bean;

import java.util.ArrayList;

public class RMDeviceRegList {
    public int offset;
    public int limit;
	public ArrayList<RMDeviceReg> devices;
	
	public ArrayList<RMDeviceReg> getDevices() {
		if(devices == null) devices = new ArrayList<>();
		return devices;
	}
	
	public void addDevice(RMDeviceReg device) {
		getDevices().add(device);
	}
	
	public RMDeviceReg getDeviceById(int rmd_id) {
		for(RMDeviceReg device : getDevices()) {
			if(device.rmd_id == rmd_id) return device;
		}
		return null;
	}
}
