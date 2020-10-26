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

@Tag("2")
class Record_3710 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3710: FirstName is Noreen")
	void FirstNameOfRecord3710() {
		assertEquals("Noreen", customers.get(3709).getFirstName());
	}

	@Test
	@DisplayName("Record 3710: LastName is Raynor")
	void LastNameOfRecord3710() {
		assertEquals("Raynor", customers.get(3709).getLastName());
	}

	@Test
	@DisplayName("Record 3710: Company is Rosalyn Moss Travel")
	void CompanyOfRecord3710() {
		assertEquals("Rosalyn Moss Travel", customers.get(3709).getCompany());
	}

	@Test
	@DisplayName("Record 3710: Address is 44777 S Grimmer Blvd  #-c")
	void AddressOfRecord3710() {
		assertEquals("44777 S Grimmer Blvd  #-c", customers.get(3709).getAddress());
	}

	@Test
	@DisplayName("Record 3710: City is Fremont")
	void CityOfRecord3710() {
		assertEquals("Fremont", customers.get(3709).getCity());
	}

	@Test
	@DisplayName("Record 3710: County is Alameda")
	void CountyOfRecord3710() {
		assertEquals("Alameda", customers.get(3709).getCounty());
	}

	@Test
	@DisplayName("Record 3710: State is CA")
	void StateOfRecord3710() {
		assertEquals("CA", customers.get(3709).getState());
	}

	@Test
	@DisplayName("Record 3710: ZIP is 94538")
	void ZIPOfRecord3710() {
		assertEquals("94538", customers.get(3709).getZIP());
	}

	@Test
	@DisplayName("Record 3710: Phone is 510-794-0403")
	void PhoneOfRecord3710() {
		assertEquals("510-794-0403", customers.get(3709).getPhone());
	}

	@Test
	@DisplayName("Record 3710: Fax is 510-794-8116")
	void FaxOfRecord3710() {
		assertEquals("510-794-8116", customers.get(3709).getFax());
	}

	@Test
	@DisplayName("Record 3710: Email is noreen@raynor.com")
	void EmailOfRecord3710() {
		assertEquals("noreen@raynor.com", customers.get(3709).getEmail());
	}

	@Test
	@DisplayName("Record 3710: Web is http://www.noreenraynor.com")
	void WebOfRecord3710() {
		assertEquals("http://www.noreenraynor.com", customers.get(3709).getWeb());
	}
}
