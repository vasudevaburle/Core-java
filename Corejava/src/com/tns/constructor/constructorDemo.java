package com.tns.constructor;

import java.util.Scanner;

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner (System.in);
	String name,city;
	int id;
	System.out.println("enter customer id");
	id=sc.nextInt();
	sc.nextLine();
	
	System.out.println("enter name");
	name=sc.nextLine();
	
	System.out.println("enter city");
	city=sc.nextLine();
	Customer cl=new Customer();// calling default constructor
	cl.setCustomerId(id);
	cl.setCustomerName(name);
	cl.setCustomerCity(city);
	System.out.println(cl);
	
	}

}
