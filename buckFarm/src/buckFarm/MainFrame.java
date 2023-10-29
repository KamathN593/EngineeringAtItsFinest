package buckFarm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
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

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pageTitlePanel = new JPanel();
		contentPane.add(pageTitlePanel);
		pageTitlePanel.setLayout(new CardLayout(0, 0));
		
		JLabel pageTitle = new JLabel("Farms to Buckeyes");
		pageTitle.setFont(new Font("Freestyle Script", Font.PLAIN, 52));
		pageTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pageTitlePanel.add(pageTitle, "name_568084855432200");
		
		JLabel lblNewLabel = new JLabel("");
		pageTitlePanel.add(lblNewLabel, "name_573907829540600");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\manas\\Downloads\\brutusInCornucopia.png"));
		
		JPanel menuPanel = new JPanel();
		contentPane.add(menuPanel);
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuPanel.add(menuBar);
		
		JMenuItem homeMenuItem = new JMenuItem("Home");
		homeMenuItem.setForeground(new Color(0, 0, 0));
		homeMenuItem.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(homeMenuItem);
		
		JMenuItem shopperMenuItem = new JMenuItem("Shopper");
		shopperMenuItem.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(shopperMenuItem);
		
		JMenuItem profileMenuItem = new JMenuItem("Profile");
		profileMenuItem.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(profileMenuItem);
		
		JMenuItem farmerMenuItem = new JMenuItem("Farmer");
		farmerMenuItem.setFont(new Font("Freestyle Script", Font.PLAIN, 30));
		menuBar.add(farmerMenuItem);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
	}

}
