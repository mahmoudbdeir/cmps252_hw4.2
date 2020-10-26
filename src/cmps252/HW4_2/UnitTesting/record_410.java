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

@Tag("9")
class Record_410 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 410: FirstName is Valentin")
	void FirstNameOfRecord410() {
		assertEquals("Valentin", customers.get(409).getFirstName());
	}

	@Test
	@DisplayName("Record 410: LastName is Hakel")
	void LastNameOfRecord410() {
		assertEquals("Hakel", customers.get(409).getLastName());
	}

	@Test
	@DisplayName("Record 410: Company is Lyf Ball Plumbing & Ind")
	void CompanyOfRecord410() {
		assertEquals("Lyf Ball Plumbing & Ind", customers.get(409).getCompany());
	}

	@Test
	@DisplayName("Record 410: Address is 4916 H Aven")
	void AddressOfRecord410() {
		assertEquals("4916 H Aven", customers.get(409).getAddress());
	}

	@Test
	@DisplayName("Record 410: City is Rosenberg")
	void CityOfRecord410() {
		assertEquals("Rosenberg", customers.get(409).getCity());
	}

	@Test
	@DisplayName("Record 410: County is Fort Bend")
	void CountyOfRecord410() {
		assertEquals("Fort Bend", customers.get(409).getCounty());
	}

	@Test
	@DisplayName("Record 410: State is TX")
	void StateOfRecord410() {
		assertEquals("TX", customers.get(409).getState());
	}

	@Test
	@DisplayName("Record 410: ZIP is 77471")
	void ZIPOfRecord410() {
		assertEquals("77471", customers.get(409).getZIP());
	}

	@Test
	@DisplayName("Record 410: Phone is 281-341-6479")
	void PhoneOfRecord410() {
		assertEquals("281-341-6479", customers.get(409).getPhone());
	}

	@Test
	@DisplayName("Record 410: Fax is 281-341-8527")
	void FaxOfRecord410() {
		assertEquals("281-341-8527", customers.get(409).getFax());
	}

	@Test
	@DisplayName("Record 410: Email is valentin@hakel.com")
	void EmailOfRecord410() {
		assertEquals("valentin@hakel.com", customers.get(409).getEmail());
	}

	@Test
	@DisplayName("Record 410: Web is http://www.valentinhakel.com")
	void WebOfRecord410() {
		assertEquals("http://www.valentinhakel.com", customers.get(409).getWeb());
	}
}
