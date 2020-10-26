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

@Tag("18")
class Record_1957 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1957: FirstName is Clarence")
	void FirstNameOfRecord1957() {
		assertEquals("Clarence", customers.get(1956).getFirstName());
	}

	@Test
	@DisplayName("Record 1957: LastName is Miralles")
	void LastNameOfRecord1957() {
		assertEquals("Miralles", customers.get(1956).getLastName());
	}

	@Test
	@DisplayName("Record 1957: Company is Glenmede Trust Co")
	void CompanyOfRecord1957() {
		assertEquals("Glenmede Trust Co", customers.get(1956).getCompany());
	}

	@Test
	@DisplayName("Record 1957: Address is 4671 Calle Carga")
	void AddressOfRecord1957() {
		assertEquals("4671 Calle Carga", customers.get(1956).getAddress());
	}

	@Test
	@DisplayName("Record 1957: City is Camarillo")
	void CityOfRecord1957() {
		assertEquals("Camarillo", customers.get(1956).getCity());
	}

	@Test
	@DisplayName("Record 1957: County is Ventura")
	void CountyOfRecord1957() {
		assertEquals("Ventura", customers.get(1956).getCounty());
	}

	@Test
	@DisplayName("Record 1957: State is CA")
	void StateOfRecord1957() {
		assertEquals("CA", customers.get(1956).getState());
	}

	@Test
	@DisplayName("Record 1957: ZIP is 93012")
	void ZIPOfRecord1957() {
		assertEquals("93012", customers.get(1956).getZIP());
	}

	@Test
	@DisplayName("Record 1957: Phone is 805-389-7814")
	void PhoneOfRecord1957() {
		assertEquals("805-389-7814", customers.get(1956).getPhone());
	}

	@Test
	@DisplayName("Record 1957: Fax is 805-389-0579")
	void FaxOfRecord1957() {
		assertEquals("805-389-0579", customers.get(1956).getFax());
	}

	@Test
	@DisplayName("Record 1957: Email is clarence@miralles.com")
	void EmailOfRecord1957() {
		assertEquals("clarence@miralles.com", customers.get(1956).getEmail());
	}

	@Test
	@DisplayName("Record 1957: Web is http://www.clarencemiralles.com")
	void WebOfRecord1957() {
		assertEquals("http://www.clarencemiralles.com", customers.get(1956).getWeb());
	}
}
