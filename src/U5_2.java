
public class U5_2 {

	public static void main(String[] args) {
		System.out.println(sumDigits(1000000000000001l));//9

	}
	
	static int sumDigits(long n) {

		int suma = 0;
		
		while(n != 0) {
			suma += n % 10;
			n = n / 10;
		}
		
		return suma;
	}
}
