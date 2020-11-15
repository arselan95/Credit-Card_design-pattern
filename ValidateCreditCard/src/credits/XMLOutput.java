package credits;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Read from output list and generate an XML file of records
 * 
 * @author arselanalvi
 *
 */
public class XMLOutput extends OutputParser {

	String JUnitTestString;

	public XMLOutput(ArrayList<Creditcard> c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	DOMSource source;
	Transformer aTransformer;

	public void out() {

		// System.out.println(c.size());

		DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
		DocumentBuilder build;

		try {
			build = dFact.newDocumentBuilder();
			Document doc = build.newDocument();
			Element root = doc.createElement("Root");
			doc.appendChild(root);

			for (Creditcard c : c) {
				Element Details = doc.createElement("Row");
				root.appendChild(Details);

				Element number = doc.createElement("CardNumber");
				number.appendChild(doc.createTextNode((c.cardnumber)));
				Details.appendChild(number);

				Element date = doc.createElement("Date");
				date.appendChild(doc.createTextNode(c.expdate));
				Details.appendChild(date);

				Element holder = doc.createElement("NameOfCardholder");
				holder.appendChild(doc.createTextNode((c.cardholder)));
				Details.appendChild(holder);

				Element issuer = doc.createElement("Issuer");
				issuer.appendChild(doc.createTextNode((c.issuer)));
				Details.appendChild(issuer);

			}

			FileWriter fos;
			TransformerFactory tranFactory = TransformerFactory.newInstance();
			aTransformer = tranFactory.newTransformer();

			aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

			aTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");

			source = new DOMSource(doc);

			try {
				String name=Test.outputfile;
				fos = new FileWriter(name);
				StreamResult result = new StreamResult(fos);
				aTransformer.transform(source, result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
