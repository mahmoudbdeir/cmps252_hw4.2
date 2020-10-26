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

@Tag("23")
class Record_4478 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4478: FirstName is Marlin")
	void FirstNameOfRecord4478() {
		assertEquals("Marlin", customers.get(4477).getFirstName());
	}

	@Test
	@DisplayName("Record 4478: LastName is Manto")
	void LastNameOfRecord4478() {
		assertEquals("Manto", customers.get(4477).getLastName());
	}

	@Test
	@DisplayName("Record 4478: Company is Kolb & Heban")
	void CompanyOfRecord4478() {
		assertEquals("Kolb & Heban", customers.get(4477).getCompany());
	}

	@Test
	@DisplayName("Record 4478: Address is 2305 Coit Rd")
	void AddressOfRecord4478() {
		assertEquals("2305 Coit Rd", customers.get(4477).getAddress());
	}

	@Test
	@DisplayName("Record 4478: City is Plano")
	void CityOfRecord4478() {
		assertEquals("Plano", customers.get(4477).getCity());
	}

	@Test
	@DisplayName("Record 4478: County is Collin")
	void CountyOfRecord4478() {
		assertEquals("Collin", customers.get(4477).getCounty());
	}

	@Test
	@DisplayName("Record 4478: State is TX")
	void StateOfRecord4478() {
		assertEquals("TX", customers.get(4477).getState());
	}

	@Test
	@DisplayName("Record 4478: ZIP is 75075")
	void ZIPOfRecord4478() {
		assertEquals("75075", customers.get(4477).getZIP());
	}

	@Test
	@DisplayName("Record 4478: Phone is 972-964-9939")
	void PhoneOfRecord4478() {
		assertEquals("972-964-9939", customers.get(4477).getPhone());
	}

	@Test
	@DisplayName("Record 4478: Fax is 972-964-3235")
	void FaxOfRecord4478() {
		assertEquals("972-964-3235", customers.get(4477).getFax());
	}

	@Test
	@DisplayName("Record 4478: Email is marlin@manto.com")
	void EmailOfRecord4478() {
		assertEquals("marlin@manto.com", customers.get(4477).getEmail());
	}

	@Test
	@DisplayName("Record 4478: Web is http://www.marlinmanto.com")
	void WebOfRecord4478() {
		assertEquals("http://www.marlinmanto.com", customers.get(4477).getWeb());
	}
}
