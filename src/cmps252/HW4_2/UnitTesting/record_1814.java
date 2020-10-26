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

@Tag("35")
class Record_1814 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1814: FirstName is Douglass")
	void FirstNameOfRecord1814() {
		assertEquals("Douglass", customers.get(1813).getFirstName());
	}

	@Test
	@DisplayName("Record 1814: LastName is Negbenebor")
	void LastNameOfRecord1814() {
		assertEquals("Negbenebor", customers.get(1813).getLastName());
	}

	@Test
	@DisplayName("Record 1814: Company is Gallagher, John M Jr")
	void CompanyOfRecord1814() {
		assertEquals("Gallagher, John M Jr", customers.get(1813).getCompany());
	}

	@Test
	@DisplayName("Record 1814: Address is 60 41st Ave")
	void AddressOfRecord1814() {
		assertEquals("60 41st Ave", customers.get(1813).getAddress());
	}

	@Test
	@DisplayName("Record 1814: City is San Mateo")
	void CityOfRecord1814() {
		assertEquals("San Mateo", customers.get(1813).getCity());
	}

	@Test
	@DisplayName("Record 1814: County is San Mateo")
	void CountyOfRecord1814() {
		assertEquals("San Mateo", customers.get(1813).getCounty());
	}

	@Test
	@DisplayName("Record 1814: State is CA")
	void StateOfRecord1814() {
		assertEquals("CA", customers.get(1813).getState());
	}

	@Test
	@DisplayName("Record 1814: ZIP is 94403")
	void ZIPOfRecord1814() {
		assertEquals("94403", customers.get(1813).getZIP());
	}

	@Test
	@DisplayName("Record 1814: Phone is 650-349-4592")
	void PhoneOfRecord1814() {
		assertEquals("650-349-4592", customers.get(1813).getPhone());
	}

	@Test
	@DisplayName("Record 1814: Fax is 650-349-0241")
	void FaxOfRecord1814() {
		assertEquals("650-349-0241", customers.get(1813).getFax());
	}

	@Test
	@DisplayName("Record 1814: Email is douglass@negbenebor.com")
	void EmailOfRecord1814() {
		assertEquals("douglass@negbenebor.com", customers.get(1813).getEmail());
	}

	@Test
	@DisplayName("Record 1814: Web is http://www.douglassnegbenebor.com")
	void WebOfRecord1814() {
		assertEquals("http://www.douglassnegbenebor.com", customers.get(1813).getWeb());
	}
}
