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

@Tag("11")
class Record_3416 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3416: FirstName is Donald")
	void FirstNameOfRecord3416() {
		assertEquals("Donald", customers.get(3415).getFirstName());
	}

	@Test
	@DisplayName("Record 3416: LastName is Molla")
	void LastNameOfRecord3416() {
		assertEquals("Molla", customers.get(3415).getLastName());
	}

	@Test
	@DisplayName("Record 3416: Company is Beedy, Jennifer Esq")
	void CompanyOfRecord3416() {
		assertEquals("Beedy, Jennifer Esq", customers.get(3415).getCompany());
	}

	@Test
	@DisplayName("Record 3416: Address is 20 W 22nd St")
	void AddressOfRecord3416() {
		assertEquals("20 W 22nd St", customers.get(3415).getAddress());
	}

	@Test
	@DisplayName("Record 3416: City is New York")
	void CityOfRecord3416() {
		assertEquals("New York", customers.get(3415).getCity());
	}

	@Test
	@DisplayName("Record 3416: County is New York")
	void CountyOfRecord3416() {
		assertEquals("New York", customers.get(3415).getCounty());
	}

	@Test
	@DisplayName("Record 3416: State is NY")
	void StateOfRecord3416() {
		assertEquals("NY", customers.get(3415).getState());
	}

	@Test
	@DisplayName("Record 3416: ZIP is 10010")
	void ZIPOfRecord3416() {
		assertEquals("10010", customers.get(3415).getZIP());
	}

	@Test
	@DisplayName("Record 3416: Phone is 212-691-9698")
	void PhoneOfRecord3416() {
		assertEquals("212-691-9698", customers.get(3415).getPhone());
	}

	@Test
	@DisplayName("Record 3416: Fax is 212-691-1671")
	void FaxOfRecord3416() {
		assertEquals("212-691-1671", customers.get(3415).getFax());
	}

	@Test
	@DisplayName("Record 3416: Email is donald@molla.com")
	void EmailOfRecord3416() {
		assertEquals("donald@molla.com", customers.get(3415).getEmail());
	}

	@Test
	@DisplayName("Record 3416: Web is http://www.donaldmolla.com")
	void WebOfRecord3416() {
		assertEquals("http://www.donaldmolla.com", customers.get(3415).getWeb());
	}
}
