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

@Tag("4")
class Record_2557 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2557: FirstName is Abigail")
	void FirstNameOfRecord2557() {
		assertEquals("Abigail", customers.get(2556).getFirstName());
	}

	@Test
	@DisplayName("Record 2557: LastName is Pavloski")
	void LastNameOfRecord2557() {
		assertEquals("Pavloski", customers.get(2556).getLastName());
	}

	@Test
	@DisplayName("Record 2557: Company is Real American Newspaper Corp")
	void CompanyOfRecord2557() {
		assertEquals("Real American Newspaper Corp", customers.get(2556).getCompany());
	}

	@Test
	@DisplayName("Record 2557: Address is 153 E 53rd St")
	void AddressOfRecord2557() {
		assertEquals("153 E 53rd St", customers.get(2556).getAddress());
	}

	@Test
	@DisplayName("Record 2557: City is New York")
	void CityOfRecord2557() {
		assertEquals("New York", customers.get(2556).getCity());
	}

	@Test
	@DisplayName("Record 2557: County is New York")
	void CountyOfRecord2557() {
		assertEquals("New York", customers.get(2556).getCounty());
	}

	@Test
	@DisplayName("Record 2557: State is NY")
	void StateOfRecord2557() {
		assertEquals("NY", customers.get(2556).getState());
	}

	@Test
	@DisplayName("Record 2557: ZIP is 10022")
	void ZIPOfRecord2557() {
		assertEquals("10022", customers.get(2556).getZIP());
	}

	@Test
	@DisplayName("Record 2557: Phone is 212-350-6772")
	void PhoneOfRecord2557() {
		assertEquals("212-350-6772", customers.get(2556).getPhone());
	}

	@Test
	@DisplayName("Record 2557: Fax is 212-350-6445")
	void FaxOfRecord2557() {
		assertEquals("212-350-6445", customers.get(2556).getFax());
	}

	@Test
	@DisplayName("Record 2557: Email is abigail@pavloski.com")
	void EmailOfRecord2557() {
		assertEquals("abigail@pavloski.com", customers.get(2556).getEmail());
	}

	@Test
	@DisplayName("Record 2557: Web is http://www.abigailpavloski.com")
	void WebOfRecord2557() {
		assertEquals("http://www.abigailpavloski.com", customers.get(2556).getWeb());
	}
}
