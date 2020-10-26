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

@Tag("47")
class Record_19 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 19: FirstName is Ashley")
	void FirstNameOfRecord19() {
		assertEquals("Ashley", customers.get(18).getFirstName());
	}

	@Test
	@DisplayName("Record 19: LastName is Kilness")
	void LastNameOfRecord19() {
		assertEquals("Kilness", customers.get(18).getLastName());
	}

	@Test
	@DisplayName("Record 19: Company is Criterium Day Engineers")
	void CompanyOfRecord19() {
		assertEquals("Criterium Day Engineers", customers.get(18).getCompany());
	}

	@Test
	@DisplayName("Record 19: Address is 1012 Webbs Chapel Rd")
	void AddressOfRecord19() {
		assertEquals("1012 Webbs Chapel Rd", customers.get(18).getAddress());
	}

	@Test
	@DisplayName("Record 19: City is Carrollton")
	void CityOfRecord19() {
		assertEquals("Carrollton", customers.get(18).getCity());
	}

	@Test
	@DisplayName("Record 19: County is Dallas")
	void CountyOfRecord19() {
		assertEquals("Dallas", customers.get(18).getCounty());
	}

	@Test
	@DisplayName("Record 19: State is TX")
	void StateOfRecord19() {
		assertEquals("TX", customers.get(18).getState());
	}

	@Test
	@DisplayName("Record 19: ZIP is 75006")
	void ZIPOfRecord19() {
		assertEquals("75006", customers.get(18).getZIP());
	}

	@Test
	@DisplayName("Record 19: Phone is 972-416-8588")
	void PhoneOfRecord19() {
		assertEquals("972-416-8588", customers.get(18).getPhone());
	}

	@Test
	@DisplayName("Record 19: Fax is 972-416-9465")
	void FaxOfRecord19() {
		assertEquals("972-416-9465", customers.get(18).getFax());
	}

	@Test
	@DisplayName("Record 19: Email is ashley@kilness.com")
	void EmailOfRecord19() {
		assertEquals("ashley@kilness.com", customers.get(18).getEmail());
	}

	@Test
	@DisplayName("Record 19: Web is http://www.ashleykilness.com")
	void WebOfRecord19() {
		assertEquals("http://www.ashleykilness.com", customers.get(18).getWeb());
	}
}
