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

@Tag("28")
class Record_3245 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3245: FirstName is Nannie")
	void FirstNameOfRecord3245() {
		assertEquals("Nannie", customers.get(3244).getFirstName());
	}

	@Test
	@DisplayName("Record 3245: LastName is Rancifer")
	void LastNameOfRecord3245() {
		assertEquals("Rancifer", customers.get(3244).getLastName());
	}

	@Test
	@DisplayName("Record 3245: Company is Comp U Copy")
	void CompanyOfRecord3245() {
		assertEquals("Comp U Copy", customers.get(3244).getCompany());
	}

	@Test
	@DisplayName("Record 3245: Address is 6565 Spencer St")
	void AddressOfRecord3245() {
		assertEquals("6565 Spencer St", customers.get(3244).getAddress());
	}

	@Test
	@DisplayName("Record 3245: City is Las Vegas")
	void CityOfRecord3245() {
		assertEquals("Las Vegas", customers.get(3244).getCity());
	}

	@Test
	@DisplayName("Record 3245: County is Clark")
	void CountyOfRecord3245() {
		assertEquals("Clark", customers.get(3244).getCounty());
	}

	@Test
	@DisplayName("Record 3245: State is NV")
	void StateOfRecord3245() {
		assertEquals("NV", customers.get(3244).getState());
	}

	@Test
	@DisplayName("Record 3245: ZIP is 89119")
	void ZIPOfRecord3245() {
		assertEquals("89119", customers.get(3244).getZIP());
	}

	@Test
	@DisplayName("Record 3245: Phone is 702-361-8775")
	void PhoneOfRecord3245() {
		assertEquals("702-361-8775", customers.get(3244).getPhone());
	}

	@Test
	@DisplayName("Record 3245: Fax is 702-361-0107")
	void FaxOfRecord3245() {
		assertEquals("702-361-0107", customers.get(3244).getFax());
	}

	@Test
	@DisplayName("Record 3245: Email is nannie@rancifer.com")
	void EmailOfRecord3245() {
		assertEquals("nannie@rancifer.com", customers.get(3244).getEmail());
	}

	@Test
	@DisplayName("Record 3245: Web is http://www.nannierancifer.com")
	void WebOfRecord3245() {
		assertEquals("http://www.nannierancifer.com", customers.get(3244).getWeb());
	}
}
