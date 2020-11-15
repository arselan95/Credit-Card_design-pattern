package credits;

import java.util.ArrayList;

/**
 * Test Driver class to test the application
 * 
 * @author arselanalvi
 *
 */
public class Test {

	static String inputfile;
	static String outputfile;
	static ArrayList<Creditcard> outputcards = new ArrayList<Creditcard>();

	public static void main(String[] args)

	{
		inputfile = args[0];
		outputfile = args[1];

		/*
		 * Handle Input
		 */
		InputFile ifile = new InputFile(new Parser(args[0]));
		ifile.determineInput(inputfile);

		ArrayList<Creditcard> parsedcards = new ArrayList<Creditcard>();
		parsedcards = ifile.parsedcards;

		String name = "";
		String number = "";
		String date = "";

		/*
		 * Algorithm to figure out which card
		 */
		for (Creditcard c : parsedcards) {

			number = c.cardnumber;
			name = c.cardholder;
			date = c.expdate;

			Card inputcard = new Card(new Creditcard(number, date, name));
			Creditcard outputcard = inputcard.getType(number, date, name);

			outputcards.add(outputcard);

		}
		/*
		 * Handle Output
		 */
		OutputFile out = new OutputFile(new OutputParser(outputcards));
		out.determineOutputfile(outputfile);

	}

}
