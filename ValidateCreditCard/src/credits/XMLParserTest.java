package credits;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class XMLParserTest {

	@Test
	void testParse() {

		String test = "JUnitTestXML.xml";

		XMLParser cs = new XMLParser(test);
		cs.parse();

		ArrayList<Creditcard> tlist = cs.getCards();

		for (Creditcard c : tlist) {
			assert (c.cardholder.equals("Bob"));
			assert (c.cardnumber.equals("4120000000000"));
			// System.out.println(c);
		}

	}

}
