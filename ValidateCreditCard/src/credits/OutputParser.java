package credits;
import java.util.ArrayList;

/**
 * Output Parser can be inherited by different types of output parsers.
 * 
 * @author arselanalvi
 *
 */
public class OutputParser {
	ArrayList<Creditcard> c;

	public OutputParser(ArrayList<Creditcard> c) {
		this.c = c;
	}

	public void out() {
	}

}
