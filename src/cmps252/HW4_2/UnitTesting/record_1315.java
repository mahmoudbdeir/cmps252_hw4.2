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

@Tag("27")
class Record_1315 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1315: FirstName is Oscar")
	void FirstNameOfRecord1315() {
		assertEquals("Oscar", customers.get(1314).getFirstName());
	}

	@Test
	@DisplayName("Record 1315: LastName is Sport")
	void LastNameOfRecord1315() {
		assertEquals("Sport", customers.get(1314).getLastName());
	}

	@Test
	@DisplayName("Record 1315: Company is Jenkins, Morris L Md")
	void CompanyOfRecord1315() {
		assertEquals("Jenkins, Morris L Md", customers.get(1314).getCompany());
	}

	@Test
	@DisplayName("Record 1315: Address is 13601 N 19th Ave")
	void AddressOfRecord1315() {
		assertEquals("13601 N 19th Ave", customers.get(1314).getAddress());
	}

	@Test
	@DisplayName("Record 1315: City is Phoenix")
	void CityOfRecord1315() {
		assertEquals("Phoenix", customers.get(1314).getCity());
	}

	@Test
	@DisplayName("Record 1315: County is Maricopa")
	void CountyOfRecord1315() {
		assertEquals("Maricopa", customers.get(1314).getCounty());
	}

	@Test
	@DisplayName("Record 1315: State is AZ")
	void StateOfRecord1315() {
		assertEquals("AZ", customers.get(1314).getState());
	}

	@Test
	@DisplayName("Record 1315: ZIP is 85029")
	void ZIPOfRecord1315() {
		assertEquals("85029", customers.get(1314).getZIP());
	}

	@Test
	@DisplayName("Record 1315: Phone is 602-866-2050")
	void PhoneOfRecord1315() {
		assertEquals("602-866-2050", customers.get(1314).getPhone());
	}

	@Test
	@DisplayName("Record 1315: Fax is 602-866-3448")
	void FaxOfRecord1315() {
		assertEquals("602-866-3448", customers.get(1314).getFax());
	}

	@Test
	@DisplayName("Record 1315: Email is oscar@sport.com")
	void EmailOfRecord1315() {
		assertEquals("oscar@sport.com", customers.get(1314).getEmail());
	}

	@Test
	@DisplayName("Record 1315: Web is http://www.oscarsport.com")
	void WebOfRecord1315() {
		assertEquals("http://www.oscarsport.com", customers.get(1314).getWeb());
	}
}
