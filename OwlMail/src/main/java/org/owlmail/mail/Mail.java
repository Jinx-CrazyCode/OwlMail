package org.owlmail.mail;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

import javax.mail.*;
import java.io.IOException;

public class Mail {
    private String sender;
    private String password;
    private String subject;
    private String msg;
    private String receiver;

    public Mail(String sender, String password, String subject, String msg, String receiver) {
    this.sender = sender;
    this.password = password;
    this.subject = subject;
    this.msg = msg;
    this.receiver = receiver;
    }
    private void configureMail(){
        SimpleEmail mail = new SimpleEmail();
        String green = "\u001B[32m";
        String red = "\u001B[31m";
        try {
            mail.setHostName("smtp-mail.outlook.com");
            mail.setSmtpPort(587);
            mail.setStartTLSEnabled(true);
            mail.setFrom(sender);
            mail.setAuthentication(sender,password);
            mail.setSubject(subject);
            mail.setMsg(msg);
            mail.addTo(receiver);
            mail.send();
            System.out.println(green + "Email sent to: " + receiver);
        } catch (EmailException e) {
            System.out.println(red + "impossible send Email: " + e.getMessage());
        }
    }

    public void sendEmail(){
        configureMail();
    }


}

