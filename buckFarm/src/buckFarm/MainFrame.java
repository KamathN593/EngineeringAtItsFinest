package buckFarm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;

public class MainFrame extends JFrame implements MainFrameI {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public CardLayout mainCard;
	private GUISetUp controller;
	private boolean business;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		mainCard = new CardLayout(0,0);
		contentPane.setLayout(mainCard);
		
		JPanel MainPanel = new JPanel();
		contentPane.add(MainPanel, "name_73551973826100");
		MainPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel Title = new JPanel();
		MainPanel.add(Title);
		
		JLabel pageTitle = new JLabel("Farms to Buckeyes");
		pageTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pageTitle.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title.add(pageTitle);
		
		JPanel menuPanel_1 = new JPanel();
		MainPanel.add(menuPanel_1);
		menuPanel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuPanel_1.add(menuBar_1);
		
		JMenuItem homeMenuItem_1 = new JMenuItem("Home");
		homeMenuItem_1.setForeground(Color.BLACK);
		homeMenuItem_1.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar_1.add(homeMenuItem_1);
		
		JMenuItem shopperMenuItem_1 = new JMenuItem("Shopper");
		shopperMenuItem_1.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar_1.add(shopperMenuItem_1);
		
		JMenuItem profileMenuItem_1 = new JMenuItem("Profile");
		profileMenuItem_1.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar_1.add(profileMenuItem_1);
		
		JMenuItem farmerMenuItem_1 = new JMenuItem("Farmer");
		farmerMenuItem_1.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar_1.add(farmerMenuItem_1);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setFont(new Font("Freestyle Script", Font.PLAIN, 25));
		txtrWelcome.setText("              Welcome to farms to buckeye where we take fresh produce and bring to your homes!");
		MainPanel.add(txtrWelcome);
		
		JPanel Farmer = new JPanel();
		contentPane.add(Farmer, "name_73551989553800");
		Farmer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel Title_1 = new JPanel();
		Farmer.add(Title_1);
		Title_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel Farmer_1 = new JLabel("Farmers");
		Farmer_1.setHorizontalAlignment(SwingConstants.CENTER);
		Farmer_1.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title_1.add(Farmer_1);
		
		JPanel panel_1 = new JPanel();
		Title_1.add(panel_1);
		
		JButton FarmerLoginBtn = new JButton("Login");
		panel_1.add(FarmerLoginBtn);
		
		JButton FarmersCrAccBtn = new JButton("Create Account");
		panel_1.add(FarmersCrAccBtn);
		
		JPanel panel = new JPanel();
		Title_1.add(panel);
		
		JPanel Shopper = new JPanel();
		contentPane.add(Shopper, "name_73552004563600");
		Shopper.setLayout(new CardLayout(0, 0));
		
		JPanel Title_1_1 = new JPanel();
		Shopper.add(Title_1_1, "name_74498707344300");
		Title_1_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel Farmer_1_1 = new JLabel("Shoppers");
		Farmer_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Farmer_1_1.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title_1_1.add(Farmer_1_1);
		
		JPanel panel_3 = new JPanel();
		Title_1_1.add(panel_3);
		
		JButton ShoppersLoginBtn = new JButton("Login");
		panel_3.add(ShoppersLoginBtn);
		
		JButton ShoppersCrAccBtn = new JButton("Create Account");
		panel_3.add(ShoppersCrAccBtn);
		ShoppersCrAccBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel_2 = new JPanel();
		Title_1_1.add(panel_2);
		
		JPanel ShopperLoginPanel = new JPanel();
		contentPane.add(ShopperLoginPanel, "name_84376621403200");
		
		JPanel ShopperNewUserPanel = new JPanel();
		contentPane.add(ShopperNewUserPanel, "name_84385803057700");
		
		JPanel FarmerLoginPanel = new JPanel();
		contentPane.add(FarmerLoginPanel, "name_84387444869900");
		
		JPanel FarmerNewUserPanel = new JPanel();
		contentPane.add(FarmerNewUserPanel, "name_84438364935500");
		
		//Add action listeners
		homeMenuItem_1.addActionListener(this);
		shopperMenuItem_1.addActionListener(this);
		profileMenuItem_1.addActionListener(this);
		farmerMenuItem_1.addActionListener(this);
		
		/*
		 * Ensure the program ends on close and that the frame is visible
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void registerObserver(GUISetUp observer) {

		this.controller = observer;
		
	}

}
