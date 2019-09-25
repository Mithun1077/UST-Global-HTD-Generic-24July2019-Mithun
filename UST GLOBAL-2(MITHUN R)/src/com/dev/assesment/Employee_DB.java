package com.dev.assesment;

public class Employee_DB {

	private int  employe_Id;
	private String employee_Name;
	private String employee_Type;
	private String email;
	public int getEmploye_Id() {
		return employe_Id;
	}
	public void setEmploye_Id(int employe_Id) {
		this.employe_Id = employe_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmployee_Type() {
		return employee_Type;
	}
	public void setEmployee_Type(String employee_Type) {
		this.employee_Type = employee_Type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	private String password;
	@Override
	public String toString() {
		return "Employee_DB [employe_Id=" + employe_Id + ", employee_Name="
				+ employee_Name + ", employee_Type=" + employee_Type
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
