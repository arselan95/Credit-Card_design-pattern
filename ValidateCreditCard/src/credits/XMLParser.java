package credits;
import java.io.File;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * Parse XML file records to list
 * @author arselanalvi
 *
 */
public class XMLParser extends Parser {

	public XMLParser(String myfile) {
		super(myfile);
		// TODO Auto-generated constructor stub
	}

	public void parse() {

		File file = new File(this.file);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();

			Document doc;

			doc = db.parse(file);

			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("row");

			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;

					String tempnumber = eElement.getElementsByTagName("CardNumber").item(0).getTextContent();

					String number = new BigDecimal(tempnumber).toPlainString();
					String date = eElement.getElementsByTagName("ExpirationDate").item(0).getTextContent();
					String name = eElement.getElementsByTagName("NameOfCardholder").item(0).getTextContent();

					Creditcard credit = new Creditcard(number, date, name);
					super.addCard(credit);

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public ArrayList<Creditcard> getCards() {
		return super.getCards();
	}

}
