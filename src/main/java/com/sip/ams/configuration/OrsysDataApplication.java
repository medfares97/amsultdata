package com.sip.ams.configuration;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


import com.sip.ams.controllers.ArticleController;

@SpringBootApplication
public class OrsysDataApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Autowired
    private JavaMailSender javaMailSender;

	void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("faresabidi21@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Success \n Spring Boot Email");

        javaMailSender.send(msg);

    }

	@Override
    public void run(String... args) throws MessagingException, IOException {

        System.out.println("Sending Email...");

        sendEmail();
        
        System.out.println("Done");

    }

	public static void main(String[] args) {
		
		new File(ArticleController.uploadDirectory).mkdir();
		//new File(ProviderController.uploadDirectoryProvider).mkdir();
		
		SpringApplication.run(OrsysDataApplication.class, args);
		
		/*Vehicule v = new Voiture();
		
		String ch="";
		String ch2 = null;
		
		List<String> ls = new ArrayList();
		List<String> ls2 = null;
		//ls2.add("ab");
		System.out.println(ls.isEmpty());
		ls.add("Java");
		System.out.println(ls.isEmpty());*/
	}


}
