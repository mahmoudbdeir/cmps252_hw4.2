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
	
	public Customer(String _firstName, String _lastName, String _company, String _address,
			String _city, String _county, String _state, String _zip, String _phone, String _fax,
			String _email, String _web) {
		
		firstName = _firstName;
		lastName = _lastName;
		company = _company;
		address = _address;
		city = _city;
		county = _city;
		state = _state;
		zip = _zip;
		phone = _phone;
		fax = _fax;
		email = _email;
		web = _web;
		
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
	public String getZip() {
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
