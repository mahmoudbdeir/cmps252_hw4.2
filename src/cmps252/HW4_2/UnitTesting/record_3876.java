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

@Tag("19")
class Record_3876 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3876: FirstName is Jennie")
	void FirstNameOfRecord3876() {
		assertEquals("Jennie", customers.get(3875).getFirstName());
	}

	@Test
	@DisplayName("Record 3876: LastName is Millen")
	void LastNameOfRecord3876() {
		assertEquals("Millen", customers.get(3875).getLastName());
	}

	@Test
	@DisplayName("Record 3876: Company is Petree Press Instant Printing")
	void CompanyOfRecord3876() {
		assertEquals("Petree Press Instant Printing", customers.get(3875).getCompany());
	}

	@Test
	@DisplayName("Record 3876: Address is 2 Palo Alto Sq")
	void AddressOfRecord3876() {
		assertEquals("2 Palo Alto Sq", customers.get(3875).getAddress());
	}

	@Test
	@DisplayName("Record 3876: City is Palo Alto")
	void CityOfRecord3876() {
		assertEquals("Palo Alto", customers.get(3875).getCity());
	}

	@Test
	@DisplayName("Record 3876: County is Santa Clara")
	void CountyOfRecord3876() {
		assertEquals("Santa Clara", customers.get(3875).getCounty());
	}

	@Test
	@DisplayName("Record 3876: State is CA")
	void StateOfRecord3876() {
		assertEquals("CA", customers.get(3875).getState());
	}

	@Test
	@DisplayName("Record 3876: ZIP is 94306")
	void ZIPOfRecord3876() {
		assertEquals("94306", customers.get(3875).getZIP());
	}

	@Test
	@DisplayName("Record 3876: Phone is 650-494-4120")
	void PhoneOfRecord3876() {
		assertEquals("650-494-4120", customers.get(3875).getPhone());
	}

	@Test
	@DisplayName("Record 3876: Fax is 650-494-2076")
	void FaxOfRecord3876() {
		assertEquals("650-494-2076", customers.get(3875).getFax());
	}

	@Test
	@DisplayName("Record 3876: Email is jennie@millen.com")
	void EmailOfRecord3876() {
		assertEquals("jennie@millen.com", customers.get(3875).getEmail());
	}

	@Test
	@DisplayName("Record 3876: Web is http://www.jenniemillen.com")
	void WebOfRecord3876() {
		assertEquals("http://www.jenniemillen.com", customers.get(3875).getWeb());
	}
}
