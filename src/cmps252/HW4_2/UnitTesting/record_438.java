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

@Tag("40")
class Record_438 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 438: FirstName is Darwin")
	void FirstNameOfRecord438() {
		assertEquals("Darwin", customers.get(437).getFirstName());
	}

	@Test
	@DisplayName("Record 438: LastName is Hostettler")
	void LastNameOfRecord438() {
		assertEquals("Hostettler", customers.get(437).getLastName());
	}

	@Test
	@DisplayName("Record 438: Company is Becharof Corporation")
	void CompanyOfRecord438() {
		assertEquals("Becharof Corporation", customers.get(437).getCompany());
	}

	@Test
	@DisplayName("Record 438: Address is 14633 Carmenita Rd")
	void AddressOfRecord438() {
		assertEquals("14633 Carmenita Rd", customers.get(437).getAddress());
	}

	@Test
	@DisplayName("Record 438: City is Norwalk")
	void CityOfRecord438() {
		assertEquals("Norwalk", customers.get(437).getCity());
	}

	@Test
	@DisplayName("Record 438: County is Los Angeles")
	void CountyOfRecord438() {
		assertEquals("Los Angeles", customers.get(437).getCounty());
	}

	@Test
	@DisplayName("Record 438: State is CA")
	void StateOfRecord438() {
		assertEquals("CA", customers.get(437).getState());
	}

	@Test
	@DisplayName("Record 438: ZIP is 90650")
	void ZIPOfRecord438() {
		assertEquals("90650", customers.get(437).getZIP());
	}

	@Test
	@DisplayName("Record 438: Phone is 562-921-9474")
	void PhoneOfRecord438() {
		assertEquals("562-921-9474", customers.get(437).getPhone());
	}

	@Test
	@DisplayName("Record 438: Fax is 562-921-3126")
	void FaxOfRecord438() {
		assertEquals("562-921-3126", customers.get(437).getFax());
	}

	@Test
	@DisplayName("Record 438: Email is darwin@hostettler.com")
	void EmailOfRecord438() {
		assertEquals("darwin@hostettler.com", customers.get(437).getEmail());
	}

	@Test
	@DisplayName("Record 438: Web is http://www.darwinhostettler.com")
	void WebOfRecord438() {
		assertEquals("http://www.darwinhostettler.com", customers.get(437).getWeb());
	}
}
