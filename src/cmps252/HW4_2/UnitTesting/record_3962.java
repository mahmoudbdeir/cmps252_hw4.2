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
class Record_3962 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3962: FirstName is Lyf")
	void FirstNameOfRecord3962() {
		assertEquals("Lyf", customers.get(3961).getFirstName());
	}

	@Test
	@DisplayName("Record 3962: LastName is Ciucci")
	void LastNameOfRecord3962() {
		assertEquals("Ciucci", customers.get(3961).getLastName());
	}

	@Test
	@DisplayName("Record 3962: Company is Brotherhood Of Rr Signalmen")
	void CompanyOfRecord3962() {
		assertEquals("Brotherhood Of Rr Signalmen", customers.get(3961).getCompany());
	}

	@Test
	@DisplayName("Record 3962: Address is 101 E Davis St")
	void AddressOfRecord3962() {
		assertEquals("101 E Davis St", customers.get(3961).getAddress());
	}

	@Test
	@DisplayName("Record 3962: City is McKinney")
	void CityOfRecord3962() {
		assertEquals("McKinney", customers.get(3961).getCity());
	}

	@Test
	@DisplayName("Record 3962: County is Collin")
	void CountyOfRecord3962() {
		assertEquals("Collin", customers.get(3961).getCounty());
	}

	@Test
	@DisplayName("Record 3962: State is TX")
	void StateOfRecord3962() {
		assertEquals("TX", customers.get(3961).getState());
	}

	@Test
	@DisplayName("Record 3962: ZIP is 75069")
	void ZIPOfRecord3962() {
		assertEquals("75069", customers.get(3961).getZIP());
	}

	@Test
	@DisplayName("Record 3962: Phone is 972-562-6222")
	void PhoneOfRecord3962() {
		assertEquals("972-562-6222", customers.get(3961).getPhone());
	}

	@Test
	@DisplayName("Record 3962: Fax is 972-562-1367")
	void FaxOfRecord3962() {
		assertEquals("972-562-1367", customers.get(3961).getFax());
	}

	@Test
	@DisplayName("Record 3962: Email is lyf@ciucci.com")
	void EmailOfRecord3962() {
		assertEquals("lyf@ciucci.com", customers.get(3961).getEmail());
	}

	@Test
	@DisplayName("Record 3962: Web is http://www.lyfciucci.com")
	void WebOfRecord3962() {
		assertEquals("http://www.lyfciucci.com", customers.get(3961).getWeb());
	}
}
