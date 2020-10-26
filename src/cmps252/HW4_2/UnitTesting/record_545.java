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

@Tag("39")
class Record_545 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 545: FirstName is Randal")
	void FirstNameOfRecord545() {
		assertEquals("Randal", customers.get(544).getFirstName());
	}

	@Test
	@DisplayName("Record 545: LastName is Hochman")
	void LastNameOfRecord545() {
		assertEquals("Hochman", customers.get(544).getLastName());
	}

	@Test
	@DisplayName("Record 545: Company is Industrial Services Amer Inc")
	void CompanyOfRecord545() {
		assertEquals("Industrial Services Amer Inc", customers.get(544).getCompany());
	}

	@Test
	@DisplayName("Record 545: Address is 77 E Lewelling Blvd")
	void AddressOfRecord545() {
		assertEquals("77 E Lewelling Blvd", customers.get(544).getAddress());
	}

	@Test
	@DisplayName("Record 545: City is San Lorenzo")
	void CityOfRecord545() {
		assertEquals("San Lorenzo", customers.get(544).getCity());
	}

	@Test
	@DisplayName("Record 545: County is Alameda")
	void CountyOfRecord545() {
		assertEquals("Alameda", customers.get(544).getCounty());
	}

	@Test
	@DisplayName("Record 545: State is CA")
	void StateOfRecord545() {
		assertEquals("CA", customers.get(544).getState());
	}

	@Test
	@DisplayName("Record 545: ZIP is 94580")
	void ZIPOfRecord545() {
		assertEquals("94580", customers.get(544).getZIP());
	}

	@Test
	@DisplayName("Record 545: Phone is 510-481-1177")
	void PhoneOfRecord545() {
		assertEquals("510-481-1177", customers.get(544).getPhone());
	}

	@Test
	@DisplayName("Record 545: Fax is 510-481-6287")
	void FaxOfRecord545() {
		assertEquals("510-481-6287", customers.get(544).getFax());
	}

	@Test
	@DisplayName("Record 545: Email is randal@hochman.com")
	void EmailOfRecord545() {
		assertEquals("randal@hochman.com", customers.get(544).getEmail());
	}

	@Test
	@DisplayName("Record 545: Web is http://www.randalhochman.com")
	void WebOfRecord545() {
		assertEquals("http://www.randalhochman.com", customers.get(544).getWeb());
	}
}
