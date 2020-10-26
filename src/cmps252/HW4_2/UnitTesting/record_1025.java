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

@Tag("26")
class Record_1025 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1025: FirstName is Merlin")
	void FirstNameOfRecord1025() {
		assertEquals("Merlin", customers.get(1024).getFirstName());
	}

	@Test
	@DisplayName("Record 1025: LastName is Sola")
	void LastNameOfRecord1025() {
		assertEquals("Sola", customers.get(1024).getLastName());
	}

	@Test
	@DisplayName("Record 1025: Company is J & P Furniture Inc")
	void CompanyOfRecord1025() {
		assertEquals("J & P Furniture Inc", customers.get(1024).getCompany());
	}

	@Test
	@DisplayName("Record 1025: Address is 720 South St")
	void AddressOfRecord1025() {
		assertEquals("720 South St", customers.get(1024).getAddress());
	}

	@Test
	@DisplayName("Record 1025: City is Honolulu")
	void CityOfRecord1025() {
		assertEquals("Honolulu", customers.get(1024).getCity());
	}

	@Test
	@DisplayName("Record 1025: County is Honolulu")
	void CountyOfRecord1025() {
		assertEquals("Honolulu", customers.get(1024).getCounty());
	}

	@Test
	@DisplayName("Record 1025: State is HI")
	void StateOfRecord1025() {
		assertEquals("HI", customers.get(1024).getState());
	}

	@Test
	@DisplayName("Record 1025: ZIP is 96813")
	void ZIPOfRecord1025() {
		assertEquals("96813", customers.get(1024).getZIP());
	}

	@Test
	@DisplayName("Record 1025: Phone is 808-533-4227")
	void PhoneOfRecord1025() {
		assertEquals("808-533-4227", customers.get(1024).getPhone());
	}

	@Test
	@DisplayName("Record 1025: Fax is 808-533-4806")
	void FaxOfRecord1025() {
		assertEquals("808-533-4806", customers.get(1024).getFax());
	}

	@Test
	@DisplayName("Record 1025: Email is merlin@sola.com")
	void EmailOfRecord1025() {
		assertEquals("merlin@sola.com", customers.get(1024).getEmail());
	}

	@Test
	@DisplayName("Record 1025: Web is http://www.merlinsola.com")
	void WebOfRecord1025() {
		assertEquals("http://www.merlinsola.com", customers.get(1024).getWeb());
	}
}
