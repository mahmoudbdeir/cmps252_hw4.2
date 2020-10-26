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

@Tag("19")
class Record_3081 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3081: FirstName is Emmanuel")
	void FirstNameOfRecord3081() {
		assertEquals("Emmanuel", customers.get(3080).getFirstName());
	}

	@Test
	@DisplayName("Record 3081: LastName is Waldeck")
	void LastNameOfRecord3081() {
		assertEquals("Waldeck", customers.get(3080).getLastName());
	}

	@Test
	@DisplayName("Record 3081: Company is Clays Creative Corner Bkry Inc")
	void CompanyOfRecord3081() {
		assertEquals("Clays Creative Corner Bkry Inc", customers.get(3080).getCompany());
	}

	@Test
	@DisplayName("Record 3081: Address is 556 E Weddell Dr")
	void AddressOfRecord3081() {
		assertEquals("556 E Weddell Dr", customers.get(3080).getAddress());
	}

	@Test
	@DisplayName("Record 3081: City is Sunnyvale")
	void CityOfRecord3081() {
		assertEquals("Sunnyvale", customers.get(3080).getCity());
	}

	@Test
	@DisplayName("Record 3081: County is Santa Clara")
	void CountyOfRecord3081() {
		assertEquals("Santa Clara", customers.get(3080).getCounty());
	}

	@Test
	@DisplayName("Record 3081: State is CA")
	void StateOfRecord3081() {
		assertEquals("CA", customers.get(3080).getState());
	}

	@Test
	@DisplayName("Record 3081: ZIP is 94089")
	void ZIPOfRecord3081() {
		assertEquals("94089", customers.get(3080).getZIP());
	}

	@Test
	@DisplayName("Record 3081: Phone is 408-745-2098")
	void PhoneOfRecord3081() {
		assertEquals("408-745-2098", customers.get(3080).getPhone());
	}

	@Test
	@DisplayName("Record 3081: Fax is 408-745-2684")
	void FaxOfRecord3081() {
		assertEquals("408-745-2684", customers.get(3080).getFax());
	}

	@Test
	@DisplayName("Record 3081: Email is emmanuel@waldeck.com")
	void EmailOfRecord3081() {
		assertEquals("emmanuel@waldeck.com", customers.get(3080).getEmail());
	}

	@Test
	@DisplayName("Record 3081: Web is http://www.emmanuelwaldeck.com")
	void WebOfRecord3081() {
		assertEquals("http://www.emmanuelwaldeck.com", customers.get(3080).getWeb());
	}
}
