package credits;
/**
 * AMEX Class
 * 
 * @author arselanalvi
 *
 */
public class Amex extends Creditcard {

	public final String amex = "A M E R I C A N   E X P R E S S";

	public Amex(String number, String date, String holder, String issuer) {
		super(number, date, holder, issuer);
		// TODO Auto-generated constructor stub
	}
	
	public Amex(String number, String date, String holder) {
		super(number, date, holder);
		// TODO Auto-generated constructor stub
	}

	public Amex(String number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	public boolean checkNumber(String number) {
		if (super.checkNumber(number))
		// System.out.println(number.length());
		{
			if (number.length() == 15) {
				char seconddigit = number.charAt(1);
				if (seconddigit == '4' || seconddigit == '7') {
					setIssuer();
					return true;
				} else {
					super.setIssuer(super.getError());
				}
			}

		}
		return false;
	}

	public void setIssuer() {
		super.setIssuer(amex);
	}
}
