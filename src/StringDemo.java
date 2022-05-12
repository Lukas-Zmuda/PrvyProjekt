
public class StringDemo {

	public static void main(String[] args) {
		
		String veta = "Java je super jazyk";
		
		String veta2 = new String("Java je super jazyk");
		
		String veta3 = "Java je super jazyk";
		
		String veta4 = new String("Java je super jazyk");
		
		String m = "PeTeR";
		String m2 = "pEtEr";
		
		System.out.println(veta2);
		System.out.println(veta);
		System.out.println(veta == veta2);
		System.out.println(veta == veta3);
		System.out.println(veta2 == veta4);
		System.out.println("-----------");
		System.out.println(veta.equals(veta2));
		System.out.println(veta2.equals(veta4));
		
		System.out.println(veta.toUpperCase());
		System.out.println(veta);
		System.out.println(veta.toLowerCase());
		
		System.out.println(m.equals(m2));
		System.out.println(m.toLowerCase().equals(m2.toLowerCase()));
		System.out.println(m.equalsIgnoreCase(m2));
		
		System.out.println(veta.length());

		System.out.println(veta.concat(veta2));
		System.out.println(veta + veta2);
		
		System.out.println(m.startsWith("Pe"));
		System.out.println(m.endsWith("r"));
		
		System.out.println(veta.charAt(0));
		
		for(int i = 0; i < m.length(); i++) {
			System.out.println((i) + ". " + m.charAt(i));
		}
		
		System.out.println(m.indexOf('q'));
		
		System.out.println(veta.substring(14));
		System.out.println(veta.substring(0, 4));
		
		System.out.println(veta.replace(' ', '-'));
		
	}

}
