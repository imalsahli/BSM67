package com.demo.inject;

public class EmailService implements Service{

    public boolean send(String msg) {
        System.out.println("Email sent to "+msg);
        return true;
    }
}