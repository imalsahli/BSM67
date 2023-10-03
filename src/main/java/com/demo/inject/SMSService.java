package com.demo.inject;

public class SMSService implements Service{
	
	
	public boolean send(String msg) {
		System.out.println("SMS sent to " + msg);
		return true;
	}
	

}
