package com.pickship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pickship.entity.OtpRecord;
import com.pickship.repo.OtpRecordRepo;

@RestController
@RequestMapping("/parcelseva/v1/verify")
public class OtpControler
{

    @Autowired
    OtpRecordRepo otpRecordRepo;

    @PostMapping()
    public boolean verifyOtp(@RequestBody OtpRecord otpRecord)
    {

	return verifyOtp(otpRecord);
    }
}