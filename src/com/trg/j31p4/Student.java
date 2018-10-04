package com.trg.j31p4;

public class Student {
	
	private int studentID;
	private String studentName;
	private String city;
	private String pincode;
	
	
	/*public Student(String studentID, String studentName, String city, String pincode) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.city = city;
		this.pincode = pincode;
	}*/
	
	
	public Student()
	{
		
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
