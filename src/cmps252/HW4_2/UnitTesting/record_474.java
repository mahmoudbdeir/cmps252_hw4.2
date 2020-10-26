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

@Tag("20")
class Record_474 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 474: FirstName is Katherine")
	void FirstNameOfRecord474() {
		assertEquals("Katherine", customers.get(473).getFirstName());
	}

	@Test
	@DisplayName("Record 474: LastName is Willimas")
	void LastNameOfRecord474() {
		assertEquals("Willimas", customers.get(473).getLastName());
	}

	@Test
	@DisplayName("Record 474: Company is Waddingham & Peterson")
	void CompanyOfRecord474() {
		assertEquals("Waddingham & Peterson", customers.get(473).getCompany());
	}

	@Test
	@DisplayName("Record 474: Address is 1870 W Bayshore Rd")
	void AddressOfRecord474() {
		assertEquals("1870 W Bayshore Rd", customers.get(473).getAddress());
	}

	@Test
	@DisplayName("Record 474: City is Palo Alto")
	void CityOfRecord474() {
		assertEquals("Palo Alto", customers.get(473).getCity());
	}

	@Test
	@DisplayName("Record 474: County is Santa Clara")
	void CountyOfRecord474() {
		assertEquals("Santa Clara", customers.get(473).getCounty());
	}

	@Test
	@DisplayName("Record 474: State is CA")
	void StateOfRecord474() {
		assertEquals("CA", customers.get(473).getState());
	}

	@Test
	@DisplayName("Record 474: ZIP is 94303")
	void ZIPOfRecord474() {
		assertEquals("94303", customers.get(473).getZIP());
	}

	@Test
	@DisplayName("Record 474: Phone is 650-321-1559")
	void PhoneOfRecord474() {
		assertEquals("650-321-1559", customers.get(473).getPhone());
	}

	@Test
	@DisplayName("Record 474: Fax is 650-321-6276")
	void FaxOfRecord474() {
		assertEquals("650-321-6276", customers.get(473).getFax());
	}

	@Test
	@DisplayName("Record 474: Email is katherine@willimas.com")
	void EmailOfRecord474() {
		assertEquals("katherine@willimas.com", customers.get(473).getEmail());
	}

	@Test
	@DisplayName("Record 474: Web is http://www.katherinewillimas.com")
	void WebOfRecord474() {
		assertEquals("http://www.katherinewillimas.com", customers.get(473).getWeb());
	}
}
