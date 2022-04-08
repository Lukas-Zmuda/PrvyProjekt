import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String meno = "";
		
		//vyzveme pouzivatela aby zadal meno
		System.out.println("Zadaj meno: ");
		
		//nacitame meno z konzoly do premennej
		meno = sc.nextLine();
		//pozdravime uzivatela jeho menom
		
		System.out.println("Ahoj " + meno + ". V ktorom roku si sa narodil?");
		int rokNarodenia = 0;
		rokNarodenia = sc.nextInt();
		
		System.out.println("Mas " + (2022 - rokNarodenia) + " rokov.");
	}
}