package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_tabs")

public class Courses 
{
	@Id
	
private int courseId;
private String courseName;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="course")

private Set<Student> students;

public int getCourseId() {
	return courseId;
}
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", students=" + students + "]";
}




}
