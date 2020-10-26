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

@Tag("16")
class Record_657 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 657: FirstName is Rita")
	void FirstNameOfRecord657() {
		assertEquals("Rita", customers.get(656).getFirstName());
	}

	@Test
	@DisplayName("Record 657: LastName is Untalan")
	void LastNameOfRecord657() {
		assertEquals("Untalan", customers.get(656).getLastName());
	}

	@Test
	@DisplayName("Record 657: Company is Joseph stoneert & Company")
	void CompanyOfRecord657() {
		assertEquals("Joseph stoneert & Company", customers.get(656).getCompany());
	}

	@Test
	@DisplayName("Record 657: Address is 20920 Lassen St")
	void AddressOfRecord657() {
		assertEquals("20920 Lassen St", customers.get(656).getAddress());
	}

	@Test
	@DisplayName("Record 657: City is Chatsworth")
	void CityOfRecord657() {
		assertEquals("Chatsworth", customers.get(656).getCity());
	}

	@Test
	@DisplayName("Record 657: County is Los Angeles")
	void CountyOfRecord657() {
		assertEquals("Los Angeles", customers.get(656).getCounty());
	}

	@Test
	@DisplayName("Record 657: State is CA")
	void StateOfRecord657() {
		assertEquals("CA", customers.get(656).getState());
	}

	@Test
	@DisplayName("Record 657: ZIP is 91311")
	void ZIPOfRecord657() {
		assertEquals("91311", customers.get(656).getZIP());
	}

	@Test
	@DisplayName("Record 657: Phone is 818-709-3270")
	void PhoneOfRecord657() {
		assertEquals("818-709-3270", customers.get(656).getPhone());
	}

	@Test
	@DisplayName("Record 657: Fax is 818-709-7271")
	void FaxOfRecord657() {
		assertEquals("818-709-7271", customers.get(656).getFax());
	}

	@Test
	@DisplayName("Record 657: Email is rita@untalan.com")
	void EmailOfRecord657() {
		assertEquals("rita@untalan.com", customers.get(656).getEmail());
	}

	@Test
	@DisplayName("Record 657: Web is http://www.ritauntalan.com")
	void WebOfRecord657() {
		assertEquals("http://www.ritauntalan.com", customers.get(656).getWeb());
	}
}
