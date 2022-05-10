import java.util.Scanner;

/**
 * Vytvorte program, ktory nacita 10 cisel a vypise ich v opacnom poradi
 * 
 * @author lukas
 *
 */
public class U12_VypisPrvkovOpacne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] cisla = new int[10];
		
		//nacitavanie cisel
		for(int i = 0; i < 10; i++) {
			System.out.println("Zadaj " + (i + 1) + ". cislo:");
			cisla[i] = sc.nextInt();
		}
		
		//vypis cisel
		for(int i = 9; i > -1; i--) {
			System.out.print(cisla[i] + ", ");
		}
		
	
		

	}

}
