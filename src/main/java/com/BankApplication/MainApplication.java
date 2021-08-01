package com.BankApplication;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class MainApplication {
	private static Logger log=Logger.getLogger(MainApplication.class);
	int i;
    public static void main( String[] args )
    {
    	MainApplication x=new MainApplication();
    	Scanner sc= new Scanner(System.in);
        System.out.println( " Welcome to SBI Bank" );
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        log.info("Enter options how to use BankApp");
     
        System.out.println("");
        System.out.println("1. Existing User");
        System.out.println("2. NewUser Login");
        System.out.println("3. Employee Login");
        while(true) {
	        System.out.println("Enter your option");
	        x.i=sc.nextInt();
	        if(x.i==1)
	        {
	        	
	        	ExistingUser eum= (ExistingUser) FactoryClass.getBankInstance(x.i);
	        	eum.getOption();
	        	eum.displayInformation();
	        	break;
	        }
	        else if(x.i==2) {
	        	UserLogin um= (UserLogin) FactoryClass.getBankInstance(x.i);
	        	um.getOption();
	        	um.displayInformation();
	        	break;
	        }
	        else if(x.i==3) {
	        	EmployeeLogin em= (EmployeeLogin) FactoryClass.getBankInstance(x.i);
	        	em.getOption();
	        	break;
	        }

	        else {
		        log.error("Wrong option entered");
	        	System.out.println("Invalid option. Please enter 1, 2 or 3");
	        }
        }
        sc.close();
        
        
        
    }

}
