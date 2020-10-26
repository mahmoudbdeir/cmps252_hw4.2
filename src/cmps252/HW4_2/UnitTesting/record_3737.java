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
class Record_3737 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3737: FirstName is Holly")
	void FirstNameOfRecord3737() {
		assertEquals("Holly", customers.get(3736).getFirstName());
	}

	@Test
	@DisplayName("Record 3737: LastName is Claridge")
	void LastNameOfRecord3737() {
		assertEquals("Claridge", customers.get(3736).getLastName());
	}

	@Test
	@DisplayName("Record 3737: Company is Maves, Paul D")
	void CompanyOfRecord3737() {
		assertEquals("Maves, Paul D", customers.get(3736).getCompany());
	}

	@Test
	@DisplayName("Record 3737: Address is 11842 Grays Corner Rd")
	void AddressOfRecord3737() {
		assertEquals("11842 Grays Corner Rd", customers.get(3736).getAddress());
	}

	@Test
	@DisplayName("Record 3737: City is Berlin")
	void CityOfRecord3737() {
		assertEquals("Berlin", customers.get(3736).getCity());
	}

	@Test
	@DisplayName("Record 3737: County is Worcester")
	void CountyOfRecord3737() {
		assertEquals("Worcester", customers.get(3736).getCounty());
	}

	@Test
	@DisplayName("Record 3737: State is MD")
	void StateOfRecord3737() {
		assertEquals("MD", customers.get(3736).getState());
	}

	@Test
	@DisplayName("Record 3737: ZIP is 21811")
	void ZIPOfRecord3737() {
		assertEquals("21811", customers.get(3736).getZIP());
	}

	@Test
	@DisplayName("Record 3737: Phone is 410-213-1097")
	void PhoneOfRecord3737() {
		assertEquals("410-213-1097", customers.get(3736).getPhone());
	}

	@Test
	@DisplayName("Record 3737: Fax is 410-213-1241")
	void FaxOfRecord3737() {
		assertEquals("410-213-1241", customers.get(3736).getFax());
	}

	@Test
	@DisplayName("Record 3737: Email is holly@claridge.com")
	void EmailOfRecord3737() {
		assertEquals("holly@claridge.com", customers.get(3736).getEmail());
	}

	@Test
	@DisplayName("Record 3737: Web is http://www.hollyclaridge.com")
	void WebOfRecord3737() {
		assertEquals("http://www.hollyclaridge.com", customers.get(3736).getWeb());
	}
}
