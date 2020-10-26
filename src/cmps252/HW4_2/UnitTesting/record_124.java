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

@Tag("6")
class Record_124 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 124: FirstName is Merle")
	void FirstNameOfRecord124() {
		assertEquals("Merle", customers.get(123).getFirstName());
	}

	@Test
	@DisplayName("Record 124: LastName is Loeschner")
	void LastNameOfRecord124() {
		assertEquals("Loeschner", customers.get(123).getLastName());
	}

	@Test
	@DisplayName("Record 124: Company is Gillman & Finney Advtsng Splty")
	void CompanyOfRecord124() {
		assertEquals("Gillman & Finney Advtsng Splty", customers.get(123).getCompany());
	}

	@Test
	@DisplayName("Record 124: Address is 2851 Nw 27th Ave")
	void AddressOfRecord124() {
		assertEquals("2851 Nw 27th Ave", customers.get(123).getAddress());
	}

	@Test
	@DisplayName("Record 124: City is Miami")
	void CityOfRecord124() {
		assertEquals("Miami", customers.get(123).getCity());
	}

	@Test
	@DisplayName("Record 124: County is Miami-Dade")
	void CountyOfRecord124() {
		assertEquals("Miami-Dade", customers.get(123).getCounty());
	}

	@Test
	@DisplayName("Record 124: State is FL")
	void StateOfRecord124() {
		assertEquals("FL", customers.get(123).getState());
	}

	@Test
	@DisplayName("Record 124: ZIP is 33142")
	void ZIPOfRecord124() {
		assertEquals("33142", customers.get(123).getZIP());
	}

	@Test
	@DisplayName("Record 124: Phone is 305-633-5468")
	void PhoneOfRecord124() {
		assertEquals("305-633-5468", customers.get(123).getPhone());
	}

	@Test
	@DisplayName("Record 124: Fax is 305-633-9375")
	void FaxOfRecord124() {
		assertEquals("305-633-9375", customers.get(123).getFax());
	}

	@Test
	@DisplayName("Record 124: Email is merle@loeschner.com")
	void EmailOfRecord124() {
		assertEquals("merle@loeschner.com", customers.get(123).getEmail());
	}

	@Test
	@DisplayName("Record 124: Web is http://www.merleloeschner.com")
	void WebOfRecord124() {
		assertEquals("http://www.merleloeschner.com", customers.get(123).getWeb());
	}
}
