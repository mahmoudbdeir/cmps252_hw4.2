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

@Tag("49")
class Record_4420 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4420: FirstName is Frances")
	void FirstNameOfRecord4420() {
		assertEquals("Frances", customers.get(4419).getFirstName());
	}

	@Test
	@DisplayName("Record 4420: LastName is Goldyn")
	void LastNameOfRecord4420() {
		assertEquals("Goldyn", customers.get(4419).getLastName());
	}

	@Test
	@DisplayName("Record 4420: Company is Solomon Krupnikoff & Wyskiel")
	void CompanyOfRecord4420() {
		assertEquals("Solomon Krupnikoff & Wyskiel", customers.get(4419).getCompany());
	}

	@Test
	@DisplayName("Record 4420: Address is 2900 Sw 28th Ter")
	void AddressOfRecord4420() {
		assertEquals("2900 Sw 28th Ter", customers.get(4419).getAddress());
	}

	@Test
	@DisplayName("Record 4420: City is Miami")
	void CityOfRecord4420() {
		assertEquals("Miami", customers.get(4419).getCity());
	}

	@Test
	@DisplayName("Record 4420: County is Miami-Dade")
	void CountyOfRecord4420() {
		assertEquals("Miami-Dade", customers.get(4419).getCounty());
	}

	@Test
	@DisplayName("Record 4420: State is FL")
	void StateOfRecord4420() {
		assertEquals("FL", customers.get(4419).getState());
	}

	@Test
	@DisplayName("Record 4420: ZIP is 33133")
	void ZIPOfRecord4420() {
		assertEquals("33133", customers.get(4419).getZIP());
	}

	@Test
	@DisplayName("Record 4420: Phone is 305-358-6497")
	void PhoneOfRecord4420() {
		assertEquals("305-358-6497", customers.get(4419).getPhone());
	}

	@Test
	@DisplayName("Record 4420: Fax is 305-358-8316")
	void FaxOfRecord4420() {
		assertEquals("305-358-8316", customers.get(4419).getFax());
	}

	@Test
	@DisplayName("Record 4420: Email is frances@goldyn.com")
	void EmailOfRecord4420() {
		assertEquals("frances@goldyn.com", customers.get(4419).getEmail());
	}

	@Test
	@DisplayName("Record 4420: Web is http://www.francesgoldyn.com")
	void WebOfRecord4420() {
		assertEquals("http://www.francesgoldyn.com", customers.get(4419).getWeb());
	}
}
