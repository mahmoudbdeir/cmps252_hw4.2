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

@Tag("2")
class Record_23 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 23: FirstName is Marilyn")
	void FirstNameOfRecord23() {
		assertEquals("Marilyn", customers.get(22).getFirstName());
	}

	@Test
	@DisplayName("Record 23: LastName is Klyne")
	void LastNameOfRecord23() {
		assertEquals("Klyne", customers.get(22).getLastName());
	}

	@Test
	@DisplayName("Record 23: Company is Alitalia Airlines")
	void CompanyOfRecord23() {
		assertEquals("Alitalia Airlines", customers.get(22).getCompany());
	}

	@Test
	@DisplayName("Record 23: Address is 1244 S 13th St")
	void AddressOfRecord23() {
		assertEquals("1244 S 13th St", customers.get(22).getAddress());
	}

	@Test
	@DisplayName("Record 23: City is Omaha")
	void CityOfRecord23() {
		assertEquals("Omaha", customers.get(22).getCity());
	}

	@Test
	@DisplayName("Record 23: County is Douglas")
	void CountyOfRecord23() {
		assertEquals("Douglas", customers.get(22).getCounty());
	}

	@Test
	@DisplayName("Record 23: State is NE")
	void StateOfRecord23() {
		assertEquals("NE", customers.get(22).getState());
	}

	@Test
	@DisplayName("Record 23: ZIP is 68108")
	void ZIPOfRecord23() {
		assertEquals("68108", customers.get(22).getZIP());
	}

	@Test
	@DisplayName("Record 23: Phone is 402-341-8233")
	void PhoneOfRecord23() {
		assertEquals("402-341-8233", customers.get(22).getPhone());
	}

	@Test
	@DisplayName("Record 23: Fax is 402-341-3687")
	void FaxOfRecord23() {
		assertEquals("402-341-3687", customers.get(22).getFax());
	}

	@Test
	@DisplayName("Record 23: Email is marilyn@klyne.com")
	void EmailOfRecord23() {
		assertEquals("marilyn@klyne.com", customers.get(22).getEmail());
	}

	@Test
	@DisplayName("Record 23: Web is http://www.marilynklyne.com")
	void WebOfRecord23() {
		assertEquals("http://www.marilynklyne.com", customers.get(22).getWeb());
	}
}
