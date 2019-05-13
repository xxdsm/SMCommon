package com.qs.screen.SMCommon.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 省、自治区、直辖市
 * @author docyp
 *
 */
public class Province implements Serializable,Cloneable {
	public int areacode;
	public String areaname;
	public ArrayList<City> cities;
	
	public ArrayList<City> getCities() {
		if(cities == null) cities = new ArrayList<>();
		return cities;
	}
	public void addCity(City city) {
		getCities().add(city);
	}
	
	public City getSubByCode(int code) {
		for(City city : getCities()) {
			if(city.areacode == code) return city;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i = -1;
		for(City city : getCities()) {
			i++;
			if(city.areacode == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
    	Province clone = new Province();
    	clone.areacode = this.areacode;
    	clone.areaname = this.areaname;
    	for(City city : getCities())
    		clone.addCity((City) city.clone());
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Province)) return false;
		Province p = (Province) obj;
		return p.areacode == this.areacode;
	}
}
