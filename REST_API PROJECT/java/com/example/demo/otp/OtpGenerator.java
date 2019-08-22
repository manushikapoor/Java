package com.example.demo.otp;

import java.util.Random;

public class OtpGenerator {

	public String generateOTP() {
		Random random = new Random();
		int otp = 10000 + random.nextInt(9999);
		String OTP = String.valueOf(otp);
		return OTP;
	}

}
