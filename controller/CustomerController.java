package com.controllers;

import com.models.Customer;
import com.models.dao.CustomerDAO;

public class CustomerController {
	
	 public static Customer findUser(int aadhar){
		Customer customer = CustomerDAO.getCustomerDataFromDatabase(aadhar);
		if(customer==null) {
			return null;
		}
			return customer;
	}
	 
	 
	 public static Customer findUserByAge(int age){
			Customer customer = CustomerDAO.getCustomerDataByAge(age);
			if(customer==null) {
				return null;
			}
				customer.setAge(customer.getAge()+2);
				return customer;
		}
	 
	
}
