package com.sathya.test;

import com.sathya.dao.EmpDao;
import com.sathya.dao.EmpDaofactory;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDao dao=EmpDaofactory.getinstance();
		
		
		
		
		
		dao.dispEmployeeByDeptno(10);
         dao.aggregate();
     
     
     
	}

}
