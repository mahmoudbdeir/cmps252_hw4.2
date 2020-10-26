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

@Tag("13")
class Record_3221 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3221: FirstName is Santiago")
	void FirstNameOfRecord3221() {
		assertEquals("Santiago", customers.get(3220).getFirstName());
	}

	@Test
	@DisplayName("Record 3221: LastName is Treleven")
	void LastNameOfRecord3221() {
		assertEquals("Treleven", customers.get(3220).getLastName());
	}

	@Test
	@DisplayName("Record 3221: Company is San Clemente Travel Service")
	void CompanyOfRecord3221() {
		assertEquals("San Clemente Travel Service", customers.get(3220).getCompany());
	}

	@Test
	@DisplayName("Record 3221: Address is 3294 Gravois Ave")
	void AddressOfRecord3221() {
		assertEquals("3294 Gravois Ave", customers.get(3220).getAddress());
	}

	@Test
	@DisplayName("Record 3221: City is Saint Louis")
	void CityOfRecord3221() {
		assertEquals("Saint Louis", customers.get(3220).getCity());
	}

	@Test
	@DisplayName("Record 3221: County is Saint Louis City")
	void CountyOfRecord3221() {
		assertEquals("Saint Louis City", customers.get(3220).getCounty());
	}

	@Test
	@DisplayName("Record 3221: State is MO")
	void StateOfRecord3221() {
		assertEquals("MO", customers.get(3220).getState());
	}

	@Test
	@DisplayName("Record 3221: ZIP is 63118")
	void ZIPOfRecord3221() {
		assertEquals("63118", customers.get(3220).getZIP());
	}

	@Test
	@DisplayName("Record 3221: Phone is 314-771-1206")
	void PhoneOfRecord3221() {
		assertEquals("314-771-1206", customers.get(3220).getPhone());
	}

	@Test
	@DisplayName("Record 3221: Fax is 314-771-0929")
	void FaxOfRecord3221() {
		assertEquals("314-771-0929", customers.get(3220).getFax());
	}

	@Test
	@DisplayName("Record 3221: Email is santiago@treleven.com")
	void EmailOfRecord3221() {
		assertEquals("santiago@treleven.com", customers.get(3220).getEmail());
	}

	@Test
	@DisplayName("Record 3221: Web is http://www.santiagotreleven.com")
	void WebOfRecord3221() {
		assertEquals("http://www.santiagotreleven.com", customers.get(3220).getWeb());
	}
}
