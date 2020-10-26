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

@Tag("46")
class Record_342 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 342: FirstName is Fred")
	void FirstNameOfRecord342() {
		assertEquals("Fred", customers.get(341).getFirstName());
	}

	@Test
	@DisplayName("Record 342: LastName is Siddens")
	void LastNameOfRecord342() {
		assertEquals("Siddens", customers.get(341).getLastName());
	}

	@Test
	@DisplayName("Record 342: Company is Madco Welding Supply")
	void CompanyOfRecord342() {
		assertEquals("Madco Welding Supply", customers.get(341).getCompany());
	}

	@Test
	@DisplayName("Record 342: Address is 108 S Main St")
	void AddressOfRecord342() {
		assertEquals("108 S Main St", customers.get(341).getAddress());
	}

	@Test
	@DisplayName("Record 342: City is Bryan")
	void CityOfRecord342() {
		assertEquals("Bryan", customers.get(341).getCity());
	}

	@Test
	@DisplayName("Record 342: County is Brazos")
	void CountyOfRecord342() {
		assertEquals("Brazos", customers.get(341).getCounty());
	}

	@Test
	@DisplayName("Record 342: State is TX")
	void StateOfRecord342() {
		assertEquals("TX", customers.get(341).getState());
	}

	@Test
	@DisplayName("Record 342: ZIP is 77803")
	void ZIPOfRecord342() {
		assertEquals("77803", customers.get(341).getZIP());
	}

	@Test
	@DisplayName("Record 342: Phone is 979-823-3650")
	void PhoneOfRecord342() {
		assertEquals("979-823-3650", customers.get(341).getPhone());
	}

	@Test
	@DisplayName("Record 342: Fax is 979-823-9744")
	void FaxOfRecord342() {
		assertEquals("979-823-9744", customers.get(341).getFax());
	}

	@Test
	@DisplayName("Record 342: Email is fred@siddens.com")
	void EmailOfRecord342() {
		assertEquals("fred@siddens.com", customers.get(341).getEmail());
	}

	@Test
	@DisplayName("Record 342: Web is http://www.fredsiddens.com")
	void WebOfRecord342() {
		assertEquals("http://www.fredsiddens.com", customers.get(341).getWeb());
	}
}
