package com.bank.Bo;
import org.apache.log4j.Logger;

import com.model.bank.PojoClass;
public class IdGeneration {
	private static Logger log=Logger.getLogger(IdGeneration.class);
	public String genratingIds(PojoClass userr){
	int id= (int)(Math.random()*9000)+1000;
	String randomId = String.valueOf(id);
	userr.setId(randomId);
	log.debug("User ID generated");
	return(userr.getId());
}
}
