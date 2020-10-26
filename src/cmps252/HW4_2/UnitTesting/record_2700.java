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

@Tag("17")
class Record_2700 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2700: FirstName is Walton")
	void FirstNameOfRecord2700() {
		assertEquals("Walton", customers.get(2699).getFirstName());
	}

	@Test
	@DisplayName("Record 2700: LastName is Hunkele")
	void LastNameOfRecord2700() {
		assertEquals("Hunkele", customers.get(2699).getLastName());
	}

	@Test
	@DisplayName("Record 2700: Company is Carlton Ice Cream")
	void CompanyOfRecord2700() {
		assertEquals("Carlton Ice Cream", customers.get(2699).getCompany());
	}

	@Test
	@DisplayName("Record 2700: Address is 10 Glenvillel")
	void AddressOfRecord2700() {
		assertEquals("10 Glenvillel", customers.get(2699).getAddress());
	}

	@Test
	@DisplayName("Record 2700: City is Greenwich")
	void CityOfRecord2700() {
		assertEquals("Greenwich", customers.get(2699).getCity());
	}

	@Test
	@DisplayName("Record 2700: County is Fairfield")
	void CountyOfRecord2700() {
		assertEquals("Fairfield", customers.get(2699).getCounty());
	}

	@Test
	@DisplayName("Record 2700: State is CT")
	void StateOfRecord2700() {
		assertEquals("CT", customers.get(2699).getState());
	}

	@Test
	@DisplayName("Record 2700: ZIP is 6831")
	void ZIPOfRecord2700() {
		assertEquals("6831", customers.get(2699).getZIP());
	}

	@Test
	@DisplayName("Record 2700: Phone is 203-531-4555")
	void PhoneOfRecord2700() {
		assertEquals("203-531-4555", customers.get(2699).getPhone());
	}

	@Test
	@DisplayName("Record 2700: Fax is 203-531-4649")
	void FaxOfRecord2700() {
		assertEquals("203-531-4649", customers.get(2699).getFax());
	}

	@Test
	@DisplayName("Record 2700: Email is walton@hunkele.com")
	void EmailOfRecord2700() {
		assertEquals("walton@hunkele.com", customers.get(2699).getEmail());
	}

	@Test
	@DisplayName("Record 2700: Web is http://www.waltonhunkele.com")
	void WebOfRecord2700() {
		assertEquals("http://www.waltonhunkele.com", customers.get(2699).getWeb());
	}
}
