package com.example.manguonmo_be.service.twilio;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.twilio.type.PhoneNumber;
import com.example.manguonmo_be.config.TwilioConfig;
import com.example.manguonmo_be.service.dto.OtpStatus;
import com.example.manguonmo_be.service.dto.PasswordResetRequestDto;
import com.example.manguonmo_be.service.dto.PasswordResetResponseDto;

import reactor.core.publisher.Mono;
import com.twilio.rest.api.v2010.account.Message;

@Service
public class TwilioOTPService {
	@Autowired
	private TwilioConfig twilioConfig;

	Map<String, String> otpMap = new HashMap<>();

	 
	public PasswordResetResponseDto sendOTPForPasswordReset(PasswordResetRequestDto passwordResetRequestDto) {
		PasswordResetResponseDto passwordResetResponseDto = null;
		
		try {
			PhoneNumber to = new PhoneNumber(passwordResetRequestDto.getPhone());
			PhoneNumber from = new PhoneNumber(twilioConfig.getPhoneNumber());
//			PhoneNumber from = new PhoneNumber("+14705162275");
			String otp = generateOTP();
			String otpMessage = "Xin chào bạn , Mã OTP của bạn là ##" + otp
					+ "##. Sử dụng nó để đăng ký tài khoản. Cảm ơn";
			Message message = Message.creator(to, from, otpMessage).create();
			otpMap.put(passwordResetRequestDto.getUsername(), otp);
            passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.DELIVERED, otpMessage);
			
		}catch(Exception ex) {
			passwordResetResponseDto = new PasswordResetResponseDto(OtpStatus.FAILED, ex.getMessage());
		}
		
		 return passwordResetResponseDto;

	}

	
	 public boolean validateOTP(String userInputOtp, String userName) {
	        if (userInputOtp.equals(otpMap.get(userName))) {
	            otpMap.remove(userName,userInputOtp);
	            return true;
	        } else {
	            return false;
	        }
	    }

	// 6 digit otp
	private String generateOTP() {
		return new DecimalFormat("000000").format(new Random().nextInt(999999));
	}
}
