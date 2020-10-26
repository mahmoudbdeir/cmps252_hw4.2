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

@Tag("37")
class Record_4947 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4947: FirstName is Ursula")
	void FirstNameOfRecord4947() {
		assertEquals("Ursula", customers.get(4946).getFirstName());
	}

	@Test
	@DisplayName("Record 4947: LastName is Delco")
	void LastNameOfRecord4947() {
		assertEquals("Delco", customers.get(4946).getLastName());
	}

	@Test
	@DisplayName("Record 4947: Company is Central Specialties Ltd")
	void CompanyOfRecord4947() {
		assertEquals("Central Specialties Ltd", customers.get(4946).getCompany());
	}

	@Test
	@DisplayName("Record 4947: Address is 46178 Winston Dr")
	void AddressOfRecord4947() {
		assertEquals("46178 Winston Dr", customers.get(4946).getAddress());
	}

	@Test
	@DisplayName("Record 4947: City is Utica")
	void CityOfRecord4947() {
		assertEquals("Utica", customers.get(4946).getCity());
	}

	@Test
	@DisplayName("Record 4947: County is Macomb")
	void CountyOfRecord4947() {
		assertEquals("Macomb", customers.get(4946).getCounty());
	}

	@Test
	@DisplayName("Record 4947: State is MI")
	void StateOfRecord4947() {
		assertEquals("MI", customers.get(4946).getState());
	}

	@Test
	@DisplayName("Record 4947: ZIP is 48315")
	void ZIPOfRecord4947() {
		assertEquals("48315", customers.get(4946).getZIP());
	}

	@Test
	@DisplayName("Record 4947: Phone is 586-566-4759")
	void PhoneOfRecord4947() {
		assertEquals("586-566-4759", customers.get(4946).getPhone());
	}

	@Test
	@DisplayName("Record 4947: Fax is 586-566-9516")
	void FaxOfRecord4947() {
		assertEquals("586-566-9516", customers.get(4946).getFax());
	}

	@Test
	@DisplayName("Record 4947: Email is ursula@delco.com")
	void EmailOfRecord4947() {
		assertEquals("ursula@delco.com", customers.get(4946).getEmail());
	}

	@Test
	@DisplayName("Record 4947: Web is http://www.ursuladelco.com")
	void WebOfRecord4947() {
		assertEquals("http://www.ursuladelco.com", customers.get(4946).getWeb());
	}
}
