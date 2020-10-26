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

@Tag("30")
class Record_1423 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1423: FirstName is Barb")
	void FirstNameOfRecord1423() {
		assertEquals("Barb", customers.get(1422).getFirstName());
	}

	@Test
	@DisplayName("Record 1423: LastName is Poplaski")
	void LastNameOfRecord1423() {
		assertEquals("Poplaski", customers.get(1422).getLastName());
	}

	@Test
	@DisplayName("Record 1423: Company is Abc Printing Co")
	void CompanyOfRecord1423() {
		assertEquals("Abc Printing Co", customers.get(1422).getCompany());
	}

	@Test
	@DisplayName("Record 1423: Address is Shell Rd")
	void AddressOfRecord1423() {
		assertEquals("Shell Rd", customers.get(1422).getAddress());
	}

	@Test
	@DisplayName("Record 1423: City is Penns Grove")
	void CityOfRecord1423() {
		assertEquals("Penns Grove", customers.get(1422).getCity());
	}

	@Test
	@DisplayName("Record 1423: County is Salem")
	void CountyOfRecord1423() {
		assertEquals("Salem", customers.get(1422).getCounty());
	}

	@Test
	@DisplayName("Record 1423: State is NJ")
	void StateOfRecord1423() {
		assertEquals("NJ", customers.get(1422).getState());
	}

	@Test
	@DisplayName("Record 1423: ZIP is 8069")
	void ZIPOfRecord1423() {
		assertEquals("8069", customers.get(1422).getZIP());
	}

	@Test
	@DisplayName("Record 1423: Phone is 856-299-6456")
	void PhoneOfRecord1423() {
		assertEquals("856-299-6456", customers.get(1422).getPhone());
	}

	@Test
	@DisplayName("Record 1423: Fax is 856-299-4206")
	void FaxOfRecord1423() {
		assertEquals("856-299-4206", customers.get(1422).getFax());
	}

	@Test
	@DisplayName("Record 1423: Email is barb@poplaski.com")
	void EmailOfRecord1423() {
		assertEquals("barb@poplaski.com", customers.get(1422).getEmail());
	}

	@Test
	@DisplayName("Record 1423: Web is http://www.barbpoplaski.com")
	void WebOfRecord1423() {
		assertEquals("http://www.barbpoplaski.com", customers.get(1422).getWeb());
	}
}
