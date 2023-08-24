package com.example.manguonmo_be.service.dto;

import lombok.Data;

@Data
public class PasswordResetRequestDto {

	private String phone;// destination
	private String username;
	private String email;
	private String password;
	private String oneTimePassword;
}