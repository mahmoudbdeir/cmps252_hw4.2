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

@Tag("36")
class Record_1892 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1892: FirstName is Steven")
	void FirstNameOfRecord1892() {
		assertEquals("Steven", customers.get(1891).getFirstName());
	}

	@Test
	@DisplayName("Record 1892: LastName is Tinucci")
	void LastNameOfRecord1892() {
		assertEquals("Tinucci", customers.get(1891).getLastName());
	}

	@Test
	@DisplayName("Record 1892: Company is Lime Tree Bay Resort")
	void CompanyOfRecord1892() {
		assertEquals("Lime Tree Bay Resort", customers.get(1891).getCompany());
	}

	@Test
	@DisplayName("Record 1892: Address is 1804 Saemann Ave")
	void AddressOfRecord1892() {
		assertEquals("1804 Saemann Ave", customers.get(1891).getAddress());
	}

	@Test
	@DisplayName("Record 1892: City is Sheboygan")
	void CityOfRecord1892() {
		assertEquals("Sheboygan", customers.get(1891).getCity());
	}

	@Test
	@DisplayName("Record 1892: County is Sheboygan")
	void CountyOfRecord1892() {
		assertEquals("Sheboygan", customers.get(1891).getCounty());
	}

	@Test
	@DisplayName("Record 1892: State is WI")
	void StateOfRecord1892() {
		assertEquals("WI", customers.get(1891).getState());
	}

	@Test
	@DisplayName("Record 1892: ZIP is 53081")
	void ZIPOfRecord1892() {
		assertEquals("53081", customers.get(1891).getZIP());
	}

	@Test
	@DisplayName("Record 1892: Phone is 920-383-3356")
	void PhoneOfRecord1892() {
		assertEquals("920-383-3356", customers.get(1891).getPhone());
	}

	@Test
	@DisplayName("Record 1892: Fax is 920-383-4596")
	void FaxOfRecord1892() {
		assertEquals("920-383-4596", customers.get(1891).getFax());
	}

	@Test
	@DisplayName("Record 1892: Email is steven@tinucci.com")
	void EmailOfRecord1892() {
		assertEquals("steven@tinucci.com", customers.get(1891).getEmail());
	}

	@Test
	@DisplayName("Record 1892: Web is http://www.steventinucci.com")
	void WebOfRecord1892() {
		assertEquals("http://www.steventinucci.com", customers.get(1891).getWeb());
	}
}
