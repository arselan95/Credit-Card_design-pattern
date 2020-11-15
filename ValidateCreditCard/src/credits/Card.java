package credits;

/**
 * Card class to use the strategy to determine type of credit cards
 * 
 * @author arselanalvi
 *
 */
public class Card {

	Creditcard creditcard;

	public Card(Creditcard creditcard) {
		this.creditcard = creditcard;
	}

	public Creditcard getType(String number,String date, String name) {

		char firstdigit = number.charAt(0);
		switch (firstdigit) {
		/*
		 * case 1: check if MASTER-CARD
		 */
		case '5':
			creditcard = new Mastercard(number,date,name);
			if (creditcard.checkNumber(number)) {
				creditcard = new Mastercard(number, date, name, creditcard.issuer);

			}
			break;

		/*
		 * case 2: check if VISA
		 */
		case '4':
			creditcard = new Visa(number,date,name);
			if (creditcard.checkNumber(number)) {
				creditcard = new Visa(number, date, name, creditcard.issuer);

			}
			break;

		/*
		 * case 3: check if AMEX
		 */
		case '3':
			creditcard = new Amex(number,date,name);
			if (creditcard.checkNumber(number)) {
				creditcard = new Amex(number, date, name, creditcard.issuer);

			}
			break;

		/*
		 * case 4: check if DISCOVER
		 */
		case '6':
			creditcard = new Discover(number,date,name);
			if (creditcard.checkNumber(number)) {
				creditcard = new Discover(number, date, name, creditcard.issuer);

			}
			break;

		}
		 return new Creditcard(creditcard.cardnumber,creditcard.expdate,creditcard.cardholder,creditcard.issuer);
		

	}

}
