package com.beginner.OtpSendAndValid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beginner.OtpSendAndValid.dto.OtpRequest;
import com.beginner.OtpSendAndValid.dto.OtpResponseDto;
import com.beginner.OtpSendAndValid.dto.OtpValidationRequest;
import com.beginner.OtpSendAndValid.service.SmsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/otp")
@Slf4j
public class OtpController {
	@Autowired
    private SmsService smsService;
    
    @GetMapping("/process")
    public String processSMS() {
        return "SMS sent";
    }


    
    @PostMapping("/send-otp")
    public OtpResponseDto sendOtp(@RequestBody OtpRequest otpRequest) {
        System.out.println("Inside sendOtp :: " + otpRequest.getUsername());
        return smsService.sendSMS(otpRequest);
    }

    @PostMapping("/validate-otp")
    public String validateOtp(@RequestBody OtpValidationRequest otpValidationRequest) {
        System.out.println("Inside validateOtp :: " + otpValidationRequest.getUsername() + " " + otpValidationRequest.getOtpNumber());
        return smsService.validateOtp(otpValidationRequest);
    }



}
