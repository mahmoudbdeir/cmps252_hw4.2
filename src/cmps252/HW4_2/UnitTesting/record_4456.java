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

@Tag("0")
class Record_4456 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4456: FirstName is Roland")
	void FirstNameOfRecord4456() {
		assertEquals("Roland", customers.get(4455).getFirstName());
	}

	@Test
	@DisplayName("Record 4456: LastName is Mangon")
	void LastNameOfRecord4456() {
		assertEquals("Mangon", customers.get(4455).getLastName());
	}

	@Test
	@DisplayName("Record 4456: Company is Overseas Printing Corp")
	void CompanyOfRecord4456() {
		assertEquals("Overseas Printing Corp", customers.get(4455).getCompany());
	}

	@Test
	@DisplayName("Record 4456: Address is 12510 Brandon St")
	void AddressOfRecord4456() {
		assertEquals("12510 Brandon St", customers.get(4455).getAddress());
	}

	@Test
	@DisplayName("Record 4456: City is Anchorage")
	void CityOfRecord4456() {
		assertEquals("Anchorage", customers.get(4455).getCity());
	}

	@Test
	@DisplayName("Record 4456: County is Anchorage")
	void CountyOfRecord4456() {
		assertEquals("Anchorage", customers.get(4455).getCounty());
	}

	@Test
	@DisplayName("Record 4456: State is AK")
	void StateOfRecord4456() {
		assertEquals("AK", customers.get(4455).getState());
	}

	@Test
	@DisplayName("Record 4456: ZIP is 99515")
	void ZIPOfRecord4456() {
		assertEquals("99515", customers.get(4455).getZIP());
	}

	@Test
	@DisplayName("Record 4456: Phone is 907-345-7326")
	void PhoneOfRecord4456() {
		assertEquals("907-345-7326", customers.get(4455).getPhone());
	}

	@Test
	@DisplayName("Record 4456: Fax is 907-345-8491")
	void FaxOfRecord4456() {
		assertEquals("907-345-8491", customers.get(4455).getFax());
	}

	@Test
	@DisplayName("Record 4456: Email is roland@mangon.com")
	void EmailOfRecord4456() {
		assertEquals("roland@mangon.com", customers.get(4455).getEmail());
	}

	@Test
	@DisplayName("Record 4456: Web is http://www.rolandmangon.com")
	void WebOfRecord4456() {
		assertEquals("http://www.rolandmangon.com", customers.get(4455).getWeb());
	}
}
