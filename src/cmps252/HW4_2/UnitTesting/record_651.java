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

@Tag("24")
class Record_651 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 651: FirstName is Ross")
	void FirstNameOfRecord651() {
		assertEquals("Ross", customers.get(650).getFirstName());
	}

	@Test
	@DisplayName("Record 651: LastName is Coupe")
	void LastNameOfRecord651() {
		assertEquals("Coupe", customers.get(650).getLastName());
	}

	@Test
	@DisplayName("Record 651: Company is Cockatoo Inn The Grand Hotel")
	void CompanyOfRecord651() {
		assertEquals("Cockatoo Inn The Grand Hotel", customers.get(650).getCompany());
	}

	@Test
	@DisplayName("Record 651: Address is 644 Middlegate Rd")
	void AddressOfRecord651() {
		assertEquals("644 Middlegate Rd", customers.get(650).getAddress());
	}

	@Test
	@DisplayName("Record 651: City is Henderson")
	void CityOfRecord651() {
		assertEquals("Henderson", customers.get(650).getCity());
	}

	@Test
	@DisplayName("Record 651: County is Clark")
	void CountyOfRecord651() {
		assertEquals("Clark", customers.get(650).getCounty());
	}

	@Test
	@DisplayName("Record 651: State is NV")
	void StateOfRecord651() {
		assertEquals("NV", customers.get(650).getState());
	}

	@Test
	@DisplayName("Record 651: ZIP is 89015")
	void ZIPOfRecord651() {
		assertEquals("89015", customers.get(650).getZIP());
	}

	@Test
	@DisplayName("Record 651: Phone is 702-565-6878")
	void PhoneOfRecord651() {
		assertEquals("702-565-6878", customers.get(650).getPhone());
	}

	@Test
	@DisplayName("Record 651: Fax is 702-565-8305")
	void FaxOfRecord651() {
		assertEquals("702-565-8305", customers.get(650).getFax());
	}

	@Test
	@DisplayName("Record 651: Email is ross@coupe.com")
	void EmailOfRecord651() {
		assertEquals("ross@coupe.com", customers.get(650).getEmail());
	}

	@Test
	@DisplayName("Record 651: Web is http://www.rosscoupe.com")
	void WebOfRecord651() {
		assertEquals("http://www.rosscoupe.com", customers.get(650).getWeb());
	}
}
