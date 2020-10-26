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

@Tag("43")
class Record_1554 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1554: FirstName is Weston")
	void FirstNameOfRecord1554() {
		assertEquals("Weston", customers.get(1553).getFirstName());
	}

	@Test
	@DisplayName("Record 1554: LastName is Snoke")
	void LastNameOfRecord1554() {
		assertEquals("Snoke", customers.get(1553).getLastName());
	}

	@Test
	@DisplayName("Record 1554: Company is Ocallahans Restaurant")
	void CompanyOfRecord1554() {
		assertEquals("Ocallahans Restaurant", customers.get(1553).getCompany());
	}

	@Test
	@DisplayName("Record 1554: Address is 171 Main St")
	void AddressOfRecord1554() {
		assertEquals("171 Main St", customers.get(1553).getAddress());
	}

	@Test
	@DisplayName("Record 1554: City is Matawan")
	void CityOfRecord1554() {
		assertEquals("Matawan", customers.get(1553).getCity());
	}

	@Test
	@DisplayName("Record 1554: County is Monmouth")
	void CountyOfRecord1554() {
		assertEquals("Monmouth", customers.get(1553).getCounty());
	}

	@Test
	@DisplayName("Record 1554: State is NJ")
	void StateOfRecord1554() {
		assertEquals("NJ", customers.get(1553).getState());
	}

	@Test
	@DisplayName("Record 1554: ZIP is 7747")
	void ZIPOfRecord1554() {
		assertEquals("7747", customers.get(1553).getZIP());
	}

	@Test
	@DisplayName("Record 1554: Phone is 732-583-2113")
	void PhoneOfRecord1554() {
		assertEquals("732-583-2113", customers.get(1553).getPhone());
	}

	@Test
	@DisplayName("Record 1554: Fax is 732-583-5829")
	void FaxOfRecord1554() {
		assertEquals("732-583-5829", customers.get(1553).getFax());
	}

	@Test
	@DisplayName("Record 1554: Email is weston@snoke.com")
	void EmailOfRecord1554() {
		assertEquals("weston@snoke.com", customers.get(1553).getEmail());
	}

	@Test
	@DisplayName("Record 1554: Web is http://www.westonsnoke.com")
	void WebOfRecord1554() {
		assertEquals("http://www.westonsnoke.com", customers.get(1553).getWeb());
	}
}
