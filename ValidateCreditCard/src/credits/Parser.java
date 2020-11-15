package credits;
import java.util.ArrayList;

/**
 * Parser class. Different type of parsers can inherit this class.
 * 
 * @author arselanalvi
 *
 */
public class Parser {

	String file;
	ArrayList<Creditcard> cards = new ArrayList<Creditcard>();

	public Parser(String file) {
		this.file = file;
	}

	public void parse() {
	}

	public void addCard(Creditcard c) {
		cards.add(c);
	}

	public ArrayList<Creditcard> getCards() {
		return cards;
	}

}
