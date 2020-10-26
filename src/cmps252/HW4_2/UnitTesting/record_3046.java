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

@Tag("6")
class Record_3046 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3046: FirstName is Alton")
	void FirstNameOfRecord3046() {
		assertEquals("Alton", customers.get(3045).getFirstName());
	}

	@Test
	@DisplayName("Record 3046: LastName is Sarcinella")
	void LastNameOfRecord3046() {
		assertEquals("Sarcinella", customers.get(3045).getLastName());
	}

	@Test
	@DisplayName("Record 3046: Company is C & K Plastics Inc")
	void CompanyOfRecord3046() {
		assertEquals("C & K Plastics Inc", customers.get(3045).getCompany());
	}

	@Test
	@DisplayName("Record 3046: Address is 705 W Hollis St")
	void AddressOfRecord3046() {
		assertEquals("705 W Hollis St", customers.get(3045).getAddress());
	}

	@Test
	@DisplayName("Record 3046: City is Nashua")
	void CityOfRecord3046() {
		assertEquals("Nashua", customers.get(3045).getCity());
	}

	@Test
	@DisplayName("Record 3046: County is Hillsborough")
	void CountyOfRecord3046() {
		assertEquals("Hillsborough", customers.get(3045).getCounty());
	}

	@Test
	@DisplayName("Record 3046: State is NH")
	void StateOfRecord3046() {
		assertEquals("NH", customers.get(3045).getState());
	}

	@Test
	@DisplayName("Record 3046: ZIP is 3062")
	void ZIPOfRecord3046() {
		assertEquals("3062", customers.get(3045).getZIP());
	}

	@Test
	@DisplayName("Record 3046: Phone is 603-883-6933")
	void PhoneOfRecord3046() {
		assertEquals("603-883-6933", customers.get(3045).getPhone());
	}

	@Test
	@DisplayName("Record 3046: Fax is 603-883-2105")
	void FaxOfRecord3046() {
		assertEquals("603-883-2105", customers.get(3045).getFax());
	}

	@Test
	@DisplayName("Record 3046: Email is alton@sarcinella.com")
	void EmailOfRecord3046() {
		assertEquals("alton@sarcinella.com", customers.get(3045).getEmail());
	}

	@Test
	@DisplayName("Record 3046: Web is http://www.altonsarcinella.com")
	void WebOfRecord3046() {
		assertEquals("http://www.altonsarcinella.com", customers.get(3045).getWeb());
	}
}
