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
class Record_3171 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3171: FirstName is Jospeh")
	void FirstNameOfRecord3171() {
		assertEquals("Jospeh", customers.get(3170).getFirstName());
	}

	@Test
	@DisplayName("Record 3171: LastName is Vinup")
	void LastNameOfRecord3171() {
		assertEquals("Vinup", customers.get(3170).getLastName());
	}

	@Test
	@DisplayName("Record 3171: Company is Martin Wells Inc")
	void CompanyOfRecord3171() {
		assertEquals("Martin Wells Inc", customers.get(3170).getCompany());
	}

	@Test
	@DisplayName("Record 3171: Address is 1300 Galaxy Way")
	void AddressOfRecord3171() {
		assertEquals("1300 Galaxy Way", customers.get(3170).getAddress());
	}

	@Test
	@DisplayName("Record 3171: City is Concord")
	void CityOfRecord3171() {
		assertEquals("Concord", customers.get(3170).getCity());
	}

	@Test
	@DisplayName("Record 3171: County is Contra Costa")
	void CountyOfRecord3171() {
		assertEquals("Contra Costa", customers.get(3170).getCounty());
	}

	@Test
	@DisplayName("Record 3171: State is CA")
	void StateOfRecord3171() {
		assertEquals("CA", customers.get(3170).getState());
	}

	@Test
	@DisplayName("Record 3171: ZIP is 94520")
	void ZIPOfRecord3171() {
		assertEquals("94520", customers.get(3170).getZIP());
	}

	@Test
	@DisplayName("Record 3171: Phone is 925-685-6019")
	void PhoneOfRecord3171() {
		assertEquals("925-685-6019", customers.get(3170).getPhone());
	}

	@Test
	@DisplayName("Record 3171: Fax is 925-685-7465")
	void FaxOfRecord3171() {
		assertEquals("925-685-7465", customers.get(3170).getFax());
	}

	@Test
	@DisplayName("Record 3171: Email is jospeh@vinup.com")
	void EmailOfRecord3171() {
		assertEquals("jospeh@vinup.com", customers.get(3170).getEmail());
	}

	@Test
	@DisplayName("Record 3171: Web is http://www.jospehvinup.com")
	void WebOfRecord3171() {
		assertEquals("http://www.jospehvinup.com", customers.get(3170).getWeb());
	}
}
