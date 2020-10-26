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

@Tag("36")
class Record_2453 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2453: FirstName is Sydney")
	void FirstNameOfRecord2453() {
		assertEquals("Sydney", customers.get(2452).getFirstName());
	}

	@Test
	@DisplayName("Record 2453: LastName is Haby")
	void LastNameOfRecord2453() {
		assertEquals("Haby", customers.get(2452).getLastName());
	}

	@Test
	@DisplayName("Record 2453: Company is Levin, Robert M Esq")
	void CompanyOfRecord2453() {
		assertEquals("Levin, Robert M Esq", customers.get(2452).getCompany());
	}

	@Test
	@DisplayName("Record 2453: Address is 1670 Pine St")
	void AddressOfRecord2453() {
		assertEquals("1670 Pine St", customers.get(2452).getAddress());
	}

	@Test
	@DisplayName("Record 2453: City is San Francisco")
	void CityOfRecord2453() {
		assertEquals("San Francisco", customers.get(2452).getCity());
	}

	@Test
	@DisplayName("Record 2453: County is San Francisco")
	void CountyOfRecord2453() {
		assertEquals("San Francisco", customers.get(2452).getCounty());
	}

	@Test
	@DisplayName("Record 2453: State is CA")
	void StateOfRecord2453() {
		assertEquals("CA", customers.get(2452).getState());
	}

	@Test
	@DisplayName("Record 2453: ZIP is 94109")
	void ZIPOfRecord2453() {
		assertEquals("94109", customers.get(2452).getZIP());
	}

	@Test
	@DisplayName("Record 2453: Phone is 415-921-9451")
	void PhoneOfRecord2453() {
		assertEquals("415-921-9451", customers.get(2452).getPhone());
	}

	@Test
	@DisplayName("Record 2453: Fax is 415-921-0047")
	void FaxOfRecord2453() {
		assertEquals("415-921-0047", customers.get(2452).getFax());
	}

	@Test
	@DisplayName("Record 2453: Email is sydney@haby.com")
	void EmailOfRecord2453() {
		assertEquals("sydney@haby.com", customers.get(2452).getEmail());
	}

	@Test
	@DisplayName("Record 2453: Web is http://www.sydneyhaby.com")
	void WebOfRecord2453() {
		assertEquals("http://www.sydneyhaby.com", customers.get(2452).getWeb());
	}
}
