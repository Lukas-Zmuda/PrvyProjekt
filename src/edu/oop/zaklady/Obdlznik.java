package edu.oop.zaklady;

/**
 * Obdlznik
 *  - v instancnych premennych evidujeme dlzku a sirku
 *  - metody:
 *  	-void info() - vypise informacie o obdlzniku v tvare:
 *  		Obdlznik d = xx cm, s = xx cm.
 *  	-double obvod() - vrati obvod obdlznika (2 * (d+s))
 *  	-double obsah() - vrati obsah obdlznika (d * s)
 *  	-boolean jeStvorec() - vrati true v pripadem, ze obdlznik je stvorec (d = s)
 * @author študent
 *
 */

public class Obdlznik {
	
	double d;
	double s;
	
	void info() {
		System.out.println("Obdlznik d = " + d + " cm, s = " + s + " cm.");
	}
	
	double obvod() {
		return 2 * (d + s);
	}
	
	double obsah() {
		return d * s;
	}
	
	boolean jeStvorec() {
		return d == s;
	}

}
