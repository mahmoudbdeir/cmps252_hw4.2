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

@Tag("19")
class Record_383 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 383: FirstName is Pilar")
	void FirstNameOfRecord383() {
		assertEquals("Pilar", customers.get(382).getFirstName());
	}

	@Test
	@DisplayName("Record 383: LastName is Handsaker")
	void LastNameOfRecord383() {
		assertEquals("Handsaker", customers.get(382).getLastName());
	}

	@Test
	@DisplayName("Record 383: Company is Stodtmyster Iron")
	void CompanyOfRecord383() {
		assertEquals("Stodtmyster Iron", customers.get(382).getCompany());
	}

	@Test
	@DisplayName("Record 383: Address is 3100 Washington Rd")
	void AddressOfRecord383() {
		assertEquals("3100 Washington Rd", customers.get(382).getAddress());
	}

	@Test
	@DisplayName("Record 383: City is Atlanta")
	void CityOfRecord383() {
		assertEquals("Atlanta", customers.get(382).getCity());
	}

	@Test
	@DisplayName("Record 383: County is Fulton")
	void CountyOfRecord383() {
		assertEquals("Fulton", customers.get(382).getCounty());
	}

	@Test
	@DisplayName("Record 383: State is GA")
	void StateOfRecord383() {
		assertEquals("GA", customers.get(382).getState());
	}

	@Test
	@DisplayName("Record 383: ZIP is 30344")
	void ZIPOfRecord383() {
		assertEquals("30344", customers.get(382).getZIP());
	}

	@Test
	@DisplayName("Record 383: Phone is 404-765-4560")
	void PhoneOfRecord383() {
		assertEquals("404-765-4560", customers.get(382).getPhone());
	}

	@Test
	@DisplayName("Record 383: Fax is 404-765-7056")
	void FaxOfRecord383() {
		assertEquals("404-765-7056", customers.get(382).getFax());
	}

	@Test
	@DisplayName("Record 383: Email is pilar@handsaker.com")
	void EmailOfRecord383() {
		assertEquals("pilar@handsaker.com", customers.get(382).getEmail());
	}

	@Test
	@DisplayName("Record 383: Web is http://www.pilarhandsaker.com")
	void WebOfRecord383() {
		assertEquals("http://www.pilarhandsaker.com", customers.get(382).getWeb());
	}
}
