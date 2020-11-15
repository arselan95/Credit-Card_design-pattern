package credits;

/**
 * VISA Card
 * @author arselanalvi
 *
 */
public class Visa extends Creditcard {

	public final String visa = "V I S A";

	public Visa(String number, String date, String holder, String issuer) {
		super(number, date, holder, issuer);
		// TODO Auto-generated constructor stub
	}
	
	public Visa(String number, String date, String holder) {
		super(number, date, holder);
		// TODO Auto-generated constructor stub
	}

	public Visa(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public boolean checkNumber(String number) {
		if (super.checkNumber(number))
		// System.out.println(number.length());
		{
			if (number.length() == 16 || number.length() == 13) {
				setIssuer();
				return true;
			} else {
				super.setIssuer(super.getError());

			}
		}
		return false;
	}

	public void setIssuer() {

		super.setIssuer(visa);

	}

}
