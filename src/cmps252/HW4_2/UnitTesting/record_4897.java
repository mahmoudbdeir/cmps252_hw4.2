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
class Record_4897 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4897: FirstName is Colton")
	void FirstNameOfRecord4897() {
		assertEquals("Colton", customers.get(4896).getFirstName());
	}

	@Test
	@DisplayName("Record 4897: LastName is Brentari")
	void LastNameOfRecord4897() {
		assertEquals("Brentari", customers.get(4896).getLastName());
	}

	@Test
	@DisplayName("Record 4897: Company is Nclis")
	void CompanyOfRecord4897() {
		assertEquals("Nclis", customers.get(4896).getCompany());
	}

	@Test
	@DisplayName("Record 4897: Address is 305 Broadway")
	void AddressOfRecord4897() {
		assertEquals("305 Broadway", customers.get(4896).getAddress());
	}

	@Test
	@DisplayName("Record 4897: City is New York")
	void CityOfRecord4897() {
		assertEquals("New York", customers.get(4896).getCity());
	}

	@Test
	@DisplayName("Record 4897: County is New York")
	void CountyOfRecord4897() {
		assertEquals("New York", customers.get(4896).getCounty());
	}

	@Test
	@DisplayName("Record 4897: State is NY")
	void StateOfRecord4897() {
		assertEquals("NY", customers.get(4896).getState());
	}

	@Test
	@DisplayName("Record 4897: ZIP is 10007")
	void ZIPOfRecord4897() {
		assertEquals("10007", customers.get(4896).getZIP());
	}

	@Test
	@DisplayName("Record 4897: Phone is 212-227-2484")
	void PhoneOfRecord4897() {
		assertEquals("212-227-2484", customers.get(4896).getPhone());
	}

	@Test
	@DisplayName("Record 4897: Fax is 212-227-3385")
	void FaxOfRecord4897() {
		assertEquals("212-227-3385", customers.get(4896).getFax());
	}

	@Test
	@DisplayName("Record 4897: Email is colton@brentari.com")
	void EmailOfRecord4897() {
		assertEquals("colton@brentari.com", customers.get(4896).getEmail());
	}

	@Test
	@DisplayName("Record 4897: Web is http://www.coltonbrentari.com")
	void WebOfRecord4897() {
		assertEquals("http://www.coltonbrentari.com", customers.get(4896).getWeb());
	}
}
