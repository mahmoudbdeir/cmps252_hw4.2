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

@Tag("44")
class Record_858 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 858: FirstName is Benedict")
	void FirstNameOfRecord858() {
		assertEquals("Benedict", customers.get(857).getFirstName());
	}

	@Test
	@DisplayName("Record 858: LastName is Isaak")
	void LastNameOfRecord858() {
		assertEquals("Isaak", customers.get(857).getLastName());
	}

	@Test
	@DisplayName("Record 858: Company is Mayo Motors Lincoln Mercury")
	void CompanyOfRecord858() {
		assertEquals("Mayo Motors Lincoln Mercury", customers.get(857).getCompany());
	}

	@Test
	@DisplayName("Record 858: Address is 707 Turnpike St")
	void AddressOfRecord858() {
		assertEquals("707 Turnpike St", customers.get(857).getAddress());
	}

	@Test
	@DisplayName("Record 858: City is North Andover")
	void CityOfRecord858() {
		assertEquals("North Andover", customers.get(857).getCity());
	}

	@Test
	@DisplayName("Record 858: County is Essex")
	void CountyOfRecord858() {
		assertEquals("Essex", customers.get(857).getCounty());
	}

	@Test
	@DisplayName("Record 858: State is MA")
	void StateOfRecord858() {
		assertEquals("MA", customers.get(857).getState());
	}

	@Test
	@DisplayName("Record 858: ZIP is 1845")
	void ZIPOfRecord858() {
		assertEquals("1845", customers.get(857).getZIP());
	}

	@Test
	@DisplayName("Record 858: Phone is 978-794-6044")
	void PhoneOfRecord858() {
		assertEquals("978-794-6044", customers.get(857).getPhone());
	}

	@Test
	@DisplayName("Record 858: Fax is 978-794-0309")
	void FaxOfRecord858() {
		assertEquals("978-794-0309", customers.get(857).getFax());
	}

	@Test
	@DisplayName("Record 858: Email is benedict@isaak.com")
	void EmailOfRecord858() {
		assertEquals("benedict@isaak.com", customers.get(857).getEmail());
	}

	@Test
	@DisplayName("Record 858: Web is http://www.benedictisaak.com")
	void WebOfRecord858() {
		assertEquals("http://www.benedictisaak.com", customers.get(857).getWeb());
	}
}
