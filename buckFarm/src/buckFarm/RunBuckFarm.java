package buckFarm;

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
		
		//TODO: Add a call to add control as an obseverer for window

	}

}
