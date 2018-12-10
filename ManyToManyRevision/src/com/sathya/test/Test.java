package com.sathya.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.Courses;
import com.sathya.entity.Student;
import com.sathya.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student();
		s1.setStudentId(101);
		s1.setStudentName("Durgesh");
		Student s2=new Student();
		s2.setStudentId(102);
		s2.setStudentName("Manish");
		Student s3=new Student();
		s3.setStudentId(103);
		s3.setStudentName("Anil");
		
		Courses c1=new Courses();
		c1.setCourseId(190);
		c1.setCourseName("Java");
		Courses c2=new Courses();
		c2.setCourseId(191);
		c2.setCourseName("Python");
		Courses c3=new Courses();
		c3.setCourseId(192);
		c3.setCourseName("Oracle");
		
		Set<Courses> set1=new HashSet();
		set1.add(c1);
		set1.add(c3);
     	s1.setCourse(set1);
     	session.save(s1);

		Set<Courses> set2=new HashSet();
		set2.add(c1);
		set2.add(c3);
		set2.add(c2);
     	s2.setCourse(set2);
         session.save(s2); 	
    
		Set<Courses> set3=new HashSet();
		set3.add(c3);
		set3.add(c2);
     	s3.setCourse(set3);
         session.save(s3);     	
		
		tx.commit();
		
	}

}
