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

@Tag("25")
class Record_111 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 111: FirstName is Ines")
	void FirstNameOfRecord111() {
		assertEquals("Ines", customers.get(110).getFirstName());
	}

	@Test
	@DisplayName("Record 111: LastName is Seltsen")
	void LastNameOfRecord111() {
		assertEquals("Seltsen", customers.get(110).getLastName());
	}

	@Test
	@DisplayName("Record 111: Company is Great American Picture Co")
	void CompanyOfRecord111() {
		assertEquals("Great American Picture Co", customers.get(110).getCompany());
	}

	@Test
	@DisplayName("Record 111: Address is 149 Lawrence St")
	void AddressOfRecord111() {
		assertEquals("149 Lawrence St", customers.get(110).getAddress());
	}

	@Test
	@DisplayName("Record 111: City is Brooklyn")
	void CityOfRecord111() {
		assertEquals("Brooklyn", customers.get(110).getCity());
	}

	@Test
	@DisplayName("Record 111: County is Kings")
	void CountyOfRecord111() {
		assertEquals("Kings", customers.get(110).getCounty());
	}

	@Test
	@DisplayName("Record 111: State is NY")
	void StateOfRecord111() {
		assertEquals("NY", customers.get(110).getState());
	}

	@Test
	@DisplayName("Record 111: ZIP is 11201")
	void ZIPOfRecord111() {
		assertEquals("11201", customers.get(110).getZIP());
	}

	@Test
	@DisplayName("Record 111: Phone is 718-783-4438")
	void PhoneOfRecord111() {
		assertEquals("718-783-4438", customers.get(110).getPhone());
	}

	@Test
	@DisplayName("Record 111: Fax is 718-783-3566")
	void FaxOfRecord111() {
		assertEquals("718-783-3566", customers.get(110).getFax());
	}

	@Test
	@DisplayName("Record 111: Email is ines@seltsen.com")
	void EmailOfRecord111() {
		assertEquals("ines@seltsen.com", customers.get(110).getEmail());
	}

	@Test
	@DisplayName("Record 111: Web is http://www.inesseltsen.com")
	void WebOfRecord111() {
		assertEquals("http://www.inesseltsen.com", customers.get(110).getWeb());
	}
}
