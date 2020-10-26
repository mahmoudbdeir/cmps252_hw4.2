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

@Tag("23")
class Record_4351 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4351: FirstName is Horacio")
	void FirstNameOfRecord4351() {
		assertEquals("Horacio", customers.get(4350).getFirstName());
	}

	@Test
	@DisplayName("Record 4351: LastName is Shifman")
	void LastNameOfRecord4351() {
		assertEquals("Shifman", customers.get(4350).getLastName());
	}

	@Test
	@DisplayName("Record 4351: Company is Process Equipment Co")
	void CompanyOfRecord4351() {
		assertEquals("Process Equipment Co", customers.get(4350).getCompany());
	}

	@Test
	@DisplayName("Record 4351: Address is 575 Lexington Ave")
	void AddressOfRecord4351() {
		assertEquals("575 Lexington Ave", customers.get(4350).getAddress());
	}

	@Test
	@DisplayName("Record 4351: City is New York")
	void CityOfRecord4351() {
		assertEquals("New York", customers.get(4350).getCity());
	}

	@Test
	@DisplayName("Record 4351: County is New York")
	void CountyOfRecord4351() {
		assertEquals("New York", customers.get(4350).getCounty());
	}

	@Test
	@DisplayName("Record 4351: State is NY")
	void StateOfRecord4351() {
		assertEquals("NY", customers.get(4350).getState());
	}

	@Test
	@DisplayName("Record 4351: ZIP is 10022")
	void ZIPOfRecord4351() {
		assertEquals("10022", customers.get(4350).getZIP());
	}

	@Test
	@DisplayName("Record 4351: Phone is 212-371-7172")
	void PhoneOfRecord4351() {
		assertEquals("212-371-7172", customers.get(4350).getPhone());
	}

	@Test
	@DisplayName("Record 4351: Fax is 212-371-3455")
	void FaxOfRecord4351() {
		assertEquals("212-371-3455", customers.get(4350).getFax());
	}

	@Test
	@DisplayName("Record 4351: Email is horacio@shifman.com")
	void EmailOfRecord4351() {
		assertEquals("horacio@shifman.com", customers.get(4350).getEmail());
	}

	@Test
	@DisplayName("Record 4351: Web is http://www.horacioshifman.com")
	void WebOfRecord4351() {
		assertEquals("http://www.horacioshifman.com", customers.get(4350).getWeb());
	}
}
