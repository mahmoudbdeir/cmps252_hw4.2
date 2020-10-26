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

@Tag("42")
class Record_1277 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1277: FirstName is Branden")
	void FirstNameOfRecord1277() {
		assertEquals("Branden", customers.get(1276).getFirstName());
	}

	@Test
	@DisplayName("Record 1277: LastName is Hollins")
	void LastNameOfRecord1277() {
		assertEquals("Hollins", customers.get(1276).getLastName());
	}

	@Test
	@DisplayName("Record 1277: Company is Globe Food Equipment Co")
	void CompanyOfRecord1277() {
		assertEquals("Globe Food Equipment Co", customers.get(1276).getCompany());
	}

	@Test
	@DisplayName("Record 1277: Address is 5124 W Vickery Blvd")
	void AddressOfRecord1277() {
		assertEquals("5124 W Vickery Blvd", customers.get(1276).getAddress());
	}

	@Test
	@DisplayName("Record 1277: City is Fort Worth")
	void CityOfRecord1277() {
		assertEquals("Fort Worth", customers.get(1276).getCity());
	}

	@Test
	@DisplayName("Record 1277: County is Tarrant")
	void CountyOfRecord1277() {
		assertEquals("Tarrant", customers.get(1276).getCounty());
	}

	@Test
	@DisplayName("Record 1277: State is TX")
	void StateOfRecord1277() {
		assertEquals("TX", customers.get(1276).getState());
	}

	@Test
	@DisplayName("Record 1277: ZIP is 76107")
	void ZIPOfRecord1277() {
		assertEquals("76107", customers.get(1276).getZIP());
	}

	@Test
	@DisplayName("Record 1277: Phone is 817-763-0807")
	void PhoneOfRecord1277() {
		assertEquals("817-763-0807", customers.get(1276).getPhone());
	}

	@Test
	@DisplayName("Record 1277: Fax is 817-763-7826")
	void FaxOfRecord1277() {
		assertEquals("817-763-7826", customers.get(1276).getFax());
	}

	@Test
	@DisplayName("Record 1277: Email is branden@hollins.com")
	void EmailOfRecord1277() {
		assertEquals("branden@hollins.com", customers.get(1276).getEmail());
	}

	@Test
	@DisplayName("Record 1277: Web is http://www.brandenhollins.com")
	void WebOfRecord1277() {
		assertEquals("http://www.brandenhollins.com", customers.get(1276).getWeb());
	}
}
