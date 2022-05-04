import java.util.Scanner;

public class U9_NajvacsieSkore {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj pocet studentov: ");
		int pocetStudentov = sc.nextInt();
		
		String maxStudent = "";
		double maxSkore = 0;
		
		for(int i = 0; i < pocetStudentov; i++) {
			System.out.println("Zadaj meno: ");
			String meno = sc.next();
			System.out.println("Zadaj skore: ");
			double skore = sc.nextDouble();
			if(skore > maxSkore) {
				maxSkore = skore;
				maxStudent = meno;
			}
		}
		
		System.out.printf("Maximalne skore ma %s - %.2f bodov", maxStudent, maxSkore);
		
		

	}

}
