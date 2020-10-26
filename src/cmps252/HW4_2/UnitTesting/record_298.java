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

@Tag("7")
class Record_298 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 298: FirstName is Carissa")
	void FirstNameOfRecord298() {
		assertEquals("Carissa", customers.get(297).getFirstName());
	}

	@Test
	@DisplayName("Record 298: LastName is Mumbower")
	void LastNameOfRecord298() {
		assertEquals("Mumbower", customers.get(297).getLastName());
	}

	@Test
	@DisplayName("Record 298: Company is Wmaj Am")
	void CompanyOfRecord298() {
		assertEquals("Wmaj Am", customers.get(297).getCompany());
	}

	@Test
	@DisplayName("Record 298: Address is 3341 Towerwood Dr  #-201")
	void AddressOfRecord298() {
		assertEquals("3341 Towerwood Dr  #-201", customers.get(297).getAddress());
	}

	@Test
	@DisplayName("Record 298: City is Dallas")
	void CityOfRecord298() {
		assertEquals("Dallas", customers.get(297).getCity());
	}

	@Test
	@DisplayName("Record 298: County is Dallas")
	void CountyOfRecord298() {
		assertEquals("Dallas", customers.get(297).getCounty());
	}

	@Test
	@DisplayName("Record 298: State is TX")
	void StateOfRecord298() {
		assertEquals("TX", customers.get(297).getState());
	}

	@Test
	@DisplayName("Record 298: ZIP is 75234")
	void ZIPOfRecord298() {
		assertEquals("75234", customers.get(297).getZIP());
	}

	@Test
	@DisplayName("Record 298: Phone is 972-484-6839")
	void PhoneOfRecord298() {
		assertEquals("972-484-6839", customers.get(297).getPhone());
	}

	@Test
	@DisplayName("Record 298: Fax is 972-484-9983")
	void FaxOfRecord298() {
		assertEquals("972-484-9983", customers.get(297).getFax());
	}

	@Test
	@DisplayName("Record 298: Email is carissa@mumbower.com")
	void EmailOfRecord298() {
		assertEquals("carissa@mumbower.com", customers.get(297).getEmail());
	}

	@Test
	@DisplayName("Record 298: Web is http://www.carissamumbower.com")
	void WebOfRecord298() {
		assertEquals("http://www.carissamumbower.com", customers.get(297).getWeb());
	}
}
