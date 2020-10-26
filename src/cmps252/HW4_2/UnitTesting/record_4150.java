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

@Tag("31")
class Record_4150 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4150: FirstName is Jordon")
	void FirstNameOfRecord4150() {
		assertEquals("Jordon", customers.get(4149).getFirstName());
	}

	@Test
	@DisplayName("Record 4150: LastName is Madson")
	void LastNameOfRecord4150() {
		assertEquals("Madson", customers.get(4149).getLastName());
	}

	@Test
	@DisplayName("Record 4150: Company is Lofts Precision Grinding Llc")
	void CompanyOfRecord4150() {
		assertEquals("Lofts Precision Grinding Llc", customers.get(4149).getCompany());
	}

	@Test
	@DisplayName("Record 4150: Address is 2931 Santa Rosa Ave")
	void AddressOfRecord4150() {
		assertEquals("2931 Santa Rosa Ave", customers.get(4149).getAddress());
	}

	@Test
	@DisplayName("Record 4150: City is Santa Rosa")
	void CityOfRecord4150() {
		assertEquals("Santa Rosa", customers.get(4149).getCity());
	}

	@Test
	@DisplayName("Record 4150: County is Sonoma")
	void CountyOfRecord4150() {
		assertEquals("Sonoma", customers.get(4149).getCounty());
	}

	@Test
	@DisplayName("Record 4150: State is CA")
	void StateOfRecord4150() {
		assertEquals("CA", customers.get(4149).getState());
	}

	@Test
	@DisplayName("Record 4150: ZIP is 95407")
	void ZIPOfRecord4150() {
		assertEquals("95407", customers.get(4149).getZIP());
	}

	@Test
	@DisplayName("Record 4150: Phone is 707-545-8443")
	void PhoneOfRecord4150() {
		assertEquals("707-545-8443", customers.get(4149).getPhone());
	}

	@Test
	@DisplayName("Record 4150: Fax is 707-545-3054")
	void FaxOfRecord4150() {
		assertEquals("707-545-3054", customers.get(4149).getFax());
	}

	@Test
	@DisplayName("Record 4150: Email is jordon@madson.com")
	void EmailOfRecord4150() {
		assertEquals("jordon@madson.com", customers.get(4149).getEmail());
	}

	@Test
	@DisplayName("Record 4150: Web is http://www.jordonmadson.com")
	void WebOfRecord4150() {
		assertEquals("http://www.jordonmadson.com", customers.get(4149).getWeb());
	}
}
