/**
 * 
 */
package com.spaneos.db_connection;

/**
 * @author balaji
 *
 */
public class DbConnectionUtill {
	private String driverName;
	private String url;
	private String userId;
	private String password;
	
	public String getConnection(){
		return "Connection is establised with "+driverName;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DbConnectionUtill [driverName=" + driverName + ", url=" + url + ", userId=" + userId + ", password="
				+ password + "]";
	}
	
	
	
	
}
