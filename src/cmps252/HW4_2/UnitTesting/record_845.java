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

@Tag("21")
class Record_845 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 845: FirstName is Jeffrey")
	void FirstNameOfRecord845() {
		assertEquals("Jeffrey", customers.get(844).getFirstName());
	}

	@Test
	@DisplayName("Record 845: LastName is Reuther")
	void LastNameOfRecord845() {
		assertEquals("Reuther", customers.get(844).getLastName());
	}

	@Test
	@DisplayName("Record 845: Company is Conde Nest")
	void CompanyOfRecord845() {
		assertEquals("Conde Nest", customers.get(844).getCompany());
	}

	@Test
	@DisplayName("Record 845: Address is 1645 Old County Rd")
	void AddressOfRecord845() {
		assertEquals("1645 Old County Rd", customers.get(844).getAddress());
	}

	@Test
	@DisplayName("Record 845: City is San Carlos")
	void CityOfRecord845() {
		assertEquals("San Carlos", customers.get(844).getCity());
	}

	@Test
	@DisplayName("Record 845: County is San Mateo")
	void CountyOfRecord845() {
		assertEquals("San Mateo", customers.get(844).getCounty());
	}

	@Test
	@DisplayName("Record 845: State is CA")
	void StateOfRecord845() {
		assertEquals("CA", customers.get(844).getState());
	}

	@Test
	@DisplayName("Record 845: ZIP is 94070")
	void ZIPOfRecord845() {
		assertEquals("94070", customers.get(844).getZIP());
	}

	@Test
	@DisplayName("Record 845: Phone is 650-591-2828")
	void PhoneOfRecord845() {
		assertEquals("650-591-2828", customers.get(844).getPhone());
	}

	@Test
	@DisplayName("Record 845: Fax is 650-591-4373")
	void FaxOfRecord845() {
		assertEquals("650-591-4373", customers.get(844).getFax());
	}

	@Test
	@DisplayName("Record 845: Email is jeffrey@reuther.com")
	void EmailOfRecord845() {
		assertEquals("jeffrey@reuther.com", customers.get(844).getEmail());
	}

	@Test
	@DisplayName("Record 845: Web is http://www.jeffreyreuther.com")
	void WebOfRecord845() {
		assertEquals("http://www.jeffreyreuther.com", customers.get(844).getWeb());
	}
}
