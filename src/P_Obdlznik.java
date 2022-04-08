/**
 * Program na vypocet obsahu a obvodu obdlznika
 * Hodnoty a, b su ulozene v rovnomennych premennych
 * @author lukas
 *
 */
public class P_Obdlznik {

	public static void main(String[] args) {
		
		double a = 12.3, b = 4;
		
		double obvod, obsah;
		obsah = a * b;
		obvod = 2 * (a + b);
		
		System.out.println("Obdlznik so stranami \na = " + a + " cm\nb = " + b + " cm");
		System.out.println("Obsah: " + obsah + " cm2");
		System.out.println("Obvod: " + obvod + " cm");
		
	}
}