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

@Tag("9")
class Record_4888 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4888: FirstName is Nita")
	void FirstNameOfRecord4888() {
		assertEquals("Nita", customers.get(4887).getFirstName());
	}

	@Test
	@DisplayName("Record 4888: LastName is Bailard")
	void LastNameOfRecord4888() {
		assertEquals("Bailard", customers.get(4887).getLastName());
	}

	@Test
	@DisplayName("Record 4888: Company is Health Quote Inc")
	void CompanyOfRecord4888() {
		assertEquals("Health Quote Inc", customers.get(4887).getCompany());
	}

	@Test
	@DisplayName("Record 4888: Address is N Main")
	void AddressOfRecord4888() {
		assertEquals("N Main", customers.get(4887).getAddress());
	}

	@Test
	@DisplayName("Record 4888: City is Pittsford")
	void CityOfRecord4888() {
		assertEquals("Pittsford", customers.get(4887).getCity());
	}

	@Test
	@DisplayName("Record 4888: County is Rutland")
	void CountyOfRecord4888() {
		assertEquals("Rutland", customers.get(4887).getCounty());
	}

	@Test
	@DisplayName("Record 4888: State is VT")
	void StateOfRecord4888() {
		assertEquals("VT", customers.get(4887).getState());
	}

	@Test
	@DisplayName("Record 4888: ZIP is 5763")
	void ZIPOfRecord4888() {
		assertEquals("5763", customers.get(4887).getZIP());
	}

	@Test
	@DisplayName("Record 4888: Phone is 802-483-4432")
	void PhoneOfRecord4888() {
		assertEquals("802-483-4432", customers.get(4887).getPhone());
	}

	@Test
	@DisplayName("Record 4888: Fax is 802-483-0856")
	void FaxOfRecord4888() {
		assertEquals("802-483-0856", customers.get(4887).getFax());
	}

	@Test
	@DisplayName("Record 4888: Email is nita@bailard.com")
	void EmailOfRecord4888() {
		assertEquals("nita@bailard.com", customers.get(4887).getEmail());
	}

	@Test
	@DisplayName("Record 4888: Web is http://www.nitabailard.com")
	void WebOfRecord4888() {
		assertEquals("http://www.nitabailard.com", customers.get(4887).getWeb());
	}
}
