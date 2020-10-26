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

@Tag("43")
class Record_170 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 170: FirstName is Donny")
	void FirstNameOfRecord170() {
		assertEquals("Donny", customers.get(169).getFirstName());
	}

	@Test
	@DisplayName("Record 170: LastName is Spielmaker")
	void LastNameOfRecord170() {
		assertEquals("Spielmaker", customers.get(169).getLastName());
	}

	@Test
	@DisplayName("Record 170: Company is Eyeon Associates")
	void CompanyOfRecord170() {
		assertEquals("Eyeon Associates", customers.get(169).getCompany());
	}

	@Test
	@DisplayName("Record 170: Address is 2490 Middlefield Rd")
	void AddressOfRecord170() {
		assertEquals("2490 Middlefield Rd", customers.get(169).getAddress());
	}

	@Test
	@DisplayName("Record 170: City is Redwood City")
	void CityOfRecord170() {
		assertEquals("Redwood City", customers.get(169).getCity());
	}

	@Test
	@DisplayName("Record 170: County is San Mateo")
	void CountyOfRecord170() {
		assertEquals("San Mateo", customers.get(169).getCounty());
	}

	@Test
	@DisplayName("Record 170: State is CA")
	void StateOfRecord170() {
		assertEquals("CA", customers.get(169).getState());
	}

	@Test
	@DisplayName("Record 170: ZIP is 94063")
	void ZIPOfRecord170() {
		assertEquals("94063", customers.get(169).getZIP());
	}

	@Test
	@DisplayName("Record 170: Phone is 650-365-5855")
	void PhoneOfRecord170() {
		assertEquals("650-365-5855", customers.get(169).getPhone());
	}

	@Test
	@DisplayName("Record 170: Fax is 650-365-2479")
	void FaxOfRecord170() {
		assertEquals("650-365-2479", customers.get(169).getFax());
	}

	@Test
	@DisplayName("Record 170: Email is donny@spielmaker.com")
	void EmailOfRecord170() {
		assertEquals("donny@spielmaker.com", customers.get(169).getEmail());
	}

	@Test
	@DisplayName("Record 170: Web is http://www.donnyspielmaker.com")
	void WebOfRecord170() {
		assertEquals("http://www.donnyspielmaker.com", customers.get(169).getWeb());
	}
}
