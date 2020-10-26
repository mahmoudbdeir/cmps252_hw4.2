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

@Tag("0")
class Record_3500 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3500: FirstName is Forrest")
	void FirstNameOfRecord3500() {
		assertEquals("Forrest", customers.get(3499).getFirstName());
	}

	@Test
	@DisplayName("Record 3500: LastName is Weldon")
	void LastNameOfRecord3500() {
		assertEquals("Weldon", customers.get(3499).getLastName());
	}

	@Test
	@DisplayName("Record 3500: Company is Architectural Hardware Inc")
	void CompanyOfRecord3500() {
		assertEquals("Architectural Hardware Inc", customers.get(3499).getCompany());
	}

	@Test
	@DisplayName("Record 3500: Address is 2825 5th Ave")
	void AddressOfRecord3500() {
		assertEquals("2825 5th Ave", customers.get(3499).getAddress());
	}

	@Test
	@DisplayName("Record 3500: City is San Diego")
	void CityOfRecord3500() {
		assertEquals("San Diego", customers.get(3499).getCity());
	}

	@Test
	@DisplayName("Record 3500: County is San Diego")
	void CountyOfRecord3500() {
		assertEquals("San Diego", customers.get(3499).getCounty());
	}

	@Test
	@DisplayName("Record 3500: State is CA")
	void StateOfRecord3500() {
		assertEquals("CA", customers.get(3499).getState());
	}

	@Test
	@DisplayName("Record 3500: ZIP is 92103")
	void ZIPOfRecord3500() {
		assertEquals("92103", customers.get(3499).getZIP());
	}

	@Test
	@DisplayName("Record 3500: Phone is 619-238-7735")
	void PhoneOfRecord3500() {
		assertEquals("619-238-7735", customers.get(3499).getPhone());
	}

	@Test
	@DisplayName("Record 3500: Fax is 619-238-2351")
	void FaxOfRecord3500() {
		assertEquals("619-238-2351", customers.get(3499).getFax());
	}

	@Test
	@DisplayName("Record 3500: Email is forrest@weldon.com")
	void EmailOfRecord3500() {
		assertEquals("forrest@weldon.com", customers.get(3499).getEmail());
	}

	@Test
	@DisplayName("Record 3500: Web is http://www.forrestweldon.com")
	void WebOfRecord3500() {
		assertEquals("http://www.forrestweldon.com", customers.get(3499).getWeb());
	}
}
