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
class Record_1067 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1067: FirstName is Hydi")
	void FirstNameOfRecord1067() {
		assertEquals("Hydi", customers.get(1066).getFirstName());
	}

	@Test
	@DisplayName("Record 1067: LastName is Cordray")
	void LastNameOfRecord1067() {
		assertEquals("Cordray", customers.get(1066).getLastName());
	}

	@Test
	@DisplayName("Record 1067: Company is Pipolo Brothers Plastering")
	void CompanyOfRecord1067() {
		assertEquals("Pipolo Brothers Plastering", customers.get(1066).getCompany());
	}

	@Test
	@DisplayName("Record 1067: Address is 5109 2nd St")
	void AddressOfRecord1067() {
		assertEquals("5109 2nd St", customers.get(1066).getAddress());
	}

	@Test
	@DisplayName("Record 1067: City is Long Island City")
	void CityOfRecord1067() {
		assertEquals("Long Island City", customers.get(1066).getCity());
	}

	@Test
	@DisplayName("Record 1067: County is Queens")
	void CountyOfRecord1067() {
		assertEquals("Queens", customers.get(1066).getCounty());
	}

	@Test
	@DisplayName("Record 1067: State is NY")
	void StateOfRecord1067() {
		assertEquals("NY", customers.get(1066).getState());
	}

	@Test
	@DisplayName("Record 1067: ZIP is 11101")
	void ZIPOfRecord1067() {
		assertEquals("11101", customers.get(1066).getZIP());
	}

	@Test
	@DisplayName("Record 1067: Phone is 718-784-4328")
	void PhoneOfRecord1067() {
		assertEquals("718-784-4328", customers.get(1066).getPhone());
	}

	@Test
	@DisplayName("Record 1067: Fax is 718-784-8141")
	void FaxOfRecord1067() {
		assertEquals("718-784-8141", customers.get(1066).getFax());
	}

	@Test
	@DisplayName("Record 1067: Email is hydi@cordray.com")
	void EmailOfRecord1067() {
		assertEquals("hydi@cordray.com", customers.get(1066).getEmail());
	}

	@Test
	@DisplayName("Record 1067: Web is http://www.hydicordray.com")
	void WebOfRecord1067() {
		assertEquals("http://www.hydicordray.com", customers.get(1066).getWeb());
	}
}
