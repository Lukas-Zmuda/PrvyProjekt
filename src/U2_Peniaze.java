import java.util.Scanner;

/**
 * Zmenaren
 * @author lukas
 *
 */
public class U2_Peniaze {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj sumu: ");
		
		int suma = sc.nextInt();
		/*
		 * 200 EUR: 9 ks
		 * 100 EUR: 0 ks
		 * 50  EUR: 1 ks
		 * 20  EUR: 1 ks
		 * 10  EUR: 0 ks
		 * 5   EUR: 1 ks
		 * 2   EUR: 0 ks
		 * 1   EUR: 0 ks
		 */
				
		int p200 = suma / 200;
		int zvysok = suma % 200;
		int p100 = zvysok / 100;
		zvysok = zvysok % 100;
		int p50 = zvysok / 50;
		zvysok = zvysok % 50;
		int p20 = zvysok / 20;
		zvysok = zvysok % 20;
		int p10 = zvysok / 10;
		zvysok = zvysok % 10;
		int p5 = zvysok / 5;
		zvysok = zvysok % 5;
		int p2 = zvysok / 2;
		zvysok = zvysok % 2;
		
		System.out.println("200 EUR: " + p200 + "\tks");
		System.out.println("100 EUR: " + p100 + "\tks");
		System.out.println("50  EUR: " + p50 + "\tks");
		System.out.println("20  EUR: " + p20 + "\tks");
		System.out.println("10  EUR: " + p10 + "\tks");
		System.out.println("5   EUR: " + p5 + "\tks");
		System.out.println("2   EUR: " + p2 + "\tks");
		System.out.println("1   EUR: " + zvysok + "\tks");

	}

}
