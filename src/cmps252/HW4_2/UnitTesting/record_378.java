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

@Tag("3")
class Record_378 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 378: FirstName is Lucia")
	void FirstNameOfRecord378() {
		assertEquals("Lucia", customers.get(377).getFirstName());
	}

	@Test
	@DisplayName("Record 378: LastName is Mellom")
	void LastNameOfRecord378() {
		assertEquals("Mellom", customers.get(377).getLastName());
	}

	@Test
	@DisplayName("Record 378: Company is Bonners Ferry Grain Co")
	void CompanyOfRecord378() {
		assertEquals("Bonners Ferry Grain Co", customers.get(377).getCompany());
	}

	@Test
	@DisplayName("Record 378: Address is 1717 Solano Way  #-15")
	void AddressOfRecord378() {
		assertEquals("1717 Solano Way  #-15", customers.get(377).getAddress());
	}

	@Test
	@DisplayName("Record 378: City is Concord")
	void CityOfRecord378() {
		assertEquals("Concord", customers.get(377).getCity());
	}

	@Test
	@DisplayName("Record 378: County is Contra Costa")
	void CountyOfRecord378() {
		assertEquals("Contra Costa", customers.get(377).getCounty());
	}

	@Test
	@DisplayName("Record 378: State is CA")
	void StateOfRecord378() {
		assertEquals("CA", customers.get(377).getState());
	}

	@Test
	@DisplayName("Record 378: ZIP is 94520")
	void ZIPOfRecord378() {
		assertEquals("94520", customers.get(377).getZIP());
	}

	@Test
	@DisplayName("Record 378: Phone is 925-827-2771")
	void PhoneOfRecord378() {
		assertEquals("925-827-2771", customers.get(377).getPhone());
	}

	@Test
	@DisplayName("Record 378: Fax is 925-827-7829")
	void FaxOfRecord378() {
		assertEquals("925-827-7829", customers.get(377).getFax());
	}

	@Test
	@DisplayName("Record 378: Email is lucia@mellom.com")
	void EmailOfRecord378() {
		assertEquals("lucia@mellom.com", customers.get(377).getEmail());
	}

	@Test
	@DisplayName("Record 378: Web is http://www.luciamellom.com")
	void WebOfRecord378() {
		assertEquals("http://www.luciamellom.com", customers.get(377).getWeb());
	}
}
