package com.sathya.test;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.sathya.entity.Flight;

public class MyInterCepter extends EmptyInterceptor
{
	private int update;
	private int creates;
	private int loads;
	//This is method is going to call when an object is going to delete
	public void onDelete(Object entity,Serializable id,Object[] state,String[] property)
	{
	//donothing
		System.out.println("Object is going to delete from database ");
	}
	//this method is call when an object is going to save
	public boolean onSave(Object entity,Serializable id,Object[] state,String[] propertyName,Type[] types)
	{
		if(entity instanceof Flight)
		{
			System.out.println("Object is going to save");
			return true;
		}
		return false;
	}
		public boolean onLoad(Object entity, Serializable id, Object[] state,
                String[] propertyNames, Type[] types) {
            System.out.println("onLoad Method is getting called");
 
            System.out.println("==== Dtails of flight ====");
            if(entity instanceof Flight)
            {
               System.out.println("method is after laoded");
               return true;
            }
            return false;
		
	}
}
