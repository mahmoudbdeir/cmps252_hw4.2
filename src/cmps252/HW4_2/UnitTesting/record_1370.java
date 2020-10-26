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

@Tag("15")
class Record_1370 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1370: FirstName is Donnie")
	void FirstNameOfRecord1370() {
		assertEquals("Donnie", customers.get(1369).getFirstName());
	}

	@Test
	@DisplayName("Record 1370: LastName is Zerby")
	void LastNameOfRecord1370() {
		assertEquals("Zerby", customers.get(1369).getLastName());
	}

	@Test
	@DisplayName("Record 1370: Company is Baker Hancock & Pollard")
	void CompanyOfRecord1370() {
		assertEquals("Baker Hancock & Pollard", customers.get(1369).getCompany());
	}

	@Test
	@DisplayName("Record 1370: Address is 1012 Quinton Ave")
	void AddressOfRecord1370() {
		assertEquals("1012 Quinton Ave", customers.get(1369).getAddress());
	}

	@Test
	@DisplayName("Record 1370: City is Trenton")
	void CityOfRecord1370() {
		assertEquals("Trenton", customers.get(1369).getCity());
	}

	@Test
	@DisplayName("Record 1370: County is Mercer")
	void CountyOfRecord1370() {
		assertEquals("Mercer", customers.get(1369).getCounty());
	}

	@Test
	@DisplayName("Record 1370: State is NJ")
	void StateOfRecord1370() {
		assertEquals("NJ", customers.get(1369).getState());
	}

	@Test
	@DisplayName("Record 1370: ZIP is 8629")
	void ZIPOfRecord1370() {
		assertEquals("8629", customers.get(1369).getZIP());
	}

	@Test
	@DisplayName("Record 1370: Phone is 609-586-3974")
	void PhoneOfRecord1370() {
		assertEquals("609-586-3974", customers.get(1369).getPhone());
	}

	@Test
	@DisplayName("Record 1370: Fax is 609-586-0968")
	void FaxOfRecord1370() {
		assertEquals("609-586-0968", customers.get(1369).getFax());
	}

	@Test
	@DisplayName("Record 1370: Email is donnie@zerby.com")
	void EmailOfRecord1370() {
		assertEquals("donnie@zerby.com", customers.get(1369).getEmail());
	}

	@Test
	@DisplayName("Record 1370: Web is http://www.donniezerby.com")
	void WebOfRecord1370() {
		assertEquals("http://www.donniezerby.com", customers.get(1369).getWeb());
	}
}
