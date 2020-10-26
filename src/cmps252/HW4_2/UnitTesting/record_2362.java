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

@Tag("30")
class Record_2362 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2362: FirstName is Caitlin")
	void FirstNameOfRecord2362() {
		assertEquals("Caitlin", customers.get(2361).getFirstName());
	}

	@Test
	@DisplayName("Record 2362: LastName is Mendola")
	void LastNameOfRecord2362() {
		assertEquals("Mendola", customers.get(2361).getLastName());
	}

	@Test
	@DisplayName("Record 2362: Company is Ask America Market Research")
	void CompanyOfRecord2362() {
		assertEquals("Ask America Market Research", customers.get(2361).getCompany());
	}

	@Test
	@DisplayName("Record 2362: Address is 2919 Valmont Rd  #-209")
	void AddressOfRecord2362() {
		assertEquals("2919 Valmont Rd  #-209", customers.get(2361).getAddress());
	}

	@Test
	@DisplayName("Record 2362: City is Boulder")
	void CityOfRecord2362() {
		assertEquals("Boulder", customers.get(2361).getCity());
	}

	@Test
	@DisplayName("Record 2362: County is Boulder")
	void CountyOfRecord2362() {
		assertEquals("Boulder", customers.get(2361).getCounty());
	}

	@Test
	@DisplayName("Record 2362: State is CO")
	void StateOfRecord2362() {
		assertEquals("CO", customers.get(2361).getState());
	}

	@Test
	@DisplayName("Record 2362: ZIP is 80301")
	void ZIPOfRecord2362() {
		assertEquals("80301", customers.get(2361).getZIP());
	}

	@Test
	@DisplayName("Record 2362: Phone is 303-444-3467")
	void PhoneOfRecord2362() {
		assertEquals("303-444-3467", customers.get(2361).getPhone());
	}

	@Test
	@DisplayName("Record 2362: Fax is 303-444-4253")
	void FaxOfRecord2362() {
		assertEquals("303-444-4253", customers.get(2361).getFax());
	}

	@Test
	@DisplayName("Record 2362: Email is caitlin@mendola.com")
	void EmailOfRecord2362() {
		assertEquals("caitlin@mendola.com", customers.get(2361).getEmail());
	}

	@Test
	@DisplayName("Record 2362: Web is http://www.caitlinmendola.com")
	void WebOfRecord2362() {
		assertEquals("http://www.caitlinmendola.com", customers.get(2361).getWeb());
	}
}
