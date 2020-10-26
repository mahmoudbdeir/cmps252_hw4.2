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
class Record_678 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 678: FirstName is Ola")
	void FirstNameOfRecord678() {
		assertEquals("Ola", customers.get(677).getFirstName());
	}

	@Test
	@DisplayName("Record 678: LastName is Julca")
	void LastNameOfRecord678() {
		assertEquals("Julca", customers.get(677).getLastName());
	}

	@Test
	@DisplayName("Record 678: Company is Kaulana Kai Hotel")
	void CompanyOfRecord678() {
		assertEquals("Kaulana Kai Hotel", customers.get(677).getCompany());
	}

	@Test
	@DisplayName("Record 678: Address is 2388 E Pleasant Valley Rd")
	void AddressOfRecord678() {
		assertEquals("2388 E Pleasant Valley Rd", customers.get(677).getAddress());
	}

	@Test
	@DisplayName("Record 678: City is Oxnard")
	void CityOfRecord678() {
		assertEquals("Oxnard", customers.get(677).getCity());
	}

	@Test
	@DisplayName("Record 678: County is Ventura")
	void CountyOfRecord678() {
		assertEquals("Ventura", customers.get(677).getCounty());
	}

	@Test
	@DisplayName("Record 678: State is CA")
	void StateOfRecord678() {
		assertEquals("CA", customers.get(677).getState());
	}

	@Test
	@DisplayName("Record 678: ZIP is 93033")
	void ZIPOfRecord678() {
		assertEquals("93033", customers.get(677).getZIP());
	}

	@Test
	@DisplayName("Record 678: Phone is 805-486-2311")
	void PhoneOfRecord678() {
		assertEquals("805-486-2311", customers.get(677).getPhone());
	}

	@Test
	@DisplayName("Record 678: Fax is 805-486-2798")
	void FaxOfRecord678() {
		assertEquals("805-486-2798", customers.get(677).getFax());
	}

	@Test
	@DisplayName("Record 678: Email is ola@julca.com")
	void EmailOfRecord678() {
		assertEquals("ola@julca.com", customers.get(677).getEmail());
	}

	@Test
	@DisplayName("Record 678: Web is http://www.olajulca.com")
	void WebOfRecord678() {
		assertEquals("http://www.olajulca.com", customers.get(677).getWeb());
	}
}
