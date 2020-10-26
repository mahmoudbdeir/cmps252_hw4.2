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
class Record_2519 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2519: FirstName is Mose")
	void FirstNameOfRecord2519() {
		assertEquals("Mose", customers.get(2518).getFirstName());
	}

	@Test
	@DisplayName("Record 2519: LastName is Bozell")
	void LastNameOfRecord2519() {
		assertEquals("Bozell", customers.get(2518).getLastName());
	}

	@Test
	@DisplayName("Record 2519: Company is Bozzuto, Elizabeth A Esq")
	void CompanyOfRecord2519() {
		assertEquals("Bozzuto, Elizabeth A Esq", customers.get(2518).getCompany());
	}

	@Test
	@DisplayName("Record 2519: Address is 1425 Nw 88th Ave")
	void AddressOfRecord2519() {
		assertEquals("1425 Nw 88th Ave", customers.get(2518).getAddress());
	}

	@Test
	@DisplayName("Record 2519: City is Miami")
	void CityOfRecord2519() {
		assertEquals("Miami", customers.get(2518).getCity());
	}

	@Test
	@DisplayName("Record 2519: County is Miami-Dade")
	void CountyOfRecord2519() {
		assertEquals("Miami-Dade", customers.get(2518).getCounty());
	}

	@Test
	@DisplayName("Record 2519: State is FL")
	void StateOfRecord2519() {
		assertEquals("FL", customers.get(2518).getState());
	}

	@Test
	@DisplayName("Record 2519: ZIP is 33172")
	void ZIPOfRecord2519() {
		assertEquals("33172", customers.get(2518).getZIP());
	}

	@Test
	@DisplayName("Record 2519: Phone is 305-594-7182")
	void PhoneOfRecord2519() {
		assertEquals("305-594-7182", customers.get(2518).getPhone());
	}

	@Test
	@DisplayName("Record 2519: Fax is 305-594-4351")
	void FaxOfRecord2519() {
		assertEquals("305-594-4351", customers.get(2518).getFax());
	}

	@Test
	@DisplayName("Record 2519: Email is mose@bozell.com")
	void EmailOfRecord2519() {
		assertEquals("mose@bozell.com", customers.get(2518).getEmail());
	}

	@Test
	@DisplayName("Record 2519: Web is http://www.mosebozell.com")
	void WebOfRecord2519() {
		assertEquals("http://www.mosebozell.com", customers.get(2518).getWeb());
	}
}
