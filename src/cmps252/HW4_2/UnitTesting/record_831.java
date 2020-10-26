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

@Tag("24")
class Record_831 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 831: FirstName is Rosella")
	void FirstNameOfRecord831() {
		assertEquals("Rosella", customers.get(830).getFirstName());
	}

	@Test
	@DisplayName("Record 831: LastName is Yellow")
	void LastNameOfRecord831() {
		assertEquals("Yellow", customers.get(830).getLastName());
	}

	@Test
	@DisplayName("Record 831: Company is New Beginning Resume Service")
	void CompanyOfRecord831() {
		assertEquals("New Beginning Resume Service", customers.get(830).getCompany());
	}

	@Test
	@DisplayName("Record 831: Address is 17000 S Western Ave")
	void AddressOfRecord831() {
		assertEquals("17000 S Western Ave", customers.get(830).getAddress());
	}

	@Test
	@DisplayName("Record 831: City is Gardena")
	void CityOfRecord831() {
		assertEquals("Gardena", customers.get(830).getCity());
	}

	@Test
	@DisplayName("Record 831: County is Los Angeles")
	void CountyOfRecord831() {
		assertEquals("Los Angeles", customers.get(830).getCounty());
	}

	@Test
	@DisplayName("Record 831: State is CA")
	void StateOfRecord831() {
		assertEquals("CA", customers.get(830).getState());
	}

	@Test
	@DisplayName("Record 831: ZIP is 90247")
	void ZIPOfRecord831() {
		assertEquals("90247", customers.get(830).getZIP());
	}

	@Test
	@DisplayName("Record 831: Phone is 310-327-5043")
	void PhoneOfRecord831() {
		assertEquals("310-327-5043", customers.get(830).getPhone());
	}

	@Test
	@DisplayName("Record 831: Fax is 310-327-7745")
	void FaxOfRecord831() {
		assertEquals("310-327-7745", customers.get(830).getFax());
	}

	@Test
	@DisplayName("Record 831: Email is rosella@yellow.com")
	void EmailOfRecord831() {
		assertEquals("rosella@yellow.com", customers.get(830).getEmail());
	}

	@Test
	@DisplayName("Record 831: Web is http://www.rosellayellow.com")
	void WebOfRecord831() {
		assertEquals("http://www.rosellayellow.com", customers.get(830).getWeb());
	}
}
