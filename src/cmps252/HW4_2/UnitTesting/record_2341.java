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

@Tag("11")
class Record_2341 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2341: FirstName is Darell")
	void FirstNameOfRecord2341() {
		assertEquals("Darell", customers.get(2340).getFirstName());
	}

	@Test
	@DisplayName("Record 2341: LastName is Ballon")
	void LastNameOfRecord2341() {
		assertEquals("Ballon", customers.get(2340).getLastName());
	}

	@Test
	@DisplayName("Record 2341: Company is Border Ventures")
	void CompanyOfRecord2341() {
		assertEquals("Border Ventures", customers.get(2340).getCompany());
	}

	@Test
	@DisplayName("Record 2341: Address is 2140 W Henrietta Rd")
	void AddressOfRecord2341() {
		assertEquals("2140 W Henrietta Rd", customers.get(2340).getAddress());
	}

	@Test
	@DisplayName("Record 2341: City is Rochester")
	void CityOfRecord2341() {
		assertEquals("Rochester", customers.get(2340).getCity());
	}

	@Test
	@DisplayName("Record 2341: County is Monroe")
	void CountyOfRecord2341() {
		assertEquals("Monroe", customers.get(2340).getCounty());
	}

	@Test
	@DisplayName("Record 2341: State is NY")
	void StateOfRecord2341() {
		assertEquals("NY", customers.get(2340).getState());
	}

	@Test
	@DisplayName("Record 2341: ZIP is 14623")
	void ZIPOfRecord2341() {
		assertEquals("14623", customers.get(2340).getZIP());
	}

	@Test
	@DisplayName("Record 2341: Phone is 585-424-7040")
	void PhoneOfRecord2341() {
		assertEquals("585-424-7040", customers.get(2340).getPhone());
	}

	@Test
	@DisplayName("Record 2341: Fax is 585-424-3465")
	void FaxOfRecord2341() {
		assertEquals("585-424-3465", customers.get(2340).getFax());
	}

	@Test
	@DisplayName("Record 2341: Email is darell@ballon.com")
	void EmailOfRecord2341() {
		assertEquals("darell@ballon.com", customers.get(2340).getEmail());
	}

	@Test
	@DisplayName("Record 2341: Web is http://www.darellballon.com")
	void WebOfRecord2341() {
		assertEquals("http://www.darellballon.com", customers.get(2340).getWeb());
	}
}
