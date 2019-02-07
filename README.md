# MVC

## Created separate packages for all three: models, views, and controller.  
###  MODEL:   
      - contains EmployeeModel class
      - Three private variables with their public getter and setter methods.
### VIEW:
  - contains FindCustomerScreen class   
    1. two static methods  FindCustomerUsingAadhar() and FindCustomerUsingAge()   
        - a. FindCustomerUsingAadhar() takes aadhar input from user and calls the findUser(aadhar) method of controller.  
        - b. FindCustomerUsingAge() takes age from the user and calls the findUserByAge(age) method of controller.   
### CONTROLLER:
      - contains CustomerController class:
contains two static methods findUser(int aadhar) and findUserByAge(int age) for creating an employee and fetching its details.
MVCDemo class
creates a reference of EmployeeModel and calls EmployeeView's registerEmp method.  
calls fetchEmp method of EmployeeController  
