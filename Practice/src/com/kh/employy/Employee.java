package com.kh.employy;

public class Employee {
	private String empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	
	
	public Employee() {
		super();
	}

	public Employee(String empNo, String name,char gender, String phone) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	
	public Employee(String empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", dept="
				+ dept + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	
	
	
//	@Override
//	public String toString() {
//		return "Employee [empNo=" + empNo + ", name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
//	}
	
	
}
