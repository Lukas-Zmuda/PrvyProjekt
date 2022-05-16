package edu.oop.zaklady;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	public int raiseSalary(int percent) {
		this.salary = (int)((1 + ((double)percent / 100)) * this.salary);
		return this.salary;
	}
	
	public String toString() {
		return "Employee[id = " + getId() + ", name = " + getName() + ", salary = " + getSalary() + "]";
	}
	
	
	
	
}
