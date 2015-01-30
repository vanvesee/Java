package com.study.design.normalfactory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendFactory sf = new SendFactory();
		Sender sender = sf.produce("sms");
		sender.Send();

		System.out.println("==================");

		SendFactory sf2 = new SendFactory();
		Sender sender2 = sf2.produceMail();
		sender2.Send();

		System.out.println("==================");

		Sender sender3 = StaticSendFactory.produceMail();
		sender3.Send();

	}

}
