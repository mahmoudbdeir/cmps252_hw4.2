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

@Tag("24")
class Record_1904 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1904: FirstName is Bud")
	void FirstNameOfRecord1904() {
		assertEquals("Bud", customers.get(1903).getFirstName());
	}

	@Test
	@DisplayName("Record 1904: LastName is Dahm")
	void LastNameOfRecord1904() {
		assertEquals("Dahm", customers.get(1903).getLastName());
	}

	@Test
	@DisplayName("Record 1904: Company is Millington Nurseries")
	void CompanyOfRecord1904() {
		assertEquals("Millington Nurseries", customers.get(1903).getCompany());
	}

	@Test
	@DisplayName("Record 1904: Address is 4 Mi N Hwy 281 N")
	void AddressOfRecord1904() {
		assertEquals("4 Mi N Hwy 281 N", customers.get(1903).getAddress());
	}

	@Test
	@DisplayName("Record 1904: City is Edinburg")
	void CityOfRecord1904() {
		assertEquals("Edinburg", customers.get(1903).getCity());
	}

	@Test
	@DisplayName("Record 1904: County is Hidalgo")
	void CountyOfRecord1904() {
		assertEquals("Hidalgo", customers.get(1903).getCounty());
	}

	@Test
	@DisplayName("Record 1904: State is TX")
	void StateOfRecord1904() {
		assertEquals("TX", customers.get(1903).getState());
	}

	@Test
	@DisplayName("Record 1904: ZIP is 78539")
	void ZIPOfRecord1904() {
		assertEquals("78539", customers.get(1903).getZIP());
	}

	@Test
	@DisplayName("Record 1904: Phone is 956-381-5055")
	void PhoneOfRecord1904() {
		assertEquals("956-381-5055", customers.get(1903).getPhone());
	}

	@Test
	@DisplayName("Record 1904: Fax is 956-381-8577")
	void FaxOfRecord1904() {
		assertEquals("956-381-8577", customers.get(1903).getFax());
	}

	@Test
	@DisplayName("Record 1904: Email is bud@dahm.com")
	void EmailOfRecord1904() {
		assertEquals("bud@dahm.com", customers.get(1903).getEmail());
	}

	@Test
	@DisplayName("Record 1904: Web is http://www.buddahm.com")
	void WebOfRecord1904() {
		assertEquals("http://www.buddahm.com", customers.get(1903).getWeb());
	}
}
