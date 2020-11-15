package credits;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MyJSONParserTest {

	@Test
	void testParse() {
		String test = "JUnitTestJson.json";

		MyJSONParser cs = new MyJSONParser(test);
		cs.parse();

		ArrayList<Creditcard> tlist = cs.getCards();

		for (Creditcard c : tlist) {
			assert (c.cardholder.equals("Eve"));
			assert (c.cardnumber.equals("341000000000000"));
			// System.out.println(c);
		}
	}

}
