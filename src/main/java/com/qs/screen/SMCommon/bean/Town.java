package com.qs.screen.SMCommon.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 镇、街道办
 * @author docyp
 *
 */
public class Town implements Serializable,Cloneable {
	public int town_id;
	public String name;
	public ArrayList<Community> communities;
	
	public ArrayList<Community> getCommunities() {
		if(communities == null) communities = new ArrayList<>();
		return communities;
	}

	public void addCommunity(Community community) {
		getCommunities().add(community);
	}
	
	public Community getSubByCode(int code) {
		for(Community community : getCommunities()) {
			if(community.com_id == code) return community;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i=-1;
		for(Community community : getCommunities()) {
			i ++;
			if(community.com_id == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
    	Town clone = new Town();
    	clone.town_id = this.town_id;
    	clone.name = this.name;
    	for(Community community : getCommunities())
    		clone.addCommunity((Community) community.clone());
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Town)) return false;
		Town p = (Town) obj;
		return p.town_id == this.town_id;
	}
}
