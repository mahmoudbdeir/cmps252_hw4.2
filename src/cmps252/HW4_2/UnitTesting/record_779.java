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

@Tag("32")
class Record_779 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 779: FirstName is Foster")
	void FirstNameOfRecord779() {
		assertEquals("Foster", customers.get(778).getFirstName());
	}

	@Test
	@DisplayName("Record 779: LastName is Vy")
	void LastNameOfRecord779() {
		assertEquals("Vy", customers.get(778).getLastName());
	}

	@Test
	@DisplayName("Record 779: Company is Coldspring Hearts & Flowers")
	void CompanyOfRecord779() {
		assertEquals("Coldspring Hearts & Flowers", customers.get(778).getCompany());
	}

	@Test
	@DisplayName("Record 779: Address is 3839 W Sahara Ave")
	void AddressOfRecord779() {
		assertEquals("3839 W Sahara Ave", customers.get(778).getAddress());
	}

	@Test
	@DisplayName("Record 779: City is Las Vegas")
	void CityOfRecord779() {
		assertEquals("Las Vegas", customers.get(778).getCity());
	}

	@Test
	@DisplayName("Record 779: County is Clark")
	void CountyOfRecord779() {
		assertEquals("Clark", customers.get(778).getCounty());
	}

	@Test
	@DisplayName("Record 779: State is NV")
	void StateOfRecord779() {
		assertEquals("NV", customers.get(778).getState());
	}

	@Test
	@DisplayName("Record 779: ZIP is 89102")
	void ZIPOfRecord779() {
		assertEquals("89102", customers.get(778).getZIP());
	}

	@Test
	@DisplayName("Record 779: Phone is 702-221-4379")
	void PhoneOfRecord779() {
		assertEquals("702-221-4379", customers.get(778).getPhone());
	}

	@Test
	@DisplayName("Record 779: Fax is 702-221-6827")
	void FaxOfRecord779() {
		assertEquals("702-221-6827", customers.get(778).getFax());
	}

	@Test
	@DisplayName("Record 779: Email is foster@vy.com")
	void EmailOfRecord779() {
		assertEquals("foster@vy.com", customers.get(778).getEmail());
	}

	@Test
	@DisplayName("Record 779: Web is http://www.fostervy.com")
	void WebOfRecord779() {
		assertEquals("http://www.fostervy.com", customers.get(778).getWeb());
	}
}
