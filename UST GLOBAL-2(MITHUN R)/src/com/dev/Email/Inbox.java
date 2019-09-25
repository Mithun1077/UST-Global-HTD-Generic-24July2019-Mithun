package com.dev.Email;

public class Inbox {
	private String Email;
	private int id;
	private String Message;
	
	@Override
	public String toString() {
		return "Inbox [Email=" + Email + ", id=" + id + ", Message=" + Message + "]";
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}


	

}
