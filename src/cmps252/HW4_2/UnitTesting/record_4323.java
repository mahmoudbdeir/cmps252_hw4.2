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

@Tag("9")
class Record_4323 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4323: FirstName is Eve")
	void FirstNameOfRecord4323() {
		assertEquals("Eve", customers.get(4322).getFirstName());
	}

	@Test
	@DisplayName("Record 4323: LastName is Giovanetti")
	void LastNameOfRecord4323() {
		assertEquals("Giovanetti", customers.get(4322).getLastName());
	}

	@Test
	@DisplayName("Record 4323: Company is Laube Technology")
	void CompanyOfRecord4323() {
		assertEquals("Laube Technology", customers.get(4322).getCompany());
	}

	@Test
	@DisplayName("Record 4323: Address is 1127 State Route 35")
	void AddressOfRecord4323() {
		assertEquals("1127 State Route 35", customers.get(4322).getAddress());
	}

	@Test
	@DisplayName("Record 4323: City is Asbury Park")
	void CityOfRecord4323() {
		assertEquals("Asbury Park", customers.get(4322).getCity());
	}

	@Test
	@DisplayName("Record 4323: County is Monmouth")
	void CountyOfRecord4323() {
		assertEquals("Monmouth", customers.get(4322).getCounty());
	}

	@Test
	@DisplayName("Record 4323: State is NJ")
	void StateOfRecord4323() {
		assertEquals("NJ", customers.get(4322).getState());
	}

	@Test
	@DisplayName("Record 4323: ZIP is 7712")
	void ZIPOfRecord4323() {
		assertEquals("7712", customers.get(4322).getZIP());
	}

	@Test
	@DisplayName("Record 4323: Phone is 732-517-9445")
	void PhoneOfRecord4323() {
		assertEquals("732-517-9445", customers.get(4322).getPhone());
	}

	@Test
	@DisplayName("Record 4323: Fax is 732-517-6577")
	void FaxOfRecord4323() {
		assertEquals("732-517-6577", customers.get(4322).getFax());
	}

	@Test
	@DisplayName("Record 4323: Email is eve@giovanetti.com")
	void EmailOfRecord4323() {
		assertEquals("eve@giovanetti.com", customers.get(4322).getEmail());
	}

	@Test
	@DisplayName("Record 4323: Web is http://www.evegiovanetti.com")
	void WebOfRecord4323() {
		assertEquals("http://www.evegiovanetti.com", customers.get(4322).getWeb());
	}
}
