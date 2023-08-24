package com.example.manguonmo_be.controller.customer;

import com.example.manguonmo_be.model.UserEntity;
import com.example.manguonmo_be.repository.UserTourRepository;
import com.example.manguonmo_be.request.UserRequest;
import com.example.manguonmo_be.service.UserService;
import com.example.manguonmo_be.service.dto.PasswordResetRequestDto;
import com.example.manguonmo_be.service.dto.PasswordResetResponseDto;
import com.example.manguonmo_be.service.twilio.TwilioOTPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/register")
public class UserController {
    @Autowired
    private UserTourRepository userTourRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private TwilioOTPService twilioOTPService;
    @PostMapping("/saveUser")
    public ResponseEntity<String> addRegisterUser(@RequestBody UserRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setPassword(userRequest.getPassWord());
        userEntity.setUsername(userRequest.getUserName());
        userEntity.setPhone(userRequest.getPhone());
        if(userService.isEmailNumberExists(userRequest.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Tai khoan da ton tai!");
        }else{
            userTourRepository.save(userEntity);
            return  ResponseEntity.status(HttpStatus.CREATED).body("Luu thanh cong!");
        }
    }
    
    @PostMapping("/send-otp")
	public PasswordResetResponseDto sendOtp(@RequestBody PasswordResetRequestDto otpRequest) {

		return twilioOTPService.sendOTPForPasswordReset(otpRequest) ;
	}
    @PostMapping("/validate-otp")
    public  ResponseEntity<String> validateOtp(@RequestBody PasswordResetRequestDto otpRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(otpRequest.getEmail());
        userEntity.setPassword(otpRequest.getPassword());
        userEntity.setPhone(otpRequest.getPhone());
        userEntity.setUsername(otpRequest.getUsername());
        if(twilioOTPService.validateOTP(otpRequest.getOneTimePassword(), otpRequest.getUsername()) == true ) {
            userTourRepository.save(userEntity);
            return  ResponseEntity.status(200).body("Luu thanh cong!");
        } else {
            return  ResponseEntity.status(500).body("Mã OTP không chính xác");
        }
    }
}
