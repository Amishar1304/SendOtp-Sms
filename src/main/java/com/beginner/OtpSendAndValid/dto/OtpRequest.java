package com.beginner.OtpSendAndValid.dto;

public class OtpRequest {
	private String username;
    private String phoneNumber;
	public OtpRequest() {
		super();
	}
	public OtpRequest(String username, String phoneNumber) {
		super();
		this.username = username;
		this.phoneNumber = phoneNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "OtpRequest [username=" + username + ", phoneNumber=" + phoneNumber + "]";
	}
    

}



