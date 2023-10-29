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
		setBounds(100, 100, 829, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
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
		
		JPanel Screen2 = new JPanel();
		contentPane.add(Screen2, "name_73551989553800");
		Screen2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel Screen3 = new JPanel();
		contentPane.add(Screen3, "name_73552004563600");
		Screen3.setLayout(new CardLayout(0, 0));
	}

}
