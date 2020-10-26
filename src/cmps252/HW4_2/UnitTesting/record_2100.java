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

@Tag("47")
class Record_2100 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2100: FirstName is Alecia")
	void FirstNameOfRecord2100() {
		assertEquals("Alecia", customers.get(2099).getFirstName());
	}

	@Test
	@DisplayName("Record 2100: LastName is Robles")
	void LastNameOfRecord2100() {
		assertEquals("Robles", customers.get(2099).getLastName());
	}

	@Test
	@DisplayName("Record 2100: Company is A C Electric Supply Co Inc")
	void CompanyOfRecord2100() {
		assertEquals("A C Electric Supply Co Inc", customers.get(2099).getCompany());
	}

	@Test
	@DisplayName("Record 2100: Address is 1717 Douglas Ave")
	void AddressOfRecord2100() {
		assertEquals("1717 Douglas Ave", customers.get(2099).getAddress());
	}

	@Test
	@DisplayName("Record 2100: City is Kalamazoo")
	void CityOfRecord2100() {
		assertEquals("Kalamazoo", customers.get(2099).getCity());
	}

	@Test
	@DisplayName("Record 2100: County is Kalamazoo")
	void CountyOfRecord2100() {
		assertEquals("Kalamazoo", customers.get(2099).getCounty());
	}

	@Test
	@DisplayName("Record 2100: State is MI")
	void StateOfRecord2100() {
		assertEquals("MI", customers.get(2099).getState());
	}

	@Test
	@DisplayName("Record 2100: ZIP is 49007")
	void ZIPOfRecord2100() {
		assertEquals("49007", customers.get(2099).getZIP());
	}

	@Test
	@DisplayName("Record 2100: Phone is 269-343-6246")
	void PhoneOfRecord2100() {
		assertEquals("269-343-6246", customers.get(2099).getPhone());
	}

	@Test
	@DisplayName("Record 2100: Fax is 269-343-3549")
	void FaxOfRecord2100() {
		assertEquals("269-343-3549", customers.get(2099).getFax());
	}

	@Test
	@DisplayName("Record 2100: Email is alecia@robles.com")
	void EmailOfRecord2100() {
		assertEquals("alecia@robles.com", customers.get(2099).getEmail());
	}

	@Test
	@DisplayName("Record 2100: Web is http://www.aleciarobles.com")
	void WebOfRecord2100() {
		assertEquals("http://www.aleciarobles.com", customers.get(2099).getWeb());
	}
}
