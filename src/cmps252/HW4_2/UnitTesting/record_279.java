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

@Tag("24")
class Record_279 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 279: FirstName is Carlton")
	void FirstNameOfRecord279() {
		assertEquals("Carlton", customers.get(278).getFirstName());
	}

	@Test
	@DisplayName("Record 279: LastName is Espeland")
	void LastNameOfRecord279() {
		assertEquals("Espeland", customers.get(278).getLastName());
	}

	@Test
	@DisplayName("Record 279: Company is Unique Metal Products")
	void CompanyOfRecord279() {
		assertEquals("Unique Metal Products", customers.get(278).getCompany());
	}

	@Test
	@DisplayName("Record 279: Address is 25 Brooklyn Terminal Mkt")
	void AddressOfRecord279() {
		assertEquals("25 Brooklyn Terminal Mkt", customers.get(278).getAddress());
	}

	@Test
	@DisplayName("Record 279: City is Brooklyn")
	void CityOfRecord279() {
		assertEquals("Brooklyn", customers.get(278).getCity());
	}

	@Test
	@DisplayName("Record 279: County is Kings")
	void CountyOfRecord279() {
		assertEquals("Kings", customers.get(278).getCounty());
	}

	@Test
	@DisplayName("Record 279: State is NY")
	void StateOfRecord279() {
		assertEquals("NY", customers.get(278).getState());
	}

	@Test
	@DisplayName("Record 279: ZIP is 11236")
	void ZIPOfRecord279() {
		assertEquals("11236", customers.get(278).getZIP());
	}

	@Test
	@DisplayName("Record 279: Phone is 718-209-1961")
	void PhoneOfRecord279() {
		assertEquals("718-209-1961", customers.get(278).getPhone());
	}

	@Test
	@DisplayName("Record 279: Fax is 718-209-5049")
	void FaxOfRecord279() {
		assertEquals("718-209-5049", customers.get(278).getFax());
	}

	@Test
	@DisplayName("Record 279: Email is carlton@espeland.com")
	void EmailOfRecord279() {
		assertEquals("carlton@espeland.com", customers.get(278).getEmail());
	}

	@Test
	@DisplayName("Record 279: Web is http://www.carltonespeland.com")
	void WebOfRecord279() {
		assertEquals("http://www.carltonespeland.com", customers.get(278).getWeb());
	}
}
