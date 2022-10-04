package seg2105Assignment2;
import java.util.ArrayList;  
import java.util.Arrays;  

public class Employee {
	private String name;
	private int hours = 40;
	private double rate = 15.50;
	private ArrayList<Address> addressList = new ArrayList<Address>();
	
	public Employee(String name, int hours, double rate, ArrayList<Address> addressList) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.addressList = addressList;	
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void addAddress(Address address) {
		addressList.add(address);
	}
	
	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	public double getRate() {
		return rate;
	}

	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	

	}
	
