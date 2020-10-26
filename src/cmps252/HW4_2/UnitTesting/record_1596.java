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

@Tag("43")
class Record_1596 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1596: FirstName is Tera")
	void FirstNameOfRecord1596() {
		assertEquals("Tera", customers.get(1595).getFirstName());
	}

	@Test
	@DisplayName("Record 1596: LastName is Norise")
	void LastNameOfRecord1596() {
		assertEquals("Norise", customers.get(1595).getLastName());
	}

	@Test
	@DisplayName("Record 1596: Company is Solymani")
	void CompanyOfRecord1596() {
		assertEquals("Solymani", customers.get(1595).getCompany());
	}

	@Test
	@DisplayName("Record 1596: Address is 725 Railroad Ave")
	void AddressOfRecord1596() {
		assertEquals("725 Railroad Ave", customers.get(1595).getAddress());
	}

	@Test
	@DisplayName("Record 1596: City is West Des Moines")
	void CityOfRecord1596() {
		assertEquals("West Des Moines", customers.get(1595).getCity());
	}

	@Test
	@DisplayName("Record 1596: County is Polk")
	void CountyOfRecord1596() {
		assertEquals("Polk", customers.get(1595).getCounty());
	}

	@Test
	@DisplayName("Record 1596: State is IA")
	void StateOfRecord1596() {
		assertEquals("IA", customers.get(1595).getState());
	}

	@Test
	@DisplayName("Record 1596: ZIP is 50265")
	void ZIPOfRecord1596() {
		assertEquals("50265", customers.get(1595).getZIP());
	}

	@Test
	@DisplayName("Record 1596: Phone is 515-277-8462")
	void PhoneOfRecord1596() {
		assertEquals("515-277-8462", customers.get(1595).getPhone());
	}

	@Test
	@DisplayName("Record 1596: Fax is 515-277-2508")
	void FaxOfRecord1596() {
		assertEquals("515-277-2508", customers.get(1595).getFax());
	}

	@Test
	@DisplayName("Record 1596: Email is tera@norise.com")
	void EmailOfRecord1596() {
		assertEquals("tera@norise.com", customers.get(1595).getEmail());
	}

	@Test
	@DisplayName("Record 1596: Web is http://www.teranorise.com")
	void WebOfRecord1596() {
		assertEquals("http://www.teranorise.com", customers.get(1595).getWeb());
	}
}
