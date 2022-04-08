import java.util.Scanner;

/**
 * Program na vypocet sprepitneho zo sumy uctu
 * -> suma
 * -> sprepitne(v percentach)
 * <- sprepitne (v EUR), celkova suma
 * -------
 * ->Zadaj sumu: 10
 * ->Kolko chces dat sprepitne(%)? 15
 * <-Sprepitne je 1.5 EUR. Spolu potrebujes zaplatit 11.50 EUR
 * 
 * @author lukas
 *
 */
public class U3_Sprepitne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double suma = 0, celkovaSuma = 0, sumaSprepitne = 0;
		double sprepitne = 0;
				
		//nacitanie vstupnych udajov
		System.out.println("Zadaj sumu: ");
		suma = sc.nextDouble();
		System.out.println("Kolko chcete dat sprepitne(%)? ");
		sprepitne = sc.nextDouble();
		
		//vypocet sprepitneho a celkovej sumy
		sumaSprepitne = (sprepitne / 100) * suma;
		celkovaSuma = suma + sumaSprepitne;
		
		//vypis udajov na konzolu
		System.out.println("Sprepitne je " + sumaSprepitne + 
				". Spolu potrebujete zaplatit " + celkovaSuma + " EUR");
		

	}

}
