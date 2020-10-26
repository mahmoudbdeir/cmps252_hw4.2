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

@Tag("4")
class Record_718 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 718: FirstName is Pearl")
	void FirstNameOfRecord718() {
		assertEquals("Pearl", customers.get(717).getFirstName());
	}

	@Test
	@DisplayName("Record 718: LastName is Altsisi")
	void LastNameOfRecord718() {
		assertEquals("Altsisi", customers.get(717).getLastName());
	}

	@Test
	@DisplayName("Record 718: Company is Pack Man Box Store")
	void CompanyOfRecord718() {
		assertEquals("Pack Man Box Store", customers.get(717).getCompany());
	}

	@Test
	@DisplayName("Record 718: Address is 5511 Pacific Blvd")
	void AddressOfRecord718() {
		assertEquals("5511 Pacific Blvd", customers.get(717).getAddress());
	}

	@Test
	@DisplayName("Record 718: City is Huntington Park")
	void CityOfRecord718() {
		assertEquals("Huntington Park", customers.get(717).getCity());
	}

	@Test
	@DisplayName("Record 718: County is Los Angeles")
	void CountyOfRecord718() {
		assertEquals("Los Angeles", customers.get(717).getCounty());
	}

	@Test
	@DisplayName("Record 718: State is CA")
	void StateOfRecord718() {
		assertEquals("CA", customers.get(717).getState());
	}

	@Test
	@DisplayName("Record 718: ZIP is 90255")
	void ZIPOfRecord718() {
		assertEquals("90255", customers.get(717).getZIP());
	}

	@Test
	@DisplayName("Record 718: Phone is 323-583-6217")
	void PhoneOfRecord718() {
		assertEquals("323-583-6217", customers.get(717).getPhone());
	}

	@Test
	@DisplayName("Record 718: Fax is 323-583-2856")
	void FaxOfRecord718() {
		assertEquals("323-583-2856", customers.get(717).getFax());
	}

	@Test
	@DisplayName("Record 718: Email is pearl@altsisi.com")
	void EmailOfRecord718() {
		assertEquals("pearl@altsisi.com", customers.get(717).getEmail());
	}

	@Test
	@DisplayName("Record 718: Web is http://www.pearlaltsisi.com")
	void WebOfRecord718() {
		assertEquals("http://www.pearlaltsisi.com", customers.get(717).getWeb());
	}
}
