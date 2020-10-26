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

@Tag("24")
class Record_1284 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1284: FirstName is Suzan")
	void FirstNameOfRecord1284() {
		assertEquals("Suzan", customers.get(1283).getFirstName());
	}

	@Test
	@DisplayName("Record 1284: LastName is Bergmann")
	void LastNameOfRecord1284() {
		assertEquals("Bergmann", customers.get(1283).getLastName());
	}

	@Test
	@DisplayName("Record 1284: Company is Cio Nap Co Builders")
	void CompanyOfRecord1284() {
		assertEquals("Cio Nap Co Builders", customers.get(1283).getCompany());
	}

	@Test
	@DisplayName("Record 1284: Address is 101 128th St Se")
	void AddressOfRecord1284() {
		assertEquals("101 128th St Se", customers.get(1283).getAddress());
	}

	@Test
	@DisplayName("Record 1284: City is Everett")
	void CityOfRecord1284() {
		assertEquals("Everett", customers.get(1283).getCity());
	}

	@Test
	@DisplayName("Record 1284: County is Snohomish")
	void CountyOfRecord1284() {
		assertEquals("Snohomish", customers.get(1283).getCounty());
	}

	@Test
	@DisplayName("Record 1284: State is WA")
	void StateOfRecord1284() {
		assertEquals("WA", customers.get(1283).getState());
	}

	@Test
	@DisplayName("Record 1284: ZIP is 98208")
	void ZIPOfRecord1284() {
		assertEquals("98208", customers.get(1283).getZIP());
	}

	@Test
	@DisplayName("Record 1284: Phone is 425-338-3938")
	void PhoneOfRecord1284() {
		assertEquals("425-338-3938", customers.get(1283).getPhone());
	}

	@Test
	@DisplayName("Record 1284: Fax is 425-338-9366")
	void FaxOfRecord1284() {
		assertEquals("425-338-9366", customers.get(1283).getFax());
	}

	@Test
	@DisplayName("Record 1284: Email is suzan@bergmann.com")
	void EmailOfRecord1284() {
		assertEquals("suzan@bergmann.com", customers.get(1283).getEmail());
	}

	@Test
	@DisplayName("Record 1284: Web is http://www.suzanbergmann.com")
	void WebOfRecord1284() {
		assertEquals("http://www.suzanbergmann.com", customers.get(1283).getWeb());
	}
}
