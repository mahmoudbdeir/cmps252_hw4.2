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

@Tag("42")
class Record_4560 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4560: FirstName is Irving")
	void FirstNameOfRecord4560() {
		assertEquals("Irving", customers.get(4559).getFirstName());
	}

	@Test
	@DisplayName("Record 4560: LastName is Kanosh")
	void LastNameOfRecord4560() {
		assertEquals("Kanosh", customers.get(4559).getLastName());
	}

	@Test
	@DisplayName("Record 4560: Company is Jarmans Construction")
	void CompanyOfRecord4560() {
		assertEquals("Jarmans Construction", customers.get(4559).getCompany());
	}

	@Test
	@DisplayName("Record 4560: Address is 235 Elm Rd")
	void AddressOfRecord4560() {
		assertEquals("235 Elm Rd", customers.get(4559).getAddress());
	}

	@Test
	@DisplayName("Record 4560: City is Briarcliff Manor")
	void CityOfRecord4560() {
		assertEquals("Briarcliff Manor", customers.get(4559).getCity());
	}

	@Test
	@DisplayName("Record 4560: County is Westchester")
	void CountyOfRecord4560() {
		assertEquals("Westchester", customers.get(4559).getCounty());
	}

	@Test
	@DisplayName("Record 4560: State is NY")
	void StateOfRecord4560() {
		assertEquals("NY", customers.get(4559).getState());
	}

	@Test
	@DisplayName("Record 4560: ZIP is 10510")
	void ZIPOfRecord4560() {
		assertEquals("10510", customers.get(4559).getZIP());
	}

	@Test
	@DisplayName("Record 4560: Phone is 914-773-7004")
	void PhoneOfRecord4560() {
		assertEquals("914-773-7004", customers.get(4559).getPhone());
	}

	@Test
	@DisplayName("Record 4560: Fax is 914-773-5398")
	void FaxOfRecord4560() {
		assertEquals("914-773-5398", customers.get(4559).getFax());
	}

	@Test
	@DisplayName("Record 4560: Email is irving@kanosh.com")
	void EmailOfRecord4560() {
		assertEquals("irving@kanosh.com", customers.get(4559).getEmail());
	}

	@Test
	@DisplayName("Record 4560: Web is http://www.irvingkanosh.com")
	void WebOfRecord4560() {
		assertEquals("http://www.irvingkanosh.com", customers.get(4559).getWeb());
	}
}
