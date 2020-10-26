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
class Record_2495 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2495: FirstName is Jasmine")
	void FirstNameOfRecord2495() {
		assertEquals("Jasmine", customers.get(2494).getFirstName());
	}

	@Test
	@DisplayName("Record 2495: LastName is Floor")
	void LastNameOfRecord2495() {
		assertEquals("Floor", customers.get(2494).getLastName());
	}

	@Test
	@DisplayName("Record 2495: Company is Tri Meg Systems Inc")
	void CompanyOfRecord2495() {
		assertEquals("Tri Meg Systems Inc", customers.get(2494).getCompany());
	}

	@Test
	@DisplayName("Record 2495: Address is 520 Elm St")
	void AddressOfRecord2495() {
		assertEquals("520 Elm St", customers.get(2494).getAddress());
	}

	@Test
	@DisplayName("Record 2495: City is West Des Moines")
	void CityOfRecord2495() {
		assertEquals("West Des Moines", customers.get(2494).getCity());
	}

	@Test
	@DisplayName("Record 2495: County is Polk")
	void CountyOfRecord2495() {
		assertEquals("Polk", customers.get(2494).getCounty());
	}

	@Test
	@DisplayName("Record 2495: State is IA")
	void StateOfRecord2495() {
		assertEquals("IA", customers.get(2494).getState());
	}

	@Test
	@DisplayName("Record 2495: ZIP is 50265")
	void ZIPOfRecord2495() {
		assertEquals("50265", customers.get(2494).getZIP());
	}

	@Test
	@DisplayName("Record 2495: Phone is 515-277-3471")
	void PhoneOfRecord2495() {
		assertEquals("515-277-3471", customers.get(2494).getPhone());
	}

	@Test
	@DisplayName("Record 2495: Fax is 515-277-8923")
	void FaxOfRecord2495() {
		assertEquals("515-277-8923", customers.get(2494).getFax());
	}

	@Test
	@DisplayName("Record 2495: Email is jasmine@floor.com")
	void EmailOfRecord2495() {
		assertEquals("jasmine@floor.com", customers.get(2494).getEmail());
	}

	@Test
	@DisplayName("Record 2495: Web is http://www.jasminefloor.com")
	void WebOfRecord2495() {
		assertEquals("http://www.jasminefloor.com", customers.get(2494).getWeb());
	}
}
