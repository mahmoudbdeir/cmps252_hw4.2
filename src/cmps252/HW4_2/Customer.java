package cmps252.HW4_2;

public class Customer {
	public String FirstName;
	public String LastName;
	public String Company;
	public String Address;
	public String City;
	public String County;
	public String State;
	public String ZIP;
	public String Phone;
	public String Fax;
	public String Email;
	public String Web;
	
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
	
	public Customer(String firstName,String lastName,String company,String address,String city,String county,String state,String zip,String phone,String fax,String email,String web) {
		super();
		FirstName=firstName;
		LastName=lastName;
		Company=company;
		Address=address;
		City=city;
		County=county;
		State=state;
		ZIP=zip;
		Phone=phone;
		Fax=fax;
		Email=email;
		Web=web;
	}
}

	
