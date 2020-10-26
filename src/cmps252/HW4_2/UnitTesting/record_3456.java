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

@Tag("20")
class Record_3456 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3456: FirstName is Betty")
	void FirstNameOfRecord3456() {
		assertEquals("Betty", customers.get(3455).getFirstName());
	}

	@Test
	@DisplayName("Record 3456: LastName is Carrera")
	void LastNameOfRecord3456() {
		assertEquals("Carrera", customers.get(3455).getLastName());
	}

	@Test
	@DisplayName("Record 3456: Company is Schmizzi, Richard W Esq")
	void CompanyOfRecord3456() {
		assertEquals("Schmizzi, Richard W Esq", customers.get(3455).getCompany());
	}

	@Test
	@DisplayName("Record 3456: Address is 2455 Francis Lewis Blvd")
	void AddressOfRecord3456() {
		assertEquals("2455 Francis Lewis Blvd", customers.get(3455).getAddress());
	}

	@Test
	@DisplayName("Record 3456: City is Whitestone")
	void CityOfRecord3456() {
		assertEquals("Whitestone", customers.get(3455).getCity());
	}

	@Test
	@DisplayName("Record 3456: County is Queens")
	void CountyOfRecord3456() {
		assertEquals("Queens", customers.get(3455).getCounty());
	}

	@Test
	@DisplayName("Record 3456: State is NY")
	void StateOfRecord3456() {
		assertEquals("NY", customers.get(3455).getState());
	}

	@Test
	@DisplayName("Record 3456: ZIP is 11357")
	void ZIPOfRecord3456() {
		assertEquals("11357", customers.get(3455).getZIP());
	}

	@Test
	@DisplayName("Record 3456: Phone is 718-352-6179")
	void PhoneOfRecord3456() {
		assertEquals("718-352-6179", customers.get(3455).getPhone());
	}

	@Test
	@DisplayName("Record 3456: Fax is 718-352-4885")
	void FaxOfRecord3456() {
		assertEquals("718-352-4885", customers.get(3455).getFax());
	}

	@Test
	@DisplayName("Record 3456: Email is betty@carrera.com")
	void EmailOfRecord3456() {
		assertEquals("betty@carrera.com", customers.get(3455).getEmail());
	}

	@Test
	@DisplayName("Record 3456: Web is http://www.bettycarrera.com")
	void WebOfRecord3456() {
		assertEquals("http://www.bettycarrera.com", customers.get(3455).getWeb());
	}
}
