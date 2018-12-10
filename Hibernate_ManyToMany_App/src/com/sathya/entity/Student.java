package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_tab")
public class Student {
	@Id
	private int id;
	@Column(length=10)
	
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="sudent_course",joinColumns=@JoinColumn(name="sid_fk"),inverseJoinColumns=@JoinColumn(name="cid_fk"))
	private Set<course> courses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<course> getCourses() {
		return courses;
	}
	public void setCourses(Set<course> courses) {
		this.courses = courses;
	}
	
			
			
	
	
	

}
