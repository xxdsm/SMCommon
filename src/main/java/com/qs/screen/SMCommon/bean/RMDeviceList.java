package com.qs.screen.SMCommon.bean;

import java.util.ArrayList;

public class RMDeviceList {
	public int offset;
	public int limit;
	public ArrayList<RMDevice> devices;
	public ArrayList<RMDevice> getDevices() {
		if(devices == null) devices = new ArrayList<>();
		return devices;
	}
	
	public void addDevice(RMDevice device) {
		getDevices().add(device);
	}
}
