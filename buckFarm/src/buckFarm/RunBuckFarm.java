package buckFarm;

/**
 * Program for running and creating the Farm to Buckeye  
 * app.
 * @author biscu
 *
 */
public class RunBuckFarm {
	
	/**
	 * Empty constructor
	 */
	private RunBuckFarm() {
	}

	/**
	 * Main method
	 * @param args
	 * 			not used
	 */
	public static void main(String[] args) {
		/*
		 * Create instances of mainFrame and GUISetUp
		 */
		MainFrame window = new MainFrame();
		GUISetUp control = new GUISetUp(window);
		
		window.registerObserver(control);

	}

}
