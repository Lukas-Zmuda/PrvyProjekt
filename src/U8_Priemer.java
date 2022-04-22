import java.util.Scanner;

/**
 * Uloha 4.1 zo strany 167
 * @author lukas
 *
 */
public class U8_Priemer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pocet = 0, vstup = 0, pocetKladnych = 0, pocetZapornych = 0;
		double priemer = 0, suma = 0;
		
		do {
			System.out.println("Zadaj cislo:");
			vstup = sc.nextInt();
			pocet++;
			suma += vstup;
			if(vstup > 0) {
				pocetKladnych++;
			}else if(vstup < 0) {
				pocetZapornych++;
			}
			
		}while(vstup != 0);
		
		pocet--;
		priemer = suma / pocet;
		
		System.out.println("Pocet kladnych: " + pocetKladnych);
		System.out.println("Pocet zapornych: " + pocetZapornych);
		System.out.println("Celkovy pocet: " + pocet);
		System.out.println("Priemer: " + priemer);

	}

}
