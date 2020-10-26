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
class Record_2089 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2089: FirstName is Taylor")
	void FirstNameOfRecord2089() {
		assertEquals("Taylor", customers.get(2088).getFirstName());
	}

	@Test
	@DisplayName("Record 2089: LastName is Myler")
	void LastNameOfRecord2089() {
		assertEquals("Myler", customers.get(2088).getLastName());
	}

	@Test
	@DisplayName("Record 2089: Company is Mitchell Office Equipment Ltd")
	void CompanyOfRecord2089() {
		assertEquals("Mitchell Office Equipment Ltd", customers.get(2088).getCompany());
	}

	@Test
	@DisplayName("Record 2089: Address is 1110 S Wells Ave")
	void AddressOfRecord2089() {
		assertEquals("1110 S Wells Ave", customers.get(2088).getAddress());
	}

	@Test
	@DisplayName("Record 2089: City is Reno")
	void CityOfRecord2089() {
		assertEquals("Reno", customers.get(2088).getCity());
	}

	@Test
	@DisplayName("Record 2089: County is Washoe")
	void CountyOfRecord2089() {
		assertEquals("Washoe", customers.get(2088).getCounty());
	}

	@Test
	@DisplayName("Record 2089: State is NV")
	void StateOfRecord2089() {
		assertEquals("NV", customers.get(2088).getState());
	}

	@Test
	@DisplayName("Record 2089: ZIP is 89502")
	void ZIPOfRecord2089() {
		assertEquals("89502", customers.get(2088).getZIP());
	}

	@Test
	@DisplayName("Record 2089: Phone is 775-825-8667")
	void PhoneOfRecord2089() {
		assertEquals("775-825-8667", customers.get(2088).getPhone());
	}

	@Test
	@DisplayName("Record 2089: Fax is 775-825-1963")
	void FaxOfRecord2089() {
		assertEquals("775-825-1963", customers.get(2088).getFax());
	}

	@Test
	@DisplayName("Record 2089: Email is taylor@myler.com")
	void EmailOfRecord2089() {
		assertEquals("taylor@myler.com", customers.get(2088).getEmail());
	}

	@Test
	@DisplayName("Record 2089: Web is http://www.taylormyler.com")
	void WebOfRecord2089() {
		assertEquals("http://www.taylormyler.com", customers.get(2088).getWeb());
	}
}
