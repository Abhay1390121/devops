package com.nagarro.model;

public class User {
	
	private int rollNo;
	private String firstName;
	private String lastName;
	private String contact;
	private String address;
	
	
	public User() {
		super();
	}
	public User(int rollNo, String firstName, String lastName, String contact, String address) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
