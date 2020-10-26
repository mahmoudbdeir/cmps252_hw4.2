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

@Tag("48")
class Record_3545 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3545: FirstName is Amy")
	void FirstNameOfRecord3545() {
		assertEquals("Amy", customers.get(3544).getFirstName());
	}

	@Test
	@DisplayName("Record 3545: LastName is Orndoff")
	void LastNameOfRecord3545() {
		assertEquals("Orndoff", customers.get(3544).getLastName());
	}

	@Test
	@DisplayName("Record 3545: Company is Excel Partnership Inc")
	void CompanyOfRecord3545() {
		assertEquals("Excel Partnership Inc", customers.get(3544).getCompany());
	}

	@Test
	@DisplayName("Record 3545: Address is 11755 Wilshire Blvd")
	void AddressOfRecord3545() {
		assertEquals("11755 Wilshire Blvd", customers.get(3544).getAddress());
	}

	@Test
	@DisplayName("Record 3545: City is Los Angeles")
	void CityOfRecord3545() {
		assertEquals("Los Angeles", customers.get(3544).getCity());
	}

	@Test
	@DisplayName("Record 3545: County is Los Angeles")
	void CountyOfRecord3545() {
		assertEquals("Los Angeles", customers.get(3544).getCounty());
	}

	@Test
	@DisplayName("Record 3545: State is CA")
	void StateOfRecord3545() {
		assertEquals("CA", customers.get(3544).getState());
	}

	@Test
	@DisplayName("Record 3545: ZIP is 90025")
	void ZIPOfRecord3545() {
		assertEquals("90025", customers.get(3544).getZIP());
	}

	@Test
	@DisplayName("Record 3545: Phone is 310-478-7042")
	void PhoneOfRecord3545() {
		assertEquals("310-478-7042", customers.get(3544).getPhone());
	}

	@Test
	@DisplayName("Record 3545: Fax is 310-478-2974")
	void FaxOfRecord3545() {
		assertEquals("310-478-2974", customers.get(3544).getFax());
	}

	@Test
	@DisplayName("Record 3545: Email is amy@orndoff.com")
	void EmailOfRecord3545() {
		assertEquals("amy@orndoff.com", customers.get(3544).getEmail());
	}

	@Test
	@DisplayName("Record 3545: Web is http://www.amyorndoff.com")
	void WebOfRecord3545() {
		assertEquals("http://www.amyorndoff.com", customers.get(3544).getWeb());
	}
}
