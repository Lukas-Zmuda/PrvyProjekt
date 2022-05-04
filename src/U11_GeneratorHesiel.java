import java.util.Scanner;

/**
 * Vytvorte generator hesiel 
 * - heslo bude generovane zo znakov a-z, 0-9, A-Z 
 * - uzivatel zada na vstupe dlzku hesla a program mu vygeneruje heslo - napr. dlzka = 5
 * heslo = fqwer
 * 
 * @author lukas
 *
 */
public class U11_GeneratorHesiel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zadaj dlzku hesla :");
		int dlzkaHesla = scanner.nextInt();
		String heslo = "";

		// define the range, ASCII a-z = 97-122
		int max = 122;
		int min = 97;
		int range = max - min + 1;

		for (int i = 0; i < dlzkaHesla; i++) {
			int rand = (int) (Math.random() * range) + min;
			char znakHesla = (char) rand;

			heslo = heslo + znakHesla;

		}
		System.out.println(heslo);

	}
}