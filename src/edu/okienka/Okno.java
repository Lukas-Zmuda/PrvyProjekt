package edu.okienka;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Okno {

	public static void main(String[] args) {
		
		JFrame okno = new JFrame();
		
		okno.setVisible(true);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setSize(300, 200);
		okno.setTitle("Moje prve okno");
		
		JButton tlacidlo = new JButton("Stlac ma");
		okno.add(tlacidlo);

	}

}
