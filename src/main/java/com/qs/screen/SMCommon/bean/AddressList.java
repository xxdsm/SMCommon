package com.qs.screen.SMCommon.bean;

import java.util.ArrayList;

public class AddressList implements Cloneable {
	public ArrayList<Province> provinces;

	public ArrayList<Province> getProvinces() {
		if(provinces == null) provinces = new ArrayList<>();
		return provinces;
	}
	
	public void addProvince(Province province) {
		getProvinces().add(province);
	}
	
	public Province getSubByCode(int code) {
		for(Province province : getProvinces()) {
			if(province.areacode == code) return province;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i = -1;
		for(Province province : getProvinces()) {
			i ++;
			if(province.areacode == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
		AddressList clone = new AddressList();
    	for(Province province : getProvinces())
    		clone.addProvince((Province) province.clone());
        return clone;
	}
}
