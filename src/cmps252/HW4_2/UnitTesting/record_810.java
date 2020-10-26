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
class Record_810 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 810: FirstName is Chet")
	void FirstNameOfRecord810() {
		assertEquals("Chet", customers.get(809).getFirstName());
	}

	@Test
	@DisplayName("Record 810: LastName is Wynmann")
	void LastNameOfRecord810() {
		assertEquals("Wynmann", customers.get(809).getLastName());
	}

	@Test
	@DisplayName("Record 810: Company is Burkey, Bruce A Esq")
	void CompanyOfRecord810() {
		assertEquals("Burkey, Bruce A Esq", customers.get(809).getCompany());
	}

	@Test
	@DisplayName("Record 810: Address is 950 Nw 12th St")
	void AddressOfRecord810() {
		assertEquals("950 Nw 12th St", customers.get(809).getAddress());
	}

	@Test
	@DisplayName("Record 810: City is Miami")
	void CityOfRecord810() {
		assertEquals("Miami", customers.get(809).getCity());
	}

	@Test
	@DisplayName("Record 810: County is Miami-Dade")
	void CountyOfRecord810() {
		assertEquals("Miami-Dade", customers.get(809).getCounty());
	}

	@Test
	@DisplayName("Record 810: State is FL")
	void StateOfRecord810() {
		assertEquals("FL", customers.get(809).getState());
	}

	@Test
	@DisplayName("Record 810: ZIP is 33136")
	void ZIPOfRecord810() {
		assertEquals("33136", customers.get(809).getZIP());
	}

	@Test
	@DisplayName("Record 810: Phone is 305-887-9944")
	void PhoneOfRecord810() {
		assertEquals("305-887-9944", customers.get(809).getPhone());
	}

	@Test
	@DisplayName("Record 810: Fax is 305-887-6083")
	void FaxOfRecord810() {
		assertEquals("305-887-6083", customers.get(809).getFax());
	}

	@Test
	@DisplayName("Record 810: Email is chet@wynmann.com")
	void EmailOfRecord810() {
		assertEquals("chet@wynmann.com", customers.get(809).getEmail());
	}

	@Test
	@DisplayName("Record 810: Web is http://www.chetwynmann.com")
	void WebOfRecord810() {
		assertEquals("http://www.chetwynmann.com", customers.get(809).getWeb());
	}
}
