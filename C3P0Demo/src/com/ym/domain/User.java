/*
* User.java
* Version 1.0.0
* Created on 2019年3月7日
* Copyright QuickCodes.net
*
*/
package com.ym.domain;

/**
 * @author Ben
 * @version 1.0.0
 * @since 
 * 创建时间：2019年3月7日
 * 功能描述：
 */
public class User {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pasword=" + pasword + "]";
	}
	int id;
	String username;
	String pasword;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the pasword
	 */
	public String getPasword() {
		return pasword;
	}
	/**
	 * @param pasword the pasword to set
	 */
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
}
