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

@Tag("6")
class Record_3991 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3991: FirstName is Minerva")
	void FirstNameOfRecord3991() {
		assertEquals("Minerva", customers.get(3990).getFirstName());
	}

	@Test
	@DisplayName("Record 3991: LastName is Rimmer")
	void LastNameOfRecord3991() {
		assertEquals("Rimmer", customers.get(3990).getLastName());
	}

	@Test
	@DisplayName("Record 3991: Company is Cohen & Malad Pc")
	void CompanyOfRecord3991() {
		assertEquals("Cohen & Malad Pc", customers.get(3990).getCompany());
	}

	@Test
	@DisplayName("Record 3991: Address is 830 Old Corlies Ave")
	void AddressOfRecord3991() {
		assertEquals("830 Old Corlies Ave", customers.get(3990).getAddress());
	}

	@Test
	@DisplayName("Record 3991: City is Neptune")
	void CityOfRecord3991() {
		assertEquals("Neptune", customers.get(3990).getCity());
	}

	@Test
	@DisplayName("Record 3991: County is Monmouth")
	void CountyOfRecord3991() {
		assertEquals("Monmouth", customers.get(3990).getCounty());
	}

	@Test
	@DisplayName("Record 3991: State is NJ")
	void StateOfRecord3991() {
		assertEquals("NJ", customers.get(3990).getState());
	}

	@Test
	@DisplayName("Record 3991: ZIP is 7753")
	void ZIPOfRecord3991() {
		assertEquals("7753", customers.get(3990).getZIP());
	}

	@Test
	@DisplayName("Record 3991: Phone is 732-918-6914")
	void PhoneOfRecord3991() {
		assertEquals("732-918-6914", customers.get(3990).getPhone());
	}

	@Test
	@DisplayName("Record 3991: Fax is 732-918-6032")
	void FaxOfRecord3991() {
		assertEquals("732-918-6032", customers.get(3990).getFax());
	}

	@Test
	@DisplayName("Record 3991: Email is minerva@rimmer.com")
	void EmailOfRecord3991() {
		assertEquals("minerva@rimmer.com", customers.get(3990).getEmail());
	}

	@Test
	@DisplayName("Record 3991: Web is http://www.minervarimmer.com")
	void WebOfRecord3991() {
		assertEquals("http://www.minervarimmer.com", customers.get(3990).getWeb());
	}
}
