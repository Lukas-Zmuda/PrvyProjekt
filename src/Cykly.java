
public class Cykly {

	public static void main(String[] args) {
		
//		System.out.println("Slovo");
//		System.out.println("Slovo");
//		System.out.println("Slovo");
//		System.out.println("Slovo");
//		System.out.println("Slovo");

		//cyklus s pevnym poctom opakovani
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Slovo");
		}
		
		for(int i = 5; i > 0; i--) {
			System.out.println("ine slovo");
		}
		
		for(int i = 0; i <= 10; i += 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		//9, 7, 5, 3, 1
		for(int i = 9; i > 0; i -= 2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		//2, 4, 8, 16, 32, 64
		for(int i = 2; i < 100; i *= 2) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		//cyklus s podmienkou na zaciatku
		
		int j = 0;
		while(j < 5) {
			System.out.println("while");
			j++;
		}
		
		
		//cyklus s podmienkou na konci
		j = 10;
		do {
			System.out.println("do");
			j++;
		}while(j < 5);
		
		System.out.println("\nProgram pokracuje dalej ...");
		
	}

}
