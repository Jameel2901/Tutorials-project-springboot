package com.dynamic.cms.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
@Autowired
private JavaMailSender javaMailSender;
@Async
public void sendEmail(String toEmail,String subject,String message)
{
	SimpleMailMessage mailMessage=new SimpleMailMessage();
	mailMessage.setTo(toEmail);
	mailMessage.setSubject(subject);
	mailMessage.setText(message);
	mailMessage.setFrom("thisisdummy2904@gmail.com");
	javaMailSender.send(mailMessage);
}

//public void aboutUsMail(String email, String name, String message)
//{
//	SimpleMailMessage mail =new SimpleMailMessage();
//	mail.setTo("lokesh.lok.lw@gmail.com");
//	mail.setSubject(name);
//	mail.setText(message);
//	mail.setFrom(email);
//	javaMailSender.send(mail);
//}

}