import java.util.Scanner;

/**
 * Program na vypocet obvodu a obsahu kruhu
 * @author lukas
 *
 */
public class U1_Kruh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program na vypocet obvodu a obsahu kruhu");
		System.out.println("----------------------------------------");
		System.out.println("Zadaj polomer kruhu: ");
		double polomer = sc.nextDouble();
		
		double obvod = 2 * 3.14 * polomer;
		double obsah = 3.14 * polomer * polomer;
		
		System.out.println("Kruh s polomerom " + polomer + " cm");
		System.out.println("Obvod: " + obvod + " cm");
		System.out.println("Obsah: " + obsah + " cm2");

	}

}
