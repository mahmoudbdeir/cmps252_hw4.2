package cmps252.HW4_2;

public class Customer {
	private String FirstName,LastName,Company,Address,City,County,State,ZIP,Phone,Fax,Email,Web;
	
	Customer(String firstName,String lastName,String company,String address,String city,String county,String state,String zIP,String phone,String fax,String email,String web){
		FirstName=firstName;
		LastName=lastName;
		Company=company;
		Address=address;
		City=city;
		County=county;
		State=state;
		ZIP=zIP;
		Phone=phone;
		Fax=fax;
		Email=email;
		Web=web;
	}

	public String getFirstName() {return FirstName;}

	public String getLastName() {return LastName;}

	public String getCompany() {return Company;}

	public String getAddress() {return Address;}

	public String getCity() {return City;}

	public String getCounty() {return County;}

	public String getState() {return State;}

	public String getZIP() {return ZIP;}

	public String getPhone() {return Phone;}

	public String getFax() {return Fax;}

	public String getEmail() {return Email;}

	public String getWeb() {return Web;}
}