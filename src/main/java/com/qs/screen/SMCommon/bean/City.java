package com.qs.screen.SMCommon.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 市、州
 * @author docyp
 *
 */
public class City implements Serializable,Cloneable {
	public int areacode;
	public String areaname;
	public ArrayList<County> counties;
	
	public ArrayList<County> getCounties() {
		if(counties == null) counties = new ArrayList<>();
		return counties;
	}
	
	public void addCounty(County county) {
		getCounties().add(county);
	}
	
	public County getSubByCode(int code) {
		for(County county : getCounties()) {
			if(county.areacode == code) return county;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i=-1;
		for(County county : getCounties()) {
			i++;
			if(county.areacode == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
    	City clone = new City();
    	clone.areacode = this.areacode;
    	clone.areaname = this.areaname;
    	for(County county : getCounties())
    		clone.addCounty((County) county.clone());
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof City)) return false;
		City p = (City) obj;
		return p.areacode == this.areacode;
	}
}
