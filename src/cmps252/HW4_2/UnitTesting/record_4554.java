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
class Record_4554 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4554: FirstName is Arline")
	void FirstNameOfRecord4554() {
		assertEquals("Arline", customers.get(4553).getFirstName());
	}

	@Test
	@DisplayName("Record 4554: LastName is Featherston")
	void LastNameOfRecord4554() {
		assertEquals("Featherston", customers.get(4553).getLastName());
	}

	@Test
	@DisplayName("Record 4554: Company is Clarion Associates Inc")
	void CompanyOfRecord4554() {
		assertEquals("Clarion Associates Inc", customers.get(4553).getCompany());
	}

	@Test
	@DisplayName("Record 4554: Address is 386 State St")
	void AddressOfRecord4554() {
		assertEquals("386 State St", customers.get(4553).getAddress());
	}

	@Test
	@DisplayName("Record 4554: City is Los Altos")
	void CityOfRecord4554() {
		assertEquals("Los Altos", customers.get(4553).getCity());
	}

	@Test
	@DisplayName("Record 4554: County is Santa Clara")
	void CountyOfRecord4554() {
		assertEquals("Santa Clara", customers.get(4553).getCounty());
	}

	@Test
	@DisplayName("Record 4554: State is CA")
	void StateOfRecord4554() {
		assertEquals("CA", customers.get(4553).getState());
	}

	@Test
	@DisplayName("Record 4554: ZIP is 94022")
	void ZIPOfRecord4554() {
		assertEquals("94022", customers.get(4553).getZIP());
	}

	@Test
	@DisplayName("Record 4554: Phone is 650-948-4767")
	void PhoneOfRecord4554() {
		assertEquals("650-948-4767", customers.get(4553).getPhone());
	}

	@Test
	@DisplayName("Record 4554: Fax is 650-948-6172")
	void FaxOfRecord4554() {
		assertEquals("650-948-6172", customers.get(4553).getFax());
	}

	@Test
	@DisplayName("Record 4554: Email is arline@featherston.com")
	void EmailOfRecord4554() {
		assertEquals("arline@featherston.com", customers.get(4553).getEmail());
	}

	@Test
	@DisplayName("Record 4554: Web is http://www.arlinefeatherston.com")
	void WebOfRecord4554() {
		assertEquals("http://www.arlinefeatherston.com", customers.get(4553).getWeb());
	}
}
