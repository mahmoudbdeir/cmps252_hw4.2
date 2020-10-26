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

@Tag("33")
class Record_2538 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2538: FirstName is Alphonse")
	void FirstNameOfRecord2538() {
		assertEquals("Alphonse", customers.get(2537).getFirstName());
	}

	@Test
	@DisplayName("Record 2538: LastName is Lapinski")
	void LastNameOfRecord2538() {
		assertEquals("Lapinski", customers.get(2537).getLastName());
	}

	@Test
	@DisplayName("Record 2538: Company is Lti Enterprises Inc")
	void CompanyOfRecord2538() {
		assertEquals("Lti Enterprises Inc", customers.get(2537).getCompany());
	}

	@Test
	@DisplayName("Record 2538: Address is 12110 Sherman Way")
	void AddressOfRecord2538() {
		assertEquals("12110 Sherman Way", customers.get(2537).getAddress());
	}

	@Test
	@DisplayName("Record 2538: City is North Hollywood")
	void CityOfRecord2538() {
		assertEquals("North Hollywood", customers.get(2537).getCity());
	}

	@Test
	@DisplayName("Record 2538: County is Los Angeles")
	void CountyOfRecord2538() {
		assertEquals("Los Angeles", customers.get(2537).getCounty());
	}

	@Test
	@DisplayName("Record 2538: State is CA")
	void StateOfRecord2538() {
		assertEquals("CA", customers.get(2537).getState());
	}

	@Test
	@DisplayName("Record 2538: ZIP is 91605")
	void ZIPOfRecord2538() {
		assertEquals("91605", customers.get(2537).getZIP());
	}

	@Test
	@DisplayName("Record 2538: Phone is 818-982-0437")
	void PhoneOfRecord2538() {
		assertEquals("818-982-0437", customers.get(2537).getPhone());
	}

	@Test
	@DisplayName("Record 2538: Fax is 818-982-1612")
	void FaxOfRecord2538() {
		assertEquals("818-982-1612", customers.get(2537).getFax());
	}

	@Test
	@DisplayName("Record 2538: Email is alphonse@lapinski.com")
	void EmailOfRecord2538() {
		assertEquals("alphonse@lapinski.com", customers.get(2537).getEmail());
	}

	@Test
	@DisplayName("Record 2538: Web is http://www.alphonselapinski.com")
	void WebOfRecord2538() {
		assertEquals("http://www.alphonselapinski.com", customers.get(2537).getWeb());
	}
}
