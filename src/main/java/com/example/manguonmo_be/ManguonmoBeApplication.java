package com.example.manguonmo_be;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.manguonmo_be.config.TwilioConfig;
import com.twilio.Twilio;

@SpringBootApplication
public class ManguonmoBeApplication {

	@Autowired
	private TwilioConfig twilioConfig;
	
	@PostConstruct
	public void initTwilio() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}
	public static void main(String[] args) {

		SpringApplication.run(ManguonmoBeApplication.class, args);
	}  

}
