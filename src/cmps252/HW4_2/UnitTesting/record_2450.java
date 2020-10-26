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
class Record_2450 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2450: FirstName is Tommie")
	void FirstNameOfRecord2450() {
		assertEquals("Tommie", customers.get(2449).getFirstName());
	}

	@Test
	@DisplayName("Record 2450: LastName is Gauger")
	void LastNameOfRecord2450() {
		assertEquals("Gauger", customers.get(2449).getLastName());
	}

	@Test
	@DisplayName("Record 2450: Company is Tubed Products Inc")
	void CompanyOfRecord2450() {
		assertEquals("Tubed Products Inc", customers.get(2449).getCompany());
	}

	@Test
	@DisplayName("Record 2450: Address is 801 West Ave")
	void AddressOfRecord2450() {
		assertEquals("801 West Ave", customers.get(2449).getAddress());
	}

	@Test
	@DisplayName("Record 2450: City is Cartersville")
	void CityOfRecord2450() {
		assertEquals("Cartersville", customers.get(2449).getCity());
	}

	@Test
	@DisplayName("Record 2450: County is Bartow")
	void CountyOfRecord2450() {
		assertEquals("Bartow", customers.get(2449).getCounty());
	}

	@Test
	@DisplayName("Record 2450: State is GA")
	void StateOfRecord2450() {
		assertEquals("GA", customers.get(2449).getState());
	}

	@Test
	@DisplayName("Record 2450: ZIP is 30120")
	void ZIPOfRecord2450() {
		assertEquals("30120", customers.get(2449).getZIP());
	}

	@Test
	@DisplayName("Record 2450: Phone is 770-382-3613")
	void PhoneOfRecord2450() {
		assertEquals("770-382-3613", customers.get(2449).getPhone());
	}

	@Test
	@DisplayName("Record 2450: Fax is 770-382-0907")
	void FaxOfRecord2450() {
		assertEquals("770-382-0907", customers.get(2449).getFax());
	}

	@Test
	@DisplayName("Record 2450: Email is tommie@gauger.com")
	void EmailOfRecord2450() {
		assertEquals("tommie@gauger.com", customers.get(2449).getEmail());
	}

	@Test
	@DisplayName("Record 2450: Web is http://www.tommiegauger.com")
	void WebOfRecord2450() {
		assertEquals("http://www.tommiegauger.com", customers.get(2449).getWeb());
	}
}
