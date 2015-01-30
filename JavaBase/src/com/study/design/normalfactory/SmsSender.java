package com.study.design.normalfactory;

public class SmsSender implements Sender{

	@Override
	public void Send(){
		System.out.println("SMS sender");
	}
}
