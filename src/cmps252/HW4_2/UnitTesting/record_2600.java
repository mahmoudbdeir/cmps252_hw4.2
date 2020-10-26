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

@Tag("35")
class Record_2600 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2600: FirstName is Drew")
	void FirstNameOfRecord2600() {
		assertEquals("Drew", customers.get(2599).getFirstName());
	}

	@Test
	@DisplayName("Record 2600: LastName is Stchur")
	void LastNameOfRecord2600() {
		assertEquals("Stchur", customers.get(2599).getLastName());
	}

	@Test
	@DisplayName("Record 2600: Company is Majestech Corp")
	void CompanyOfRecord2600() {
		assertEquals("Majestech Corp", customers.get(2599).getCompany());
	}

	@Test
	@DisplayName("Record 2600: Address is 2555 Poplar Ave")
	void AddressOfRecord2600() {
		assertEquals("2555 Poplar Ave", customers.get(2599).getAddress());
	}

	@Test
	@DisplayName("Record 2600: City is Memphis")
	void CityOfRecord2600() {
		assertEquals("Memphis", customers.get(2599).getCity());
	}

	@Test
	@DisplayName("Record 2600: County is Shelby")
	void CountyOfRecord2600() {
		assertEquals("Shelby", customers.get(2599).getCounty());
	}

	@Test
	@DisplayName("Record 2600: State is TN")
	void StateOfRecord2600() {
		assertEquals("TN", customers.get(2599).getState());
	}

	@Test
	@DisplayName("Record 2600: ZIP is 38112")
	void ZIPOfRecord2600() {
		assertEquals("38112", customers.get(2599).getZIP());
	}

	@Test
	@DisplayName("Record 2600: Phone is 901-452-4004")
	void PhoneOfRecord2600() {
		assertEquals("901-452-4004", customers.get(2599).getPhone());
	}

	@Test
	@DisplayName("Record 2600: Fax is 901-452-8028")
	void FaxOfRecord2600() {
		assertEquals("901-452-8028", customers.get(2599).getFax());
	}

	@Test
	@DisplayName("Record 2600: Email is drew@stchur.com")
	void EmailOfRecord2600() {
		assertEquals("drew@stchur.com", customers.get(2599).getEmail());
	}

	@Test
	@DisplayName("Record 2600: Web is http://www.drewstchur.com")
	void WebOfRecord2600() {
		assertEquals("http://www.drewstchur.com", customers.get(2599).getWeb());
	}
}
