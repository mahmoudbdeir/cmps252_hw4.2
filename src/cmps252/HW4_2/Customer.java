package cmps252.HW4_2;


public class Customer {
	private String Firstname;
	private String Lastname;
	private String Company;
	private String Address;
	private String City;
	private String Country;
	private String State;
	private String Zip;
	private String Phone;
	private String Fax;
	private String Email;
	private String Web;
	public String getFirstname() {
		return Firstname;
	}
	public String getLastname() {
		return Lastname;
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
	public String getCountry() {
		return Country;
	}
	public String getState() {
		return State;
	}
	public String getZip() {
		return Zip;
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
	public Customer(String firstname, String lastname, String company, String address, String city, String country,
			String state, String zip, String phone, String fax, String email, String web) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Company = company;
		Address = address;
		City = city;
		Country = country;
		State = state;
		Zip = zip;
		Phone = phone;
		Fax = fax;
		Email = email;
		Web = web;
	}

}
