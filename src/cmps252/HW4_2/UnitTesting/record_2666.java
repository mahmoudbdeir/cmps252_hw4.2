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

@Tag("4")
class Record_2666 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2666: FirstName is Helena")
	void FirstNameOfRecord2666() {
		assertEquals("Helena", customers.get(2665).getFirstName());
	}

	@Test
	@DisplayName("Record 2666: LastName is Wadas")
	void LastNameOfRecord2666() {
		assertEquals("Wadas", customers.get(2665).getLastName());
	}

	@Test
	@DisplayName("Record 2666: Company is Smith, Beverly Esq")
	void CompanyOfRecord2666() {
		assertEquals("Smith, Beverly Esq", customers.get(2665).getCompany());
	}

	@Test
	@DisplayName("Record 2666: Address is 111 Nw 21st Ave")
	void AddressOfRecord2666() {
		assertEquals("111 Nw 21st Ave", customers.get(2665).getAddress());
	}

	@Test
	@DisplayName("Record 2666: City is Portland")
	void CityOfRecord2666() {
		assertEquals("Portland", customers.get(2665).getCity());
	}

	@Test
	@DisplayName("Record 2666: County is Multnomah")
	void CountyOfRecord2666() {
		assertEquals("Multnomah", customers.get(2665).getCounty());
	}

	@Test
	@DisplayName("Record 2666: State is OR")
	void StateOfRecord2666() {
		assertEquals("OR", customers.get(2665).getState());
	}

	@Test
	@DisplayName("Record 2666: ZIP is 97209")
	void ZIPOfRecord2666() {
		assertEquals("97209", customers.get(2665).getZIP());
	}

	@Test
	@DisplayName("Record 2666: Phone is 503-222-7118")
	void PhoneOfRecord2666() {
		assertEquals("503-222-7118", customers.get(2665).getPhone());
	}

	@Test
	@DisplayName("Record 2666: Fax is 503-222-7789")
	void FaxOfRecord2666() {
		assertEquals("503-222-7789", customers.get(2665).getFax());
	}

	@Test
	@DisplayName("Record 2666: Email is helena@wadas.com")
	void EmailOfRecord2666() {
		assertEquals("helena@wadas.com", customers.get(2665).getEmail());
	}

	@Test
	@DisplayName("Record 2666: Web is http://www.helenawadas.com")
	void WebOfRecord2666() {
		assertEquals("http://www.helenawadas.com", customers.get(2665).getWeb());
	}
}
