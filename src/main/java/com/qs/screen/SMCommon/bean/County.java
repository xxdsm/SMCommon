package com.qs.screen.SMCommon.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 县、区
 * @author docyp
 *
 */
public class County implements Serializable,Cloneable {
	public int areacode;
	public String areaname;
	public ArrayList<Town> towns;
	
	public ArrayList<Town> getTowns() {
		if(towns == null) towns = new ArrayList<>();
		return towns;
	}
	
	public void addTown(Town town) {
		getTowns().add(town);
	}
	
	public Town getSubByCode(int code) {
		for(Town town : getTowns()) {
			if(town.town_id == code) return town;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i=-1;
		for(Town town : getTowns()) {
			i ++;
			if(town.town_id == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
    	County clone = new County();
    	clone.areacode = this.areacode;
    	clone.areaname = this.areaname;
    	for(Town town : getTowns())
    		clone.addTown((Town) town.clone());
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof County)) return false;
		County p = (County) obj;
		return p.areacode == this.areacode;
	}
}
