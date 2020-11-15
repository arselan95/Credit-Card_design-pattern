package credits;

/**
 * Determine Output file based on input
 * 
 * @author arselanalvi
 *
 */
public class OutputFile {

	OutputParser p;
	String JUnitTestString;

	public OutputFile(OutputParser p) {
		this.p = p;
	}

	public void determineOutputfile(String input) {
		String json = ".json";
		String xml = ".xml";
		String csv = ".csv";

		int index = input.indexOf('.');
		String type = input.substring(index);

		/*
		 * case 1: JSON
		 */
		if (type.equals(json)) {
			p = new JSONOutput(p.c);
			p.out();
			
			//JUnit Test
			JUnitTestString=json;
			
		}

		/*
		 * case 2: CSV
		 */
		if (type.equals(csv)) {
			p = new CSVOutput(p.c);
			p.out();
			
			//JUnit Test
			JUnitTestString=csv;

		}

		/*
		 * case 3: XML
		 */
		if (type.equals(xml)) {
			p = new XMLOutput(p.c);
			p.out();
			
			//JUnit Test
			JUnitTestString=xml;
		}

	}

}
