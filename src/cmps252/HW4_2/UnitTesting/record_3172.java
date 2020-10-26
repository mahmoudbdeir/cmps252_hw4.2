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

@Tag("5")
class Record_3172 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3172: FirstName is Tina")
	void FirstNameOfRecord3172() {
		assertEquals("Tina", customers.get(3171).getFirstName());
	}

	@Test
	@DisplayName("Record 3172: LastName is Siregar")
	void LastNameOfRecord3172() {
		assertEquals("Siregar", customers.get(3171).getLastName());
	}

	@Test
	@DisplayName("Record 3172: Company is Mitsui Bussan Aerospace Corp")
	void CompanyOfRecord3172() {
		assertEquals("Mitsui Bussan Aerospace Corp", customers.get(3171).getCompany());
	}

	@Test
	@DisplayName("Record 3172: Address is 5569 Bowden Rd")
	void AddressOfRecord3172() {
		assertEquals("5569 Bowden Rd", customers.get(3171).getAddress());
	}

	@Test
	@DisplayName("Record 3172: City is Jacksonville")
	void CityOfRecord3172() {
		assertEquals("Jacksonville", customers.get(3171).getCity());
	}

	@Test
	@DisplayName("Record 3172: County is Duval")
	void CountyOfRecord3172() {
		assertEquals("Duval", customers.get(3171).getCounty());
	}

	@Test
	@DisplayName("Record 3172: State is FL")
	void StateOfRecord3172() {
		assertEquals("FL", customers.get(3171).getState());
	}

	@Test
	@DisplayName("Record 3172: ZIP is 32216")
	void ZIPOfRecord3172() {
		assertEquals("32216", customers.get(3171).getZIP());
	}

	@Test
	@DisplayName("Record 3172: Phone is 904-733-5247")
	void PhoneOfRecord3172() {
		assertEquals("904-733-5247", customers.get(3171).getPhone());
	}

	@Test
	@DisplayName("Record 3172: Fax is 904-733-4559")
	void FaxOfRecord3172() {
		assertEquals("904-733-4559", customers.get(3171).getFax());
	}

	@Test
	@DisplayName("Record 3172: Email is tina@siregar.com")
	void EmailOfRecord3172() {
		assertEquals("tina@siregar.com", customers.get(3171).getEmail());
	}

	@Test
	@DisplayName("Record 3172: Web is http://www.tinasiregar.com")
	void WebOfRecord3172() {
		assertEquals("http://www.tinasiregar.com", customers.get(3171).getWeb());
	}
}
