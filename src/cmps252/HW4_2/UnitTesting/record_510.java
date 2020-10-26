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

@Tag("20")
class Record_510 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 510: FirstName is Theodore")
	void FirstNameOfRecord510() {
		assertEquals("Theodore", customers.get(509).getFirstName());
	}

	@Test
	@DisplayName("Record 510: LastName is Sadar")
	void LastNameOfRecord510() {
		assertEquals("Sadar", customers.get(509).getLastName());
	}

	@Test
	@DisplayName("Record 510: Company is Corona, Joseph T Md")
	void CompanyOfRecord510() {
		assertEquals("Corona, Joseph T Md", customers.get(509).getCompany());
	}

	@Test
	@DisplayName("Record 510: Address is 9530 Cabot Dr")
	void AddressOfRecord510() {
		assertEquals("9530 Cabot Dr", customers.get(509).getAddress());
	}

	@Test
	@DisplayName("Record 510: City is San Diego")
	void CityOfRecord510() {
		assertEquals("San Diego", customers.get(509).getCity());
	}

	@Test
	@DisplayName("Record 510: County is San Diego")
	void CountyOfRecord510() {
		assertEquals("San Diego", customers.get(509).getCounty());
	}

	@Test
	@DisplayName("Record 510: State is CA")
	void StateOfRecord510() {
		assertEquals("CA", customers.get(509).getState());
	}

	@Test
	@DisplayName("Record 510: ZIP is 92126")
	void ZIPOfRecord510() {
		assertEquals("92126", customers.get(509).getZIP());
	}

	@Test
	@DisplayName("Record 510: Phone is 858-689-3719")
	void PhoneOfRecord510() {
		assertEquals("858-689-3719", customers.get(509).getPhone());
	}

	@Test
	@DisplayName("Record 510: Fax is 858-689-9679")
	void FaxOfRecord510() {
		assertEquals("858-689-9679", customers.get(509).getFax());
	}

	@Test
	@DisplayName("Record 510: Email is theodore@sadar.com")
	void EmailOfRecord510() {
		assertEquals("theodore@sadar.com", customers.get(509).getEmail());
	}

	@Test
	@DisplayName("Record 510: Web is http://www.theodoresadar.com")
	void WebOfRecord510() {
		assertEquals("http://www.theodoresadar.com", customers.get(509).getWeb());
	}
}
