package com.sathya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")


public class Employee {
	@Id
	@Column(name="EmpNo")
	private int empNumber;
	@Column(name="Deptno")
	private int empDeptno;
	@Column(name="Salary")
	private int empSal;
	@Column(name="EmpNeme")
	private String empName;
	public Employee()
	{
		
	}
	public Employee(int empNumber)
	{
		this.empNumber=empNumber;
		
	}
	public Employee(int empNumber,int empDeptno,int empSal,String empName)
	{
		this.empNumber=empNumber;
		this.empDeptno=empDeptno;
		this.empSal=empSal;
		this.empName=empName;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public int getEmpDeptno() {
		return empDeptno;
	}
	public void setEmpDeptno(int empDeptno) {
		this.empDeptno = empDeptno;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
public String toString()
{
	 	return "Employee[empNumber="+empNumber+",empName="+empName+",empSal="+empSal+",empDeptno="+empDeptno+"]";
}
}
