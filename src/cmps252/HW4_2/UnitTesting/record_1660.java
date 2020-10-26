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

@Tag("42")
class Record_1660 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1660: FirstName is Lacy")
	void FirstNameOfRecord1660() {
		assertEquals("Lacy", customers.get(1659).getFirstName());
	}

	@Test
	@DisplayName("Record 1660: LastName is Schroyer")
	void LastNameOfRecord1660() {
		assertEquals("Schroyer", customers.get(1659).getLastName());
	}

	@Test
	@DisplayName("Record 1660: Company is Hillsborough Beacon")
	void CompanyOfRecord1660() {
		assertEquals("Hillsborough Beacon", customers.get(1659).getCompany());
	}

	@Test
	@DisplayName("Record 1660: Address is 609 County Road 579")
	void AddressOfRecord1660() {
		assertEquals("609 County Road 579", customers.get(1659).getAddress());
	}

	@Test
	@DisplayName("Record 1660: City is Pittstown")
	void CityOfRecord1660() {
		assertEquals("Pittstown", customers.get(1659).getCity());
	}

	@Test
	@DisplayName("Record 1660: County is Hunterdon")
	void CountyOfRecord1660() {
		assertEquals("Hunterdon", customers.get(1659).getCounty());
	}

	@Test
	@DisplayName("Record 1660: State is NJ")
	void StateOfRecord1660() {
		assertEquals("NJ", customers.get(1659).getState());
	}

	@Test
	@DisplayName("Record 1660: ZIP is 8867")
	void ZIPOfRecord1660() {
		assertEquals("8867", customers.get(1659).getZIP());
	}

	@Test
	@DisplayName("Record 1660: Phone is 908-735-1871")
	void PhoneOfRecord1660() {
		assertEquals("908-735-1871", customers.get(1659).getPhone());
	}

	@Test
	@DisplayName("Record 1660: Fax is 908-735-2198")
	void FaxOfRecord1660() {
		assertEquals("908-735-2198", customers.get(1659).getFax());
	}

	@Test
	@DisplayName("Record 1660: Email is lacy@schroyer.com")
	void EmailOfRecord1660() {
		assertEquals("lacy@schroyer.com", customers.get(1659).getEmail());
	}

	@Test
	@DisplayName("Record 1660: Web is http://www.lacyschroyer.com")
	void WebOfRecord1660() {
		assertEquals("http://www.lacyschroyer.com", customers.get(1659).getWeb());
	}
}
