
public class U16Strings {

	public static void main(String[] args) {
		
		String email = "info@posta.elct.sk";
		
		String schranka = schranka(email);//info
		System.out.println(schranka);
		String server = server(email);//elct.sk
		System.out.println(server);
		boolean validna = valid(email);	
		System.out.println(validna);
	}

	/**
	 * Email je validny ak:
	 * - v casti za zavinacom (serverova cast) sa nachadza aspon 1 bodka 
	 * 		(info@info - FALSE, info@posta.elct.sk - TRUE)
	 * - v adrese sa musi nachadzat prave 1 zavinac
	 *      (testtest.sk - FALSE, info@elct.sk - TRUE, info@posta.elct@sk - FALSE)
	 * 
	 * @param email
	 * @return true - validny email
	 */
	static boolean valid(String email) {
		int pocetBodiek = 0;
		int pocetZavinacov = 0;
		for(int i = 0; i < server(email).length(); i++) {
			if(server(email).charAt(i) == '.') {
				pocetBodiek++;
			}
		}
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				pocetZavinacov++;
			}
		}
		return (pocetBodiek > 0) && (pocetZavinacov == 1);			
	}

	static String server(String email) {
		int poziciaZavinac = email.indexOf('@');
		return email.substring(poziciaZavinac + 1);
	}

	static String schranka(String email) {
		return email.substring(0, email.indexOf('@'));
	}

}
