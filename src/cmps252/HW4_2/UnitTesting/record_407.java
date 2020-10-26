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

@Tag("10")
class Record_407 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 407: FirstName is Christa")
	void FirstNameOfRecord407() {
		assertEquals("Christa", customers.get(406).getFirstName());
	}

	@Test
	@DisplayName("Record 407: LastName is Carwile")
	void LastNameOfRecord407() {
		assertEquals("Carwile", customers.get(406).getLastName());
	}

	@Test
	@DisplayName("Record 407: Company is Chadwell, James D Esq")
	void CompanyOfRecord407() {
		assertEquals("Chadwell, James D Esq", customers.get(406).getCompany());
	}

	@Test
	@DisplayName("Record 407: Address is 1358 Ortonville Rd")
	void AddressOfRecord407() {
		assertEquals("1358 Ortonville Rd", customers.get(406).getAddress());
	}

	@Test
	@DisplayName("Record 407: City is Ortonville")
	void CityOfRecord407() {
		assertEquals("Ortonville", customers.get(406).getCity());
	}

	@Test
	@DisplayName("Record 407: County is Oakland")
	void CountyOfRecord407() {
		assertEquals("Oakland", customers.get(406).getCounty());
	}

	@Test
	@DisplayName("Record 407: State is MI")
	void StateOfRecord407() {
		assertEquals("MI", customers.get(406).getState());
	}

	@Test
	@DisplayName("Record 407: ZIP is 48462")
	void ZIPOfRecord407() {
		assertEquals("48462", customers.get(406).getZIP());
	}

	@Test
	@DisplayName("Record 407: Phone is 248-627-8836")
	void PhoneOfRecord407() {
		assertEquals("248-627-8836", customers.get(406).getPhone());
	}

	@Test
	@DisplayName("Record 407: Fax is 248-627-8239")
	void FaxOfRecord407() {
		assertEquals("248-627-8239", customers.get(406).getFax());
	}

	@Test
	@DisplayName("Record 407: Email is christa@carwile.com")
	void EmailOfRecord407() {
		assertEquals("christa@carwile.com", customers.get(406).getEmail());
	}

	@Test
	@DisplayName("Record 407: Web is http://www.christacarwile.com")
	void WebOfRecord407() {
		assertEquals("http://www.christacarwile.com", customers.get(406).getWeb());
	}
}
