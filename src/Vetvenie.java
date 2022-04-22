
public class Vetvenie {

	public static void main(String[] args) {
		
		int a = -11;
		
		//neuplna podmienka
		if(a > 0) {
			System.out.println("a je kladne");
		}
	
		//uplna podmienka
		if(a % 2 == 0) {
			System.out.println("a je parne cislo");
		}else {
			System.out.println("a je neparne cislo");
		}
		
		if((a > 100) && (a < 200)) {
			System.out.println("a je z intervalu (100, 200)");
		}else {
			System.out.println("nie je z intervalu");
		}
		
		int skore = 120;
//		if(skore <= 100 && skore > 90) {
//			System.out.println(1);
//		}
		
		if(skore > 90) {
			System.out.println(1);
		}else if(skore > 80) {
			System.out.println(2);
		}else if(skore > 70) {
			System.out.println(3);
		}else if(skore > 60) {
			System.out.println(4);
		}else {
			System.out.println(5);
		}
		
		int denVTyzdni = 7;
//		if(denVTyzdni == 1) {
//			System.out.println("Pondelok");
//		}
		
		switch(denVTyzdni) {
		case 1:
			System.out.println("Pondelok");
			break;
		case 2:
			System.out.println("Utorok");
			break;
		case 3:
			System.out.println("Streda");
			break;
		case 4:
			System.out.println("Stvrtok");
			break;
		case 5:
			System.out.println("Piatok");
			break;
		case 6:
			System.out.println("Sobota");
			break;
		case 7:
			System.out.println("Nedela");
			break;
		default:
			System.out.println("Nespravny den v tyzdni!");
		}
		
		switch(denVTyzdni) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Pracovny den");
			break;
		case 6:
		case 7:
			System.out.println("Je tu vikend");
			break;
		}
		
		String smajlik = ":)";
		switch(smajlik) {
		case ":(":
			System.out.println("Som smutny");
			break;
		case ":)":
			System.out.println("Som vesely");
			break;
		}
		
		boolean prsi = false;
		if(prsi) {
			System.out.println("Zober si dazdnik");
		}else {
			System.out.println("Netreba ti dazdnik");
		}
		System.out.println("Program pokracuje dalej ...");

		int hladinaVody = 24;
		int premenna = 0;
		//od hladiny vody 50 a viac -> premenna = 1500
		
		
		if(hladinaVody > 50) {
			premenna = 1500;
		}else {
			premenna = 0;
		}
		
		//ternarny operator
		premenna = (hladinaVody > 50)? 1500: 0;
		
		
	}

}
