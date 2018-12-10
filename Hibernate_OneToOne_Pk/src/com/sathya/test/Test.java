package com.sathya.test;

import com.sathya.dao.Daofactory;
import com.sathya.dao.PassportDao;

public class Test {

	public static void main(String[] args) {
		PassportDao dao=Daofactory.getInstance();
		
		//PassoprtImple d=new PassoprtImple();
		dao.savePassportwithPerson();

	}

}
