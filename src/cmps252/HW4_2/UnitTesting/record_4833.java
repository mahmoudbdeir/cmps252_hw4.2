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

@Tag("6")
class Record_4833 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4833: FirstName is Dudley")
	void FirstNameOfRecord4833() {
		assertEquals("Dudley", customers.get(4832).getFirstName());
	}

	@Test
	@DisplayName("Record 4833: LastName is Stumpo")
	void LastNameOfRecord4833() {
		assertEquals("Stumpo", customers.get(4832).getLastName());
	}

	@Test
	@DisplayName("Record 4833: Company is William A Murphy & Assocs Inc")
	void CompanyOfRecord4833() {
		assertEquals("William A Murphy & Assocs Inc", customers.get(4832).getCompany());
	}

	@Test
	@DisplayName("Record 4833: Address is 48 Lawton St")
	void AddressOfRecord4833() {
		assertEquals("48 Lawton St", customers.get(4832).getAddress());
	}

	@Test
	@DisplayName("Record 4833: City is New Rochelle")
	void CityOfRecord4833() {
		assertEquals("New Rochelle", customers.get(4832).getCity());
	}

	@Test
	@DisplayName("Record 4833: County is Westchester")
	void CountyOfRecord4833() {
		assertEquals("Westchester", customers.get(4832).getCounty());
	}

	@Test
	@DisplayName("Record 4833: State is NY")
	void StateOfRecord4833() {
		assertEquals("NY", customers.get(4832).getState());
	}

	@Test
	@DisplayName("Record 4833: ZIP is 10801")
	void ZIPOfRecord4833() {
		assertEquals("10801", customers.get(4832).getZIP());
	}

	@Test
	@DisplayName("Record 4833: Phone is 914-632-9515")
	void PhoneOfRecord4833() {
		assertEquals("914-632-9515", customers.get(4832).getPhone());
	}

	@Test
	@DisplayName("Record 4833: Fax is 914-632-3494")
	void FaxOfRecord4833() {
		assertEquals("914-632-3494", customers.get(4832).getFax());
	}

	@Test
	@DisplayName("Record 4833: Email is dudley@stumpo.com")
	void EmailOfRecord4833() {
		assertEquals("dudley@stumpo.com", customers.get(4832).getEmail());
	}

	@Test
	@DisplayName("Record 4833: Web is http://www.dudleystumpo.com")
	void WebOfRecord4833() {
		assertEquals("http://www.dudleystumpo.com", customers.get(4832).getWeb());
	}
}
