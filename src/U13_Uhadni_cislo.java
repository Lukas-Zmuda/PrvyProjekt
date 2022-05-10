import java.util.Scanner;

/**
 * Vytvorte program, ktory vygeneruje 10 cisel z intervalu <1, 100>
 * Nasledne uzivatel zada 5 cisel.
 * Program mu vypise kolko spravnych cisel uhadol
 * 
 * @author lukas
 *
 */
public class U13_Uhadni_cislo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vygenerovaneCisla = new int[10];
		int[] cislaUzivatel = new int[5];
		int pocetUhadnutych = 0;
		
		//vygenerovanie 10 cisel
		for(int i = 0; i < vygenerovaneCisla.length; i++) {
			vygenerovaneCisla[i] = (int)(Math.random() * 100 + 1);
		}
		
//		for(int c: vygenerovaneCisla) {
//			System.out.print(c + ", ");
//		}
		//nacitanie 5 cisel od uzivatela
		for(int i = 0; i < cislaUzivatel.length; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo: ");
			cislaUzivatel[i] = sc.nextInt();
		}
		
//		for(int c: cislaUzivatel) {
//			System.out.print(c + ", ");
//		}
		//porovnanie uzivatelom zadanych cisel s vygenerovanymi
		for(int i = 0; i < cislaUzivatel.length; i++) {
			for(int j = 0; j < vygenerovaneCisla.length; j++) {
				if(cislaUzivatel[i] == vygenerovaneCisla[j]) {
					pocetUhadnutych++;
				}
			}
		}
		
		//vypis uhadnutych cisel
		System.out.println("Vygenerovane boli tieto cisla:");
		for(int c: vygenerovaneCisla) {
			System.out.print(c + ", ");
		}
		
		System.out.println("\nUzivatel zadal tieto cisla:");
		for(int c: cislaUzivatel) {
			System.out.print(c + ", ");
		}
		if(pocetUhadnutych == 5) {
			System.out.println("\n**** VYHRAL SI JACKPOT ****");
		}else if(pocetUhadnutych == 0) {
			System.out.println("\nHraj znova");
		}
		System.out.println("\nPocet uhadnutych: " + pocetUhadnutych);
		

	}

}
