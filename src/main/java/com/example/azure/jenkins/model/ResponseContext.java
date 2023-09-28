package com.example.azure.jenkins.model;

import java.util.Date;

public class ResponseContext {

	private boolean success;
	private Date currentTimeStamp;
	private String version = "1.1.0";
	
	public boolean getSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Date getCurrentTimeStamp() {
		return currentTimeStamp;
	}
	public void setCurrentTimeStamp(Date currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public ResponseContext() {}
	public ResponseContext(boolean success, Date currentTimeStamp) {
		super();
		this.success = success;
		this.currentTimeStamp = currentTimeStamp;
	}
}
