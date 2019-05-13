package com.qs.screen.SMCommon.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 村、社区
 * @author docyp
 *
 */
public class Community implements Serializable,Cloneable {
	public int com_id;
	public String name;
	public ArrayList<Livingarea> livingareas;
	
	public ArrayList<Livingarea> getLivingareas() {
		if(livingareas == null) livingareas = new ArrayList<>();
		return livingareas;
	}
	
	public void addLivingarea(Livingarea livingarea) {
		getLivingareas().add(livingarea);
	}
	
	public Livingarea getSubByCode(int code) {
		for(Livingarea livingarea : getLivingareas()) {
			if(livingarea.liv_id == code) return livingarea;
		}
		return null;
	}
	
	public int subIndexByCode(int code) {
		int i=-1;
		for(Livingarea livingarea : getLivingareas()) {
			i ++;
			if(livingarea.liv_id == code) return i;
		}
		return i;
	}
	
	@Override
	public Object clone() {
    	Community clone = new Community();
    	clone.com_id = this.com_id;
    	clone.name = this.name;
    	for(Livingarea livingarea : getLivingareas())
    		clone.addLivingarea((Livingarea) livingarea.clone());
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Community)) return false;
		Community p = (Community) obj;
		return p.com_id == this.com_id;
	}
}
