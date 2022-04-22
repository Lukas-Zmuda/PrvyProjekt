import java.util.Scanner;

public class U5_BMI {

	public static void main(String[] args) {
		// nacitame vstupnych udajov
		Scanner sc = new Scanner(System.in);
		double vyska = 0, hmotnost = 0, bmi = 0;
		System.out.println("Zadajte vysku[cm]: ");
		vyska = sc.nextDouble();
		System.out.println("Zadaj hmotnost[kg]: ");
		hmotnost = sc.nextDouble();
		// vypocitame bmi podla vzorca
		vyska = vyska / 100;
		bmi = hmotnost / (vyska * vyska);

		// vypiseme hodnoty
		// System.out.println("BMI: " + bmi);
		System.out.printf("BMI: %.2f\n", bmi);
		
		if(bmi > 40) {
			System.out.println("Tazka obezita");
		}else if(bmi > 30) {
			System.out.println("Obezita");
		}else if(bmi > 25) {
			System.out.println("Mierna nadvaha");
		}else if(bmi > 18.5){
			System.out.println("Zdrava vaha");
		}else {
			System.out.println("Podvyziva");
		}
		

	}

}
