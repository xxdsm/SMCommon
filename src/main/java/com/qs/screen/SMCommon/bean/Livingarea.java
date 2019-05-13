package com.qs.screen.SMCommon.bean;

import java.io.Serializable;

/**
 * 社、组、小区
 * @author docyp
 *
 */
public class Livingarea implements Serializable,Cloneable {
	public int liv_id;
	public String name;
	
	@Override
	public Object clone() {
    	Livingarea clone = new Livingarea();
    	clone.liv_id = this.liv_id;
    	clone.name = this.name;
        return clone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Livingarea)) return false;
		Livingarea p = (Livingarea) obj;
		return p.liv_id == this.liv_id;
	}
}
