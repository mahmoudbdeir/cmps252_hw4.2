package cmps252.HW4_2;

public class Customer {
	//TODO add your code here	
	private String Firstname;
	private String LastName;
	private String Company;
	private String Address;
	private String City;
	private String Country;
	private String State;
	private String ZIP;
	private String Phone;
	private String Fax;
	private String Email;
	private String Web;
	
	
	public String getFirstName() {
		return Firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public String getCompany() {
		return Company;
	}
	public String getAddress() {
		return Address;
	}
	public String getCity() {
		return City;
	}
	public String getCounty() {
		return Country;
	}
	public String getState() {
		return State;
	}
	public String getZIP() {
		return ZIP;
	}
	public String getPhone() {
		return Phone;
	}
	public String getFax() {
		return Fax;
	}
	public String getEmail() {
		return Email;
	}
	public String getWeb() {
		return Web;
	}
	public Customer(String firstname, String lastName, String company, String address, String city, String country,
			String state, String zIP, String phone, String fax, String email, String web) {
		super();
		Firstname = firstname;
		LastName = lastName;
		Company = company;
		Address = address;
		City = city;
		Country = country;
		State = state;
		ZIP = zIP;
		Phone = phone;
		Fax = fax;
		Email = email;
		Web = web;
	}
	
	
}
