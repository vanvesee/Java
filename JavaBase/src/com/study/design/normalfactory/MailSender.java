package com.study.design.normalfactory;

public class MailSender implements Sender{

	@Override
	public void Send(){
		System.out.println("mail sender");
	}
}
