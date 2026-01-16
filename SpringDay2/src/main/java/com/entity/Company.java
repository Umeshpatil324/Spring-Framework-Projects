package com.entity;

public class Company {
	int cID;
    String name;
    Employee emp;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cID, String name, Employee emp) {
		super();
		this.cID = cID;
		this.name = name;
		this.emp = emp;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Company [cID=" + cID + ", name=" + name + ", emp=" + emp + "]";
	}
    

}
