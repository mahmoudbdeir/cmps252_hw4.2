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

@Tag("3")
class Record_2894 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2894: FirstName is David")
	void FirstNameOfRecord2894() {
		assertEquals("David", customers.get(2893).getFirstName());
	}

	@Test
	@DisplayName("Record 2894: LastName is Asbridge")
	void LastNameOfRecord2894() {
		assertEquals("Asbridge", customers.get(2893).getLastName());
	}

	@Test
	@DisplayName("Record 2894: Company is Borel & Dunner Inc")
	void CompanyOfRecord2894() {
		assertEquals("Borel & Dunner Inc", customers.get(2893).getCompany());
	}

	@Test
	@DisplayName("Record 2894: Address is 2003 E 5th St  #-1")
	void AddressOfRecord2894() {
		assertEquals("2003 E 5th St  #-1", customers.get(2893).getAddress());
	}

	@Test
	@DisplayName("Record 2894: City is Tempe")
	void CityOfRecord2894() {
		assertEquals("Tempe", customers.get(2893).getCity());
	}

	@Test
	@DisplayName("Record 2894: County is Maricopa")
	void CountyOfRecord2894() {
		assertEquals("Maricopa", customers.get(2893).getCounty());
	}

	@Test
	@DisplayName("Record 2894: State is AZ")
	void StateOfRecord2894() {
		assertEquals("AZ", customers.get(2893).getState());
	}

	@Test
	@DisplayName("Record 2894: ZIP is 85281")
	void ZIPOfRecord2894() {
		assertEquals("85281", customers.get(2893).getZIP());
	}

	@Test
	@DisplayName("Record 2894: Phone is 480-966-1707")
	void PhoneOfRecord2894() {
		assertEquals("480-966-1707", customers.get(2893).getPhone());
	}

	@Test
	@DisplayName("Record 2894: Fax is 480-966-5742")
	void FaxOfRecord2894() {
		assertEquals("480-966-5742", customers.get(2893).getFax());
	}

	@Test
	@DisplayName("Record 2894: Email is david@asbridge.com")
	void EmailOfRecord2894() {
		assertEquals("david@asbridge.com", customers.get(2893).getEmail());
	}

	@Test
	@DisplayName("Record 2894: Web is http://www.davidasbridge.com")
	void WebOfRecord2894() {
		assertEquals("http://www.davidasbridge.com", customers.get(2893).getWeb());
	}
}
