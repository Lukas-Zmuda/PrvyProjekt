
public class Operatory {

	public static void main(String[] args) {
		
		//aritmeticke operatory
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 % 3);
		
		int a = 10 * ((5 + 2) / 2);
		
		System.out.println("a = " + a);
		
		a = a + 5;
		a += 5;
		a =+ 5;
		a =- 5;
		a = 5;
		System.out.println(a);
		
		a -= 5;//a = a - 5;
		a *= 5;
		a /= 5;
		a %= 5;
		
		//a = a + 1;
		a += 1;
		a++;
		
		a--;
		++a;
			
		System.out.println("a = " + a);
		
		int b = ++a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//relacne
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		System.out.println(10 >= 5);
		System.out.println(10 <= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		
		int denT = 2;
		
		boolean jeUtorok = denT == 2;
		System.out.println(jeUtorok);
		
		//logicke op.
		//AND - &&
		//OR - ||
		//NOT - !
		
		//TODO task demo
		int hod = 22;
		boolean jeVikend = (denT > 5) && (denT < 8);
		
		/*			 AND	  OR	 NOT	
		 * +---+---+-------+-------+----+
		 * | A | B | A & B | A | B | !A |
		 * +---+---+-------+-------+----+
		 * | 1 | 1 |   1   |   1   |  0 |
		 * | 1 | 0 |   0   |   1   |  0 |
		 * | 0 | 1 |   0   |   1   |  1 |
		 * | 0 | 0 |   0   |   0   |  1 |
		 * +---+---+-------+-------+----+
		 *  		 * 
		 */
			
		
	}

}
