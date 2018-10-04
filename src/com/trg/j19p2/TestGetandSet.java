package com.trg.j19p2;

public class TestGetandSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     GetandSet file= new GetandSet();
     file.setStudentName("chandu");
     String name= file.getStudentName();
     file.setAge(20);
     int age=file.getAge();
     file.setCost(5.99877);
     double cost=file.getCost();
     
     Person person = new Person();
     person.setAge(40);
     person.setStudentName("bindu");
     file.setPerson(person);
     
     System.out.println("the student name is:"+name);
     System.out.println("the student age is:"+age);
     System.out.println("the cost of a product is:"+cost);
     System.out.println("the age of a personis:"+(file.getPerson()).getAge());
     System.out.println("the name of a person is:"+(file.getPerson()).getStudentName());
     
     
     
     
	}

}
