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
class Record_1960 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1960: FirstName is Melissa")
	void FirstNameOfRecord1960() {
		assertEquals("Melissa", customers.get(1959).getFirstName());
	}

	@Test
	@DisplayName("Record 1960: LastName is Myste")
	void LastNameOfRecord1960() {
		assertEquals("Myste", customers.get(1959).getLastName());
	}

	@Test
	@DisplayName("Record 1960: Company is Carry On Seafoods")
	void CompanyOfRecord1960() {
		assertEquals("Carry On Seafoods", customers.get(1959).getCompany());
	}

	@Test
	@DisplayName("Record 1960: Address is 204 38th St")
	void AddressOfRecord1960() {
		assertEquals("204 38th St", customers.get(1959).getAddress());
	}

	@Test
	@DisplayName("Record 1960: City is Moline")
	void CityOfRecord1960() {
		assertEquals("Moline", customers.get(1959).getCity());
	}

	@Test
	@DisplayName("Record 1960: County is Rock Island")
	void CountyOfRecord1960() {
		assertEquals("Rock Island", customers.get(1959).getCounty());
	}

	@Test
	@DisplayName("Record 1960: State is IL")
	void StateOfRecord1960() {
		assertEquals("IL", customers.get(1959).getState());
	}

	@Test
	@DisplayName("Record 1960: ZIP is 61265")
	void ZIPOfRecord1960() {
		assertEquals("61265", customers.get(1959).getZIP());
	}

	@Test
	@DisplayName("Record 1960: Phone is 309-762-3542")
	void PhoneOfRecord1960() {
		assertEquals("309-762-3542", customers.get(1959).getPhone());
	}

	@Test
	@DisplayName("Record 1960: Fax is 309-762-7959")
	void FaxOfRecord1960() {
		assertEquals("309-762-7959", customers.get(1959).getFax());
	}

	@Test
	@DisplayName("Record 1960: Email is melissa@myste.com")
	void EmailOfRecord1960() {
		assertEquals("melissa@myste.com", customers.get(1959).getEmail());
	}

	@Test
	@DisplayName("Record 1960: Web is http://www.melissamyste.com")
	void WebOfRecord1960() {
		assertEquals("http://www.melissamyste.com", customers.get(1959).getWeb());
	}
}
