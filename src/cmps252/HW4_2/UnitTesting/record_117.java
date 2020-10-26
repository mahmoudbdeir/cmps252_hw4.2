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

@Tag("29")
class Record_117 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 117: FirstName is Ester")
	void FirstNameOfRecord117() {
		assertEquals("Ester", customers.get(116).getFirstName());
	}

	@Test
	@DisplayName("Record 117: LastName is Silsbee")
	void LastNameOfRecord117() {
		assertEquals("Silsbee", customers.get(116).getLastName());
	}

	@Test
	@DisplayName("Record 117: Company is Kent H Landsberg Co")
	void CompanyOfRecord117() {
		assertEquals("Kent H Landsberg Co", customers.get(116).getCompany());
	}

	@Test
	@DisplayName("Record 117: Address is 1417 4th St")
	void AddressOfRecord117() {
		assertEquals("1417 4th St", customers.get(116).getAddress());
	}

	@Test
	@DisplayName("Record 117: City is Berkeley")
	void CityOfRecord117() {
		assertEquals("Berkeley", customers.get(116).getCity());
	}

	@Test
	@DisplayName("Record 117: County is Alameda")
	void CountyOfRecord117() {
		assertEquals("Alameda", customers.get(116).getCounty());
	}

	@Test
	@DisplayName("Record 117: State is CA")
	void StateOfRecord117() {
		assertEquals("CA", customers.get(116).getState());
	}

	@Test
	@DisplayName("Record 117: ZIP is 94710")
	void ZIPOfRecord117() {
		assertEquals("94710", customers.get(116).getZIP());
	}

	@Test
	@DisplayName("Record 117: Phone is 510-527-3139")
	void PhoneOfRecord117() {
		assertEquals("510-527-3139", customers.get(116).getPhone());
	}

	@Test
	@DisplayName("Record 117: Fax is 510-527-3916")
	void FaxOfRecord117() {
		assertEquals("510-527-3916", customers.get(116).getFax());
	}

	@Test
	@DisplayName("Record 117: Email is ester@silsbee.com")
	void EmailOfRecord117() {
		assertEquals("ester@silsbee.com", customers.get(116).getEmail());
	}

	@Test
	@DisplayName("Record 117: Web is http://www.estersilsbee.com")
	void WebOfRecord117() {
		assertEquals("http://www.estersilsbee.com", customers.get(116).getWeb());
	}
}
