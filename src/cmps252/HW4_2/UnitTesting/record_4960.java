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

@Tag("41")
class Record_4960 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4960: FirstName is Nicky")
	void FirstNameOfRecord4960() {
		assertEquals("Nicky", customers.get(4959).getFirstName());
	}

	@Test
	@DisplayName("Record 4960: LastName is Loeffelholz")
	void LastNameOfRecord4960() {
		assertEquals("Loeffelholz", customers.get(4959).getLastName());
	}

	@Test
	@DisplayName("Record 4960: Company is Aig Life Companies")
	void CompanyOfRecord4960() {
		assertEquals("Aig Life Companies", customers.get(4959).getCompany());
	}

	@Test
	@DisplayName("Record 4960: Address is 1964 Indianola Ave")
	void AddressOfRecord4960() {
		assertEquals("1964 Indianola Ave", customers.get(4959).getAddress());
	}

	@Test
	@DisplayName("Record 4960: City is Des Moines")
	void CityOfRecord4960() {
		assertEquals("Des Moines", customers.get(4959).getCity());
	}

	@Test
	@DisplayName("Record 4960: County is Polk")
	void CountyOfRecord4960() {
		assertEquals("Polk", customers.get(4959).getCounty());
	}

	@Test
	@DisplayName("Record 4960: State is IA")
	void StateOfRecord4960() {
		assertEquals("IA", customers.get(4959).getState());
	}

	@Test
	@DisplayName("Record 4960: ZIP is 50315")
	void ZIPOfRecord4960() {
		assertEquals("50315", customers.get(4959).getZIP());
	}

	@Test
	@DisplayName("Record 4960: Phone is 515-283-7039")
	void PhoneOfRecord4960() {
		assertEquals("515-283-7039", customers.get(4959).getPhone());
	}

	@Test
	@DisplayName("Record 4960: Fax is 515-283-4238")
	void FaxOfRecord4960() {
		assertEquals("515-283-4238", customers.get(4959).getFax());
	}

	@Test
	@DisplayName("Record 4960: Email is nicky@loeffelholz.com")
	void EmailOfRecord4960() {
		assertEquals("nicky@loeffelholz.com", customers.get(4959).getEmail());
	}

	@Test
	@DisplayName("Record 4960: Web is http://www.nickyloeffelholz.com")
	void WebOfRecord4960() {
		assertEquals("http://www.nickyloeffelholz.com", customers.get(4959).getWeb());
	}
}
