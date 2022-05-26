package edu.okienka;

import javax.swing.JOptionPane;

public class Okienka {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Toto je dolezita informacia!");
		
		//JOptionPane.showMessageDialog(null, "Nastala chyba v programe!", "POZOR", JOptionPane.PLAIN_MESSAGE);
		
		
		//String meno = JOptionPane.showInputDialog("Ako sa volas?");
//		System.out.println(meno);
		
		//int rokNarodenia = Integer.parseInt(JOptionPane.showInputDialog("V ktorom roku si sa narodil?"));
		
		
		//JOptionPane.showMessageDialog(null, "Ahoj " + meno + ". Mas " + (2021 - rokNarodenia) + " rokov.");
		
		//int volba = JOptionPane.showConfirmDialog(null, "Chces ukoncit aplikaciu?", "Koniec?", JOptionPane.YES_NO_CANCEL_OPTION);
		
		
		Object[] moznosti = {"Ano, prosim", "Nie, dakujem", "Neviem"};
		
		//int volba = JOptionPane.showOptionDialog(null, "Chces sa naucit programovat?", "Klucova otazka",
		//		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, moznosti, moznosti[2]);
		
		Object[] jedla = {"sunka", "vajicka", "parky", "zelenina"};
		String volba = (String)JOptionPane.showInputDialog(null, "Co chces na ranajky?", "Klucova otazka", 
				JOptionPane.QUESTION_MESSAGE, null, jedla, jedla[2]);
				
		System.out.println(volba);

	}

}
