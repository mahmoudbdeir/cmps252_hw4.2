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

@Tag("0")
class Record_2464 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2464: FirstName is Lucy")
	void FirstNameOfRecord2464() {
		assertEquals("Lucy", customers.get(2463).getFirstName());
	}

	@Test
	@DisplayName("Record 2464: LastName is Gangel")
	void LastNameOfRecord2464() {
		assertEquals("Gangel", customers.get(2463).getLastName());
	}

	@Test
	@DisplayName("Record 2464: Company is Columbia Export Co")
	void CompanyOfRecord2464() {
		assertEquals("Columbia Export Co", customers.get(2463).getCompany());
	}

	@Test
	@DisplayName("Record 2464: Address is 7879 Jackson Ave")
	void AddressOfRecord2464() {
		assertEquals("7879 Jackson Ave", customers.get(2463).getAddress());
	}

	@Test
	@DisplayName("Record 2464: City is Ann Arbor")
	void CityOfRecord2464() {
		assertEquals("Ann Arbor", customers.get(2463).getCity());
	}

	@Test
	@DisplayName("Record 2464: County is Washtenaw")
	void CountyOfRecord2464() {
		assertEquals("Washtenaw", customers.get(2463).getCounty());
	}

	@Test
	@DisplayName("Record 2464: State is MI")
	void StateOfRecord2464() {
		assertEquals("MI", customers.get(2463).getState());
	}

	@Test
	@DisplayName("Record 2464: ZIP is 48103")
	void ZIPOfRecord2464() {
		assertEquals("48103", customers.get(2463).getZIP());
	}

	@Test
	@DisplayName("Record 2464: Phone is 734-663-2484")
	void PhoneOfRecord2464() {
		assertEquals("734-663-2484", customers.get(2463).getPhone());
	}

	@Test
	@DisplayName("Record 2464: Fax is 734-663-7307")
	void FaxOfRecord2464() {
		assertEquals("734-663-7307", customers.get(2463).getFax());
	}

	@Test
	@DisplayName("Record 2464: Email is lucy@gangel.com")
	void EmailOfRecord2464() {
		assertEquals("lucy@gangel.com", customers.get(2463).getEmail());
	}

	@Test
	@DisplayName("Record 2464: Web is http://www.lucygangel.com")
	void WebOfRecord2464() {
		assertEquals("http://www.lucygangel.com", customers.get(2463).getWeb());
	}
}
