package com.imooc.o2o.entity;

import java.util.Date;

public class LocalAuth {
	private long localAuthId;
	private String username;
	private String password;
	private Date createTime;
	private Date lastEditTime;
	private personInfo personInfo;
	public long getLocalAuthId() {
		return localAuthId;
	}
	public void setLocalAuthId(long localAuthId) {
		this.localAuthId = localAuthId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public personInfo getPersonInfo() {
		return personInfo;
	}
	public void setPersonInfo(personInfo personInfo) {
		this.personInfo = personInfo;
	}
	
	
}
