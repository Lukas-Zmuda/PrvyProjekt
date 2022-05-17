package edu.oop.dedicnost.uloha;

import java.util.Objects;

public class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		int a = (int)12.5;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		Person osoba2 = (Person)obj;		
		return this.name.equals(osoba2.name) && this.address.equals(osoba2.address);
	}
	
	
	
	
	
	
}