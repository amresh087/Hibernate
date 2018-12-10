package com.sathya.test;

import com.sathya.dao.MTMDao;
import com.sathya.dao.MTMDaoImple;


public class Test 
{
	
public static void main(String s[])
{
	MTMDaoImple d=new MTMDaoImple();
	
	
	//d.saveStudentWithCourse();
	 d.removecoursefromStudent(903,101);
	
}
}
