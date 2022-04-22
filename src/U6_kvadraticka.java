import java.util.Scanner;

public class U6_kvadraticka {

	public static void main(String[] args) {

		//nacitanie koeficientov a, b, c
		Scanner sc = new Scanner(System.in);
		double a, b, c, diskriminant, r1, r2, r;
		System.out.println("Zadaj koeficient a:");
		a = sc.nextDouble();
		System.out.println("Zadaj koeficient b:");
		b = sc.nextDouble();
		System.out.println("Zadaj koeficient c:");
		c = sc.nextDouble();
		
		//vypocet diskriminantu b^2 - 4*a*c
		diskriminant = b * b - (4 * a * c);
		//System.out.println("D=" + diskriminant);
		//vypocet korenov na zaklade diskriminantu
		if(diskriminant > 0) {
			//D>0 - rovnica ma 2 korene
			r1 = (-b + Math.sqrt(diskriminant))/(2 * a);
			r2 = (-b - Math.sqrt(diskriminant))/(2 * a);
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
		}else if(diskriminant == 0) {
			//D=0 - rovnica ma jeden koren -b/(2*a)
			r = -b / (2 * a);
			System.out.println("r = " + r);
		}else {
			System.out.println("Rovnica nema riesenie v R");
		}
		//D<0 - rovnica nema riesenie v R
		
		
	}

}
