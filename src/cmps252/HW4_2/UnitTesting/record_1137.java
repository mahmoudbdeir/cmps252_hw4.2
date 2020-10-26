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

@Tag("1")
class Record_1137 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1137: FirstName is Zelma")
	void FirstNameOfRecord1137() {
		assertEquals("Zelma", customers.get(1136).getFirstName());
	}

	@Test
	@DisplayName("Record 1137: LastName is Osucha")
	void LastNameOfRecord1137() {
		assertEquals("Osucha", customers.get(1136).getLastName());
	}

	@Test
	@DisplayName("Record 1137: Company is Law Office Of Donald E Cortis")
	void CompanyOfRecord1137() {
		assertEquals("Law Office Of Donald E Cortis", customers.get(1136).getCompany());
	}

	@Test
	@DisplayName("Record 1137: Address is 306 N Volusia Ave")
	void AddressOfRecord1137() {
		assertEquals("306 N Volusia Ave", customers.get(1136).getAddress());
	}

	@Test
	@DisplayName("Record 1137: City is Orange City")
	void CityOfRecord1137() {
		assertEquals("Orange City", customers.get(1136).getCity());
	}

	@Test
	@DisplayName("Record 1137: County is Volusia")
	void CountyOfRecord1137() {
		assertEquals("Volusia", customers.get(1136).getCounty());
	}

	@Test
	@DisplayName("Record 1137: State is FL")
	void StateOfRecord1137() {
		assertEquals("FL", customers.get(1136).getState());
	}

	@Test
	@DisplayName("Record 1137: ZIP is 32763")
	void ZIPOfRecord1137() {
		assertEquals("32763", customers.get(1136).getZIP());
	}

	@Test
	@DisplayName("Record 1137: Phone is 407-775-0818")
	void PhoneOfRecord1137() {
		assertEquals("407-775-0818", customers.get(1136).getPhone());
	}

	@Test
	@DisplayName("Record 1137: Fax is 407-775-3421")
	void FaxOfRecord1137() {
		assertEquals("407-775-3421", customers.get(1136).getFax());
	}

	@Test
	@DisplayName("Record 1137: Email is zelma@osucha.com")
	void EmailOfRecord1137() {
		assertEquals("zelma@osucha.com", customers.get(1136).getEmail());
	}

	@Test
	@DisplayName("Record 1137: Web is http://www.zelmaosucha.com")
	void WebOfRecord1137() {
		assertEquals("http://www.zelmaosucha.com", customers.get(1136).getWeb());
	}
}
