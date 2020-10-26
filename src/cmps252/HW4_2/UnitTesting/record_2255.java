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

@Tag("38")
class Record_2255 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2255: FirstName is Travis")
	void FirstNameOfRecord2255() {
		assertEquals("Travis", customers.get(2254).getFirstName());
	}

	@Test
	@DisplayName("Record 2255: LastName is Copes")
	void LastNameOfRecord2255() {
		assertEquals("Copes", customers.get(2254).getLastName());
	}

	@Test
	@DisplayName("Record 2255: Company is Springs Window Fashions")
	void CompanyOfRecord2255() {
		assertEquals("Springs Window Fashions", customers.get(2254).getCompany());
	}

	@Test
	@DisplayName("Record 2255: Address is 870 Market St")
	void AddressOfRecord2255() {
		assertEquals("870 Market St", customers.get(2254).getAddress());
	}

	@Test
	@DisplayName("Record 2255: City is San Francisco")
	void CityOfRecord2255() {
		assertEquals("San Francisco", customers.get(2254).getCity());
	}

	@Test
	@DisplayName("Record 2255: County is San Francisco")
	void CountyOfRecord2255() {
		assertEquals("San Francisco", customers.get(2254).getCounty());
	}

	@Test
	@DisplayName("Record 2255: State is CA")
	void StateOfRecord2255() {
		assertEquals("CA", customers.get(2254).getState());
	}

	@Test
	@DisplayName("Record 2255: ZIP is 94102")
	void ZIPOfRecord2255() {
		assertEquals("94102", customers.get(2254).getZIP());
	}

	@Test
	@DisplayName("Record 2255: Phone is 415-834-3061")
	void PhoneOfRecord2255() {
		assertEquals("415-834-3061", customers.get(2254).getPhone());
	}

	@Test
	@DisplayName("Record 2255: Fax is 415-834-7094")
	void FaxOfRecord2255() {
		assertEquals("415-834-7094", customers.get(2254).getFax());
	}

	@Test
	@DisplayName("Record 2255: Email is travis@copes.com")
	void EmailOfRecord2255() {
		assertEquals("travis@copes.com", customers.get(2254).getEmail());
	}

	@Test
	@DisplayName("Record 2255: Web is http://www.traviscopes.com")
	void WebOfRecord2255() {
		assertEquals("http://www.traviscopes.com", customers.get(2254).getWeb());
	}
}
