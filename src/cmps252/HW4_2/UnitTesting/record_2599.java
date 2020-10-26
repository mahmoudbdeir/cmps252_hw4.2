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

@Tag("9")
class Record_2599 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2599: FirstName is Tommie")
	void FirstNameOfRecord2599() {
		assertEquals("Tommie", customers.get(2598).getFirstName());
	}

	@Test
	@DisplayName("Record 2599: LastName is Ropes")
	void LastNameOfRecord2599() {
		assertEquals("Ropes", customers.get(2598).getLastName());
	}

	@Test
	@DisplayName("Record 2599: Company is Roberts, Bud Esq")
	void CompanyOfRecord2599() {
		assertEquals("Roberts, Bud Esq", customers.get(2598).getCompany());
	}

	@Test
	@DisplayName("Record 2599: Address is 4500 W Bethany Rd")
	void AddressOfRecord2599() {
		assertEquals("4500 W Bethany Rd", customers.get(2598).getAddress());
	}

	@Test
	@DisplayName("Record 2599: City is North Little Rock")
	void CityOfRecord2599() {
		assertEquals("North Little Rock", customers.get(2598).getCity());
	}

	@Test
	@DisplayName("Record 2599: County is Pulaski")
	void CountyOfRecord2599() {
		assertEquals("Pulaski", customers.get(2598).getCounty());
	}

	@Test
	@DisplayName("Record 2599: State is AR")
	void StateOfRecord2599() {
		assertEquals("AR", customers.get(2598).getState());
	}

	@Test
	@DisplayName("Record 2599: ZIP is 72117")
	void ZIPOfRecord2599() {
		assertEquals("72117", customers.get(2598).getZIP());
	}

	@Test
	@DisplayName("Record 2599: Phone is 501-945-9552")
	void PhoneOfRecord2599() {
		assertEquals("501-945-9552", customers.get(2598).getPhone());
	}

	@Test
	@DisplayName("Record 2599: Fax is 501-945-6015")
	void FaxOfRecord2599() {
		assertEquals("501-945-6015", customers.get(2598).getFax());
	}

	@Test
	@DisplayName("Record 2599: Email is tommie@ropes.com")
	void EmailOfRecord2599() {
		assertEquals("tommie@ropes.com", customers.get(2598).getEmail());
	}

	@Test
	@DisplayName("Record 2599: Web is http://www.tommieropes.com")
	void WebOfRecord2599() {
		assertEquals("http://www.tommieropes.com", customers.get(2598).getWeb());
	}
}
