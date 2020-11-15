package credits;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CSVParserTest {

	@Test
	void testParse() {
		String test = "JUnitCSVTest.csv";

		CSVParser cs = new CSVParser(test);
		cs.parse();

		ArrayList<Creditcard> tlist = cs.getCards();

		for (Creditcard c : tlist) {
			assert (c.cardholder.equals("Bob"));
			assert (c.cardnumber.equals("4120000000000"));
			// System.out.println(c);
		}

	}

}
