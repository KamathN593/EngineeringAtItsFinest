package buckFarm;
import java.awt.event.ActionListener;

public interface MainFrameI extends ActionListener {

	/**
	 * Register the observer that will take care of all of
	 * the functionality.
	 * @param observer
	 * 				the observer in question
	 */
	void registerObserver(GUISetUp observer);
}
