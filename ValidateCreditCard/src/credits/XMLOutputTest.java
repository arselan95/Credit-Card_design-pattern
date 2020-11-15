package credits;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class XMLOutputTest {

	@Test
	void testOut() {
		Creditcard card1 = new Creditcard("4120000000000", "4/20/2030", "Bob", "V I S A");
		ArrayList<Creditcard> testlist = new ArrayList<Creditcard>();
		testlist.add(card1);

		XMLOutput jo = new XMLOutput(testlist);
		jo.out();

	}

}
