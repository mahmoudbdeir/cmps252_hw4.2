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
class Record_945 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 945: FirstName is Soledad")
	void FirstNameOfRecord945() {
		assertEquals("Soledad", customers.get(944).getFirstName());
	}

	@Test
	@DisplayName("Record 945: LastName is Leer")
	void LastNameOfRecord945() {
		assertEquals("Leer", customers.get(944).getLastName());
	}

	@Test
	@DisplayName("Record 945: Company is Custom Woodcraft Ltd")
	void CompanyOfRecord945() {
		assertEquals("Custom Woodcraft Ltd", customers.get(944).getCompany());
	}

	@Test
	@DisplayName("Record 945: Address is 2050 Peachtree Industrial Ct")
	void AddressOfRecord945() {
		assertEquals("2050 Peachtree Industrial Ct", customers.get(944).getAddress());
	}

	@Test
	@DisplayName("Record 945: City is Atlanta")
	void CityOfRecord945() {
		assertEquals("Atlanta", customers.get(944).getCity());
	}

	@Test
	@DisplayName("Record 945: County is Dekalb")
	void CountyOfRecord945() {
		assertEquals("Dekalb", customers.get(944).getCounty());
	}

	@Test
	@DisplayName("Record 945: State is GA")
	void StateOfRecord945() {
		assertEquals("GA", customers.get(944).getState());
	}

	@Test
	@DisplayName("Record 945: ZIP is 30341")
	void ZIPOfRecord945() {
		assertEquals("30341", customers.get(944).getZIP());
	}

	@Test
	@DisplayName("Record 945: Phone is 770-458-2448")
	void PhoneOfRecord945() {
		assertEquals("770-458-2448", customers.get(944).getPhone());
	}

	@Test
	@DisplayName("Record 945: Fax is 770-458-7928")
	void FaxOfRecord945() {
		assertEquals("770-458-7928", customers.get(944).getFax());
	}

	@Test
	@DisplayName("Record 945: Email is soledad@leer.com")
	void EmailOfRecord945() {
		assertEquals("soledad@leer.com", customers.get(944).getEmail());
	}

	@Test
	@DisplayName("Record 945: Web is http://www.soledadleer.com")
	void WebOfRecord945() {
		assertEquals("http://www.soledadleer.com", customers.get(944).getWeb());
	}
}
