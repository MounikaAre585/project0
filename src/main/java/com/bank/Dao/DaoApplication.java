package com.bank.Dao;
import java.util.List;

import com.model.bank.PojoClass;

public interface DaoApplication {
	public int addToDB(PojoClass userDB);
	public List<PojoClass> getFromDB(String a);
}
