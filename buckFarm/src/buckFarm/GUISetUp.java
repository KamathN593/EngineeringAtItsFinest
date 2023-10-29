package buckFarm;

import java.awt.CardLayout;

/**
 * Controller class for GUI
 * @author Rebekkah Mobley
 *
 */
public class GUISetUp {
	
	/**
	 * variable for the window of the GUI
	 */
	private final MainFrame mainPanel;
	
	/**
	 * Constructor
	 */
	public GUISetUp (MainFrame mainWindow) {
		this.mainPanel = mainWindow;
	}
	
	/**
	 * Process the event that the sign-in button is pressed. 
	 * Check to ensure that the username and password match 
	 * an existing user-in this case, just user/password.
	 */
	public void processSignIn() {
		this.mainPanel.mainCard.next(this.mainPanel.contentPane);
	}
	
	/**
	 * Process the make post event for the business side of Farm
	 * to Buckeye.
	 */
	public void processMakePost() {
		//TODO: add code to switch to the make post screen
	}
	
	/**
	 * Process the current post event for the business side of
	 * Farm to Buckeye to show the current orders up.
	 */
	public void processCurrentpost() {
		//TODO: switch to the current post page
	}
	
	/**
	 * Process previous sales event for the business side of Farm
	 * to Buckeye to show the prior sales that the user made.
	 */
	public void processPreviousSales() {
		//TODO: switch to previous sales pages
	}

}
