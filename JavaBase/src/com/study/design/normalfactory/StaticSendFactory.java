package com.study.design.normalfactory;

public class StaticSendFactory {

	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
}
