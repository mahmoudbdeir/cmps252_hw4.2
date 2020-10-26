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

@Tag("36")
class Record_1306 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1306: FirstName is Portia")
	void FirstNameOfRecord1306() {
		assertEquals("Portia", customers.get(1305).getFirstName());
	}

	@Test
	@DisplayName("Record 1306: LastName is Jahnsen")
	void LastNameOfRecord1306() {
		assertEquals("Jahnsen", customers.get(1305).getLastName());
	}

	@Test
	@DisplayName("Record 1306: Company is Hughes Thorsness Gants Powell")
	void CompanyOfRecord1306() {
		assertEquals("Hughes Thorsness Gants Powell", customers.get(1305).getCompany());
	}

	@Test
	@DisplayName("Record 1306: Address is 786 Mountain Blvd")
	void AddressOfRecord1306() {
		assertEquals("786 Mountain Blvd", customers.get(1305).getAddress());
	}

	@Test
	@DisplayName("Record 1306: City is Plainfield")
	void CityOfRecord1306() {
		assertEquals("Plainfield", customers.get(1305).getCity());
	}

	@Test
	@DisplayName("Record 1306: County is Union")
	void CountyOfRecord1306() {
		assertEquals("Union", customers.get(1305).getCounty());
	}

	@Test
	@DisplayName("Record 1306: State is NJ")
	void StateOfRecord1306() {
		assertEquals("NJ", customers.get(1305).getState());
	}

	@Test
	@DisplayName("Record 1306: ZIP is 7060")
	void ZIPOfRecord1306() {
		assertEquals("7060", customers.get(1305).getZIP());
	}

	@Test
	@DisplayName("Record 1306: Phone is 908-753-7554")
	void PhoneOfRecord1306() {
		assertEquals("908-753-7554", customers.get(1305).getPhone());
	}

	@Test
	@DisplayName("Record 1306: Fax is 908-753-2596")
	void FaxOfRecord1306() {
		assertEquals("908-753-2596", customers.get(1305).getFax());
	}

	@Test
	@DisplayName("Record 1306: Email is portia@jahnsen.com")
	void EmailOfRecord1306() {
		assertEquals("portia@jahnsen.com", customers.get(1305).getEmail());
	}

	@Test
	@DisplayName("Record 1306: Web is http://www.portiajahnsen.com")
	void WebOfRecord1306() {
		assertEquals("http://www.portiajahnsen.com", customers.get(1305).getWeb());
	}
}
