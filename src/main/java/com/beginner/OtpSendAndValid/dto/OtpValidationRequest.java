package com.beginner.OtpSendAndValid.dto;

public class OtpValidationRequest {
	private String username;
	private String otpNumber;
	
	public OtpValidationRequest() {
		super();
	}
	public OtpValidationRequest(String username, String otpNumber) {
		super();
		this.username = username;
		this.otpNumber = otpNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOtpNumber() {
		return otpNumber;
	}
	public void setOtpNumber(String otpNumber) {
		this.otpNumber = otpNumber;
	}
	@Override
	public String toString() {
		return "OtpValidationRequest [username=" + username + ", otpNumber=" + otpNumber + "]";
	}
	

}



