/**
 * Program na vypocet obvodu a obsahu kruhu
 * @author lukas
 *
 */
public class U1_Kruh {

	public static void main(String[] args) {
		
		double polomer = 2.45;
		
		double obvod = 2 * 3.14 * polomer;
		double obsah = 3.14 * polomer * polomer;
		
		System.out.println("Kruh s polomerom " + polomer + " cm");
		System.out.println("Obvod: " + obvod + " cm");
		System.out.println("Obsah: " + obsah + " cm2");

	}

}
