package seg2105Assignment2;

public class Address {
	private String street;
	private int number;
	private String postalCode;
	
	/*
	 * Constructor function for an Address object. Creates an object of type Address.
	 * 
	 * Parameters: Street Name, Street Number and Postal Code
	 */
	public Address(String street, int number, String postalCode) {
		this.street = street;
		this.number = number;
		this.postalCode = postalCode;
	}
	
	/*
	 * This method returns the Address in a written form easy to understand in basic english.
	 * 
	 * Returns: A string that reads out the address including the street name, number and postal code.
	 * E.g 280 Somerset St E, K1N6V8
	 */
	public String writeAddress() {
		return number + " " + street + ", " + postalCode;
	}

}
