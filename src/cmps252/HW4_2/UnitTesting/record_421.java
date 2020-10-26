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

@Tag("0")
class Record_421 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 421: FirstName is Norman")
	void FirstNameOfRecord421() {
		assertEquals("Norman", customers.get(420).getFirstName());
	}

	@Test
	@DisplayName("Record 421: LastName is Skeesick")
	void LastNameOfRecord421() {
		assertEquals("Skeesick", customers.get(420).getLastName());
	}

	@Test
	@DisplayName("Record 421: Company is Boise Cascade Office Products")
	void CompanyOfRecord421() {
		assertEquals("Boise Cascade Office Products", customers.get(420).getCompany());
	}

	@Test
	@DisplayName("Record 421: Address is 5260 Vineland Ave")
	void AddressOfRecord421() {
		assertEquals("5260 Vineland Ave", customers.get(420).getAddress());
	}

	@Test
	@DisplayName("Record 421: City is North Hollywood")
	void CityOfRecord421() {
		assertEquals("North Hollywood", customers.get(420).getCity());
	}

	@Test
	@DisplayName("Record 421: County is Los Angeles")
	void CountyOfRecord421() {
		assertEquals("Los Angeles", customers.get(420).getCounty());
	}

	@Test
	@DisplayName("Record 421: State is CA")
	void StateOfRecord421() {
		assertEquals("CA", customers.get(420).getState());
	}

	@Test
	@DisplayName("Record 421: ZIP is 91601")
	void ZIPOfRecord421() {
		assertEquals("91601", customers.get(420).getZIP());
	}

	@Test
	@DisplayName("Record 421: Phone is 818-509-3478")
	void PhoneOfRecord421() {
		assertEquals("818-509-3478", customers.get(420).getPhone());
	}

	@Test
	@DisplayName("Record 421: Fax is 818-509-7039")
	void FaxOfRecord421() {
		assertEquals("818-509-7039", customers.get(420).getFax());
	}

	@Test
	@DisplayName("Record 421: Email is norman@skeesick.com")
	void EmailOfRecord421() {
		assertEquals("norman@skeesick.com", customers.get(420).getEmail());
	}

	@Test
	@DisplayName("Record 421: Web is http://www.normanskeesick.com")
	void WebOfRecord421() {
		assertEquals("http://www.normanskeesick.com", customers.get(420).getWeb());
	}
}
