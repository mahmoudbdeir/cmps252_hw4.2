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

@Tag("41")
class Record_4646 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4646: FirstName is Alene")
	void FirstNameOfRecord4646() {
		assertEquals("Alene", customers.get(4645).getFirstName());
	}

	@Test
	@DisplayName("Record 4646: LastName is Hackle")
	void LastNameOfRecord4646() {
		assertEquals("Hackle", customers.get(4645).getLastName());
	}

	@Test
	@DisplayName("Record 4646: Company is Doe Spun Group Inc")
	void CompanyOfRecord4646() {
		assertEquals("Doe Spun Group Inc", customers.get(4645).getCompany());
	}

	@Test
	@DisplayName("Record 4646: Address is 1904 W Pinhook Rd  #-102")
	void AddressOfRecord4646() {
		assertEquals("1904 W Pinhook Rd  #-102", customers.get(4645).getAddress());
	}

	@Test
	@DisplayName("Record 4646: City is Lafayette")
	void CityOfRecord4646() {
		assertEquals("Lafayette", customers.get(4645).getCity());
	}

	@Test
	@DisplayName("Record 4646: County is Lafayette")
	void CountyOfRecord4646() {
		assertEquals("Lafayette", customers.get(4645).getCounty());
	}

	@Test
	@DisplayName("Record 4646: State is LA")
	void StateOfRecord4646() {
		assertEquals("LA", customers.get(4645).getState());
	}

	@Test
	@DisplayName("Record 4646: ZIP is 70508")
	void ZIPOfRecord4646() {
		assertEquals("70508", customers.get(4645).getZIP());
	}

	@Test
	@DisplayName("Record 4646: Phone is 337-237-2311")
	void PhoneOfRecord4646() {
		assertEquals("337-237-2311", customers.get(4645).getPhone());
	}

	@Test
	@DisplayName("Record 4646: Fax is 337-237-3856")
	void FaxOfRecord4646() {
		assertEquals("337-237-3856", customers.get(4645).getFax());
	}

	@Test
	@DisplayName("Record 4646: Email is alene@hackle.com")
	void EmailOfRecord4646() {
		assertEquals("alene@hackle.com", customers.get(4645).getEmail());
	}

	@Test
	@DisplayName("Record 4646: Web is http://www.alenehackle.com")
	void WebOfRecord4646() {
		assertEquals("http://www.alenehackle.com", customers.get(4645).getWeb());
	}
}
