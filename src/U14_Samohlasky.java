import java.util.Scanner;

/**
 * Vytvorte program, ktory nacita vetu a vypise pocet samohlasok
 * samohlasky: a, e, i, o, u, y
 * Mama ma Emu.
 * -> 5
 * @author lukas
 *
 */
public class U14_Samohlasky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String veta = "";
		System.out.println("Zadaj vetu:");
		veta = sc.nextLine();
		int pocetSam = 0;
				
		char[] znaky = veta.toCharArray();
		
		for(char pismeno: znaky) {
			if(pismeno == 'a' || pismeno == 'A') {
				pocetSam++;
			}else if(pismeno == 'e' || pismeno == 'E') {
				pocetSam++;
			}else if(pismeno == 'i' || pismeno == 'I') {
				pocetSam++;
			}else if(pismeno == 'o' || pismeno == 'O') {
				pocetSam++;
			}else if(pismeno == 'u' || pismeno == 'U') {
				pocetSam++;
			}else if(pismeno == 'y' || pismeno == 'Y') {
				pocetSam++;
			}
		}
		
		System.out.println("Pocet samohlasok: " + pocetSam);

	}

}
