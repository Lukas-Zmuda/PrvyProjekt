import java.util.Scanner;

public class U15PoleStatistika {

	static Scanner sc = new Scanner(System.in);
	static final char mena = '$';
		
	public static void main(String[] args) {
		int[] cisla = {10, -2, 456, 3, 9};

		vypis(cisla);
		System.out.println(min(cisla));
		int m = min(cisla);
		System.out.println(m);
		System.out.println(max(cisla));
		System.out.println(priemer(cisla));
		System.out.println(pocetNadPriemer(cisla));
		System.out.println(pocetPodPriemer(cisla));
		int[] obr = obratene(cisla);
		vypis(obr);
		
		String vstup = sc.nextLine();
		
	}
	
	
	static void vypis(int[] pole) {
		
		System.out.println(mena);
		for(int cislo: pole) {
			System.out.print(cislo + ", ");
		}
		System.out.println();
	}
	static int min(int[] pole) {
		int minimum = pole[0];
		for(int cislo: pole) {
			if(cislo < minimum) {
				minimum = cislo;
			}
		}
		return minimum;
	}
	static int max(int[] pole) {
		int maximum = pole[0];
		for(int cislo: pole) {
			if(cislo > maximum) {
				maximum = cislo;
			}
		}
		return maximum;
	}
	static double priemer(int[] pole) {
		sc.nextLine();
		int suma = 0;
		for(int cislo: pole) {
			suma += cislo;
		}
		return ((double)suma / pole.length);
	}
	static int pocetNadPriemer(int[] pole) {
		int pocet = 0;
		
		for(int i = 0; i < pole.length; i++) {
			if(pole[i] > priemer(pole)) {
				pocet++;
			}
		}
		return pocet;
	}
	static int pocetPodPriemer(int[] pole) {
		int pocet = 0;
		for(int i = 0; i < pole.length; i++) {
			if(pole[i] < priemer(pole)) {
				pocet++;
			}
		}
		return pocet;
	}
	static int[] obratene(int[] pole) {
		int[] obratene = new int[pole.length];
		
//		for(int i = 0, j = (pole.length - 1); i < pole.length; i++, j--) {
//			obratene[i] = pole[j];
//		}	
		
		for(int i = 0; i < pole.length; i++) {
			obratene[i] = pole[(pole.length - 1) - i];
		}
		return obratene;
	}
	

}
