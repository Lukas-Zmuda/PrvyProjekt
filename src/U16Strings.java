
public class U16Strings {

	public static void main(String[] args) {
		
		String email = "info@elct.sk";
		
		String schranka = schranka(email);//info
		String server = server(email);//elct.sk
		boolean validna = valid(email);	
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
		
		return false;
	}

	static String server(String email) {
		
		return null;
	}

	static String schranka(String email) {
		
		
		return null;
	}

}
