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

@Tag("21")
class Record_4195 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4195: FirstName is Wilhelmina")
	void FirstNameOfRecord4195() {
		assertEquals("Wilhelmina", customers.get(4194).getFirstName());
	}

	@Test
	@DisplayName("Record 4195: LastName is Wallenbrock")
	void LastNameOfRecord4195() {
		assertEquals("Wallenbrock", customers.get(4194).getLastName());
	}

	@Test
	@DisplayName("Record 4195: Company is Intrntl Planned Parenthood")
	void CompanyOfRecord4195() {
		assertEquals("Intrntl Planned Parenthood", customers.get(4194).getCompany());
	}

	@Test
	@DisplayName("Record 4195: Address is 476 State Rd 150")
	void AddressOfRecord4195() {
		assertEquals("476 State Rd 150", customers.get(4194).getAddress());
	}

	@Test
	@DisplayName("Record 4195: City is Arroyo Seco")
	void CityOfRecord4195() {
		assertEquals("Arroyo Seco", customers.get(4194).getCity());
	}

	@Test
	@DisplayName("Record 4195: County is Taos")
	void CountyOfRecord4195() {
		assertEquals("Taos", customers.get(4194).getCounty());
	}

	@Test
	@DisplayName("Record 4195: State is NM")
	void StateOfRecord4195() {
		assertEquals("NM", customers.get(4194).getState());
	}

	@Test
	@DisplayName("Record 4195: ZIP is 87514")
	void ZIPOfRecord4195() {
		assertEquals("87514", customers.get(4194).getZIP());
	}

	@Test
	@DisplayName("Record 4195: Phone is 505-776-2665")
	void PhoneOfRecord4195() {
		assertEquals("505-776-2665", customers.get(4194).getPhone());
	}

	@Test
	@DisplayName("Record 4195: Fax is 505-776-5371")
	void FaxOfRecord4195() {
		assertEquals("505-776-5371", customers.get(4194).getFax());
	}

	@Test
	@DisplayName("Record 4195: Email is wilhelmina@wallenbrock.com")
	void EmailOfRecord4195() {
		assertEquals("wilhelmina@wallenbrock.com", customers.get(4194).getEmail());
	}

	@Test
	@DisplayName("Record 4195: Web is http://www.wilhelminawallenbrock.com")
	void WebOfRecord4195() {
		assertEquals("http://www.wilhelminawallenbrock.com", customers.get(4194).getWeb());
	}
}
