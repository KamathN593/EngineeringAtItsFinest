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
	private JMenuItem homeMenu,shopperMenu,profileMenu,farmerMenu;

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
		contentPane.add(MainPanel, "MainPanel");
		MainPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel Title = new JPanel();
		MainPanel.add(Title);
		
		JLabel pageTitle = new JLabel("Farms to Buckeyes");
		pageTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pageTitle.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title.add(pageTitle);
		
		JPanel menuPanel = new JPanel();
		MainPanel.add(menuPanel);
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuPanel.add(menuBar);
		
		this.homeMenu = new JMenuItem("Home");
		homeMenu.setForeground(Color.BLACK);
		homeMenu.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(homeMenu);
		
		shopperMenu = new JMenuItem("Shopper");
		shopperMenu.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(shopperMenu);
		
		profileMenu = new JMenuItem("Profile");
		profileMenu.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(profileMenu);
		
		farmerMenu = new JMenuItem("Farmer");
		farmerMenu.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(farmerMenu);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setFont(new Font("Freestyle Script", Font.PLAIN, 25));
		txtrWelcome.setText("              Welcome to farms to buckeye where we take fresh produce and bring to your homes!");
		MainPanel.add(txtrWelcome);
		
		JPanel Farmer = new JPanel();
		contentPane.add(Farmer, "Farmer");
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
		contentPane.add(Shopper, "Shopper");
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
		
		JPanel panel_2 = new JPanel();
		Title_1_1.add(panel_2);
		
		JPanel ShopperLoginPanel = new JPanel();
		contentPane.add(ShopperLoginPanel, "ShopperLogin");
		
		JPanel ShopperNewUserPanel = new JPanel();
		contentPane.add(ShopperNewUserPanel, "ShopNew");
		
		JPanel FarmerLoginPanel = new JPanel();
		contentPane.add(FarmerLoginPanel, "FarmLogin");
		
		JPanel FarmerNewUserPanel = new JPanel();
		contentPane.add(FarmerNewUserPanel, "FarmNew");
		
		//Add action listeners
		homeMenu.addActionListener(this);
		shopperMenu.addActionListener(this);
		profileMenu.addActionListener(this);
		farmerMenu.addActionListener(this);
		ShoppersCrAccBtn.addActionListener(this);
		ShoppersLoginBtn.addActionListener(this);
		FarmersCrAccBtn.addActionListener(this);
		
		/*
		 * Ensure the program ends on close and that the frame is visible
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		if(source == this.homeMenu) {
			this.controller.processHome();
		} else if (source == this.farmerMenu) {
			this.controller.processFarmer();
		} else if (source == this.shopperMenu) {
			this.controller.processShopper();
		}
	}

	@Override
	public void registerObserver(GUISetUp observer) {

		this.controller = observer;
		
	}

}
