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
class Record_4004 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4004: FirstName is Sharon")
	void FirstNameOfRecord4004() {
		assertEquals("Sharon", customers.get(4003).getFirstName());
	}

	@Test
	@DisplayName("Record 4004: LastName is Knyp")
	void LastNameOfRecord4004() {
		assertEquals("Knyp", customers.get(4003).getLastName());
	}

	@Test
	@DisplayName("Record 4004: Company is Bear Creek Gardens")
	void CompanyOfRecord4004() {
		assertEquals("Bear Creek Gardens", customers.get(4003).getCompany());
	}

	@Test
	@DisplayName("Record 4004: Address is 246 Mcallister St")
	void AddressOfRecord4004() {
		assertEquals("246 Mcallister St", customers.get(4003).getAddress());
	}

	@Test
	@DisplayName("Record 4004: City is San Francisco")
	void CityOfRecord4004() {
		assertEquals("San Francisco", customers.get(4003).getCity());
	}

	@Test
	@DisplayName("Record 4004: County is San Francisco")
	void CountyOfRecord4004() {
		assertEquals("San Francisco", customers.get(4003).getCounty());
	}

	@Test
	@DisplayName("Record 4004: State is CA")
	void StateOfRecord4004() {
		assertEquals("CA", customers.get(4003).getState());
	}

	@Test
	@DisplayName("Record 4004: ZIP is 94102")
	void ZIPOfRecord4004() {
		assertEquals("94102", customers.get(4003).getZIP());
	}

	@Test
	@DisplayName("Record 4004: Phone is 415-861-5696")
	void PhoneOfRecord4004() {
		assertEquals("415-861-5696", customers.get(4003).getPhone());
	}

	@Test
	@DisplayName("Record 4004: Fax is 415-861-6925")
	void FaxOfRecord4004() {
		assertEquals("415-861-6925", customers.get(4003).getFax());
	}

	@Test
	@DisplayName("Record 4004: Email is sharon@knyp.com")
	void EmailOfRecord4004() {
		assertEquals("sharon@knyp.com", customers.get(4003).getEmail());
	}

	@Test
	@DisplayName("Record 4004: Web is http://www.sharonknyp.com")
	void WebOfRecord4004() {
		assertEquals("http://www.sharonknyp.com", customers.get(4003).getWeb());
	}
}
