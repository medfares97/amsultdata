package com.sip.ams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.sip.ams.controllers.ArticleController;

import java.io.File;

@SpringBootApplication
public class AmsultdataApplication {

	
	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(AmsultdataApplication.class, args);
	}

}
