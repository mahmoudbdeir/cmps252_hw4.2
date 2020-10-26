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

@Tag("26")
class Record_2128 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2128: FirstName is Donnie")
	void FirstNameOfRecord2128() {
		assertEquals("Donnie", customers.get(2127).getFirstName());
	}

	@Test
	@DisplayName("Record 2128: LastName is Devarona")
	void LastNameOfRecord2128() {
		assertEquals("Devarona", customers.get(2127).getLastName());
	}

	@Test
	@DisplayName("Record 2128: Company is Rockys Bail Bonds")
	void CompanyOfRecord2128() {
		assertEquals("Rockys Bail Bonds", customers.get(2127).getCompany());
	}

	@Test
	@DisplayName("Record 2128: Address is 192 Us Highway 22")
	void AddressOfRecord2128() {
		assertEquals("192 Us Highway 22", customers.get(2127).getAddress());
	}

	@Test
	@DisplayName("Record 2128: City is Dunellen")
	void CityOfRecord2128() {
		assertEquals("Dunellen", customers.get(2127).getCity());
	}

	@Test
	@DisplayName("Record 2128: County is Middlesex")
	void CountyOfRecord2128() {
		assertEquals("Middlesex", customers.get(2127).getCounty());
	}

	@Test
	@DisplayName("Record 2128: State is NJ")
	void StateOfRecord2128() {
		assertEquals("NJ", customers.get(2127).getState());
	}

	@Test
	@DisplayName("Record 2128: ZIP is 8812")
	void ZIPOfRecord2128() {
		assertEquals("8812", customers.get(2127).getZIP());
	}

	@Test
	@DisplayName("Record 2128: Phone is 732-752-3381")
	void PhoneOfRecord2128() {
		assertEquals("732-752-3381", customers.get(2127).getPhone());
	}

	@Test
	@DisplayName("Record 2128: Fax is 732-752-3217")
	void FaxOfRecord2128() {
		assertEquals("732-752-3217", customers.get(2127).getFax());
	}

	@Test
	@DisplayName("Record 2128: Email is donnie@devarona.com")
	void EmailOfRecord2128() {
		assertEquals("donnie@devarona.com", customers.get(2127).getEmail());
	}

	@Test
	@DisplayName("Record 2128: Web is http://www.donniedevarona.com")
	void WebOfRecord2128() {
		assertEquals("http://www.donniedevarona.com", customers.get(2127).getWeb());
	}
}
