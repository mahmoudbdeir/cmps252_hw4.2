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

@Tag("18")
class Record_4003 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4003: FirstName is Phil")
	void FirstNameOfRecord4003() {
		assertEquals("Phil", customers.get(4002).getFirstName());
	}

	@Test
	@DisplayName("Record 4003: LastName is Tooze")
	void LastNameOfRecord4003() {
		assertEquals("Tooze", customers.get(4002).getLastName());
	}

	@Test
	@DisplayName("Record 4003: Company is Thor Building Systems Inc")
	void CompanyOfRecord4003() {
		assertEquals("Thor Building Systems Inc", customers.get(4002).getCompany());
	}

	@Test
	@DisplayName("Record 4003: Address is 421 E 61st St")
	void AddressOfRecord4003() {
		assertEquals("421 E 61st St", customers.get(4002).getAddress());
	}

	@Test
	@DisplayName("Record 4003: City is New York")
	void CityOfRecord4003() {
		assertEquals("New York", customers.get(4002).getCity());
	}

	@Test
	@DisplayName("Record 4003: County is New York")
	void CountyOfRecord4003() {
		assertEquals("New York", customers.get(4002).getCounty());
	}

	@Test
	@DisplayName("Record 4003: State is NY")
	void StateOfRecord4003() {
		assertEquals("NY", customers.get(4002).getState());
	}

	@Test
	@DisplayName("Record 4003: ZIP is 10021")
	void ZIPOfRecord4003() {
		assertEquals("10021", customers.get(4002).getZIP());
	}

	@Test
	@DisplayName("Record 4003: Phone is 212-688-9059")
	void PhoneOfRecord4003() {
		assertEquals("212-688-9059", customers.get(4002).getPhone());
	}

	@Test
	@DisplayName("Record 4003: Fax is 212-688-1183")
	void FaxOfRecord4003() {
		assertEquals("212-688-1183", customers.get(4002).getFax());
	}

	@Test
	@DisplayName("Record 4003: Email is phil@tooze.com")
	void EmailOfRecord4003() {
		assertEquals("phil@tooze.com", customers.get(4002).getEmail());
	}

	@Test
	@DisplayName("Record 4003: Web is http://www.philtooze.com")
	void WebOfRecord4003() {
		assertEquals("http://www.philtooze.com", customers.get(4002).getWeb());
	}
}
