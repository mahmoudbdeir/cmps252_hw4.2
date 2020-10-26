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
class Record_2161 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2161: FirstName is Marcelo")
	void FirstNameOfRecord2161() {
		assertEquals("Marcelo", customers.get(2160).getFirstName());
	}

	@Test
	@DisplayName("Record 2161: LastName is Willimas")
	void LastNameOfRecord2161() {
		assertEquals("Willimas", customers.get(2160).getLastName());
	}

	@Test
	@DisplayName("Record 2161: Company is Dbl Labs Inc")
	void CompanyOfRecord2161() {
		assertEquals("Dbl Labs Inc", customers.get(2160).getCompany());
	}

	@Test
	@DisplayName("Record 2161: Address is 110 E 9th St")
	void AddressOfRecord2161() {
		assertEquals("110 E 9th St", customers.get(2160).getAddress());
	}

	@Test
	@DisplayName("Record 2161: City is Los Angeles")
	void CityOfRecord2161() {
		assertEquals("Los Angeles", customers.get(2160).getCity());
	}

	@Test
	@DisplayName("Record 2161: County is Los Angeles")
	void CountyOfRecord2161() {
		assertEquals("Los Angeles", customers.get(2160).getCounty());
	}

	@Test
	@DisplayName("Record 2161: State is CA")
	void StateOfRecord2161() {
		assertEquals("CA", customers.get(2160).getState());
	}

	@Test
	@DisplayName("Record 2161: ZIP is 90079")
	void ZIPOfRecord2161() {
		assertEquals("90079", customers.get(2160).getZIP());
	}

	@Test
	@DisplayName("Record 2161: Phone is 213-627-1968")
	void PhoneOfRecord2161() {
		assertEquals("213-627-1968", customers.get(2160).getPhone());
	}

	@Test
	@DisplayName("Record 2161: Fax is 213-627-5465")
	void FaxOfRecord2161() {
		assertEquals("213-627-5465", customers.get(2160).getFax());
	}

	@Test
	@DisplayName("Record 2161: Email is marcelo@willimas.com")
	void EmailOfRecord2161() {
		assertEquals("marcelo@willimas.com", customers.get(2160).getEmail());
	}

	@Test
	@DisplayName("Record 2161: Web is http://www.marcelowillimas.com")
	void WebOfRecord2161() {
		assertEquals("http://www.marcelowillimas.com", customers.get(2160).getWeb());
	}
}
