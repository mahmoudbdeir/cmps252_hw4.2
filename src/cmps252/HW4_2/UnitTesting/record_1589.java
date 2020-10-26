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

@Tag("13")
class Record_1589 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1589: FirstName is Luann")
	void FirstNameOfRecord1589() {
		assertEquals("Luann", customers.get(1588).getFirstName());
	}

	@Test
	@DisplayName("Record 1589: LastName is ychenlaub")
	void LastNameOfRecord1589() {
		assertEquals("ychenlaub", customers.get(1588).getLastName());
	}

	@Test
	@DisplayName("Record 1589: Company is Garvey Whitman Inc")
	void CompanyOfRecord1589() {
		assertEquals("Garvey Whitman Inc", customers.get(1588).getCompany());
	}

	@Test
	@DisplayName("Record 1589: Address is 1273 Forgewood Ave")
	void AddressOfRecord1589() {
		assertEquals("1273 Forgewood Ave", customers.get(1588).getAddress());
	}

	@Test
	@DisplayName("Record 1589: City is Sunnyvale")
	void CityOfRecord1589() {
		assertEquals("Sunnyvale", customers.get(1588).getCity());
	}

	@Test
	@DisplayName("Record 1589: County is Santa Clara")
	void CountyOfRecord1589() {
		assertEquals("Santa Clara", customers.get(1588).getCounty());
	}

	@Test
	@DisplayName("Record 1589: State is CA")
	void StateOfRecord1589() {
		assertEquals("CA", customers.get(1588).getState());
	}

	@Test
	@DisplayName("Record 1589: ZIP is 94089")
	void ZIPOfRecord1589() {
		assertEquals("94089", customers.get(1588).getZIP());
	}

	@Test
	@DisplayName("Record 1589: Phone is 408-734-2181")
	void PhoneOfRecord1589() {
		assertEquals("408-734-2181", customers.get(1588).getPhone());
	}

	@Test
	@DisplayName("Record 1589: Fax is 408-734-1666")
	void FaxOfRecord1589() {
		assertEquals("408-734-1666", customers.get(1588).getFax());
	}

	@Test
	@DisplayName("Record 1589: Email is luann@ychenlaub.com")
	void EmailOfRecord1589() {
		assertEquals("luann@ychenlaub.com", customers.get(1588).getEmail());
	}

	@Test
	@DisplayName("Record 1589: Web is http://www.luannychenlaub.com")
	void WebOfRecord1589() {
		assertEquals("http://www.luannychenlaub.com", customers.get(1588).getWeb());
	}
}
