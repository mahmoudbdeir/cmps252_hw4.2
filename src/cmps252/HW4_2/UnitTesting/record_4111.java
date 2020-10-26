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

@Tag("30")
class Record_4111 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4111: FirstName is Paige")
	void FirstNameOfRecord4111() {
		assertEquals("Paige", customers.get(4110).getFirstName());
	}

	@Test
	@DisplayName("Record 4111: LastName is Spears")
	void LastNameOfRecord4111() {
		assertEquals("Spears", customers.get(4110).getLastName());
	}

	@Test
	@DisplayName("Record 4111: Company is Herrera, Moses Md")
	void CompanyOfRecord4111() {
		assertEquals("Herrera, Moses Md", customers.get(4110).getCompany());
	}

	@Test
	@DisplayName("Record 4111: Address is 49 Wyckoff Ave")
	void AddressOfRecord4111() {
		assertEquals("49 Wyckoff Ave", customers.get(4110).getAddress());
	}

	@Test
	@DisplayName("Record 4111: City is Brooklyn")
	void CityOfRecord4111() {
		assertEquals("Brooklyn", customers.get(4110).getCity());
	}

	@Test
	@DisplayName("Record 4111: County is Kings")
	void CountyOfRecord4111() {
		assertEquals("Kings", customers.get(4110).getCounty());
	}

	@Test
	@DisplayName("Record 4111: State is NY")
	void StateOfRecord4111() {
		assertEquals("NY", customers.get(4110).getState());
	}

	@Test
	@DisplayName("Record 4111: ZIP is 11237")
	void ZIPOfRecord4111() {
		assertEquals("11237", customers.get(4110).getZIP());
	}

	@Test
	@DisplayName("Record 4111: Phone is 718-456-8012")
	void PhoneOfRecord4111() {
		assertEquals("718-456-8012", customers.get(4110).getPhone());
	}

	@Test
	@DisplayName("Record 4111: Fax is 718-456-4469")
	void FaxOfRecord4111() {
		assertEquals("718-456-4469", customers.get(4110).getFax());
	}

	@Test
	@DisplayName("Record 4111: Email is paige@spears.com")
	void EmailOfRecord4111() {
		assertEquals("paige@spears.com", customers.get(4110).getEmail());
	}

	@Test
	@DisplayName("Record 4111: Web is http://www.paigespears.com")
	void WebOfRecord4111() {
		assertEquals("http://www.paigespears.com", customers.get(4110).getWeb());
	}
}
