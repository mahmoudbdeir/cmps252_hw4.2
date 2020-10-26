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

@Tag("38")
class Record_2994 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2994: FirstName is Lessie")
	void FirstNameOfRecord2994() {
		assertEquals("Lessie", customers.get(2993).getFirstName());
	}

	@Test
	@DisplayName("Record 2994: LastName is Juvera")
	void LastNameOfRecord2994() {
		assertEquals("Juvera", customers.get(2993).getLastName());
	}

	@Test
	@DisplayName("Record 2994: Company is Chips")
	void CompanyOfRecord2994() {
		assertEquals("Chips", customers.get(2993).getCompany());
	}

	@Test
	@DisplayName("Record 2994: Address is 606 E 27th St")
	void AddressOfRecord2994() {
		assertEquals("606 E 27th St", customers.get(2993).getAddress());
	}

	@Test
	@DisplayName("Record 2994: City is Scottsbluff")
	void CityOfRecord2994() {
		assertEquals("Scottsbluff", customers.get(2993).getCity());
	}

	@Test
	@DisplayName("Record 2994: County is Scotts Bluff")
	void CountyOfRecord2994() {
		assertEquals("Scotts Bluff", customers.get(2993).getCounty());
	}

	@Test
	@DisplayName("Record 2994: State is NE")
	void StateOfRecord2994() {
		assertEquals("NE", customers.get(2993).getState());
	}

	@Test
	@DisplayName("Record 2994: ZIP is 69361")
	void ZIPOfRecord2994() {
		assertEquals("69361", customers.get(2993).getZIP());
	}

	@Test
	@DisplayName("Record 2994: Phone is 308-632-8025")
	void PhoneOfRecord2994() {
		assertEquals("308-632-8025", customers.get(2993).getPhone());
	}

	@Test
	@DisplayName("Record 2994: Fax is 308-632-2457")
	void FaxOfRecord2994() {
		assertEquals("308-632-2457", customers.get(2993).getFax());
	}

	@Test
	@DisplayName("Record 2994: Email is lessie@juvera.com")
	void EmailOfRecord2994() {
		assertEquals("lessie@juvera.com", customers.get(2993).getEmail());
	}

	@Test
	@DisplayName("Record 2994: Web is http://www.lessiejuvera.com")
	void WebOfRecord2994() {
		assertEquals("http://www.lessiejuvera.com", customers.get(2993).getWeb());
	}
}
