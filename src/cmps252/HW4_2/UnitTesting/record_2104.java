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

@Tag("35")
class Record_2104 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2104: FirstName is Francis")
	void FirstNameOfRecord2104() {
		assertEquals("Francis", customers.get(2103).getFirstName());
	}

	@Test
	@DisplayName("Record 2104: LastName is Ana")
	void LastNameOfRecord2104() {
		assertEquals("Ana", customers.get(2103).getLastName());
	}

	@Test
	@DisplayName("Record 2104: Company is River Bridge Inn")
	void CompanyOfRecord2104() {
		assertEquals("River Bridge Inn", customers.get(2103).getCompany());
	}

	@Test
	@DisplayName("Record 2104: Address is 175 W Wieuca Rd Ne")
	void AddressOfRecord2104() {
		assertEquals("175 W Wieuca Rd Ne", customers.get(2103).getAddress());
	}

	@Test
	@DisplayName("Record 2104: City is Atlanta")
	void CityOfRecord2104() {
		assertEquals("Atlanta", customers.get(2103).getCity());
	}

	@Test
	@DisplayName("Record 2104: County is Fulton")
	void CountyOfRecord2104() {
		assertEquals("Fulton", customers.get(2103).getCounty());
	}

	@Test
	@DisplayName("Record 2104: State is GA")
	void StateOfRecord2104() {
		assertEquals("GA", customers.get(2103).getState());
	}

	@Test
	@DisplayName("Record 2104: ZIP is 30342")
	void ZIPOfRecord2104() {
		assertEquals("30342", customers.get(2103).getZIP());
	}

	@Test
	@DisplayName("Record 2104: Phone is 404-847-5889")
	void PhoneOfRecord2104() {
		assertEquals("404-847-5889", customers.get(2103).getPhone());
	}

	@Test
	@DisplayName("Record 2104: Fax is 404-847-2287")
	void FaxOfRecord2104() {
		assertEquals("404-847-2287", customers.get(2103).getFax());
	}

	@Test
	@DisplayName("Record 2104: Email is francis@ana.com")
	void EmailOfRecord2104() {
		assertEquals("francis@ana.com", customers.get(2103).getEmail());
	}

	@Test
	@DisplayName("Record 2104: Web is http://www.francisana.com")
	void WebOfRecord2104() {
		assertEquals("http://www.francisana.com", customers.get(2103).getWeb());
	}
}
