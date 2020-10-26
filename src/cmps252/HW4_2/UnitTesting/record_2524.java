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

@Tag("13")
class Record_2524 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2524: FirstName is Peter")
	void FirstNameOfRecord2524() {
		assertEquals("Peter", customers.get(2523).getFirstName());
	}

	@Test
	@DisplayName("Record 2524: LastName is Selts")
	void LastNameOfRecord2524() {
		assertEquals("Selts", customers.get(2523).getLastName());
	}

	@Test
	@DisplayName("Record 2524: Company is Grindstone Farm")
	void CompanyOfRecord2524() {
		assertEquals("Grindstone Farm", customers.get(2523).getCompany());
	}

	@Test
	@DisplayName("Record 2524: Address is 30790 W 8mile Rd")
	void AddressOfRecord2524() {
		assertEquals("30790 W 8mile Rd", customers.get(2523).getAddress());
	}

	@Test
	@DisplayName("Record 2524: City is Farmington")
	void CityOfRecord2524() {
		assertEquals("Farmington", customers.get(2523).getCity());
	}

	@Test
	@DisplayName("Record 2524: County is Oakland")
	void CountyOfRecord2524() {
		assertEquals("Oakland", customers.get(2523).getCounty());
	}

	@Test
	@DisplayName("Record 2524: State is MI")
	void StateOfRecord2524() {
		assertEquals("MI", customers.get(2523).getState());
	}

	@Test
	@DisplayName("Record 2524: ZIP is 48336")
	void ZIPOfRecord2524() {
		assertEquals("48336", customers.get(2523).getZIP());
	}

	@Test
	@DisplayName("Record 2524: Phone is 248-474-5576")
	void PhoneOfRecord2524() {
		assertEquals("248-474-5576", customers.get(2523).getPhone());
	}

	@Test
	@DisplayName("Record 2524: Fax is 248-474-2765")
	void FaxOfRecord2524() {
		assertEquals("248-474-2765", customers.get(2523).getFax());
	}

	@Test
	@DisplayName("Record 2524: Email is peter@selts.com")
	void EmailOfRecord2524() {
		assertEquals("peter@selts.com", customers.get(2523).getEmail());
	}

	@Test
	@DisplayName("Record 2524: Web is http://www.peterselts.com")
	void WebOfRecord2524() {
		assertEquals("http://www.peterselts.com", customers.get(2523).getWeb());
	}
}
