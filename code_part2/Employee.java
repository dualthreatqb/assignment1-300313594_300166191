package seg2105Assignment2;
import java.util.ArrayList;  
import java.util.Arrays;  

public class Employee {
	private String name;
	private int hours = 40;
	private double rate = 15.50;
	private ArrayList<Address> addressList = new ArrayList<Address>();
	
	/*
	 * Constructor for an object of type Employee.
	 * Specifically for when name, hours, rate, and address list are to be set.
	 * 
	 * Parameters: Name of Employee, Hours Worked, Wage Rate and List of Addresses
	 */
	public Employee(String name, int hours, double rate, ArrayList<Address> addressList) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.addressList = addressList;	
	}
	
	/*
	 * Constructor for an object of type Employee when hours, rate, and address list are not specified.
	 * 
	 * Parameter: Name of Employee as a String
	 */
	public Employee(String name) {
		this.name = name;
	}
	
	/*
	 * This methods adds the address of Employee to their current address list.
	 */
	public void addAddress(Address address) {
		addressList.add(address);
	}
	
	/*
	 * Getter function for the name of an employee.
	 * 
	 * Returns: Name of the Employee as a String
	 */
	public String getName() {
		return name;
	}

	/*
	 * Getter function for the hours worked of an employee.
	 * 
	 * Returns: Hours worked of the employee as an Integer.
	 */
	public int getHours() {
		return hours;
	}

	/*
	 * Getter function for the wage rate of an Employee.
	 * 
	 * Returns: The wage rate of the employee as a double.
	 */
	public double getRate() {
		return rate;
	}

	/*
	 * Getter function for the address list of an Employee
	 * 
	 * Returns: The address list of the employee as an ArrayList.
	 */
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	

	}
	
