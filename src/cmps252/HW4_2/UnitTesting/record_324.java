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

@Tag("13")
class Record_324 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 324: FirstName is Lindsay")
	void FirstNameOfRecord324() {
		assertEquals("Lindsay", customers.get(323).getFirstName());
	}

	@Test
	@DisplayName("Record 324: LastName is Piek")
	void LastNameOfRecord324() {
		assertEquals("Piek", customers.get(323).getLastName());
	}

	@Test
	@DisplayName("Record 324: Company is Duffy Real Estate Inc")
	void CompanyOfRecord324() {
		assertEquals("Duffy Real Estate Inc", customers.get(323).getCompany());
	}

	@Test
	@DisplayName("Record 324: Address is 9515 Rush St")
	void AddressOfRecord324() {
		assertEquals("9515 Rush St", customers.get(323).getAddress());
	}

	@Test
	@DisplayName("Record 324: City is South El Monte")
	void CityOfRecord324() {
		assertEquals("South El Monte", customers.get(323).getCity());
	}

	@Test
	@DisplayName("Record 324: County is Los Angeles")
	void CountyOfRecord324() {
		assertEquals("Los Angeles", customers.get(323).getCounty());
	}

	@Test
	@DisplayName("Record 324: State is CA")
	void StateOfRecord324() {
		assertEquals("CA", customers.get(323).getState());
	}

	@Test
	@DisplayName("Record 324: ZIP is 91733")
	void ZIPOfRecord324() {
		assertEquals("91733", customers.get(323).getZIP());
	}

	@Test
	@DisplayName("Record 324: Phone is 626-443-0199")
	void PhoneOfRecord324() {
		assertEquals("626-443-0199", customers.get(323).getPhone());
	}

	@Test
	@DisplayName("Record 324: Fax is 626-443-5612")
	void FaxOfRecord324() {
		assertEquals("626-443-5612", customers.get(323).getFax());
	}

	@Test
	@DisplayName("Record 324: Email is lindsay@piek.com")
	void EmailOfRecord324() {
		assertEquals("lindsay@piek.com", customers.get(323).getEmail());
	}

	@Test
	@DisplayName("Record 324: Web is http://www.lindsaypiek.com")
	void WebOfRecord324() {
		assertEquals("http://www.lindsaypiek.com", customers.get(323).getWeb());
	}
}
