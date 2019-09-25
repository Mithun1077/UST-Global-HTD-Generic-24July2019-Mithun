package com.dev.Email;

public class Account {
	@Override
	public String toString() {
		return "Account [Id=" + Id + ", username=" + username + ", password=" + password + ", Email=" + Email + "]";
	}
	private int Id;
	private String username;
	private String password;
	private String Email;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}
