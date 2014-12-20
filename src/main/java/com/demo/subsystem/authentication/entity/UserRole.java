package com.demo.subsystem.authentication.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
	private static final long serialVersionUID = 845711791667183804L;

	private String id;
	private String userid;
	private String roleid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRoleid() {
		return roleid;
	}
	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}
}
