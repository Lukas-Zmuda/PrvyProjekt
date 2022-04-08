
public class VystupPrintf {

	public static void main(String[] args) {
		int vek = 18;
		String meno = "Fero";
		double priemer = 1.78545;
		
		System.out.println("Ziak " + meno + " ma " + vek + " rokov. Priemerna znamka je " + priemer);

		System.out.printf("Ziak %s ma %d rokov. Priemerna znamka je %.2f", meno, vek, priemer);
	}
}