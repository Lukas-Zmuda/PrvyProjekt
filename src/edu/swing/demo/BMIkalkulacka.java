package edu.swing.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMIkalkulacka extends JFrame {

	private JPanel contentPane;
	private JTextField tfHmotnost;
	private JTextField tfVyska;
	private JButton btnVypocitaj;
	private JButton btnVymaz;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIkalkulacka frame = new BMIkalkulacka();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BMIkalkulacka() {
		
		initComponents();
		createEvents();
		
		
	}

	private void initComponents() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BMIkalkulacka.class.getResource("/edu/swing/res/icons8_hamburger_32px.png")));
		setTitle("BMI kalkulačka");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 322, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 286, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hmotnosť:");
		lblNewLabel.setBounds(10, 14, 68, 17);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tfHmotnost = new JTextField();
		tfHmotnost.setBounds(88, 11, 149, 23);
		panel.add(tfHmotnost);
		tfHmotnost.setToolTipText("hmotnosť v kg");
		tfHmotnost.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfHmotnost.setColumns(10);
		
		tfVyska = new JTextField();
		tfVyska.setBounds(88, 41, 149, 23);
		panel.add(tfVyska);
		tfVyska.setToolTipText("výška v cm");
		tfVyska.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfVyska.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Výška:");
		lblNewLabel_1.setBounds(37, 42, 41, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("kg");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(245, 11, 20, 23);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("cm");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(245, 41, 20, 23);
		panel.add(lblNewLabel_3);
		
		btnVypocitaj = new JButton("");
		
		btnVypocitaj.setToolTipText("vypočítaj BMI");
		btnVypocitaj.setIcon(new ImageIcon(BMIkalkulacka.class.getResource("/edu/swing/res/icons8_calculator_32px.png")));
		btnVypocitaj.setBounds(10, 99, 135, 41);
		contentPane.add(btnVypocitaj);
		
		btnVymaz = new JButton("");
		
		btnVymaz.setToolTipText("vymaž formulár");
		btnVymaz.setIcon(new ImageIcon(BMIkalkulacka.class.getResource("/edu/swing/res/icons8_Delete_32px_1.png")));
		btnVymaz.setBounds(155, 99, 141, 41);
		contentPane.add(btnVymaz);
		
	}

	private void createEvents() {
		
		btnVypocitaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bmi;
				double vyska;
				if(!tfVyska.getText().equals("")) {
					vyska = Double.parseDouble(tfVyska.getText());					
				}else {
					tfVyska.setBackground(new Color(255, 0, 0));
					vyska = 1;
				}
				int hmotnost;
				if(!tfHmotnost.getText().equals("")) {
					hmotnost = Integer.parseInt(tfHmotnost.getText());
				}else {
					hmotnost = 1;
					tfHmotnost.setBackground(new Color(255, 0, 0 ));
				}
				vyska = vyska / 100;
				bmi = hmotnost / (vyska * vyska);

				String vypis = "";
				vypis += "BMI: " + bmi + " - ";
							
				if(bmi > 40) {
					vypis += "Tazka obezita";
				}else if(bmi > 30) {
					vypis += "Obezita";
				}else if(bmi > 25) {
					vypis += "Mierna nadvaha";
				}else if(bmi > 18.5){
					vypis += "Zdrava vaha";
				}else {
					vypis += "Podvyziva";
				}
				
				JOptionPane.showMessageDialog(rootPane, vypis);

			}
		});
		
		btnVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfHmotnost.setText("");
				tfHmotnost.setBackground(new Color(255,255,255));
				tfVyska.setText("");
				tfVyska.setBackground(new Color(255,255,255));
				
			}
		});
		
	}

}
