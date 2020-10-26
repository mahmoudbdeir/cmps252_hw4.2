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

@Tag("46")
class Record_1680 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1680: FirstName is Michaela")
	void FirstNameOfRecord1680() {
		assertEquals("Michaela", customers.get(1679).getFirstName());
	}

	@Test
	@DisplayName("Record 1680: LastName is Aipopo")
	void LastNameOfRecord1680() {
		assertEquals("Aipopo", customers.get(1679).getLastName());
	}

	@Test
	@DisplayName("Record 1680: Company is C & L Supply Inc")
	void CompanyOfRecord1680() {
		assertEquals("C & L Supply Inc", customers.get(1679).getCompany());
	}

	@Test
	@DisplayName("Record 1680: Address is 136150 Main")
	void AddressOfRecord1680() {
		assertEquals("136150 Main", customers.get(1679).getAddress());
	}

	@Test
	@DisplayName("Record 1680: City is Princeton")
	void CityOfRecord1680() {
		assertEquals("Princeton", customers.get(1679).getCity());
	}

	@Test
	@DisplayName("Record 1680: County is Mercer")
	void CountyOfRecord1680() {
		assertEquals("Mercer", customers.get(1679).getCounty());
	}

	@Test
	@DisplayName("Record 1680: State is NJ")
	void StateOfRecord1680() {
		assertEquals("NJ", customers.get(1679).getState());
	}

	@Test
	@DisplayName("Record 1680: ZIP is 8540")
	void ZIPOfRecord1680() {
		assertEquals("8540", customers.get(1679).getZIP());
	}

	@Test
	@DisplayName("Record 1680: Phone is 609-951-7833")
	void PhoneOfRecord1680() {
		assertEquals("609-951-7833", customers.get(1679).getPhone());
	}

	@Test
	@DisplayName("Record 1680: Fax is 609-951-5197")
	void FaxOfRecord1680() {
		assertEquals("609-951-5197", customers.get(1679).getFax());
	}

	@Test
	@DisplayName("Record 1680: Email is michaela@aipopo.com")
	void EmailOfRecord1680() {
		assertEquals("michaela@aipopo.com", customers.get(1679).getEmail());
	}

	@Test
	@DisplayName("Record 1680: Web is http://www.michaelaaipopo.com")
	void WebOfRecord1680() {
		assertEquals("http://www.michaelaaipopo.com", customers.get(1679).getWeb());
	}
}
