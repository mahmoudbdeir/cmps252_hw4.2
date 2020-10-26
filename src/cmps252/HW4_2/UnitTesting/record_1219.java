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
class Record_1219 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1219: FirstName is Bennie")
	void FirstNameOfRecord1219() {
		assertEquals("Bennie", customers.get(1218).getFirstName());
	}

	@Test
	@DisplayName("Record 1219: LastName is Bryce")
	void LastNameOfRecord1219() {
		assertEquals("Bryce", customers.get(1218).getLastName());
	}

	@Test
	@DisplayName("Record 1219: Company is Wizo Golden 1380")
	void CompanyOfRecord1219() {
		assertEquals("Wizo Golden 1380", customers.get(1218).getCompany());
	}

	@Test
	@DisplayName("Record 1219: Address is 354 State Hwy  #-36")
	void AddressOfRecord1219() {
		assertEquals("354 State Hwy  #-36", customers.get(1218).getAddress());
	}

	@Test
	@DisplayName("Record 1219: City is Belford")
	void CityOfRecord1219() {
		assertEquals("Belford", customers.get(1218).getCity());
	}

	@Test
	@DisplayName("Record 1219: County is Monmouth")
	void CountyOfRecord1219() {
		assertEquals("Monmouth", customers.get(1218).getCounty());
	}

	@Test
	@DisplayName("Record 1219: State is NJ")
	void StateOfRecord1219() {
		assertEquals("NJ", customers.get(1218).getState());
	}

	@Test
	@DisplayName("Record 1219: ZIP is 7718")
	void ZIPOfRecord1219() {
		assertEquals("7718", customers.get(1218).getZIP());
	}

	@Test
	@DisplayName("Record 1219: Phone is 732-264-3421")
	void PhoneOfRecord1219() {
		assertEquals("732-264-3421", customers.get(1218).getPhone());
	}

	@Test
	@DisplayName("Record 1219: Fax is 732-264-5409")
	void FaxOfRecord1219() {
		assertEquals("732-264-5409", customers.get(1218).getFax());
	}

	@Test
	@DisplayName("Record 1219: Email is bennie@bryce.com")
	void EmailOfRecord1219() {
		assertEquals("bennie@bryce.com", customers.get(1218).getEmail());
	}

	@Test
	@DisplayName("Record 1219: Web is http://www.benniebryce.com")
	void WebOfRecord1219() {
		assertEquals("http://www.benniebryce.com", customers.get(1218).getWeb());
	}
}
