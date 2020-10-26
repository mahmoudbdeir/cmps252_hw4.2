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
class Record_3158 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3158: FirstName is Walker")
	void FirstNameOfRecord3158() {
		assertEquals("Walker", customers.get(3157).getFirstName());
	}

	@Test
	@DisplayName("Record 3158: LastName is Wheldon")
	void LastNameOfRecord3158() {
		assertEquals("Wheldon", customers.get(3157).getLastName());
	}

	@Test
	@DisplayName("Record 3158: Company is Pacific Coast Producers")
	void CompanyOfRecord3158() {
		assertEquals("Pacific Coast Producers", customers.get(3157).getCompany());
	}

	@Test
	@DisplayName("Record 3158: Address is 516 W 35th St")
	void AddressOfRecord3158() {
		assertEquals("516 W 35th St", customers.get(3157).getAddress());
	}

	@Test
	@DisplayName("Record 3158: City is Davenport")
	void CityOfRecord3158() {
		assertEquals("Davenport", customers.get(3157).getCity());
	}

	@Test
	@DisplayName("Record 3158: County is Scott")
	void CountyOfRecord3158() {
		assertEquals("Scott", customers.get(3157).getCounty());
	}

	@Test
	@DisplayName("Record 3158: State is IA")
	void StateOfRecord3158() {
		assertEquals("IA", customers.get(3157).getState());
	}

	@Test
	@DisplayName("Record 3158: ZIP is 52806")
	void ZIPOfRecord3158() {
		assertEquals("52806", customers.get(3157).getZIP());
	}

	@Test
	@DisplayName("Record 3158: Phone is 563-391-8533")
	void PhoneOfRecord3158() {
		assertEquals("563-391-8533", customers.get(3157).getPhone());
	}

	@Test
	@DisplayName("Record 3158: Fax is 563-391-2322")
	void FaxOfRecord3158() {
		assertEquals("563-391-2322", customers.get(3157).getFax());
	}

	@Test
	@DisplayName("Record 3158: Email is walker@wheldon.com")
	void EmailOfRecord3158() {
		assertEquals("walker@wheldon.com", customers.get(3157).getEmail());
	}

	@Test
	@DisplayName("Record 3158: Web is http://www.walkerwheldon.com")
	void WebOfRecord3158() {
		assertEquals("http://www.walkerwheldon.com", customers.get(3157).getWeb());
	}
}
