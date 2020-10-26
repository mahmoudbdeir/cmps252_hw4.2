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

@Tag("15")
class Record_3235 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3235: FirstName is Frank")
	void FirstNameOfRecord3235() {
		assertEquals("Frank", customers.get(3234).getFirstName());
	}

	@Test
	@DisplayName("Record 3235: LastName is Calahan")
	void LastNameOfRecord3235() {
		assertEquals("Calahan", customers.get(3234).getLastName());
	}

	@Test
	@DisplayName("Record 3235: Company is Converter Parts Inc")
	void CompanyOfRecord3235() {
		assertEquals("Converter Parts Inc", customers.get(3234).getCompany());
	}

	@Test
	@DisplayName("Record 3235: Address is 899 Chalmers St")
	void AddressOfRecord3235() {
		assertEquals("899 Chalmers St", customers.get(3234).getAddress());
	}

	@Test
	@DisplayName("Record 3235: City is Detroit")
	void CityOfRecord3235() {
		assertEquals("Detroit", customers.get(3234).getCity());
	}

	@Test
	@DisplayName("Record 3235: County is Wayne")
	void CountyOfRecord3235() {
		assertEquals("Wayne", customers.get(3234).getCounty());
	}

	@Test
	@DisplayName("Record 3235: State is MI")
	void StateOfRecord3235() {
		assertEquals("MI", customers.get(3234).getState());
	}

	@Test
	@DisplayName("Record 3235: ZIP is 48215")
	void ZIPOfRecord3235() {
		assertEquals("48215", customers.get(3234).getZIP());
	}

	@Test
	@DisplayName("Record 3235: Phone is 313-331-6256")
	void PhoneOfRecord3235() {
		assertEquals("313-331-6256", customers.get(3234).getPhone());
	}

	@Test
	@DisplayName("Record 3235: Fax is 313-331-7993")
	void FaxOfRecord3235() {
		assertEquals("313-331-7993", customers.get(3234).getFax());
	}

	@Test
	@DisplayName("Record 3235: Email is frank@calahan.com")
	void EmailOfRecord3235() {
		assertEquals("frank@calahan.com", customers.get(3234).getEmail());
	}

	@Test
	@DisplayName("Record 3235: Web is http://www.frankcalahan.com")
	void WebOfRecord3235() {
		assertEquals("http://www.frankcalahan.com", customers.get(3234).getWeb());
	}
}
