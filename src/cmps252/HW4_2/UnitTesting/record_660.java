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

@Tag("48")
class Record_660 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 660: FirstName is Sal")
	void FirstNameOfRecord660() {
		assertEquals("Sal", customers.get(659).getFirstName());
	}

	@Test
	@DisplayName("Record 660: LastName is Madge")
	void LastNameOfRecord660() {
		assertEquals("Madge", customers.get(659).getLastName());
	}

	@Test
	@DisplayName("Record 660: Company is Link Federal Credit Union")
	void CompanyOfRecord660() {
		assertEquals("Link Federal Credit Union", customers.get(659).getCompany());
	}

	@Test
	@DisplayName("Record 660: Address is 467 W Patrick St")
	void AddressOfRecord660() {
		assertEquals("467 W Patrick St", customers.get(659).getAddress());
	}

	@Test
	@DisplayName("Record 660: City is Frederick")
	void CityOfRecord660() {
		assertEquals("Frederick", customers.get(659).getCity());
	}

	@Test
	@DisplayName("Record 660: County is Frederick")
	void CountyOfRecord660() {
		assertEquals("Frederick", customers.get(659).getCounty());
	}

	@Test
	@DisplayName("Record 660: State is MD")
	void StateOfRecord660() {
		assertEquals("MD", customers.get(659).getState());
	}

	@Test
	@DisplayName("Record 660: ZIP is 21701")
	void ZIPOfRecord660() {
		assertEquals("21701", customers.get(659).getZIP());
	}

	@Test
	@DisplayName("Record 660: Phone is 301-663-6713")
	void PhoneOfRecord660() {
		assertEquals("301-663-6713", customers.get(659).getPhone());
	}

	@Test
	@DisplayName("Record 660: Fax is 301-663-7811")
	void FaxOfRecord660() {
		assertEquals("301-663-7811", customers.get(659).getFax());
	}

	@Test
	@DisplayName("Record 660: Email is sal@madge.com")
	void EmailOfRecord660() {
		assertEquals("sal@madge.com", customers.get(659).getEmail());
	}

	@Test
	@DisplayName("Record 660: Web is http://www.salmadge.com")
	void WebOfRecord660() {
		assertEquals("http://www.salmadge.com", customers.get(659).getWeb());
	}
}
