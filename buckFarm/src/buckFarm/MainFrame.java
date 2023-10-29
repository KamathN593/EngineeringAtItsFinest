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
		
		JLabel label = new JLabel("");
		MainPanel.add(label);
		
		JPanel Farmer = new JPanel();
		contentPane.add(Farmer, "name_73551989553800");
		Farmer.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel Title_1 = new JPanel();
		Farmer.add(Title_1);
		
		JLabel Farmer_1 = new JLabel("Farmers");
		Farmer_1.setHorizontalAlignment(SwingConstants.CENTER);
		Farmer_1.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title_1.add(Farmer_1);
		
		JPanel Shopper = new JPanel();
		contentPane.add(Shopper, "name_73552004563600");
		Shopper.setLayout(new CardLayout(0, 0));
		
		JPanel Title_1_1 = new JPanel();
		Shopper.add(Title_1_1, "name_74498707344300");
		
		JLabel Farmer_1_1 = new JLabel("Shoppers");
		Farmer_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Farmer_1_1.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		Title_1_1.add(Farmer_1_1);
		
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
		this.controller.processSignIn();
		
	}

	@Override
	public void registerObserver(GUISetUp observer) {

		this.controller = observer;
		
	}

}
