package edu.oop.zaklady;

public class Tester {

	public static void main(String[] args) {
		
		//deklaracia objektu
		Osoba o;
		
		//inicializacia objektu
		o = new Osoba();

		o.pozdrav(true);
		
		Osoba o2 = new Osoba();
		
		o.meno = "Fero";
		o.priezvisko = "Mravec";
		o.vek = 68;
		o.pohlavie = 'm';
		
		System.out.println("Ako sa vola Fero? " + o.priezvisko);
		
		Osoba o3 = o;
		
		o3.priezvisko = "Mravcek";
		
		System.out.println("Ako sa vola Fero? " + o.priezvisko);
		
		o.vek = 75;
		
		System.out.println(o3.vek);
		
		o.pozdrav();
		o3.pozdrav();
		
		o3.pozdrav(true);
		o3.pozdrav(false);
		
		System.out.println(o.pohlavieSlovom());
		
		Osoba o4 = new Osoba(null, null, 35, 'm');
		o4.pozdrav(true);
		o4.meno = null;
		o4.pozdrav(true);
		
		Osoba o5 = new Osoba("Aladar", "Miazga");
		
		o5.pozdrav(true);

		Employee emp = new Employee(2, "Peter", "Pan", 1200);
		
		System.out.println(emp.toString());
		emp.raiseSalary(10);
		System.out.println(emp.toString());
	}

}
