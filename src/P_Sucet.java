import java.util.Scanner;

/**
 * Program nacitava cisla zo vstupu. 
 * Nacitavanie skonci ked zadame 0
 * Nasledne program vypise sucet zadanych cisel
 * @author lukas
 *
 */
public class P_Sucet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sucet = 0, vstup = 0;
		
//		while(vstup != 0) {
//			System.out.println("Zadaj cislo: ");
//			vstup = sc.nextInt();
//			sucet += vstup;
//		}
		
		do {
			System.out.println("Zadaj cislo: ");
			vstup = sc.nextInt();
			sucet += vstup;
		}while(vstup != 0);
		
		System.out.println("Sucet: " + sucet);

	}

}
