package com.trg.j31p3;

public class Student {
	
	private String studentID;
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
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
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
