package com.beginner.OtpSendAndValid.dto;

public class OtpResponseDto {
	private OtpStatus  status;
	private String message;
	
	public OtpResponseDto() {
		super();
	}
	public OtpResponseDto(OtpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public OtpStatus getStatus() {
		return status;
	}
	public void setStatus(OtpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "OtpResponseDto [status=" + status + ", message=" + message + "]";
	}
	

}



