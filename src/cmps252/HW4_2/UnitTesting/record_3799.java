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

@Tag("4")
class Record_3799 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3799: FirstName is Dorthy")
	void FirstNameOfRecord3799() {
		assertEquals("Dorthy", customers.get(3798).getFirstName());
	}

	@Test
	@DisplayName("Record 3799: LastName is Cappucci")
	void LastNameOfRecord3799() {
		assertEquals("Cappucci", customers.get(3798).getLastName());
	}

	@Test
	@DisplayName("Record 3799: Company is Industrial Gasket Inc")
	void CompanyOfRecord3799() {
		assertEquals("Industrial Gasket Inc", customers.get(3798).getCompany());
	}

	@Test
	@DisplayName("Record 3799: Address is 2900 Nw 35th St")
	void AddressOfRecord3799() {
		assertEquals("2900 Nw 35th St", customers.get(3798).getAddress());
	}

	@Test
	@DisplayName("Record 3799: City is Miami")
	void CityOfRecord3799() {
		assertEquals("Miami", customers.get(3798).getCity());
	}

	@Test
	@DisplayName("Record 3799: County is Miami-Dade")
	void CountyOfRecord3799() {
		assertEquals("Miami-Dade", customers.get(3798).getCounty());
	}

	@Test
	@DisplayName("Record 3799: State is FL")
	void StateOfRecord3799() {
		assertEquals("FL", customers.get(3798).getState());
	}

	@Test
	@DisplayName("Record 3799: ZIP is 33142")
	void ZIPOfRecord3799() {
		assertEquals("33142", customers.get(3798).getZIP());
	}

	@Test
	@DisplayName("Record 3799: Phone is 305-634-7091")
	void PhoneOfRecord3799() {
		assertEquals("305-634-7091", customers.get(3798).getPhone());
	}

	@Test
	@DisplayName("Record 3799: Fax is 305-634-2864")
	void FaxOfRecord3799() {
		assertEquals("305-634-2864", customers.get(3798).getFax());
	}

	@Test
	@DisplayName("Record 3799: Email is dorthy@cappucci.com")
	void EmailOfRecord3799() {
		assertEquals("dorthy@cappucci.com", customers.get(3798).getEmail());
	}

	@Test
	@DisplayName("Record 3799: Web is http://www.dorthycappucci.com")
	void WebOfRecord3799() {
		assertEquals("http://www.dorthycappucci.com", customers.get(3798).getWeb());
	}
}
