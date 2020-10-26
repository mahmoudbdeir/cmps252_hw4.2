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

@Tag("42")
class Record_2158 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2158: FirstName is Lacy")
	void FirstNameOfRecord2158() {
		assertEquals("Lacy", customers.get(2157).getFirstName());
	}

	@Test
	@DisplayName("Record 2158: LastName is Penta")
	void LastNameOfRecord2158() {
		assertEquals("Penta", customers.get(2157).getLastName());
	}

	@Test
	@DisplayName("Record 2158: Company is Silver Wallcovering Inc")
	void CompanyOfRecord2158() {
		assertEquals("Silver Wallcovering Inc", customers.get(2157).getCompany());
	}

	@Test
	@DisplayName("Record 2158: Address is 28290m 60 E")
	void AddressOfRecord2158() {
		assertEquals("28290m 60 E", customers.get(2157).getAddress());
	}

	@Test
	@DisplayName("Record 2158: City is Homer")
	void CityOfRecord2158() {
		assertEquals("Homer", customers.get(2157).getCity());
	}

	@Test
	@DisplayName("Record 2158: County is Calhoun")
	void CountyOfRecord2158() {
		assertEquals("Calhoun", customers.get(2157).getCounty());
	}

	@Test
	@DisplayName("Record 2158: State is MI")
	void StateOfRecord2158() {
		assertEquals("MI", customers.get(2157).getState());
	}

	@Test
	@DisplayName("Record 2158: ZIP is 49245")
	void ZIPOfRecord2158() {
		assertEquals("49245", customers.get(2157).getZIP());
	}

	@Test
	@DisplayName("Record 2158: Phone is 517-568-5231")
	void PhoneOfRecord2158() {
		assertEquals("517-568-5231", customers.get(2157).getPhone());
	}

	@Test
	@DisplayName("Record 2158: Fax is 517-568-2619")
	void FaxOfRecord2158() {
		assertEquals("517-568-2619", customers.get(2157).getFax());
	}

	@Test
	@DisplayName("Record 2158: Email is lacy@penta.com")
	void EmailOfRecord2158() {
		assertEquals("lacy@penta.com", customers.get(2157).getEmail());
	}

	@Test
	@DisplayName("Record 2158: Web is http://www.lacypenta.com")
	void WebOfRecord2158() {
		assertEquals("http://www.lacypenta.com", customers.get(2157).getWeb());
	}
}
