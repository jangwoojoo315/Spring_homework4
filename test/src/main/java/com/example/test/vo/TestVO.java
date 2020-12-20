package com.example.test.vo;

import java.sql.Timestamp;

public class TestVO {
	private Integer requestID;
	private String requestCode;
	private String userID;
	private Timestamp createDate;
	public Integer getRequestID() {
		return requestID;
	}
	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}
