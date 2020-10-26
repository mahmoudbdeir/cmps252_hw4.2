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

@Tag("22")
class Record_507 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 507: FirstName is Gina")
	void FirstNameOfRecord507() {
		assertEquals("Gina", customers.get(506).getFirstName());
	}

	@Test
	@DisplayName("Record 507: LastName is Pirolli")
	void LastNameOfRecord507() {
		assertEquals("Pirolli", customers.get(506).getLastName());
	}

	@Test
	@DisplayName("Record 507: Company is Presentations South Inc")
	void CompanyOfRecord507() {
		assertEquals("Presentations South Inc", customers.get(506).getCompany());
	}

	@Test
	@DisplayName("Record 507: Address is 26556 Redhawk Ln")
	void AddressOfRecord507() {
		assertEquals("26556 Redhawk Ln", customers.get(506).getAddress());
	}

	@Test
	@DisplayName("Record 507: City is Clovis")
	void CityOfRecord507() {
		assertEquals("Clovis", customers.get(506).getCity());
	}

	@Test
	@DisplayName("Record 507: County is Fresno")
	void CountyOfRecord507() {
		assertEquals("Fresno", customers.get(506).getCounty());
	}

	@Test
	@DisplayName("Record 507: State is CA")
	void StateOfRecord507() {
		assertEquals("CA", customers.get(506).getState());
	}

	@Test
	@DisplayName("Record 507: ZIP is 93611")
	void ZIPOfRecord507() {
		assertEquals("93611", customers.get(506).getZIP());
	}

	@Test
	@DisplayName("Record 507: Phone is 559-244-7105")
	void PhoneOfRecord507() {
		assertEquals("559-244-7105", customers.get(506).getPhone());
	}

	@Test
	@DisplayName("Record 507: Fax is 559-244-9415")
	void FaxOfRecord507() {
		assertEquals("559-244-9415", customers.get(506).getFax());
	}

	@Test
	@DisplayName("Record 507: Email is gina@pirolli.com")
	void EmailOfRecord507() {
		assertEquals("gina@pirolli.com", customers.get(506).getEmail());
	}

	@Test
	@DisplayName("Record 507: Web is http://www.ginapirolli.com")
	void WebOfRecord507() {
		assertEquals("http://www.ginapirolli.com", customers.get(506).getWeb());
	}
}
