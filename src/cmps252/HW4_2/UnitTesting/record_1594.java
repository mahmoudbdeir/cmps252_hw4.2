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

@Tag("23")
class Record_1594 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1594: FirstName is Jan")
	void FirstNameOfRecord1594() {
		assertEquals("Jan", customers.get(1593).getFirstName());
	}

	@Test
	@DisplayName("Record 1594: LastName is Yunes")
	void LastNameOfRecord1594() {
		assertEquals("Yunes", customers.get(1593).getLastName());
	}

	@Test
	@DisplayName("Record 1594: Company is Bauer & Associates Inc")
	void CompanyOfRecord1594() {
		assertEquals("Bauer & Associates Inc", customers.get(1593).getCompany());
	}

	@Test
	@DisplayName("Record 1594: Address is 1005 Santa Isabel Ave")
	void AddressOfRecord1594() {
		assertEquals("1005 Santa Isabel Ave", customers.get(1593).getAddress());
	}

	@Test
	@DisplayName("Record 1594: City is Laredo")
	void CityOfRecord1594() {
		assertEquals("Laredo", customers.get(1593).getCity());
	}

	@Test
	@DisplayName("Record 1594: County is Webb")
	void CountyOfRecord1594() {
		assertEquals("Webb", customers.get(1593).getCounty());
	}

	@Test
	@DisplayName("Record 1594: State is TX")
	void StateOfRecord1594() {
		assertEquals("TX", customers.get(1593).getState());
	}

	@Test
	@DisplayName("Record 1594: ZIP is 78040")
	void ZIPOfRecord1594() {
		assertEquals("78040", customers.get(1593).getZIP());
	}

	@Test
	@DisplayName("Record 1594: Phone is 956-725-4335")
	void PhoneOfRecord1594() {
		assertEquals("956-725-4335", customers.get(1593).getPhone());
	}

	@Test
	@DisplayName("Record 1594: Fax is 956-725-1029")
	void FaxOfRecord1594() {
		assertEquals("956-725-1029", customers.get(1593).getFax());
	}

	@Test
	@DisplayName("Record 1594: Email is jan@yunes.com")
	void EmailOfRecord1594() {
		assertEquals("jan@yunes.com", customers.get(1593).getEmail());
	}

	@Test
	@DisplayName("Record 1594: Web is http://www.janyunes.com")
	void WebOfRecord1594() {
		assertEquals("http://www.janyunes.com", customers.get(1593).getWeb());
	}
}
