package com.qs.screen.SMCommon;

/**
 *用户信息
 */
public class SMUser {
	public int id;
	public String username;
	public String password;
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof SMUser)) return false;
		if (this == obj) return true;
		SMUser eqUser = (SMUser) obj;
		if(this.id == eqUser.id) return true;
		if(this.username == eqUser.username || this.username.equals(eqUser.username)) return true;
		return false;
	}
}
