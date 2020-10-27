package cmps252.HW4_2;

public class Customer {
	private String firstName;
	private String lastName;
	private String company;
	private String address;
	private String city;
	private String county;
	private String state;
	private String zip;
	private String phone;
	private String fax;
	private String email;
	private String web;
	
	public Customer(String firstName, String lastName, String company, String address, String city, String county,
			String state, String zip, String phone, String fax, String email, String web) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.address = address;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.web = web;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCompany() {
		return company;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getCounty() {
		return county;
	}
	public String getState() {
		return state;
	}
	public String getZIP() {
		return zip;
	}
	public String getPhone() {
		return phone;
	}
	public String getFax() {
		return fax;
	}
	public String getEmail() {
		return email;
	}
	public String getWeb() {
		return web;
	}
	
}
