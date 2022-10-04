package seg2105Assignment2;

public class Address {
	private String street;
	private int number;
	private String postalCode;
	
	public Address(String street, int number, String postalCode) {
		this.street = street;
		this.number = number;
		this.postalCode = postalCode;
	}
	
	public String writeAddress() {
		return number + " " + street + ", " + postalCode;
	}

}
