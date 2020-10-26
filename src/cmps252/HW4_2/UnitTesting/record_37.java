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

@Tag("34")
class Record_37 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 37: FirstName is Angelica")
	void FirstNameOfRecord37() {
		assertEquals("Angelica", customers.get(36).getFirstName());
	}

	@Test
	@DisplayName("Record 37: LastName is Berkenbile")
	void LastNameOfRecord37() {
		assertEquals("Berkenbile", customers.get(36).getLastName());
	}

	@Test
	@DisplayName("Record 37: Company is B D Holt Co")
	void CompanyOfRecord37() {
		assertEquals("B D Holt Co", customers.get(36).getCompany());
	}

	@Test
	@DisplayName("Record 37: Address is 2301 York Rd")
	void AddressOfRecord37() {
		assertEquals("2301 York Rd", customers.get(36).getAddress());
	}

	@Test
	@DisplayName("Record 37: City is Lutherville Timonium")
	void CityOfRecord37() {
		assertEquals("Lutherville Timonium", customers.get(36).getCity());
	}

	@Test
	@DisplayName("Record 37: County is Baltimore")
	void CountyOfRecord37() {
		assertEquals("Baltimore", customers.get(36).getCounty());
	}

	@Test
	@DisplayName("Record 37: State is MD")
	void StateOfRecord37() {
		assertEquals("MD", customers.get(36).getState());
	}

	@Test
	@DisplayName("Record 37: ZIP is 21093")
	void ZIPOfRecord37() {
		assertEquals("21093", customers.get(36).getZIP());
	}

	@Test
	@DisplayName("Record 37: Phone is 410-252-6645")
	void PhoneOfRecord37() {
		assertEquals("410-252-6645", customers.get(36).getPhone());
	}

	@Test
	@DisplayName("Record 37: Fax is 410-252-8038")
	void FaxOfRecord37() {
		assertEquals("410-252-8038", customers.get(36).getFax());
	}

	@Test
	@DisplayName("Record 37: Email is angelica@berkenbile.com")
	void EmailOfRecord37() {
		assertEquals("angelica@berkenbile.com", customers.get(36).getEmail());
	}

	@Test
	@DisplayName("Record 37: Web is http://www.angelicaberkenbile.com")
	void WebOfRecord37() {
		assertEquals("http://www.angelicaberkenbile.com", customers.get(36).getWeb());
	}
}
