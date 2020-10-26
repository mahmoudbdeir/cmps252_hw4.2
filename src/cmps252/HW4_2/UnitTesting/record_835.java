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

@Tag("5")
class Record_835 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 835: FirstName is Lewis")
	void FirstNameOfRecord835() {
		assertEquals("Lewis", customers.get(834).getFirstName());
	}

	@Test
	@DisplayName("Record 835: LastName is Jividen")
	void LastNameOfRecord835() {
		assertEquals("Jividen", customers.get(834).getLastName());
	}

	@Test
	@DisplayName("Record 835: Company is Americold Corp")
	void CompanyOfRecord835() {
		assertEquals("Americold Corp", customers.get(834).getCompany());
	}

	@Test
	@DisplayName("Record 835: Address is 231 W 39th St")
	void AddressOfRecord835() {
		assertEquals("231 W 39th St", customers.get(834).getAddress());
	}

	@Test
	@DisplayName("Record 835: City is New York")
	void CityOfRecord835() {
		assertEquals("New York", customers.get(834).getCity());
	}

	@Test
	@DisplayName("Record 835: County is New York")
	void CountyOfRecord835() {
		assertEquals("New York", customers.get(834).getCounty());
	}

	@Test
	@DisplayName("Record 835: State is NY")
	void StateOfRecord835() {
		assertEquals("NY", customers.get(834).getState());
	}

	@Test
	@DisplayName("Record 835: ZIP is 10018")
	void ZIPOfRecord835() {
		assertEquals("10018", customers.get(834).getZIP());
	}

	@Test
	@DisplayName("Record 835: Phone is 212-944-0994")
	void PhoneOfRecord835() {
		assertEquals("212-944-0994", customers.get(834).getPhone());
	}

	@Test
	@DisplayName("Record 835: Fax is 212-944-3061")
	void FaxOfRecord835() {
		assertEquals("212-944-3061", customers.get(834).getFax());
	}

	@Test
	@DisplayName("Record 835: Email is lewis@jividen.com")
	void EmailOfRecord835() {
		assertEquals("lewis@jividen.com", customers.get(834).getEmail());
	}

	@Test
	@DisplayName("Record 835: Web is http://www.lewisjividen.com")
	void WebOfRecord835() {
		assertEquals("http://www.lewisjividen.com", customers.get(834).getWeb());
	}
}
