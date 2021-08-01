package com.bank.Bo;
import java.util.List;

import com.model.bank.PojoClass;
public interface BoLogic {
	public int sendToDB(PojoClass userdetails);
	public List<PojoClass> getFromDB();
	int sendToDB1(PojoClass userdetails);
}
