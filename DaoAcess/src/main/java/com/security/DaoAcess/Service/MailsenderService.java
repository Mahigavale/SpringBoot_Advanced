package com.security.DaoAcess.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailsenderService {
	
	 @Autowired
	 private JavaMailSender mailsender;
	 
	 public void sendemail(String to)
	 {
		 String from="maheshgavale2000@gmail.com";
		 String subject="Welcome to Mailsender !!!";
		 SimpleMailMessage mailmessage=new SimpleMailMessage();
		 
		 
		 mailmessage.setTo(to);
		 mailmessage.setFrom(from);
		 mailmessage.setSubject(subject);
		 mailmessage.setText("hii welcome to our application. looking forward to great business together!!");
		 
		 System.out.println("****************");
		 System.out.println("Mail sending to:"+to);
		 System.out.println("####################");
		 
		 mailsender.send(mailmessage);
	 }
	  
	 
	 public void htmlmail(String to, String name) throws MessagingException
	 {
		
		 String from="maheshgavale2000@gmail.com";
		 String subject="Hi, Welcome !!!";
		MimeMessage mime=mailsender.createMimeMessage();
		
		MimeMessageHelper helper=new MimeMessageHelper(mime, true, "UTF-8");
		
		String htmlcontent="""
				<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Email</title>
</head>
<body style="font-family: Arial, sans-serif; line-height: 1.6; background-color: #f4f4f4; padding: 20px;">

    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center">
                <table width="600" style="background-color: #ffffff; padding: 30px; border: 1px solid #dddddd; border-radius: 8px;">
                    
                    <tr>
                        <td style="padding-bottom: 20px; border-bottom: 1px solid #eeeeee;">
                            <h2 style="color: #333333; margin: 0;">Welcome,{{username}}!</h2>
                        </td>
                    </tr>

                    <tr>
                        <td style="padding-top: 20px;">
                            <p style="color: #555555; margin-bottom: 15px;">Dear Customer,</p>
                            
                            <p style="color: #555555; margin-bottom: 15px;">
                                Thank you for signing up! We're excited to have you on board.
                            </p>
                            
                            <p style="text-align: center; margin-top: 30px; margin-bottom: 30px;">
                                <a href="[Your_Link_Here]" 
                                   style="background-color: #007bff; color: #ffffff; text-decoration: none; padding: 10px 20px; border-radius: 5px; display: inline-block;">
                                    Get Started Now
                                </a>
                            </p>
                            
                            <p style="color: #555555; margin-bottom: 15px;">
                                If you have any questions, feel free to reply to this email.
                            </p>
                            
                            <p style="color: #555555;">Best Regards,<br>The [Your Company Name] Team</p>
                        </td>
                    </tr>

                    <tr>
                        <td style="padding-top: 20px; border-top: 1px solid #eeeeee; font-size: 12px; color: #999999; text-align: center;">
                            <p style="margin: 0;">&copy; 2025 Your Company Name. All rights reserved.</p>
                            <p style="margin: 5px 0 0 0;"><a href="[Unsubscribe_Link_Here]" style="color: #999999;">Unsubscribe</a></p>
                        </td>
                    </tr>

                </table>
            </td>
        </tr>
    </table>
</body>
</html>
""";
		
		
		String finalhtmlcontent=htmlcontent.replace("{{username}}",name );
		
		helper.setText(finalhtmlcontent, true);
		helper.setFrom(from);
		helper.setTo(to);
		helper.setSubject(subject);
		
		System.out.println("Sending html mail.");
		
		mailsender.send(mime);
				
	 }
	 

}
