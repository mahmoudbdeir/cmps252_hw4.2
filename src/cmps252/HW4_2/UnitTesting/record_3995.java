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
class Record_3995 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3995: FirstName is Lula")
	void FirstNameOfRecord3995() {
		assertEquals("Lula", customers.get(3994).getFirstName());
	}

	@Test
	@DisplayName("Record 3995: LastName is Lamers")
	void LastNameOfRecord3995() {
		assertEquals("Lamers", customers.get(3994).getLastName());
	}

	@Test
	@DisplayName("Record 3995: Company is L S I Inc")
	void CompanyOfRecord3995() {
		assertEquals("L S I Inc", customers.get(3994).getCompany());
	}

	@Test
	@DisplayName("Record 3995: Address is 3117 Highway 90 E")
	void AddressOfRecord3995() {
		assertEquals("3117 Highway 90 E", customers.get(3994).getAddress());
	}

	@Test
	@DisplayName("Record 3995: City is Broussard")
	void CityOfRecord3995() {
		assertEquals("Broussard", customers.get(3994).getCity());
	}

	@Test
	@DisplayName("Record 3995: County is Lafayette")
	void CountyOfRecord3995() {
		assertEquals("Lafayette", customers.get(3994).getCounty());
	}

	@Test
	@DisplayName("Record 3995: State is LA")
	void StateOfRecord3995() {
		assertEquals("LA", customers.get(3994).getState());
	}

	@Test
	@DisplayName("Record 3995: ZIP is 70518")
	void ZIPOfRecord3995() {
		assertEquals("70518", customers.get(3994).getZIP());
	}

	@Test
	@DisplayName("Record 3995: Phone is 337-261-3780")
	void PhoneOfRecord3995() {
		assertEquals("337-261-3780", customers.get(3994).getPhone());
	}

	@Test
	@DisplayName("Record 3995: Fax is 337-261-2749")
	void FaxOfRecord3995() {
		assertEquals("337-261-2749", customers.get(3994).getFax());
	}

	@Test
	@DisplayName("Record 3995: Email is lula@lamers.com")
	void EmailOfRecord3995() {
		assertEquals("lula@lamers.com", customers.get(3994).getEmail());
	}

	@Test
	@DisplayName("Record 3995: Web is http://www.lulalamers.com")
	void WebOfRecord3995() {
		assertEquals("http://www.lulalamers.com", customers.get(3994).getWeb());
	}
}
