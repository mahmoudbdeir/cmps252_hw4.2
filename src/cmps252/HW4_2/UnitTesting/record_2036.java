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

@Tag("32")
class Record_2036 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2036: FirstName is Lucille")
	void FirstNameOfRecord2036() {
		assertEquals("Lucille", customers.get(2035).getFirstName());
	}

	@Test
	@DisplayName("Record 2036: LastName is Malichi")
	void LastNameOfRecord2036() {
		assertEquals("Malichi", customers.get(2035).getLastName());
	}

	@Test
	@DisplayName("Record 2036: Company is Portable X Ray Of Southern Nv")
	void CompanyOfRecord2036() {
		assertEquals("Portable X Ray Of Southern Nv", customers.get(2035).getCompany());
	}

	@Test
	@DisplayName("Record 2036: Address is 1460 Chestnut Ave")
	void AddressOfRecord2036() {
		assertEquals("1460 Chestnut Ave", customers.get(2035).getAddress());
	}

	@Test
	@DisplayName("Record 2036: City is Hillside")
	void CityOfRecord2036() {
		assertEquals("Hillside", customers.get(2035).getCity());
	}

	@Test
	@DisplayName("Record 2036: County is Union")
	void CountyOfRecord2036() {
		assertEquals("Union", customers.get(2035).getCounty());
	}

	@Test
	@DisplayName("Record 2036: State is NJ")
	void StateOfRecord2036() {
		assertEquals("NJ", customers.get(2035).getState());
	}

	@Test
	@DisplayName("Record 2036: ZIP is 7205")
	void ZIPOfRecord2036() {
		assertEquals("7205", customers.get(2035).getZIP());
	}

	@Test
	@DisplayName("Record 2036: Phone is 908-964-5217")
	void PhoneOfRecord2036() {
		assertEquals("908-964-5217", customers.get(2035).getPhone());
	}

	@Test
	@DisplayName("Record 2036: Fax is 908-964-9201")
	void FaxOfRecord2036() {
		assertEquals("908-964-9201", customers.get(2035).getFax());
	}

	@Test
	@DisplayName("Record 2036: Email is lucille@malichi.com")
	void EmailOfRecord2036() {
		assertEquals("lucille@malichi.com", customers.get(2035).getEmail());
	}

	@Test
	@DisplayName("Record 2036: Web is http://www.lucillemalichi.com")
	void WebOfRecord2036() {
		assertEquals("http://www.lucillemalichi.com", customers.get(2035).getWeb());
	}
}
