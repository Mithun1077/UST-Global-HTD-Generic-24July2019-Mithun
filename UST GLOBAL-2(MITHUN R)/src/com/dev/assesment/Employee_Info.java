package com.dev.assesment;

public class Employee_Info {

	private int employee_Id;
	private String leaveDate;
	private String leave_status;
	public int getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	@Override
	public String toString() {
	
		return  employee_Id + 
				 leaveDate + leave_status ;
	}
	public String getLeave_status() {
		return leave_status;
	}
	public void setLeave_status(String leave_status) {
		this.leave_status = leave_status;
	}
}
