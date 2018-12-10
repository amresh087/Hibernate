package com.sathya.test;

import com.sathya.dao.Daofactory;
import com.sathya.dao.TablePer;
import com.sathya.entity.Card;
import com.sathya.entity.Checque;

public class TablePerDemo {

	public static void main(String[] args) 
	{
		TablePer dao=Daofactory.getinstance();
		
		
		
   Card c=new Card(101090,98989903,new java.util.Date(),8984,"MasterCard");
    
      dao.savecard(c);
    
     Checque chq=new Checque(101190,98989903,new java.util.Date(),89894,"Paid");
         dao.saveChecque(chq);
    
      
     
     
	}

}
