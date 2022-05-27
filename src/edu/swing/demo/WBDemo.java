package edu.swing.demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WBDemo extends JFrame {

	private JPanel contentPane;
	private JButton btnStlac;
	private JTextField tfMeno;
	private JRadioButton rdbtnZena;
	private JRadioButton rdbtnMuz;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnVymaz;
	private JComboBox cbTitul;
	private JCheckBox chckbxStav;
	private JPanel pT1;
	private JPanel pT2;

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
					WBDemo frame = new WBDemo();
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
	public WBDemo() {
		initComponents();
		createEvents();		
	}

	private void initComponents() {
		setTitle("WB Demo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(WBDemo.class.getResource("/edu/swing/res/icons8_monkey_52px.png")));
		setBounds(100, 100, 819, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnStlac = new JButton("Stlac ma");
		btnStlac.setIcon(new ImageIcon(WBDemo.class.getResource("/edu/swing/res/icons8_natural_user_interface_2_32px.png")));
		btnStlac.setBounds(672, 11, 121, 43);
		contentPane.add(btnStlac);		
		
		JLabel lblMeno = new JLabel("Meno:");
		lblMeno.setBounds(10, 15, 46, 14);
		contentPane.add(lblMeno);
		
		tfMeno = new JTextField();
		tfMeno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfMeno.setToolTipText("Sem zadaj meno");
		tfMeno.setBounds(80, 8, 330, 26);
		contentPane.add(tfMeno);
		tfMeno.setColumns(10);
		
		rdbtnMuz = new JRadioButton("Muž");
		buttonGroup.add(rdbtnMuz);
		rdbtnMuz.setBounds(80, 41, 46, 23);
		contentPane.add(rdbtnMuz);
		
		rdbtnZena = new JRadioButton("Žena");
		rdbtnZena.setSelected(true);
		buttonGroup.add(rdbtnZena);
		rdbtnZena.setBounds(128, 41, 65, 23);
		contentPane.add(rdbtnZena);
		
		btnVymaz = new JButton("Vymaž");
		btnVymaz.setIcon(new ImageIcon(WBDemo.class.getResource("/edu/swing/res/icons8_Delete_32px.png")));
		
		btnVymaz.setBounds(672, 65, 121, 43);
		contentPane.add(btnVymaz);
		
		cbTitul = new JComboBox();
		cbTitul.setModel(new DefaultComboBoxModel(new String[] {"", "Bc.", "Ing.", "Mgr.", "RNDr.", "MUDr.", "JUDr."}));
		cbTitul.setSelectedIndex(1);
		cbTitul.setBounds(80, 66, 121, 22);
		contentPane.add(cbTitul);
		
		JLabel lblNewLabel = new JLabel("Pohlavie:");
		lblNewLabel.setBounds(10, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titul:");
		lblNewLabel_1.setBounds(10, 70, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		chckbxStav = new JCheckBox("ženatý/vydatá");
		chckbxStav.setBounds(80, 107, 97, 23);
		contentPane.add(chckbxStav);
		
		JLabel lblNewLabel_2 = new JLabel("Stav:");
		lblNewLabel_2.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tla\u010Didl\u00E1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(355, 65, 261, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pT1 = new JPanel();
		
		pT1.setBackground(new Color(0, 204, 0));
		pT1.setBounds(10, 22, 52, 54);
		panel.add(pT1);
		
		pT2 = new JPanel();
		
		pT2.setBackground(new Color(0, 102, 255));
		pT2.setBounds(72, 22, 52, 54);
		panel.add(pT2);
	}

	private void createEvents() {
		
		pT2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pT2.setBackground(new Color(0, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pT2.setBackground(new Color(0, 102, 255));
			}
		});
		
		pT1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pT1.setBackground(new Color(0, 255, 51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pT1.setBackground(new Color(0, 204, 0));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(rootPane, "Klikol si na zelene tlacidlo!");
			}
		});
		
		btnStlac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String meno = tfMeno.getText();
				meno = "Ahoj " + cbTitul.getSelectedItem() + " " + meno + ". ";
				if(rdbtnZena.isSelected()) {
					if(chckbxStav.isSelected()) {
						meno += "Vitajte pani.";
					}else {
						meno += "Vitajte slecna.";						
					}
				}else {
					meno += "Vitajte pane.";
				}
				//JOptionPane.showMessageDialog(rootPane, meno);
				tfMeno.setText(meno);
			}
		});
		
		btnVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfMeno.setText("");
				cbTitul.setSelectedIndex(1);
				rdbtnZena.setSelected(true);
				chckbxStav.setSelected(false);
			}
		});
		
	}
}
