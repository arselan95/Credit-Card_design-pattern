package credits;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Credit card class.
 * 
 * @author arselanalvi
 *
 */
public class Creditcard {

	String cardnumber;
	String expdate;
	String cardholder;
	String issuer;

	public Creditcard(String number) {
		cardnumber = number;
	}

	public Creditcard(String number, String date, String holder) {
		cardnumber = number;
		expdate = date;
		cardholder = holder;
	}

	public Creditcard(String number, String date, String holder, String issuer) {
		cardnumber = number;
		expdate = date;
		cardholder = holder;
		this.issuer = issuer;
	}

	public boolean checkNumber(String number) {
		if (number.length() <= 19) {
			return true;
		}
		this.issuer = "NOT A CREDIT CARD";
		return false;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getError()

	{
		return "TYPE DOES NOT MATCH";
	}

	@Override
	public String toString() {
		return ("\nNumber:" + this.cardnumber + "\nDate: " + this.expdate + "\nName: " + this.cardholder + "\nIssuer: "
				+ this.issuer);
	}

	public String toCsvRow() {
		return Stream.of(cardnumber, expdate, cardholder, issuer).map(value -> value.replaceAll("\"", "\"\""))
				.map(value -> Stream.of("\"", ",").anyMatch(value::contains) ? "\"" + value + "\"" : value)
				.collect(Collectors.joining(","));
	}

}
