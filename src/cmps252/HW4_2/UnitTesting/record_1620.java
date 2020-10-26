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

@Tag("20")
class Record_1620 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1620: FirstName is Antionette")
	void FirstNameOfRecord1620() {
		assertEquals("Antionette", customers.get(1619).getFirstName());
	}

	@Test
	@DisplayName("Record 1620: LastName is Brousard")
	void LastNameOfRecord1620() {
		assertEquals("Brousard", customers.get(1619).getLastName());
	}

	@Test
	@DisplayName("Record 1620: Company is Chelan House")
	void CompanyOfRecord1620() {
		assertEquals("Chelan House", customers.get(1619).getCompany());
	}

	@Test
	@DisplayName("Record 1620: Address is 105 E Main")
	void AddressOfRecord1620() {
		assertEquals("105 E Main", customers.get(1619).getAddress());
	}

	@Test
	@DisplayName("Record 1620: City is Daleville")
	void CityOfRecord1620() {
		assertEquals("Daleville", customers.get(1619).getCity());
	}

	@Test
	@DisplayName("Record 1620: County is Delaware")
	void CountyOfRecord1620() {
		assertEquals("Delaware", customers.get(1619).getCounty());
	}

	@Test
	@DisplayName("Record 1620: State is IN")
	void StateOfRecord1620() {
		assertEquals("IN", customers.get(1619).getState());
	}

	@Test
	@DisplayName("Record 1620: ZIP is 47334")
	void ZIPOfRecord1620() {
		assertEquals("47334", customers.get(1619).getZIP());
	}

	@Test
	@DisplayName("Record 1620: Phone is 765-378-7286")
	void PhoneOfRecord1620() {
		assertEquals("765-378-7286", customers.get(1619).getPhone());
	}

	@Test
	@DisplayName("Record 1620: Fax is 765-378-7796")
	void FaxOfRecord1620() {
		assertEquals("765-378-7796", customers.get(1619).getFax());
	}

	@Test
	@DisplayName("Record 1620: Email is antionette@brousard.com")
	void EmailOfRecord1620() {
		assertEquals("antionette@brousard.com", customers.get(1619).getEmail());
	}

	@Test
	@DisplayName("Record 1620: Web is http://www.antionettebrousard.com")
	void WebOfRecord1620() {
		assertEquals("http://www.antionettebrousard.com", customers.get(1619).getWeb());
	}
}
