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

@Tag("39")
class Record_114 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 114: FirstName is Ashlee")
	void FirstNameOfRecord114() {
		assertEquals("Ashlee", customers.get(113).getFirstName());
	}

	@Test
	@DisplayName("Record 114: LastName is Havatone")
	void LastNameOfRecord114() {
		assertEquals("Havatone", customers.get(113).getLastName());
	}

	@Test
	@DisplayName("Record 114: Company is Superior Rubber Die Co Inc")
	void CompanyOfRecord114() {
		assertEquals("Superior Rubber Die Co Inc", customers.get(113).getCompany());
	}

	@Test
	@DisplayName("Record 114: Address is 1522 Saint Louis Ave")
	void AddressOfRecord114() {
		assertEquals("1522 Saint Louis Ave", customers.get(113).getAddress());
	}

	@Test
	@DisplayName("Record 114: City is Kansas City")
	void CityOfRecord114() {
		assertEquals("Kansas City", customers.get(113).getCity());
	}

	@Test
	@DisplayName("Record 114: County is Jackson")
	void CountyOfRecord114() {
		assertEquals("Jackson", customers.get(113).getCounty());
	}

	@Test
	@DisplayName("Record 114: State is MO")
	void StateOfRecord114() {
		assertEquals("MO", customers.get(113).getState());
	}

	@Test
	@DisplayName("Record 114: ZIP is 64101")
	void ZIPOfRecord114() {
		assertEquals("64101", customers.get(113).getZIP());
	}

	@Test
	@DisplayName("Record 114: Phone is 816-471-2713")
	void PhoneOfRecord114() {
		assertEquals("816-471-2713", customers.get(113).getPhone());
	}

	@Test
	@DisplayName("Record 114: Fax is 816-471-3009")
	void FaxOfRecord114() {
		assertEquals("816-471-3009", customers.get(113).getFax());
	}

	@Test
	@DisplayName("Record 114: Email is ashlee@havatone.com")
	void EmailOfRecord114() {
		assertEquals("ashlee@havatone.com", customers.get(113).getEmail());
	}

	@Test
	@DisplayName("Record 114: Web is http://www.ashleehavatone.com")
	void WebOfRecord114() {
		assertEquals("http://www.ashleehavatone.com", customers.get(113).getWeb());
	}
}
