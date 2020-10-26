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

@Tag("30")
class Record_1309 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1309: FirstName is Margarito")
	void FirstNameOfRecord1309() {
		assertEquals("Margarito", customers.get(1308).getFirstName());
	}

	@Test
	@DisplayName("Record 1309: LastName is Marhoefer")
	void LastNameOfRecord1309() {
		assertEquals("Marhoefer", customers.get(1308).getLastName());
	}

	@Test
	@DisplayName("Record 1309: Company is Degnan Boyle Realtors")
	void CompanyOfRecord1309() {
		assertEquals("Degnan Boyle Realtors", customers.get(1308).getCompany());
	}

	@Test
	@DisplayName("Record 1309: Address is 290 Northern Ave")
	void AddressOfRecord1309() {
		assertEquals("290 Northern Ave", customers.get(1308).getAddress());
	}

	@Test
	@DisplayName("Record 1309: City is Boston")
	void CityOfRecord1309() {
		assertEquals("Boston", customers.get(1308).getCity());
	}

	@Test
	@DisplayName("Record 1309: County is Suffolk")
	void CountyOfRecord1309() {
		assertEquals("Suffolk", customers.get(1308).getCounty());
	}

	@Test
	@DisplayName("Record 1309: State is MA")
	void StateOfRecord1309() {
		assertEquals("MA", customers.get(1308).getState());
	}

	@Test
	@DisplayName("Record 1309: ZIP is 2210")
	void ZIPOfRecord1309() {
		assertEquals("2210", customers.get(1308).getZIP());
	}

	@Test
	@DisplayName("Record 1309: Phone is 617-261-0486")
	void PhoneOfRecord1309() {
		assertEquals("617-261-0486", customers.get(1308).getPhone());
	}

	@Test
	@DisplayName("Record 1309: Fax is 617-261-9594")
	void FaxOfRecord1309() {
		assertEquals("617-261-9594", customers.get(1308).getFax());
	}

	@Test
	@DisplayName("Record 1309: Email is margarito@marhoefer.com")
	void EmailOfRecord1309() {
		assertEquals("margarito@marhoefer.com", customers.get(1308).getEmail());
	}

	@Test
	@DisplayName("Record 1309: Web is http://www.margaritomarhoefer.com")
	void WebOfRecord1309() {
		assertEquals("http://www.margaritomarhoefer.com", customers.get(1308).getWeb());
	}
}
