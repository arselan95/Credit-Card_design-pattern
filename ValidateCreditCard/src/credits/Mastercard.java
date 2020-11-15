package credits;
/**
 * Master Card class
 * 
 * @author arselanalvi
 *
 */
public class Mastercard extends Creditcard {
	public final String mastercard = "M A S T E R - C A R D";

	public Mastercard(String number, String date, String holder, String issuer) {
		super(number, date, holder, issuer);
	}
	
	public Mastercard(String number, String date, String holder) {
		super(number, date, holder);
		// TODO Auto-generated constructor stub
	}

	public Mastercard(String number) {
		super(number);

	}

	public boolean containsinarray(char c, char[] array) {
		for (char x : array) {
			if (x == c) {
				return true;
			}
		}
		return false;
	}

	public boolean checkNumber(String number) {
		if (super.checkNumber(number))
		// System.out.println(number.length());
		{
			if (number.length() == 16) {
				char seconddigit = number.charAt(1);

				char seconddigitrange[] = { '1', '2', '3', '4', '5' };

				if (containsinarray(seconddigit, seconddigitrange)) {

					setIssuerMaster();

					return true;

				} else {
					super.setIssuer(super.getError());

				}
				return false;

			} else {
				super.setIssuer(super.getError());

			}
		}
		return false;
	}

	public void setIssuerMaster() {

		super.setIssuer(mastercard);

	}

}
