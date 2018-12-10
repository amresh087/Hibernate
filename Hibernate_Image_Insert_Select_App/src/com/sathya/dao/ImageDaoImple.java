package com.sathya.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.jdbc.LobCreator;

import com.sathya.entity.Emplyee;

import co.sathya.util.HibernateUtil;

public class ImageDaoImple implements ImageDao 
{
	private SessionFactory factory;
	
	public ImageDaoImple()
	{
	factory=HibernateUtil.getSessionfactory();
	
	}
	public void insertImage()
	{
		try
		{
	Emplyee e=new Emplyee();
	e.setId(101);
	e.setEmpName("durgesh");
	Session session=factory.openSession();
	FileInputStream fis=new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	File f=new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	
	long len=f.length();
	
	LobCreator creator=Hibernate.getLobCreator(session);
	Blob blb=creator.createBlob(fis,len);
	e.setImg(blb);
	Transaction tx=session.beginTransaction();
	session.save(e);
	tx.commit();
    session.close();	
	
	
	
	
	
	
	}
		catch(Exception e)
		{
			
		}
	}
	public void selectImage()
	{
		try
		{
			Session session=factory.openSession();
			Emplyee e=(Emplyee)session.get(Emplyee.class, 101);
			Blob blb=e.getImg();
			int len=(int)blb.length();
			byte bytes[]=blb.getBytes(1, len);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\DURGESH\\Documents\\test.jpg");
			fos.write(bytes);
			session.close();
		}
		catch(Exception e)
		{
			
		}
			
		
	}
	

}
