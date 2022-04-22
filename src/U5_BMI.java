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
		System.out.printf("BMI: %.2f", bmi);

	}

}
