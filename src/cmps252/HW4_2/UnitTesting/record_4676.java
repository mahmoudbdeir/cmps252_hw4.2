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

@Tag("37")
class Record_4676 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4676: FirstName is Tracey")
	void FirstNameOfRecord4676() {
		assertEquals("Tracey", customers.get(4675).getFirstName());
	}

	@Test
	@DisplayName("Record 4676: LastName is Mcclaran")
	void LastNameOfRecord4676() {
		assertEquals("Mcclaran", customers.get(4675).getLastName());
	}

	@Test
	@DisplayName("Record 4676: Company is Spiral Paper Tubes")
	void CompanyOfRecord4676() {
		assertEquals("Spiral Paper Tubes", customers.get(4675).getCompany());
	}

	@Test
	@DisplayName("Record 4676: Address is 11832 Rock Landing Rd")
	void AddressOfRecord4676() {
		assertEquals("11832 Rock Landing Rd", customers.get(4675).getAddress());
	}

	@Test
	@DisplayName("Record 4676: City is Newport News")
	void CityOfRecord4676() {
		assertEquals("Newport News", customers.get(4675).getCity());
	}

	@Test
	@DisplayName("Record 4676: County is Newport News City")
	void CountyOfRecord4676() {
		assertEquals("Newport News City", customers.get(4675).getCounty());
	}

	@Test
	@DisplayName("Record 4676: State is VA")
	void StateOfRecord4676() {
		assertEquals("VA", customers.get(4675).getState());
	}

	@Test
	@DisplayName("Record 4676: ZIP is 23606")
	void ZIPOfRecord4676() {
		assertEquals("23606", customers.get(4675).getZIP());
	}

	@Test
	@DisplayName("Record 4676: Phone is 757-873-7351")
	void PhoneOfRecord4676() {
		assertEquals("757-873-7351", customers.get(4675).getPhone());
	}

	@Test
	@DisplayName("Record 4676: Fax is 757-873-0899")
	void FaxOfRecord4676() {
		assertEquals("757-873-0899", customers.get(4675).getFax());
	}

	@Test
	@DisplayName("Record 4676: Email is tracey@mcclaran.com")
	void EmailOfRecord4676() {
		assertEquals("tracey@mcclaran.com", customers.get(4675).getEmail());
	}

	@Test
	@DisplayName("Record 4676: Web is http://www.traceymcclaran.com")
	void WebOfRecord4676() {
		assertEquals("http://www.traceymcclaran.com", customers.get(4675).getWeb());
	}
}
