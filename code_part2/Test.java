package seg2105Assignment2;
import java.util.ArrayList;  

/*
 * Author: Ryan Licandro
 * Date: October 9th, 2022
 * Course: SEG 2105
 * 
 * This program is a java object-oriented programming representation of the memory diagram given in part 2 of Assignment 1.
 */
public class Test {

	/*
	 * This main method is built to test the functionality of the program that models 
	 * the memory diagram given in part 2 of Assignment 1.
	 * 
	 * Main method creates Falcao as an Employee with 2 unique addresses and displays his information.
	 * 
	 * Parameters: String[] args
	 */
	public static void main(String[] args) {
		Address address1 = new Address("Queen", 48, "K1P1N2");
		Address address2 = new Address("King Edward", 800, "K1N6N5");
		
		Employee Falcao = new Employee("Falcao");
		Falcao.addAddress(address1);
		Falcao.addAddress(address2);
		
		ArrayList<Address> addressList = Falcao.getAddressList();
		String writtenAddressList = address1.writeAddress() + " & " + address2.writeAddress();
		
		
		System.out.println("Name: " + Falcao.getName());
		System.out.println("Hours worked: " + Falcao.getHours());
		System.out.println("Rate: " + Falcao.getRate());
		System.out.println("Address List: " + writtenAddressList);
	}

}
