package com.sathya.entity;

public class Employee {
	private int empNumber;
	private int empDeptno;
	private int empSal;
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
