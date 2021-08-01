package com.BankApplication;

public class FactoryClass {

	public static UserInterface getBankInstance(int userType) {
		UserInterface u=null;
		if(userType==1) {
			u= new ExistingUser();
		}
		if(userType==2) {
			u= new UserLogin();
		}
		if(userType==3) {
			u= new EmployeeLogin();
		}
		return u;
	}
}
