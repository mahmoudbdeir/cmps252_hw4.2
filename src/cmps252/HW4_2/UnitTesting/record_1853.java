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

@Tag("33")
class Record_1853 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1853: FirstName is Walton")
	void FirstNameOfRecord1853() {
		assertEquals("Walton", customers.get(1852).getFirstName());
	}

	@Test
	@DisplayName("Record 1853: LastName is Ridler")
	void LastNameOfRecord1853() {
		assertEquals("Ridler", customers.get(1852).getLastName());
	}

	@Test
	@DisplayName("Record 1853: Company is Solomon Brewer Saxon")
	void CompanyOfRecord1853() {
		assertEquals("Solomon Brewer Saxon", customers.get(1852).getCompany());
	}

	@Test
	@DisplayName("Record 1853: Address is 31 Maple Ave")
	void AddressOfRecord1853() {
		assertEquals("31 Maple Ave", customers.get(1852).getAddress());
	}

	@Test
	@DisplayName("Record 1853: City is Bethel")
	void CityOfRecord1853() {
		assertEquals("Bethel", customers.get(1852).getCity());
	}

	@Test
	@DisplayName("Record 1853: County is Fairfield")
	void CountyOfRecord1853() {
		assertEquals("Fairfield", customers.get(1852).getCounty());
	}

	@Test
	@DisplayName("Record 1853: State is CT")
	void StateOfRecord1853() {
		assertEquals("CT", customers.get(1852).getState());
	}

	@Test
	@DisplayName("Record 1853: ZIP is 6801")
	void ZIPOfRecord1853() {
		assertEquals("6801", customers.get(1852).getZIP());
	}

	@Test
	@DisplayName("Record 1853: Phone is 203-792-8650")
	void PhoneOfRecord1853() {
		assertEquals("203-792-8650", customers.get(1852).getPhone());
	}

	@Test
	@DisplayName("Record 1853: Fax is 203-792-2767")
	void FaxOfRecord1853() {
		assertEquals("203-792-2767", customers.get(1852).getFax());
	}

	@Test
	@DisplayName("Record 1853: Email is walton@ridler.com")
	void EmailOfRecord1853() {
		assertEquals("walton@ridler.com", customers.get(1852).getEmail());
	}

	@Test
	@DisplayName("Record 1853: Web is http://www.waltonridler.com")
	void WebOfRecord1853() {
		assertEquals("http://www.waltonridler.com", customers.get(1852).getWeb());
	}
}
