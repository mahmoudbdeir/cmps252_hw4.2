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
class Record_4984 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4984: FirstName is Jody")
	void FirstNameOfRecord4984() {
		assertEquals("Jody", customers.get(4983).getFirstName());
	}

	@Test
	@DisplayName("Record 4984: LastName is Hughe")
	void LastNameOfRecord4984() {
		assertEquals("Hughe", customers.get(4983).getLastName());
	}

	@Test
	@DisplayName("Record 4984: Company is Nutrition Service Associates")
	void CompanyOfRecord4984() {
		assertEquals("Nutrition Service Associates", customers.get(4983).getCompany());
	}

	@Test
	@DisplayName("Record 4984: Address is 302 Richmond Ct")
	void AddressOfRecord4984() {
		assertEquals("302 Richmond Ct", customers.get(4983).getAddress());
	}

	@Test
	@DisplayName("Record 4984: City is Laredo")
	void CityOfRecord4984() {
		assertEquals("Laredo", customers.get(4983).getCity());
	}

	@Test
	@DisplayName("Record 4984: County is Webb")
	void CountyOfRecord4984() {
		assertEquals("Webb", customers.get(4983).getCounty());
	}

	@Test
	@DisplayName("Record 4984: State is TX")
	void StateOfRecord4984() {
		assertEquals("TX", customers.get(4983).getState());
	}

	@Test
	@DisplayName("Record 4984: ZIP is 78045")
	void ZIPOfRecord4984() {
		assertEquals("78045", customers.get(4983).getZIP());
	}

	@Test
	@DisplayName("Record 4984: Phone is 956-727-2298")
	void PhoneOfRecord4984() {
		assertEquals("956-727-2298", customers.get(4983).getPhone());
	}

	@Test
	@DisplayName("Record 4984: Fax is 956-727-8128")
	void FaxOfRecord4984() {
		assertEquals("956-727-8128", customers.get(4983).getFax());
	}

	@Test
	@DisplayName("Record 4984: Email is jody@hughe.com")
	void EmailOfRecord4984() {
		assertEquals("jody@hughe.com", customers.get(4983).getEmail());
	}

	@Test
	@DisplayName("Record 4984: Web is http://www.jodyhughe.com")
	void WebOfRecord4984() {
		assertEquals("http://www.jodyhughe.com", customers.get(4983).getWeb());
	}
}
