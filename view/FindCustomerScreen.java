package com.views;

import java.util.Scanner;

import com.controllers.CustomerController;
import com.models.Customer;

public class FindCustomerScreen {
	
	public static Customer FindCustomerUsingAadhar()  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter aadhar of customer you want to see info of");
		int aadhar = scan.nextInt();
		return CustomerController.findUser(aadhar);
	}
	
	
	public static Customer FindCustomerUsingAge()  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age of customer you want to see info of");
		int age = scan.nextInt();
		return CustomerController.findUserByAge(age);
	}
	
	private FindCustomerScreen(){
	}
}
