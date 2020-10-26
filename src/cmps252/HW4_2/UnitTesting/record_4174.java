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

@Tag("5")
class Record_4174 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4174: FirstName is Irwin")
	void FirstNameOfRecord4174() {
		assertEquals("Irwin", customers.get(4173).getFirstName());
	}

	@Test
	@DisplayName("Record 4174: LastName is Sherville")
	void LastNameOfRecord4174() {
		assertEquals("Sherville", customers.get(4173).getLastName());
	}

	@Test
	@DisplayName("Record 4174: Company is Unr Rohn")
	void CompanyOfRecord4174() {
		assertEquals("Unr Rohn", customers.get(4173).getCompany());
	}

	@Test
	@DisplayName("Record 4174: Address is 500 Park Ave")
	void AddressOfRecord4174() {
		assertEquals("500 Park Ave", customers.get(4173).getAddress());
	}

	@Test
	@DisplayName("Record 4174: City is New York")
	void CityOfRecord4174() {
		assertEquals("New York", customers.get(4173).getCity());
	}

	@Test
	@DisplayName("Record 4174: County is New York")
	void CountyOfRecord4174() {
		assertEquals("New York", customers.get(4173).getCounty());
	}

	@Test
	@DisplayName("Record 4174: State is NY")
	void StateOfRecord4174() {
		assertEquals("NY", customers.get(4173).getState());
	}

	@Test
	@DisplayName("Record 4174: ZIP is 10022")
	void ZIPOfRecord4174() {
		assertEquals("10022", customers.get(4173).getZIP());
	}

	@Test
	@DisplayName("Record 4174: Phone is 212-832-6955")
	void PhoneOfRecord4174() {
		assertEquals("212-832-6955", customers.get(4173).getPhone());
	}

	@Test
	@DisplayName("Record 4174: Fax is 212-832-2616")
	void FaxOfRecord4174() {
		assertEquals("212-832-2616", customers.get(4173).getFax());
	}

	@Test
	@DisplayName("Record 4174: Email is irwin@sherville.com")
	void EmailOfRecord4174() {
		assertEquals("irwin@sherville.com", customers.get(4173).getEmail());
	}

	@Test
	@DisplayName("Record 4174: Web is http://www.irwinsherville.com")
	void WebOfRecord4174() {
		assertEquals("http://www.irwinsherville.com", customers.get(4173).getWeb());
	}
}
