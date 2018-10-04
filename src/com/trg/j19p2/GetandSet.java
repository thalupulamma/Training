package com.trg.j19p2;

public  class GetandSet {
	private String studentName;
	private int age;
	private Person  person;
	private double cost;
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public String getStudentName(){
		return this.studentName;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setPerson(Person person)
	{
		this.person=person;
	}
	public Person getPerson()
	{
		return this.person;
	}
	public void setCost(double cost)
	{
		this.cost=cost;
	}

public double getCost()
{
	return this.cost;
}
}
