package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")

public class Student 
{
@Id	
private int studentId;
private String studentName;
@ManyToMany(cascade=CascadeType.ALL)

@JoinTable(name="Studentcorses",joinColumns=@JoinColumn(name="sid_fk"),inverseJoinColumns=@JoinColumn(name="cid_fk"))

private Set<Courses> course;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public Set<Courses> getCourse() {
	return course;
}

public void setCourse(Set<Courses> course) {
	this.course = course;
}


@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}



}
