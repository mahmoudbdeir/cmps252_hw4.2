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

@Tag("12")
class Record_4444 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4444: FirstName is Mitchel")
	void FirstNameOfRecord4444() {
		assertEquals("Mitchel", customers.get(4443).getFirstName());
	}

	@Test
	@DisplayName("Record 4444: LastName is Fujimoto")
	void LastNameOfRecord4444() {
		assertEquals("Fujimoto", customers.get(4443).getLastName());
	}

	@Test
	@DisplayName("Record 4444: Company is Spee Dee Packaging Machy Inc")
	void CompanyOfRecord4444() {
		assertEquals("Spee Dee Packaging Machy Inc", customers.get(4443).getCompany());
	}

	@Test
	@DisplayName("Record 4444: Address is 375 N French Rd")
	void AddressOfRecord4444() {
		assertEquals("375 N French Rd", customers.get(4443).getAddress());
	}

	@Test
	@DisplayName("Record 4444: City is Buffalo")
	void CityOfRecord4444() {
		assertEquals("Buffalo", customers.get(4443).getCity());
	}

	@Test
	@DisplayName("Record 4444: County is Erie")
	void CountyOfRecord4444() {
		assertEquals("Erie", customers.get(4443).getCounty());
	}

	@Test
	@DisplayName("Record 4444: State is NY")
	void StateOfRecord4444() {
		assertEquals("NY", customers.get(4443).getState());
	}

	@Test
	@DisplayName("Record 4444: ZIP is 14228")
	void ZIPOfRecord4444() {
		assertEquals("14228", customers.get(4443).getZIP());
	}

	@Test
	@DisplayName("Record 4444: Phone is 716-691-5573")
	void PhoneOfRecord4444() {
		assertEquals("716-691-5573", customers.get(4443).getPhone());
	}

	@Test
	@DisplayName("Record 4444: Fax is 716-691-2447")
	void FaxOfRecord4444() {
		assertEquals("716-691-2447", customers.get(4443).getFax());
	}

	@Test
	@DisplayName("Record 4444: Email is mitchel@fujimoto.com")
	void EmailOfRecord4444() {
		assertEquals("mitchel@fujimoto.com", customers.get(4443).getEmail());
	}

	@Test
	@DisplayName("Record 4444: Web is http://www.mitchelfujimoto.com")
	void WebOfRecord4444() {
		assertEquals("http://www.mitchelfujimoto.com", customers.get(4443).getWeb());
	}
}
