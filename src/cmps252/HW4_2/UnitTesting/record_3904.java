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

@Tag("29")
class Record_3904 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3904: FirstName is Rosetta")
	void FirstNameOfRecord3904() {
		assertEquals("Rosetta", customers.get(3903).getFirstName());
	}

	@Test
	@DisplayName("Record 3904: LastName is Graban")
	void LastNameOfRecord3904() {
		assertEquals("Graban", customers.get(3903).getLastName());
	}

	@Test
	@DisplayName("Record 3904: Company is Security Office Furn Co")
	void CompanyOfRecord3904() {
		assertEquals("Security Office Furn Co", customers.get(3903).getCompany());
	}

	@Test
	@DisplayName("Record 3904: Address is 100 W 5th St")
	void AddressOfRecord3904() {
		assertEquals("100 W 5th St", customers.get(3903).getAddress());
	}

	@Test
	@DisplayName("Record 3904: City is Tulsa")
	void CityOfRecord3904() {
		assertEquals("Tulsa", customers.get(3903).getCity());
	}

	@Test
	@DisplayName("Record 3904: County is Tulsa")
	void CountyOfRecord3904() {
		assertEquals("Tulsa", customers.get(3903).getCounty());
	}

	@Test
	@DisplayName("Record 3904: State is OK")
	void StateOfRecord3904() {
		assertEquals("OK", customers.get(3903).getState());
	}

	@Test
	@DisplayName("Record 3904: ZIP is 74103")
	void ZIPOfRecord3904() {
		assertEquals("74103", customers.get(3903).getZIP());
	}

	@Test
	@DisplayName("Record 3904: Phone is 918-581-8013")
	void PhoneOfRecord3904() {
		assertEquals("918-581-8013", customers.get(3903).getPhone());
	}

	@Test
	@DisplayName("Record 3904: Fax is 918-581-6015")
	void FaxOfRecord3904() {
		assertEquals("918-581-6015", customers.get(3903).getFax());
	}

	@Test
	@DisplayName("Record 3904: Email is rosetta@graban.com")
	void EmailOfRecord3904() {
		assertEquals("rosetta@graban.com", customers.get(3903).getEmail());
	}

	@Test
	@DisplayName("Record 3904: Web is http://www.rosettagraban.com")
	void WebOfRecord3904() {
		assertEquals("http://www.rosettagraban.com", customers.get(3903).getWeb());
	}
}
