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

@Tag("20")
class Record_56 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 56: FirstName is Jody")
	void FirstNameOfRecord56() {
		assertEquals("Jody", customers.get(55).getFirstName());
	}

	@Test
	@DisplayName("Record 56: LastName is Huckfeldt")
	void LastNameOfRecord56() {
		assertEquals("Huckfeldt", customers.get(55).getLastName());
	}

	@Test
	@DisplayName("Record 56: Company is R S Graphics Inc")
	void CompanyOfRecord56() {
		assertEquals("R S Graphics Inc", customers.get(55).getCompany());
	}

	@Test
	@DisplayName("Record 56: Address is 435 Raritan Center Pky")
	void AddressOfRecord56() {
		assertEquals("435 Raritan Center Pky", customers.get(55).getAddress());
	}

	@Test
	@DisplayName("Record 56: City is Edison")
	void CityOfRecord56() {
		assertEquals("Edison", customers.get(55).getCity());
	}

	@Test
	@DisplayName("Record 56: County is Middlesex")
	void CountyOfRecord56() {
		assertEquals("Middlesex", customers.get(55).getCounty());
	}

	@Test
	@DisplayName("Record 56: State is NJ")
	void StateOfRecord56() {
		assertEquals("NJ", customers.get(55).getState());
	}

	@Test
	@DisplayName("Record 56: ZIP is 8837")
	void ZIPOfRecord56() {
		assertEquals("8837", customers.get(55).getZIP());
	}

	@Test
	@DisplayName("Record 56: Phone is 732-225-4045")
	void PhoneOfRecord56() {
		assertEquals("732-225-4045", customers.get(55).getPhone());
	}

	@Test
	@DisplayName("Record 56: Fax is 732-225-9829")
	void FaxOfRecord56() {
		assertEquals("732-225-9829", customers.get(55).getFax());
	}

	@Test
	@DisplayName("Record 56: Email is jody@huckfeldt.com")
	void EmailOfRecord56() {
		assertEquals("jody@huckfeldt.com", customers.get(55).getEmail());
	}

	@Test
	@DisplayName("Record 56: Web is http://www.jodyhuckfeldt.com")
	void WebOfRecord56() {
		assertEquals("http://www.jodyhuckfeldt.com", customers.get(55).getWeb());
	}
}
