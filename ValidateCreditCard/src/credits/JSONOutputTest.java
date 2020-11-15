package credits;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JSONOutputTest {

	@Test
	void testOut() {

		Creditcard card1 = new Creditcard("4120000000000", "4/20/2030", "Bob", "V I S A");
		ArrayList<Creditcard> testlist = new ArrayList<Creditcard>();
		testlist.add(card1);

		String sampleout = "{\"cardnumber\":\"4120000000000\",\"expdate\":\"4/20/2030\",\"cardholder\":\"Bob\",\"issuer\":\"V I S A\"}";
		JSONOutput jo = new JSONOutput(testlist);
		jo.out();

		assert (sampleout.equals(jo.JUnitTestString));

	}

}
