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

@Tag("25")
class Record_285 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 285: FirstName is Ronny")
	void FirstNameOfRecord285() {
		assertEquals("Ronny", customers.get(284).getFirstName());
	}

	@Test
	@DisplayName("Record 285: LastName is Grahovac")
	void LastNameOfRecord285() {
		assertEquals("Grahovac", customers.get(284).getLastName());
	}

	@Test
	@DisplayName("Record 285: Company is Action Sports Retailer")
	void CompanyOfRecord285() {
		assertEquals("Action Sports Retailer", customers.get(284).getCompany());
	}

	@Test
	@DisplayName("Record 285: Address is 830 Menlo Ave")
	void AddressOfRecord285() {
		assertEquals("830 Menlo Ave", customers.get(284).getAddress());
	}

	@Test
	@DisplayName("Record 285: City is Menlo Park")
	void CityOfRecord285() {
		assertEquals("Menlo Park", customers.get(284).getCity());
	}

	@Test
	@DisplayName("Record 285: County is San Mateo")
	void CountyOfRecord285() {
		assertEquals("San Mateo", customers.get(284).getCounty());
	}

	@Test
	@DisplayName("Record 285: State is CA")
	void StateOfRecord285() {
		assertEquals("CA", customers.get(284).getState());
	}

	@Test
	@DisplayName("Record 285: ZIP is 94025")
	void ZIPOfRecord285() {
		assertEquals("94025", customers.get(284).getZIP());
	}

	@Test
	@DisplayName("Record 285: Phone is 650-328-7100")
	void PhoneOfRecord285() {
		assertEquals("650-328-7100", customers.get(284).getPhone());
	}

	@Test
	@DisplayName("Record 285: Fax is 650-328-0582")
	void FaxOfRecord285() {
		assertEquals("650-328-0582", customers.get(284).getFax());
	}

	@Test
	@DisplayName("Record 285: Email is ronny@grahovac.com")
	void EmailOfRecord285() {
		assertEquals("ronny@grahovac.com", customers.get(284).getEmail());
	}

	@Test
	@DisplayName("Record 285: Web is http://www.ronnygrahovac.com")
	void WebOfRecord285() {
		assertEquals("http://www.ronnygrahovac.com", customers.get(284).getWeb());
	}
}
