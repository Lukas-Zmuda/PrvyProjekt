package edu.oop.dedicnost.uloha;

public class Test {

	public static void main(String[] args) {
		Person s = new Student("Janko", "Hrasko", "programator", 1, 200);
		System.out.println(s);
		
		Staff staff = new Staff("Ivan", "Hrozny", "elct", 500);
		System.out.println(staff);
		
		Person os1 = new Person("Janko", "Kosice");
		Person os2 = new Person("Janko", "Kosice");
		System.out.println(os1.equals(os2));

	}

}
