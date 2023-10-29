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
	 * Process the event that the farmer button was pressed
	 */
	public void processFarmer() {
		this.mainPanel.mainCard.show(this.mainPanel.contentPane,"Farmer");
	}
	
	/**
	 * Process the make post event for the business side of Farm
	 * to Buckeye.
	 */
	public void processProfile() {
		//TODO: add code to switch to the make post screen
	}
	
	/**
	 * Process the current post event for the business side of
	 * Farm to Buckeye to show the current orders up.
	 */
	public void processShopper() {
		this.mainPanel.mainCard.show(this.mainPanel.contentPane, "Shopper");
	}
	
	/**
	 * Process previous sales event for the business side of Farm
	 * to Buckeye to show the prior sales that the user made.
	 */
	public void processHome() {
		this.mainPanel.mainCard.show(this.mainPanel.contentPane, "MainPanel");

	}

}
