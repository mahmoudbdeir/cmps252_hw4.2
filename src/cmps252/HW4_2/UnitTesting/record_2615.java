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

@Tag("38")
class Record_2615 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2615: FirstName is Ollie")
	void FirstNameOfRecord2615() {
		assertEquals("Ollie", customers.get(2614).getFirstName());
	}

	@Test
	@DisplayName("Record 2615: LastName is Critchley")
	void LastNameOfRecord2615() {
		assertEquals("Critchley", customers.get(2614).getLastName());
	}

	@Test
	@DisplayName("Record 2615: Company is Donrey Outdoor Advertising Co")
	void CompanyOfRecord2615() {
		assertEquals("Donrey Outdoor Advertising Co", customers.get(2614).getCompany());
	}

	@Test
	@DisplayName("Record 2615: Address is 604 W Main St")
	void AddressOfRecord2615() {
		assertEquals("604 W Main St", customers.get(2614).getAddress());
	}

	@Test
	@DisplayName("Record 2615: City is Lake Zurich")
	void CityOfRecord2615() {
		assertEquals("Lake Zurich", customers.get(2614).getCity());
	}

	@Test
	@DisplayName("Record 2615: County is Lake")
	void CountyOfRecord2615() {
		assertEquals("Lake", customers.get(2614).getCounty());
	}

	@Test
	@DisplayName("Record 2615: State is IL")
	void StateOfRecord2615() {
		assertEquals("IL", customers.get(2614).getState());
	}

	@Test
	@DisplayName("Record 2615: ZIP is 60047")
	void ZIPOfRecord2615() {
		assertEquals("60047", customers.get(2614).getZIP());
	}

	@Test
	@DisplayName("Record 2615: Phone is 847-540-2067")
	void PhoneOfRecord2615() {
		assertEquals("847-540-2067", customers.get(2614).getPhone());
	}

	@Test
	@DisplayName("Record 2615: Fax is 847-540-0106")
	void FaxOfRecord2615() {
		assertEquals("847-540-0106", customers.get(2614).getFax());
	}

	@Test
	@DisplayName("Record 2615: Email is ollie@critchley.com")
	void EmailOfRecord2615() {
		assertEquals("ollie@critchley.com", customers.get(2614).getEmail());
	}

	@Test
	@DisplayName("Record 2615: Web is http://www.olliecritchley.com")
	void WebOfRecord2615() {
		assertEquals("http://www.olliecritchley.com", customers.get(2614).getWeb());
	}
}
