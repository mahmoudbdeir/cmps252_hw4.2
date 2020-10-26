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

@Tag("35")
class Record_1368 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1368: FirstName is Reginald")
	void FirstNameOfRecord1368() {
		assertEquals("Reginald", customers.get(1367).getFirstName());
	}

	@Test
	@DisplayName("Record 1368: LastName is Markus")
	void LastNameOfRecord1368() {
		assertEquals("Markus", customers.get(1367).getLastName());
	}

	@Test
	@DisplayName("Record 1368: Company is Tommy B Duke Pc")
	void CompanyOfRecord1368() {
		assertEquals("Tommy B Duke Pc", customers.get(1367).getCompany());
	}

	@Test
	@DisplayName("Record 1368: Address is 2322 New Rd")
	void AddressOfRecord1368() {
		assertEquals("2322 New Rd", customers.get(1367).getAddress());
	}

	@Test
	@DisplayName("Record 1368: City is Northfield")
	void CityOfRecord1368() {
		assertEquals("Northfield", customers.get(1367).getCity());
	}

	@Test
	@DisplayName("Record 1368: County is Atlantic")
	void CountyOfRecord1368() {
		assertEquals("Atlantic", customers.get(1367).getCounty());
	}

	@Test
	@DisplayName("Record 1368: State is NJ")
	void StateOfRecord1368() {
		assertEquals("NJ", customers.get(1367).getState());
	}

	@Test
	@DisplayName("Record 1368: ZIP is 8225")
	void ZIPOfRecord1368() {
		assertEquals("8225", customers.get(1367).getZIP());
	}

	@Test
	@DisplayName("Record 1368: Phone is 609-641-9314")
	void PhoneOfRecord1368() {
		assertEquals("609-641-9314", customers.get(1367).getPhone());
	}

	@Test
	@DisplayName("Record 1368: Fax is 609-641-1965")
	void FaxOfRecord1368() {
		assertEquals("609-641-1965", customers.get(1367).getFax());
	}

	@Test
	@DisplayName("Record 1368: Email is reginald@markus.com")
	void EmailOfRecord1368() {
		assertEquals("reginald@markus.com", customers.get(1367).getEmail());
	}

	@Test
	@DisplayName("Record 1368: Web is http://www.reginaldmarkus.com")
	void WebOfRecord1368() {
		assertEquals("http://www.reginaldmarkus.com", customers.get(1367).getWeb());
	}
}
