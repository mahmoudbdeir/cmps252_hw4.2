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

@Tag("29")
class Record_3277 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3277: FirstName is Eldridge")
	void FirstNameOfRecord3277() {
		assertEquals("Eldridge", customers.get(3276).getFirstName());
	}

	@Test
	@DisplayName("Record 3277: LastName is Lidster")
	void LastNameOfRecord3277() {
		assertEquals("Lidster", customers.get(3276).getLastName());
	}

	@Test
	@DisplayName("Record 3277: Company is Bps Reprographic Svc San Fran")
	void CompanyOfRecord3277() {
		assertEquals("Bps Reprographic Svc San Fran", customers.get(3276).getCompany());
	}

	@Test
	@DisplayName("Record 3277: Address is 10 Industrial Dr")
	void AddressOfRecord3277() {
		assertEquals("10 Industrial Dr", customers.get(3276).getAddress());
	}

	@Test
	@DisplayName("Record 3277: City is New Brunswick")
	void CityOfRecord3277() {
		assertEquals("New Brunswick", customers.get(3276).getCity());
	}

	@Test
	@DisplayName("Record 3277: County is Middlesex")
	void CountyOfRecord3277() {
		assertEquals("Middlesex", customers.get(3276).getCounty());
	}

	@Test
	@DisplayName("Record 3277: State is NJ")
	void StateOfRecord3277() {
		assertEquals("NJ", customers.get(3276).getState());
	}

	@Test
	@DisplayName("Record 3277: ZIP is 8901")
	void ZIPOfRecord3277() {
		assertEquals("8901", customers.get(3276).getZIP());
	}

	@Test
	@DisplayName("Record 3277: Phone is 732-247-8536")
	void PhoneOfRecord3277() {
		assertEquals("732-247-8536", customers.get(3276).getPhone());
	}

	@Test
	@DisplayName("Record 3277: Fax is 732-247-2067")
	void FaxOfRecord3277() {
		assertEquals("732-247-2067", customers.get(3276).getFax());
	}

	@Test
	@DisplayName("Record 3277: Email is eldridge@lidster.com")
	void EmailOfRecord3277() {
		assertEquals("eldridge@lidster.com", customers.get(3276).getEmail());
	}

	@Test
	@DisplayName("Record 3277: Web is http://www.eldridgelidster.com")
	void WebOfRecord3277() {
		assertEquals("http://www.eldridgelidster.com", customers.get(3276).getWeb());
	}
}
