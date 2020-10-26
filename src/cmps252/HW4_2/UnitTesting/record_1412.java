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

@Tag("47")
class Record_1412 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1412: FirstName is Courtney")
	void FirstNameOfRecord1412() {
		assertEquals("Courtney", customers.get(1411).getFirstName());
	}

	@Test
	@DisplayName("Record 1412: LastName is Wakin")
	void LastNameOfRecord1412() {
		assertEquals("Wakin", customers.get(1411).getLastName());
	}

	@Test
	@DisplayName("Record 1412: Company is Singstore A")
	void CompanyOfRecord1412() {
		assertEquals("Singstore A", customers.get(1411).getCompany());
	}

	@Test
	@DisplayName("Record 1412: Address is Gorman")
	void AddressOfRecord1412() {
		assertEquals("Gorman", customers.get(1411).getAddress());
	}

	@Test
	@DisplayName("Record 1412: City is Columbia")
	void CityOfRecord1412() {
		assertEquals("Columbia", customers.get(1411).getCity());
	}

	@Test
	@DisplayName("Record 1412: County is Howard")
	void CountyOfRecord1412() {
		assertEquals("Howard", customers.get(1411).getCounty());
	}

	@Test
	@DisplayName("Record 1412: State is MD")
	void StateOfRecord1412() {
		assertEquals("MD", customers.get(1411).getState());
	}

	@Test
	@DisplayName("Record 1412: ZIP is 21045")
	void ZIPOfRecord1412() {
		assertEquals("21045", customers.get(1411).getZIP());
	}

	@Test
	@DisplayName("Record 1412: Phone is 410-964-3476")
	void PhoneOfRecord1412() {
		assertEquals("410-964-3476", customers.get(1411).getPhone());
	}

	@Test
	@DisplayName("Record 1412: Fax is 410-964-2908")
	void FaxOfRecord1412() {
		assertEquals("410-964-2908", customers.get(1411).getFax());
	}

	@Test
	@DisplayName("Record 1412: Email is courtney@wakin.com")
	void EmailOfRecord1412() {
		assertEquals("courtney@wakin.com", customers.get(1411).getEmail());
	}

	@Test
	@DisplayName("Record 1412: Web is http://www.courtneywakin.com")
	void WebOfRecord1412() {
		assertEquals("http://www.courtneywakin.com", customers.get(1411).getWeb());
	}
}
