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

@Tag("4")
class Record_503 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 503: FirstName is Sallie")
	void FirstNameOfRecord503() {
		assertEquals("Sallie", customers.get(502).getFirstName());
	}

	@Test
	@DisplayName("Record 503: LastName is Marquardt")
	void LastNameOfRecord503() {
		assertEquals("Marquardt", customers.get(502).getLastName());
	}

	@Test
	@DisplayName("Record 503: Company is Visx Inc")
	void CompanyOfRecord503() {
		assertEquals("Visx Inc", customers.get(502).getCompany());
	}

	@Test
	@DisplayName("Record 503: Address is 1401 Cleveland Ave")
	void AddressOfRecord503() {
		assertEquals("1401 Cleveland Ave", customers.get(502).getAddress());
	}

	@Test
	@DisplayName("Record 503: City is National City")
	void CityOfRecord503() {
		assertEquals("National City", customers.get(502).getCity());
	}

	@Test
	@DisplayName("Record 503: County is San Diego")
	void CountyOfRecord503() {
		assertEquals("San Diego", customers.get(502).getCounty());
	}

	@Test
	@DisplayName("Record 503: State is CA")
	void StateOfRecord503() {
		assertEquals("CA", customers.get(502).getState());
	}

	@Test
	@DisplayName("Record 503: ZIP is 91950")
	void ZIPOfRecord503() {
		assertEquals("91950", customers.get(502).getZIP());
	}

	@Test
	@DisplayName("Record 503: Phone is 619-474-2956")
	void PhoneOfRecord503() {
		assertEquals("619-474-2956", customers.get(502).getPhone());
	}

	@Test
	@DisplayName("Record 503: Fax is 619-474-3905")
	void FaxOfRecord503() {
		assertEquals("619-474-3905", customers.get(502).getFax());
	}

	@Test
	@DisplayName("Record 503: Email is sallie@marquardt.com")
	void EmailOfRecord503() {
		assertEquals("sallie@marquardt.com", customers.get(502).getEmail());
	}

	@Test
	@DisplayName("Record 503: Web is http://www.salliemarquardt.com")
	void WebOfRecord503() {
		assertEquals("http://www.salliemarquardt.com", customers.get(502).getWeb());
	}
}
