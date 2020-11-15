package credits;
import java.util.ArrayList;

/**
 * Determine input file 
 * @author arselanalvi
 *
 */

public class InputFile {
	Parser p;
	ArrayList<Creditcard>parsedcards ;
	String JUnitTestString;

	public InputFile(Parser p) {
		this.p = p;
	}

	public void determineInput(String file) {
		
		String json = ".json";
		String xml = ".xml";
		String csv = ".csv";

		parsedcards = new ArrayList<Creditcard>();
		
		int index = file.indexOf('.');
		String type = file.substring(index);

		System.out.println(type);

		/*
		 * case 1: JSON
		 */
		if (type.equals(json)) {
			p = new MyJSONParser(p.file);
			p.parse();
			parsedcards = p.getCards();
			
			//test
			JUnitTestString=json;
		}

		/*
		 * case 2: CSV
		 */
		if (type.equals(csv)) {
			p = new CSVParser(p.file);
			p.parse();
			parsedcards = p.getCards();
			
			//test
			JUnitTestString=csv;

		}

		/*
		 * case 3: XML
		 */
		if (type.equals(xml)) {
			p = new XMLParser(p.file);
			p.parse();
			parsedcards = p.getCards();
			
			//test
			JUnitTestString=xml;

		}

	}

}
