package edu.swing.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Kalkulacka extends JFrame {

	private JPanel contentPane;
	private JTextField tfDisplay;
	private String cislo = "";
	private int c1 = 0, c2 = 0;
	private int operacia = 0;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_12;
	private JButton button_13;
	private JButton button_10;
	private JButton button_11;
	private JButton btnC;

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
					Kalkulacka frame = new Kalkulacka();
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
	public Kalkulacka() {		
		initComponents();
		createEvents();		
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tfDisplay = new JTextField();
		tfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		tfDisplay.setFont(new Font("Consolas", Font.PLAIN, 18));
		tfDisplay.setColumns(10);
		
		button = new JButton("1");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_1 = new JButton("2");
		
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_2 = new JButton("3");
		
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_3 = new JButton("4");
		
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_4 = new JButton("5");
		
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_5 = new JButton("6");
		
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_6 = new JButton("7");
		
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_7 = new JButton("8");
		
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_8 = new JButton("9");
		
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_9 = new JButton("0");
		
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_10 = new JButton("+");
		
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_11 = new JButton("=");
		
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnC = new JButton("C");
		
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_12 = new JButton("-");
		
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		button_13 = new JButton("*");
		
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tfDisplay, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_10)
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tfDisplay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(33))
		);
		contentPane.setLayout(gl_contentPane);
		
	}

	private void createEvents() {
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "1";
				tfDisplay.setText(cislo);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "2";
				tfDisplay.setText(cislo);
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "3";
				tfDisplay.setText(cislo);
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "4";
				tfDisplay.setText(cislo);
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "5";
				tfDisplay.setText(cislo);
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "6";
				tfDisplay.setText(cislo);
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "7";
				tfDisplay.setText(cislo);
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "8";
				tfDisplay.setText(cislo);
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "9";
				tfDisplay.setText(cislo);
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo += "0";
				tfDisplay.setText(cislo);
			}
		});
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1 = Integer.parseInt(cislo);
				cislo = "";
				operacia = 1;
			}
		});
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c2 = Integer.parseInt(cislo);
				cislo = "";
				int vysledok = 0;
				switch(operacia) {
				case 1:
					vysledok = c1 + c2;
					break;
				case 2:
					vysledok = c1 - c2;
					break;
				case 3:
					vysledok = c1 * c2;
					break;
					
				}
				String vypis = "" + vysledok;
				tfDisplay.setText(vypis);
				cislo = vypis;
				operacia = 0;
			}
		});
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cislo = "";
				tfDisplay.setText(cislo);
				operacia = 0;
			}
		});
		
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1 = Integer.parseInt(cislo);
				cislo = "";
				operacia = 2;
			}
		});
		
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				c1 = Integer.parseInt(cislo);
				cislo = "";
				operacia = 3;
			}
		});
		
	}

}
