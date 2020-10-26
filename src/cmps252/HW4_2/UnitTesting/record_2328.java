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

@Tag("41")
class Record_2328 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2328: FirstName is Lucinda")
	void FirstNameOfRecord2328() {
		assertEquals("Lucinda", customers.get(2327).getFirstName());
	}

	@Test
	@DisplayName("Record 2328: LastName is Wynman")
	void LastNameOfRecord2328() {
		assertEquals("Wynman", customers.get(2327).getLastName());
	}

	@Test
	@DisplayName("Record 2328: Company is Shants & Booker")
	void CompanyOfRecord2328() {
		assertEquals("Shants & Booker", customers.get(2327).getCompany());
	}

	@Test
	@DisplayName("Record 2328: Address is 2005 Hickory Grove Rd")
	void AddressOfRecord2328() {
		assertEquals("2005 Hickory Grove Rd", customers.get(2327).getAddress());
	}

	@Test
	@DisplayName("Record 2328: City is Davenport")
	void CityOfRecord2328() {
		assertEquals("Davenport", customers.get(2327).getCity());
	}

	@Test
	@DisplayName("Record 2328: County is Scott")
	void CountyOfRecord2328() {
		assertEquals("Scott", customers.get(2327).getCounty());
	}

	@Test
	@DisplayName("Record 2328: State is IA")
	void StateOfRecord2328() {
		assertEquals("IA", customers.get(2327).getState());
	}

	@Test
	@DisplayName("Record 2328: ZIP is 52804")
	void ZIPOfRecord2328() {
		assertEquals("52804", customers.get(2327).getZIP());
	}

	@Test
	@DisplayName("Record 2328: Phone is 563-323-1929")
	void PhoneOfRecord2328() {
		assertEquals("563-323-1929", customers.get(2327).getPhone());
	}

	@Test
	@DisplayName("Record 2328: Fax is 563-323-5131")
	void FaxOfRecord2328() {
		assertEquals("563-323-5131", customers.get(2327).getFax());
	}

	@Test
	@DisplayName("Record 2328: Email is lucinda@wynman.com")
	void EmailOfRecord2328() {
		assertEquals("lucinda@wynman.com", customers.get(2327).getEmail());
	}

	@Test
	@DisplayName("Record 2328: Web is http://www.lucindawynman.com")
	void WebOfRecord2328() {
		assertEquals("http://www.lucindawynman.com", customers.get(2327).getWeb());
	}
}
