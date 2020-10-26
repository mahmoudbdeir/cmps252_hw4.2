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

@Tag("34")
class Record_4558 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4558: FirstName is Jeromy")
	void FirstNameOfRecord4558() {
		assertEquals("Jeromy", customers.get(4557).getFirstName());
	}

	@Test
	@DisplayName("Record 4558: LastName is Taite")
	void LastNameOfRecord4558() {
		assertEquals("Taite", customers.get(4557).getLastName());
	}

	@Test
	@DisplayName("Record 4558: Company is Refrigeration Products Co")
	void CompanyOfRecord4558() {
		assertEquals("Refrigeration Products Co", customers.get(4557).getCompany());
	}

	@Test
	@DisplayName("Record 4558: Address is 1370 Americas Aven")
	void AddressOfRecord4558() {
		assertEquals("1370 Americas Aven", customers.get(4557).getAddress());
	}

	@Test
	@DisplayName("Record 4558: City is New York")
	void CityOfRecord4558() {
		assertEquals("New York", customers.get(4557).getCity());
	}

	@Test
	@DisplayName("Record 4558: County is New York")
	void CountyOfRecord4558() {
		assertEquals("New York", customers.get(4557).getCounty());
	}

	@Test
	@DisplayName("Record 4558: State is NY")
	void StateOfRecord4558() {
		assertEquals("NY", customers.get(4557).getState());
	}

	@Test
	@DisplayName("Record 4558: ZIP is 10019")
	void ZIPOfRecord4558() {
		assertEquals("10019", customers.get(4557).getZIP());
	}

	@Test
	@DisplayName("Record 4558: Phone is 212-315-7425")
	void PhoneOfRecord4558() {
		assertEquals("212-315-7425", customers.get(4557).getPhone());
	}

	@Test
	@DisplayName("Record 4558: Fax is 212-315-0661")
	void FaxOfRecord4558() {
		assertEquals("212-315-0661", customers.get(4557).getFax());
	}

	@Test
	@DisplayName("Record 4558: Email is jeromy@taite.com")
	void EmailOfRecord4558() {
		assertEquals("jeromy@taite.com", customers.get(4557).getEmail());
	}

	@Test
	@DisplayName("Record 4558: Web is http://www.jeromytaite.com")
	void WebOfRecord4558() {
		assertEquals("http://www.jeromytaite.com", customers.get(4557).getWeb());
	}
}
