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

@Tag("28")
class Record_4361 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4361: FirstName is Eduardo")
	void FirstNameOfRecord4361() {
		assertEquals("Eduardo", customers.get(4360).getFirstName());
	}

	@Test
	@DisplayName("Record 4361: LastName is Wombolt")
	void LastNameOfRecord4361() {
		assertEquals("Wombolt", customers.get(4360).getLastName());
	}

	@Test
	@DisplayName("Record 4361: Company is Archer Rubber Co")
	void CompanyOfRecord4361() {
		assertEquals("Archer Rubber Co", customers.get(4360).getCompany());
	}

	@Test
	@DisplayName("Record 4361: Address is 44 Montgomery St")
	void AddressOfRecord4361() {
		assertEquals("44 Montgomery St", customers.get(4360).getAddress());
	}

	@Test
	@DisplayName("Record 4361: City is San Francisco")
	void CityOfRecord4361() {
		assertEquals("San Francisco", customers.get(4360).getCity());
	}

	@Test
	@DisplayName("Record 4361: County is San Francisco")
	void CountyOfRecord4361() {
		assertEquals("San Francisco", customers.get(4360).getCounty());
	}

	@Test
	@DisplayName("Record 4361: State is CA")
	void StateOfRecord4361() {
		assertEquals("CA", customers.get(4360).getState());
	}

	@Test
	@DisplayName("Record 4361: ZIP is 94104")
	void ZIPOfRecord4361() {
		assertEquals("94104", customers.get(4360).getZIP());
	}

	@Test
	@DisplayName("Record 4361: Phone is 415-421-0662")
	void PhoneOfRecord4361() {
		assertEquals("415-421-0662", customers.get(4360).getPhone());
	}

	@Test
	@DisplayName("Record 4361: Fax is 415-421-8727")
	void FaxOfRecord4361() {
		assertEquals("415-421-8727", customers.get(4360).getFax());
	}

	@Test
	@DisplayName("Record 4361: Email is eduardo@wombolt.com")
	void EmailOfRecord4361() {
		assertEquals("eduardo@wombolt.com", customers.get(4360).getEmail());
	}

	@Test
	@DisplayName("Record 4361: Web is http://www.eduardowombolt.com")
	void WebOfRecord4361() {
		assertEquals("http://www.eduardowombolt.com", customers.get(4360).getWeb());
	}
}
