package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("10")
class Record_3998 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3998: FirstName is Bruce")
	void FirstNameOfRecord3998() {
		assertEquals("Bruce", customers.get(3997).getFirstName());
	}

	@Test
	@DisplayName("Record 3998: LastName is Capley")
	void LastNameOfRecord3998() {
		assertEquals("Capley", customers.get(3997).getLastName());
	}

	@Test
	@DisplayName("Record 3998: Company is International Braford Assn Inc")
	void CompanyOfRecord3998() {
		assertEquals("International Braford Assn Inc", customers.get(3997).getCompany());
	}

	@Test
	@DisplayName("Record 3998: Address is 791 County Road 437")
	void AddressOfRecord3998() {
		assertEquals("791 County Road 437", customers.get(3997).getAddress());
	}

	@Test
	@DisplayName("Record 3998: City is Cullman")
	void CityOfRecord3998() {
		assertEquals("Cullman", customers.get(3997).getCity());
	}

	@Test
	@DisplayName("Record 3998: County is Cullman")
	void CountyOfRecord3998() {
		assertEquals("Cullman", customers.get(3997).getCounty());
	}

	@Test
	@DisplayName("Record 3998: State is AL")
	void StateOfRecord3998() {
		assertEquals("AL", customers.get(3997).getState());
	}

	@Test
	@DisplayName("Record 3998: ZIP is 35055")
	void ZIPOfRecord3998() {
		assertEquals("35055", customers.get(3997).getZIP());
	}

	@Test
	@DisplayName("Record 3998: Phone is 256-734-1974")
	void PhoneOfRecord3998() {
		assertEquals("256-734-1974", customers.get(3997).getPhone());
	}

	@Test
	@DisplayName("Record 3998: Fax is 256-734-2168")
	void FaxOfRecord3998() {
		assertEquals("256-734-2168", customers.get(3997).getFax());
	}

	@Test
	@DisplayName("Record 3998: Email is bruce@capley.com")
	void EmailOfRecord3998() {
		assertEquals("bruce@capley.com", customers.get(3997).getEmail());
	}

	@Test
	@DisplayName("Record 3998: Web is http://www.brucecapley.com")
	void WebOfRecord3998() {
		assertEquals("http://www.brucecapley.com", customers.get(3997).getWeb());
	}
}
