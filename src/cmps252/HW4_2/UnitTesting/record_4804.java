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

@Tag("22")
class Record_4804 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4804: FirstName is Dominic")
	void FirstNameOfRecord4804() {
		assertEquals("Dominic", customers.get(4803).getFirstName());
	}

	@Test
	@DisplayName("Record 4804: LastName is Metty")
	void LastNameOfRecord4804() {
		assertEquals("Metty", customers.get(4803).getLastName());
	}

	@Test
	@DisplayName("Record 4804: Company is Everett Griffith Jr & Assocs")
	void CompanyOfRecord4804() {
		assertEquals("Everett Griffith Jr & Assocs", customers.get(4803).getCompany());
	}

	@Test
	@DisplayName("Record 4804: Address is 15457 E Jarvis Pl")
	void AddressOfRecord4804() {
		assertEquals("15457 E Jarvis Pl", customers.get(4803).getAddress());
	}

	@Test
	@DisplayName("Record 4804: City is Aurora")
	void CityOfRecord4804() {
		assertEquals("Aurora", customers.get(4803).getCity());
	}

	@Test
	@DisplayName("Record 4804: County is Arapahoe")
	void CountyOfRecord4804() {
		assertEquals("Arapahoe", customers.get(4803).getCounty());
	}

	@Test
	@DisplayName("Record 4804: State is CO")
	void StateOfRecord4804() {
		assertEquals("CO", customers.get(4803).getState());
	}

	@Test
	@DisplayName("Record 4804: ZIP is 80013")
	void ZIPOfRecord4804() {
		assertEquals("80013", customers.get(4803).getZIP());
	}

	@Test
	@DisplayName("Record 4804: Phone is 303-699-5613")
	void PhoneOfRecord4804() {
		assertEquals("303-699-5613", customers.get(4803).getPhone());
	}

	@Test
	@DisplayName("Record 4804: Fax is 303-699-0034")
	void FaxOfRecord4804() {
		assertEquals("303-699-0034", customers.get(4803).getFax());
	}

	@Test
	@DisplayName("Record 4804: Email is dominic@metty.com")
	void EmailOfRecord4804() {
		assertEquals("dominic@metty.com", customers.get(4803).getEmail());
	}

	@Test
	@DisplayName("Record 4804: Web is http://www.dominicmetty.com")
	void WebOfRecord4804() {
		assertEquals("http://www.dominicmetty.com", customers.get(4803).getWeb());
	}
}
