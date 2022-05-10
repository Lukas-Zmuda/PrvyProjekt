
public class Pole {

	public static void main(String[] args) {
		
		int[] cisla;
		cisla = new int[5];
		System.out.println(cisla[0]);
		
		int a = 15;
		
		cisla[0] = 147;
		System.out.println(cisla[0]);
		cisla[1] = -54;
		cisla[2] = 99;
		cisla[3] = 187;
		cisla[4] = -63;
		
		System.out.println(cisla[3]);
		System.out.println("--------------");
		for(int i = 0; i < 5; i++) {
			System.out.println(cisla[i]);
		}

		System.out.println("-------");
		for(int i = 4; i > -1; i--) {
			System.out.println(cisla[i]);
		}
		
		cisla[4] = cisla[3] + cisla[2];
		cisla[0]++;
		
		System.out.println("-------");
		
		for(int c :cisla) {
			System.out.println(c);
		}
		
		String[] mena = {"Denisa", "Richard", "Martin", "Lukas", "Martin", "Petra", "Fero"};
		
		mena[2] = "Mato";
		
		for(String m: mena) {
			System.out.println(m);
		}
		
		System.out.println("-----");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i]);
		}
		//System.out.println(i);
		System.out.println("Posledne meno v zozname je: " + mena[mena.length - 1]);
	}

}
