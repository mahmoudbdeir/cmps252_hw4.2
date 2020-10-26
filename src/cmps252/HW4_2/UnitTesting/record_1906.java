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

@Tag("18")
class Record_1906 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1906: FirstName is German")
	void FirstNameOfRecord1906() {
		assertEquals("German", customers.get(1905).getFirstName());
	}

	@Test
	@DisplayName("Record 1906: LastName is Kennebeck")
	void LastNameOfRecord1906() {
		assertEquals("Kennebeck", customers.get(1905).getLastName());
	}

	@Test
	@DisplayName("Record 1906: Company is Custom Carton Inc")
	void CompanyOfRecord1906() {
		assertEquals("Custom Carton Inc", customers.get(1905).getCompany());
	}

	@Test
	@DisplayName("Record 1906: Address is 480 N Fairground St")
	void AddressOfRecord1906() {
		assertEquals("480 N Fairground St", customers.get(1905).getAddress());
	}

	@Test
	@DisplayName("Record 1906: City is Marietta")
	void CityOfRecord1906() {
		assertEquals("Marietta", customers.get(1905).getCity());
	}

	@Test
	@DisplayName("Record 1906: County is Cobb")
	void CountyOfRecord1906() {
		assertEquals("Cobb", customers.get(1905).getCounty());
	}

	@Test
	@DisplayName("Record 1906: State is GA")
	void StateOfRecord1906() {
		assertEquals("GA", customers.get(1905).getState());
	}

	@Test
	@DisplayName("Record 1906: ZIP is 30060")
	void ZIPOfRecord1906() {
		assertEquals("30060", customers.get(1905).getZIP());
	}

	@Test
	@DisplayName("Record 1906: Phone is 770-427-6905")
	void PhoneOfRecord1906() {
		assertEquals("770-427-6905", customers.get(1905).getPhone());
	}

	@Test
	@DisplayName("Record 1906: Fax is 770-427-6004")
	void FaxOfRecord1906() {
		assertEquals("770-427-6004", customers.get(1905).getFax());
	}

	@Test
	@DisplayName("Record 1906: Email is german@kennebeck.com")
	void EmailOfRecord1906() {
		assertEquals("german@kennebeck.com", customers.get(1905).getEmail());
	}

	@Test
	@DisplayName("Record 1906: Web is http://www.germankennebeck.com")
	void WebOfRecord1906() {
		assertEquals("http://www.germankennebeck.com", customers.get(1905).getWeb());
	}
}
