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
class Record_1803 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1803: FirstName is Sydney")
	void FirstNameOfRecord1803() {
		assertEquals("Sydney", customers.get(1802).getFirstName());
	}

	@Test
	@DisplayName("Record 1803: LastName is Pantano")
	void LastNameOfRecord1803() {
		assertEquals("Pantano", customers.get(1802).getLastName());
	}

	@Test
	@DisplayName("Record 1803: Company is Johnson, William E Ls")
	void CompanyOfRecord1803() {
		assertEquals("Johnson, William E Ls", customers.get(1802).getCompany());
	}

	@Test
	@DisplayName("Record 1803: Address is 518 W 67th St")
	void AddressOfRecord1803() {
		assertEquals("518 W 67th St", customers.get(1802).getAddress());
	}

	@Test
	@DisplayName("Record 1803: City is Shreveport")
	void CityOfRecord1803() {
		assertEquals("Shreveport", customers.get(1802).getCity());
	}

	@Test
	@DisplayName("Record 1803: County is Caddo")
	void CountyOfRecord1803() {
		assertEquals("Caddo", customers.get(1802).getCounty());
	}

	@Test
	@DisplayName("Record 1803: State is LA")
	void StateOfRecord1803() {
		assertEquals("LA", customers.get(1802).getState());
	}

	@Test
	@DisplayName("Record 1803: ZIP is 71106")
	void ZIPOfRecord1803() {
		assertEquals("71106", customers.get(1802).getZIP());
	}

	@Test
	@DisplayName("Record 1803: Phone is 318-865-0076")
	void PhoneOfRecord1803() {
		assertEquals("318-865-0076", customers.get(1802).getPhone());
	}

	@Test
	@DisplayName("Record 1803: Fax is 318-865-4312")
	void FaxOfRecord1803() {
		assertEquals("318-865-4312", customers.get(1802).getFax());
	}

	@Test
	@DisplayName("Record 1803: Email is sydney@pantano.com")
	void EmailOfRecord1803() {
		assertEquals("sydney@pantano.com", customers.get(1802).getEmail());
	}

	@Test
	@DisplayName("Record 1803: Web is http://www.sydneypantano.com")
	void WebOfRecord1803() {
		assertEquals("http://www.sydneypantano.com", customers.get(1802).getWeb());
	}
}
