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

@Tag("18")
class Record_2605 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2605: FirstName is Ismael")
	void FirstNameOfRecord2605() {
		assertEquals("Ismael", customers.get(2604).getFirstName());
	}

	@Test
	@DisplayName("Record 2605: LastName is Charm")
	void LastNameOfRecord2605() {
		assertEquals("Charm", customers.get(2604).getLastName());
	}

	@Test
	@DisplayName("Record 2605: Company is Cash Management Group")
	void CompanyOfRecord2605() {
		assertEquals("Cash Management Group", customers.get(2604).getCompany());
	}

	@Test
	@DisplayName("Record 2605: Address is 235 W 154th St")
	void AddressOfRecord2605() {
		assertEquals("235 W 154th St", customers.get(2604).getAddress());
	}

	@Test
	@DisplayName("Record 2605: City is New York")
	void CityOfRecord2605() {
		assertEquals("New York", customers.get(2604).getCity());
	}

	@Test
	@DisplayName("Record 2605: County is New York")
	void CountyOfRecord2605() {
		assertEquals("New York", customers.get(2604).getCounty());
	}

	@Test
	@DisplayName("Record 2605: State is NY")
	void StateOfRecord2605() {
		assertEquals("NY", customers.get(2604).getState());
	}

	@Test
	@DisplayName("Record 2605: ZIP is 10039")
	void ZIPOfRecord2605() {
		assertEquals("10039", customers.get(2604).getZIP());
	}

	@Test
	@DisplayName("Record 2605: Phone is 212-491-5159")
	void PhoneOfRecord2605() {
		assertEquals("212-491-5159", customers.get(2604).getPhone());
	}

	@Test
	@DisplayName("Record 2605: Fax is 212-491-9473")
	void FaxOfRecord2605() {
		assertEquals("212-491-9473", customers.get(2604).getFax());
	}

	@Test
	@DisplayName("Record 2605: Email is ismael@charm.com")
	void EmailOfRecord2605() {
		assertEquals("ismael@charm.com", customers.get(2604).getEmail());
	}

	@Test
	@DisplayName("Record 2605: Web is http://www.ismaelcharm.com")
	void WebOfRecord2605() {
		assertEquals("http://www.ismaelcharm.com", customers.get(2604).getWeb());
	}
}
