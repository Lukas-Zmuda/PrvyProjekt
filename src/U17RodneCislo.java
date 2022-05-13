import java.util.Scanner;

/**
 * Vytvorte program, ktory nacita od uzivatela rodne cislo
 * (bez casti za lomitkom) a vrati datum narodenia vo formate
 * dd.mm.rrrr - muz/zena
 * 
 * 
 * 
 * @author študent
 *
 */
public class U17RodneCislo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String pohlavie = "";
		
		System.out.println("Zadaj cele rodne cislo:");
		String rc = sc.nextLine();
		
		int rok = Integer.parseInt(rc.substring(0, 2));
		int mes = Integer.parseInt(rc.substring(2, 4));
		int den = Integer.parseInt(rc.substring(4, 6));
		
		String rrok = "", rmes = "", rden = "";
		if(rc.length() == 11) {
			if(rok < 54) {
				rrok = "20" + ((rok < 10)? "0" + rok: "" + rok);
			}else {
				rrok = "19" + ((rok < 10)? "0" + rok: "" + rok);
			}
		}else if(rc.length() == 10) {
			if(rok < 54) {
				rrok = "19" + ((rok < 10)? "0" + rok: "" + rok);
			}			
		}
		
		if(mes > 50) {
			pohlavie = "zena";
			mes -= 50;
		}else {
			pohlavie = "muz";
		}
		
		rmes = (mes < 10)? "0" + mes : "" + mes;
		rden = (den < 10)? "0" + den : "" + den;
		
		System.out.println(rden + "." + rmes + "." + rrok + "-" + pohlavie);

	}

}
