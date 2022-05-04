import java.util.Scanner;

/**
 * Vytvorte hru nasobilka
 *  - hra vygeneruje v kazdom kole ulohu z malej nasobilky
 *  	- napr.: 2 x 3 = 
 *  - pocet kol - 5
 *  - na konci vypise:
 *  	 - Pocet spravnych odpovedi: x
 *  	 - Hlaska
 *  		- ak uzivatel vyriesi vsetkych 5 uloh spravne: Super!
 *  		- ak uzivatel vyriesi < 3 ulohy spravne: Musis sa este doucit nasobilku!
 *  
 * @author lukas
 *
 */
public class U10_HraNasobilka {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vitajte v hre nasobilka");
		System.out.println("-----------------------");
		int volba = 0;
		while(true) {			
			int c1 = 0, c2 = 0, vstup = 0, pocetSpravnych = 0, pocetKol = 0;
			long trvanie, zaciatok, koniec;
			int nasHornaHranica = 0;
			
			System.out.println("Ktoru nasobilku chcete hrat?");
			System.out.println("1 - mala nasobilka");
			System.out.println("2 - velka nasobilka");
			
			volba = sc.nextInt();
			if(volba == 1) {
				nasHornaHranica = 10;
			}else if(volba == 2) {
				nasHornaHranica = 20;
			}else {
				System.out.println("Nespravna volba. Skus to este raz!");
				continue;
			}
			
			System.out.println("Kolko kol ma mat hra?");
			pocetKol = sc.nextInt();
			
			zaciatok = System.currentTimeMillis();
			for(int i = 0; i < pocetKol; i++) {
				c1 = (int)(Math.random() * nasHornaHranica + 1);
				c2 = (int)(Math.random() * nasHornaHranica + 1);
				System.out.println(c1 + " x " + c2 + " = ");
				vstup = sc.nextInt();
				if((c1 * c2) == vstup) {
					pocetSpravnych++;
				}
			}
			koniec = System.currentTimeMillis();
			trvanie = koniec - zaciatok;
			trvanie /= 1000;
			System.out.println("Pocet spravnych odpovedi: " + pocetSpravnych);
			System.out.println("Stihol si to za " + trvanie + " s");
			if(pocetSpravnych == pocetKol) {
				System.out.println("Super!");
			}else if(pocetSpravnych < 3) {
				System.out.println("Musis sa este doucit nasobilku!");
			}
			
			System.out.println("Ukoncit hru?[1-ano/0-nie]");
			volba = sc.nextInt();
			if(volba == 1) {
				break;
			}
			
		}
		
		System.out.println("Dovidenia");

	}

}
