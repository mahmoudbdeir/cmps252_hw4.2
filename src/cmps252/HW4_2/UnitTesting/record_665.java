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

@Tag("45")
class Record_665 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 665: FirstName is Quincy")
	void FirstNameOfRecord665() {
		assertEquals("Quincy", customers.get(664).getFirstName());
	}

	@Test
	@DisplayName("Record 665: LastName is Lebaron")
	void LastNameOfRecord665() {
		assertEquals("Lebaron", customers.get(664).getLastName());
	}

	@Test
	@DisplayName("Record 665: Company is Ymca Camp Lakewood & Trout Ldg")
	void CompanyOfRecord665() {
		assertEquals("Ymca Camp Lakewood & Trout Ldg", customers.get(664).getCompany());
	}

	@Test
	@DisplayName("Record 665: Address is 6706 Benjamin Rd  #-200")
	void AddressOfRecord665() {
		assertEquals("6706 Benjamin Rd  #-200", customers.get(664).getAddress());
	}

	@Test
	@DisplayName("Record 665: City is Tampa")
	void CityOfRecord665() {
		assertEquals("Tampa", customers.get(664).getCity());
	}

	@Test
	@DisplayName("Record 665: County is Hillsborough")
	void CountyOfRecord665() {
		assertEquals("Hillsborough", customers.get(664).getCounty());
	}

	@Test
	@DisplayName("Record 665: State is FL")
	void StateOfRecord665() {
		assertEquals("FL", customers.get(664).getState());
	}

	@Test
	@DisplayName("Record 665: ZIP is 33634")
	void ZIPOfRecord665() {
		assertEquals("33634", customers.get(664).getZIP());
	}

	@Test
	@DisplayName("Record 665: Phone is 813-249-0872")
	void PhoneOfRecord665() {
		assertEquals("813-249-0872", customers.get(664).getPhone());
	}

	@Test
	@DisplayName("Record 665: Fax is 813-249-3046")
	void FaxOfRecord665() {
		assertEquals("813-249-3046", customers.get(664).getFax());
	}

	@Test
	@DisplayName("Record 665: Email is quincy@lebaron.com")
	void EmailOfRecord665() {
		assertEquals("quincy@lebaron.com", customers.get(664).getEmail());
	}

	@Test
	@DisplayName("Record 665: Web is http://www.quincylebaron.com")
	void WebOfRecord665() {
		assertEquals("http://www.quincylebaron.com", customers.get(664).getWeb());
	}
}
