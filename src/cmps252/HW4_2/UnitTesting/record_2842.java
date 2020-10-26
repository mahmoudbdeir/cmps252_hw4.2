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
class Record_2842 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2842: FirstName is Napoleon")
	void FirstNameOfRecord2842() {
		assertEquals("Napoleon", customers.get(2841).getFirstName());
	}

	@Test
	@DisplayName("Record 2842: LastName is Laesser")
	void LastNameOfRecord2842() {
		assertEquals("Laesser", customers.get(2841).getLastName());
	}

	@Test
	@DisplayName("Record 2842: Company is Lucky Travel Service")
	void CompanyOfRecord2842() {
		assertEquals("Lucky Travel Service", customers.get(2841).getCompany());
	}

	@Test
	@DisplayName("Record 2842: Address is 2744 Atlantic Ave")
	void AddressOfRecord2842() {
		assertEquals("2744 Atlantic Ave", customers.get(2841).getAddress());
	}

	@Test
	@DisplayName("Record 2842: City is Brooklyn")
	void CityOfRecord2842() {
		assertEquals("Brooklyn", customers.get(2841).getCity());
	}

	@Test
	@DisplayName("Record 2842: County is Kings")
	void CountyOfRecord2842() {
		assertEquals("Kings", customers.get(2841).getCounty());
	}

	@Test
	@DisplayName("Record 2842: State is NY")
	void StateOfRecord2842() {
		assertEquals("NY", customers.get(2841).getState());
	}

	@Test
	@DisplayName("Record 2842: ZIP is 11207")
	void ZIPOfRecord2842() {
		assertEquals("11207", customers.get(2841).getZIP());
	}

	@Test
	@DisplayName("Record 2842: Phone is 718-647-7698")
	void PhoneOfRecord2842() {
		assertEquals("718-647-7698", customers.get(2841).getPhone());
	}

	@Test
	@DisplayName("Record 2842: Fax is 718-647-4022")
	void FaxOfRecord2842() {
		assertEquals("718-647-4022", customers.get(2841).getFax());
	}

	@Test
	@DisplayName("Record 2842: Email is napoleon@laesser.com")
	void EmailOfRecord2842() {
		assertEquals("napoleon@laesser.com", customers.get(2841).getEmail());
	}

	@Test
	@DisplayName("Record 2842: Web is http://www.napoleonlaesser.com")
	void WebOfRecord2842() {
		assertEquals("http://www.napoleonlaesser.com", customers.get(2841).getWeb());
	}
}
