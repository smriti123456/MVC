package com.models.dao;

import java.util.ArrayList;

import com.models.Customer;

//DAO data access object

public class CustomerDAO {
	
	private static Customer customer = new Customer("smriti_QA", 23, 12345);
	
	public static Customer getCustomerDataFromDatabase(int aadhar){
		
		if(customer.getAadhar()==aadhar) {
			return customer;
		}
			return null;
	}
	
	
public static Customer getCustomerDataByAge(int age){
		
		if(customer.getAge()==age) {
			return customer;
		}
			return null;
	}
	
}
