package credits;
/**
 * Discover class
 * 
 * @author arselanalvi
 *
 */
public class Discover extends Creditcard {

	public final String discover = "D I S C O V E R";

	public Discover(String number, String date, String holder, String issuer) {
		super(number, date, holder, issuer);
		// TODO Auto-generated constructor stub
	}
	
	public Discover(String number, String date, String holder) {
		super(number, date, holder);
		// TODO Auto-generated constructor stub
	}

	public Discover(String number) {
		super(number);
	}

	public boolean checkNumber(String number) {
		if (super.checkNumber(number))
		// System.out.println(number.length());
		{
			if (number.length() == 16) {
				//System.out.print(number.substring(1,4));
				if (number.substring(1, 4).equals("011")) {
					setIssuer();
					return true;
				} else {
					super.setIssuer(super.getError());

				}
			} else {
				super.setIssuer(super.getError());

			}
		}
		return false;
	}

	public void setIssuer() {

		super.setIssuer(discover);

	}

}
