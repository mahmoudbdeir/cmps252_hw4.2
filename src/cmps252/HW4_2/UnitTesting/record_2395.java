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

@Tag("14")
class Record_2395 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2395: FirstName is Kimberly")
	void FirstNameOfRecord2395() {
		assertEquals("Kimberly", customers.get(2394).getFirstName());
	}

	@Test
	@DisplayName("Record 2395: LastName is Wysenberger")
	void LastNameOfRecord2395() {
		assertEquals("Wysenberger", customers.get(2394).getLastName());
	}

	@Test
	@DisplayName("Record 2395: Company is Second Natl Bank")
	void CompanyOfRecord2395() {
		assertEquals("Second Natl Bank", customers.get(2394).getCompany());
	}

	@Test
	@DisplayName("Record 2395: Address is 1650 Ocean Ave")
	void AddressOfRecord2395() {
		assertEquals("1650 Ocean Ave", customers.get(2394).getAddress());
	}

	@Test
	@DisplayName("Record 2395: City is Brooklyn")
	void CityOfRecord2395() {
		assertEquals("Brooklyn", customers.get(2394).getCity());
	}

	@Test
	@DisplayName("Record 2395: County is Kings")
	void CountyOfRecord2395() {
		assertEquals("Kings", customers.get(2394).getCounty());
	}

	@Test
	@DisplayName("Record 2395: State is NY")
	void StateOfRecord2395() {
		assertEquals("NY", customers.get(2394).getState());
	}

	@Test
	@DisplayName("Record 2395: ZIP is 11230")
	void ZIPOfRecord2395() {
		assertEquals("11230", customers.get(2394).getZIP());
	}

	@Test
	@DisplayName("Record 2395: Phone is 718-692-6972")
	void PhoneOfRecord2395() {
		assertEquals("718-692-6972", customers.get(2394).getPhone());
	}

	@Test
	@DisplayName("Record 2395: Fax is 718-692-8658")
	void FaxOfRecord2395() {
		assertEquals("718-692-8658", customers.get(2394).getFax());
	}

	@Test
	@DisplayName("Record 2395: Email is kimberly@wysenberger.com")
	void EmailOfRecord2395() {
		assertEquals("kimberly@wysenberger.com", customers.get(2394).getEmail());
	}

	@Test
	@DisplayName("Record 2395: Web is http://www.kimberlywysenberger.com")
	void WebOfRecord2395() {
		assertEquals("http://www.kimberlywysenberger.com", customers.get(2394).getWeb());
	}
}
