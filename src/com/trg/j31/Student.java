package com.trg.j31;

public class Student {
	
	private int studentID;
	private String studentName;
	private String city;
	private int pincode;
	
	
	public Student(int studentID, String studentName, String city, int pincode) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.city = city;
		this.pincode = pincode;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
