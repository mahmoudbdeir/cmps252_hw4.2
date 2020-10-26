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
class Record_2991 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2991: FirstName is Carlene")
	void FirstNameOfRecord2991() {
		assertEquals("Carlene", customers.get(2990).getFirstName());
	}

	@Test
	@DisplayName("Record 2991: LastName is Winzenried")
	void LastNameOfRecord2991() {
		assertEquals("Winzenried", customers.get(2990).getLastName());
	}

	@Test
	@DisplayName("Record 2991: Company is Albany Co Courts")
	void CompanyOfRecord2991() {
		assertEquals("Albany Co Courts", customers.get(2990).getCompany());
	}

	@Test
	@DisplayName("Record 2991: Address is 584 Middletown Blvd")
	void AddressOfRecord2991() {
		assertEquals("584 Middletown Blvd", customers.get(2990).getAddress());
	}

	@Test
	@DisplayName("Record 2991: City is Langhorne")
	void CityOfRecord2991() {
		assertEquals("Langhorne", customers.get(2990).getCity());
	}

	@Test
	@DisplayName("Record 2991: County is Bucks")
	void CountyOfRecord2991() {
		assertEquals("Bucks", customers.get(2990).getCounty());
	}

	@Test
	@DisplayName("Record 2991: State is PA")
	void StateOfRecord2991() {
		assertEquals("PA", customers.get(2990).getState());
	}

	@Test
	@DisplayName("Record 2991: ZIP is 19047")
	void ZIPOfRecord2991() {
		assertEquals("19047", customers.get(2990).getZIP());
	}

	@Test
	@DisplayName("Record 2991: Phone is 215-702-1833")
	void PhoneOfRecord2991() {
		assertEquals("215-702-1833", customers.get(2990).getPhone());
	}

	@Test
	@DisplayName("Record 2991: Fax is 215-702-7186")
	void FaxOfRecord2991() {
		assertEquals("215-702-7186", customers.get(2990).getFax());
	}

	@Test
	@DisplayName("Record 2991: Email is carlene@winzenried.com")
	void EmailOfRecord2991() {
		assertEquals("carlene@winzenried.com", customers.get(2990).getEmail());
	}

	@Test
	@DisplayName("Record 2991: Web is http://www.carlenewinzenried.com")
	void WebOfRecord2991() {
		assertEquals("http://www.carlenewinzenried.com", customers.get(2990).getWeb());
	}
}
