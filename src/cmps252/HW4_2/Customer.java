package cmps252.HW4_2;

public class Customer {
	private String FirstName;
	private String LastName;
	private String Company;
	private String Address;
	private String City;
	private String County;
	private String State;
	private String ZIP;
	private String Phone;
	private String Fax;
	private String Email;
	private String Web;
	
	public String getFirstName() {
		return FirstName;
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
		return County;
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
	public Customer(String firstName, String lastName, String company, String address, String city, String county,
			String state, String zip, String phone, String fax, String email, String web) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Company = company;
		Address = address;
		City = city;
		County = county;
		State = state;
		ZIP = zip;
		Phone = phone;
		Fax = fax;
		Email = email;
		Web = web;
	}
	
	
	
}	

