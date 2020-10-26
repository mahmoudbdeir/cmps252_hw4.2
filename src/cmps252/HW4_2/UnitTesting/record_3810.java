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

@Tag("11")
class Record_3810 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3810: FirstName is Arthur")
	void FirstNameOfRecord3810() {
		assertEquals("Arthur", customers.get(3809).getFirstName());
	}

	@Test
	@DisplayName("Record 3810: LastName is Bartone")
	void LastNameOfRecord3810() {
		assertEquals("Bartone", customers.get(3809).getLastName());
	}

	@Test
	@DisplayName("Record 3810: Company is Kelco Sales & Engineering Co")
	void CompanyOfRecord3810() {
		assertEquals("Kelco Sales & Engineering Co", customers.get(3809).getCompany());
	}

	@Test
	@DisplayName("Record 3810: Address is 1621 Wall St")
	void AddressOfRecord3810() {
		assertEquals("1621 Wall St", customers.get(3809).getAddress());
	}

	@Test
	@DisplayName("Record 3810: City is Dallas")
	void CityOfRecord3810() {
		assertEquals("Dallas", customers.get(3809).getCity());
	}

	@Test
	@DisplayName("Record 3810: County is Dallas")
	void CountyOfRecord3810() {
		assertEquals("Dallas", customers.get(3809).getCounty());
	}

	@Test
	@DisplayName("Record 3810: State is TX")
	void StateOfRecord3810() {
		assertEquals("TX", customers.get(3809).getState());
	}

	@Test
	@DisplayName("Record 3810: ZIP is 75215")
	void ZIPOfRecord3810() {
		assertEquals("75215", customers.get(3809).getZIP());
	}

	@Test
	@DisplayName("Record 3810: Phone is 214-428-3263")
	void PhoneOfRecord3810() {
		assertEquals("214-428-3263", customers.get(3809).getPhone());
	}

	@Test
	@DisplayName("Record 3810: Fax is 214-428-0854")
	void FaxOfRecord3810() {
		assertEquals("214-428-0854", customers.get(3809).getFax());
	}

	@Test
	@DisplayName("Record 3810: Email is arthur@bartone.com")
	void EmailOfRecord3810() {
		assertEquals("arthur@bartone.com", customers.get(3809).getEmail());
	}

	@Test
	@DisplayName("Record 3810: Web is http://www.arthurbartone.com")
	void WebOfRecord3810() {
		assertEquals("http://www.arthurbartone.com", customers.get(3809).getWeb());
	}
}
