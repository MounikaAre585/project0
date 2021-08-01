package com.bank.Bo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import com.bank.Dao.DaoApplication;
import com.bank.Dao.DaoOperation;
import com.model.bank.PojoClass;
public class ValidatingCredentials {
	private static Logger log=Logger.getLogger(ValidatingCredentials.class);
	public int  validatePassword(String pwd) {
		String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\S+$).{8,20}$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(pwd);
		if(m.matches()) {
			log.debug("valid password");
			return 1;
		}
		
		else {
			log.warn("Invalid password");
			return 0;
		}
		
	}
	
	public int validatePhoneNumber(String phn) {
		if(phn.length()==10) {
			log.debug("valid phone number");
			return 1;
		}
		else {
			log.error("Invalid phone number");
			return 0;
		}
	}
	
	public int validateInitialBalance(int amt) {
		if(amt>=6000) {
			log.debug("Valid initial amount");
			return 1;
		}
		else {
			log.warn("Insufficient initial amount");
			return 0;
		}
	}
	
	public int validateAdhar(String adharNumber) {
		// TODO Auto-generated method stub
		if(adharNumber.length()==10) {
			log.debug("Valid adhar");
			return 1;
		}
		else {
			log.error("Invalid adhar");
			return 0;
		}
	}

	public int sendToDB(PojoClass userdetails) {
		// TODO Auto-generated method stub
		DaoOperation dao= new DaoOperation();
		int dbStatus=dao.addToDB(userdetails);
		
		
		return dbStatus;
	}

	public List<PojoClass> getFromDB() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
