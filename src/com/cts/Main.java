package com.cts;

import com.cts.service.SomeService;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome the session");
		System.out.println("Hi, hope you are fine");
		
		SomeService ss=new SomeService();
		System.out.println(ss.findLength("program"));
		
		}
	
	

}
