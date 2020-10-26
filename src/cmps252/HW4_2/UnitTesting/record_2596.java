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

@Tag("31")
class Record_2596 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2596: FirstName is Jarvis")
	void FirstNameOfRecord2596() {
		assertEquals("Jarvis", customers.get(2595).getFirstName());
	}

	@Test
	@DisplayName("Record 2596: LastName is Rajtar")
	void LastNameOfRecord2596() {
		assertEquals("Rajtar", customers.get(2595).getLastName());
	}

	@Test
	@DisplayName("Record 2596: Company is East & West Associates")
	void CompanyOfRecord2596() {
		assertEquals("East & West Associates", customers.get(2595).getCompany());
	}

	@Test
	@DisplayName("Record 2596: Address is 2938 Columbia Ave  #-1402")
	void AddressOfRecord2596() {
		assertEquals("2938 Columbia Ave  #-1402", customers.get(2595).getAddress());
	}

	@Test
	@DisplayName("Record 2596: City is Lancaster")
	void CityOfRecord2596() {
		assertEquals("Lancaster", customers.get(2595).getCity());
	}

	@Test
	@DisplayName("Record 2596: County is Lancaster")
	void CountyOfRecord2596() {
		assertEquals("Lancaster", customers.get(2595).getCounty());
	}

	@Test
	@DisplayName("Record 2596: State is PA")
	void StateOfRecord2596() {
		assertEquals("PA", customers.get(2595).getState());
	}

	@Test
	@DisplayName("Record 2596: ZIP is 17603")
	void ZIPOfRecord2596() {
		assertEquals("17603", customers.get(2595).getZIP());
	}

	@Test
	@DisplayName("Record 2596: Phone is 717-291-4917")
	void PhoneOfRecord2596() {
		assertEquals("717-291-4917", customers.get(2595).getPhone());
	}

	@Test
	@DisplayName("Record 2596: Fax is 717-291-9336")
	void FaxOfRecord2596() {
		assertEquals("717-291-9336", customers.get(2595).getFax());
	}

	@Test
	@DisplayName("Record 2596: Email is jarvis@rajtar.com")
	void EmailOfRecord2596() {
		assertEquals("jarvis@rajtar.com", customers.get(2595).getEmail());
	}

	@Test
	@DisplayName("Record 2596: Web is http://www.jarvisrajtar.com")
	void WebOfRecord2596() {
		assertEquals("http://www.jarvisrajtar.com", customers.get(2595).getWeb());
	}
}
