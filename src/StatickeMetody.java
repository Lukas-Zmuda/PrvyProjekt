
public class StatickeMetody {

	public static void main(String[] args) {
		ciara();
		System.out.println("Vitajte v mojom super programe");
		ciara();
		
		int[] cisla = {1, 25, -7, 89, 4};
		
		vypisPole(cisla);
		
		int[] cisla2 = vytvorPole(14, -1);
		vypisPole(cisla2);
		
		System.out.println();
		System.out.println(druhaMocnina(12.3));
		double moc = druhaMocnina(11.1);
		System.out.println(moc);
		System.out.println(scitaj(12, 3, 47));
		
		ciara(9);
		System.out.println("Dovidenia");
		ciara(9, "_");
		System.out.println(scitaj(1, 12, 178, 987, 546, 158));
		int[] c = {1, 2, 3, 4, 5};
		System.out.println(nasob(c));
	}
	
	//metoda bez navratovej hodnoty
	static void ciara() {
		System.out.println("------------------------------");
	}
	
	static void ciara(int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	static void ciara(int dlzka, String znak) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(int[] pole) {
		for(int i: pole) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	//metoda s navratovou hodnotou
	
	static double druhaMocnina(double cislo) {
		double hodnota = cislo * cislo;
		return hodnota;
	}
	
	static double scitaj(double a, double b, double c) {
		return a + b + c;
	}

	static int scitaj(int a, int b, int c) {
		return a + b + c;
	}
	
	static int scitaj(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	static int scitaj(int... cisla) {
		int suma = 0;
		for(int i = 0; i < cisla.length; i++) {
			suma += cisla[i];
		}
		return suma;
	}
	
	static int nasob(int[] cisla) {
		int suma = 1;
		for(int i = 0; i < cisla.length; i++) {
			suma *= cisla[i];
		}
		return suma;
	}
	
	static int[] vytvorPole(int pocetPrvkov, int hodnotaPrvku) {
		int[] pole = new int[pocetPrvkov];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = hodnotaPrvku;
		}
		return pole;
	}
}
