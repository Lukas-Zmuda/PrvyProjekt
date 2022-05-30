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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JProgressBar;

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
	private JButton btnNastavenia;
	private JTextArea taVypis;
	private JSpinner spinner;
	private JSlider slider;
	private JMenuItem mntmUkoncit;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JMenuItem mntmVymazat;
	private JProgressBar progressBar;
	private JButton btnPlus;
	private JMenuItem mntmVymaz;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Súbor");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nový");
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Uložiť");
		mntmNewMenuItem_1.setEnabled(false);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Otvoriť");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmUkoncit = new JMenuItem("Ukončiť");
		mntmUkoncit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		mntmUkoncit.setIcon(new ImageIcon(WBDemo.class.getResource("/edu/swing/res/icons8_Close_16px.png")));
		
		mnNewMenu.add(mntmUkoncit);
		
		JMenu mnNewMenu_1 = new JMenu("Upraviť");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Nastavenia");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Všeobecné");
		mnNewMenu_2.add(mnNewMenu_3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Nastavenie 1");
		mnNewMenu_3.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("Nastavenie 2");
		mnNewMenu_3.add(chckbxmntmNewCheckItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("Nastavenie 3");
		mnNewMenu_3.add(chckbxmntmNewCheckItem_2);
		
		JMenu mnNewMenu_4 = new JMenu("Vlastnosti");
		mnNewMenu_2.add(mnNewMenu_4);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Radio 1");
		buttonGroup_1.add(rdbtnmntmNewRadioItem);
		mnNewMenu_4.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Radio 2");
		buttonGroup_1.add(rdbtnmntmNewRadioItem_1);
		mnNewMenu_4.add(rdbtnmntmNewRadioItem_1);
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
		
		btnNastavenia = new JButton("");
		btnNastavenia.setIcon(new ImageIcon(WBDemo.class.getResource("/edu/swing/res/icons8_settings_32px.png")));
		btnNastavenia.setBounds(728, 119, 65, 61);
		contentPane.add(btnNastavenia);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 271, 162, 156);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(324, 288, 65, 61);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(WBDemo.class.getResource("/edu/swing/res/icons8_hamburger_32px.png")));
		panel_1.add(lblNewLabel_3);
		
		spinner = new JSpinner();
		
		spinner.setModel(new SpinnerNumberModel(0, null, 20, 1));
		spinner.setBounds(80, 160, 59, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_4 = new JLabel("Počet detí:");
		lblNewLabel_4.setBounds(10, 166, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		slider = new JSlider();
		
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(5);
		slider.setValue(0);
		slider.setMaximum(20);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(149, 137, 196, 75);
		contentPane.add(slider);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(421, 271, 348, 181);
		contentPane.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Prva karta", null, panel_2, null);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Druhá karta", null, panel_3, null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton_2))
					.addContainerGap(228, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_2)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		taVypis = new JTextArea();
		taVypis.setBounds(24, 271, 160, 154);
		contentPane.add(taVypis);
		taVypis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(taVypis, popupMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Nastavenia");
		popupMenu.add(mntmNewMenuItem_3);
		
		mntmVymazat = new JMenuItem("Vymazať");
		
		popupMenu.add(mntmVymazat);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMaximum(10);
		progressBar.setBounds(24, 223, 196, 26);
		contentPane.add(progressBar);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(progressBar, popupMenu_1);
		
		mntmVymaz = new JMenuItem("Vymaž");
		
		popupMenu_1.add(mntmVymaz);
		
		btnPlus = new JButton("+");
		
		btnPlus.setBounds(230, 223, 41, 26);
		contentPane.add(btnPlus);
	}

	private void createEvents() {
		
		mntmVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(0);
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(progressBar.getValue() + 1);
				
				if(progressBar.getValue() >= 7) {
					progressBar.setForeground(Color.RED);
				}else if(progressBar.getValue() <= 3) {
					progressBar.setForeground(Color.YELLOW);
				}else {
					progressBar.setForeground(Color.BLUE);
				}
			}
		});
		
		mntmVymazat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taVypis.setText("");
			}
		});
		
		mntmUkoncit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider.setValue((int)spinner.getValue());
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				spinner.setValue(slider.getValue());
			}
		});
		
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
				//tfMeno.setText(meno);
				meno += "\nPocet deti: " + spinner.getValue();
				taVypis.setText(meno);
			}
		});
		
		btnVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfMeno.setText("");
				cbTitul.setSelectedIndex(1);
				rdbtnZena.setSelected(true);
				chckbxStav.setSelected(false);
				spinner.setValue(0);
				taVypis.setText("");
			}
		});
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
