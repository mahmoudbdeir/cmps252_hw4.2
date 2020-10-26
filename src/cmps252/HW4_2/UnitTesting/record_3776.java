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

@Tag("15")
class Record_3776 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3776: FirstName is Scot")
	void FirstNameOfRecord3776() {
		assertEquals("Scot", customers.get(3775).getFirstName());
	}

	@Test
	@DisplayName("Record 3776: LastName is Hornbeck")
	void LastNameOfRecord3776() {
		assertEquals("Hornbeck", customers.get(3775).getLastName());
	}

	@Test
	@DisplayName("Record 3776: Company is Wyss Freedman Roomberg")
	void CompanyOfRecord3776() {
		assertEquals("Wyss Freedman Roomberg", customers.get(3775).getCompany());
	}

	@Test
	@DisplayName("Record 3776: Address is 600 Broadway St")
	void AddressOfRecord3776() {
		assertEquals("600 Broadway St", customers.get(3775).getAddress());
	}

	@Test
	@DisplayName("Record 3776: City is Little Rock")
	void CityOfRecord3776() {
		assertEquals("Little Rock", customers.get(3775).getCity());
	}

	@Test
	@DisplayName("Record 3776: County is Pulaski")
	void CountyOfRecord3776() {
		assertEquals("Pulaski", customers.get(3775).getCounty());
	}

	@Test
	@DisplayName("Record 3776: State is AR")
	void StateOfRecord3776() {
		assertEquals("AR", customers.get(3775).getState());
	}

	@Test
	@DisplayName("Record 3776: ZIP is 72201")
	void ZIPOfRecord3776() {
		assertEquals("72201", customers.get(3775).getZIP());
	}

	@Test
	@DisplayName("Record 3776: Phone is 501-376-2433")
	void PhoneOfRecord3776() {
		assertEquals("501-376-2433", customers.get(3775).getPhone());
	}

	@Test
	@DisplayName("Record 3776: Fax is 501-376-9036")
	void FaxOfRecord3776() {
		assertEquals("501-376-9036", customers.get(3775).getFax());
	}

	@Test
	@DisplayName("Record 3776: Email is scot@hornbeck.com")
	void EmailOfRecord3776() {
		assertEquals("scot@hornbeck.com", customers.get(3775).getEmail());
	}

	@Test
	@DisplayName("Record 3776: Web is http://www.scothornbeck.com")
	void WebOfRecord3776() {
		assertEquals("http://www.scothornbeck.com", customers.get(3775).getWeb());
	}
}
