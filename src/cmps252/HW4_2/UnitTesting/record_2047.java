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

@Tag("38")
class Record_2047 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2047: FirstName is Jeanna")
	void FirstNameOfRecord2047() {
		assertEquals("Jeanna", customers.get(2046).getFirstName());
	}

	@Test
	@DisplayName("Record 2047: LastName is Matherson")
	void LastNameOfRecord2047() {
		assertEquals("Matherson", customers.get(2046).getLastName());
	}

	@Test
	@DisplayName("Record 2047: Company is Catalina, Frank E Esq")
	void CompanyOfRecord2047() {
		assertEquals("Catalina, Frank E Esq", customers.get(2046).getCompany());
	}

	@Test
	@DisplayName("Record 2047: Address is 217 W 13th St")
	void AddressOfRecord2047() {
		assertEquals("217 W 13th St", customers.get(2046).getAddress());
	}

	@Test
	@DisplayName("Record 2047: City is Salisbury")
	void CityOfRecord2047() {
		assertEquals("Salisbury", customers.get(2046).getCity());
	}

	@Test
	@DisplayName("Record 2047: County is Rowan")
	void CountyOfRecord2047() {
		assertEquals("Rowan", customers.get(2046).getCounty());
	}

	@Test
	@DisplayName("Record 2047: State is NC")
	void StateOfRecord2047() {
		assertEquals("NC", customers.get(2046).getState());
	}

	@Test
	@DisplayName("Record 2047: ZIP is 28144")
	void ZIPOfRecord2047() {
		assertEquals("28144", customers.get(2046).getZIP());
	}

	@Test
	@DisplayName("Record 2047: Phone is 704-639-7159")
	void PhoneOfRecord2047() {
		assertEquals("704-639-7159", customers.get(2046).getPhone());
	}

	@Test
	@DisplayName("Record 2047: Fax is 704-639-9479")
	void FaxOfRecord2047() {
		assertEquals("704-639-9479", customers.get(2046).getFax());
	}

	@Test
	@DisplayName("Record 2047: Email is jeanna@matherson.com")
	void EmailOfRecord2047() {
		assertEquals("jeanna@matherson.com", customers.get(2046).getEmail());
	}

	@Test
	@DisplayName("Record 2047: Web is http://www.jeannamatherson.com")
	void WebOfRecord2047() {
		assertEquals("http://www.jeannamatherson.com", customers.get(2046).getWeb());
	}
}
