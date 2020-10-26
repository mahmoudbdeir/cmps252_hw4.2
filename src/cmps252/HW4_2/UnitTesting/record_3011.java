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
class Record_3011 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3011: FirstName is Orlando")
	void FirstNameOfRecord3011() {
		assertEquals("Orlando", customers.get(3010).getFirstName());
	}

	@Test
	@DisplayName("Record 3011: LastName is Duis")
	void LastNameOfRecord3011() {
		assertEquals("Duis", customers.get(3010).getLastName());
	}

	@Test
	@DisplayName("Record 3011: Company is Meehan Steel Products Co")
	void CompanyOfRecord3011() {
		assertEquals("Meehan Steel Products Co", customers.get(3010).getCompany());
	}

	@Test
	@DisplayName("Record 3011: Address is 811 S Central Expy")
	void AddressOfRecord3011() {
		assertEquals("811 S Central Expy", customers.get(3010).getAddress());
	}

	@Test
	@DisplayName("Record 3011: City is Richardson")
	void CityOfRecord3011() {
		assertEquals("Richardson", customers.get(3010).getCity());
	}

	@Test
	@DisplayName("Record 3011: County is Dallas")
	void CountyOfRecord3011() {
		assertEquals("Dallas", customers.get(3010).getCounty());
	}

	@Test
	@DisplayName("Record 3011: State is TX")
	void StateOfRecord3011() {
		assertEquals("TX", customers.get(3010).getState());
	}

	@Test
	@DisplayName("Record 3011: ZIP is 75080")
	void ZIPOfRecord3011() {
		assertEquals("75080", customers.get(3010).getZIP());
	}

	@Test
	@DisplayName("Record 3011: Phone is 972-235-4304")
	void PhoneOfRecord3011() {
		assertEquals("972-235-4304", customers.get(3010).getPhone());
	}

	@Test
	@DisplayName("Record 3011: Fax is 972-235-1372")
	void FaxOfRecord3011() {
		assertEquals("972-235-1372", customers.get(3010).getFax());
	}

	@Test
	@DisplayName("Record 3011: Email is orlando@duis.com")
	void EmailOfRecord3011() {
		assertEquals("orlando@duis.com", customers.get(3010).getEmail());
	}

	@Test
	@DisplayName("Record 3011: Web is http://www.orlandoduis.com")
	void WebOfRecord3011() {
		assertEquals("http://www.orlandoduis.com", customers.get(3010).getWeb());
	}
}
