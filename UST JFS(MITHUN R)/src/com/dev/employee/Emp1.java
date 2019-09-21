package com.dev.employee;

public class Emp1 {

	private int emp_id;
	@Override
	public String toString() {
		return "Emp1 [emp_id=" + emp_id + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", salary=" + salary + "]";
	}
	private String ename,email,password;
	private double salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
