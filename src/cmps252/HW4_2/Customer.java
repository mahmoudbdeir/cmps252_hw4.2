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
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return Company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		Company = company;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the county
	 */
	public String getCounty() {
		return County;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		County = county;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * @return the zIP
	 */
	public String getZIP() {
		return ZIP;
	}
	/**
	 * @param zIP the zIP to set
	 */
	public void setZIP(String zIP) {
		ZIP = zIP;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return Phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		Phone = phone;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return Fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		Fax = fax;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the web
	 */
	public String getWeb() {
		return Web;
	}
	/**
	 * @param web the web to set
	 */
	public void setWeb(String web) {
		Web = web;
	}
	public Customer(String firstName, String lastName, String company, String address, String city, String county,
			String state, String zIP, String phone, String fax, String email, String web) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Company = company;
		Address = address;
		City = city;
		County = county;
		State = state;
		ZIP = zIP;
		Phone = phone;
		Fax = fax;
		Email = email;
		Web = web;
	}
	

}
