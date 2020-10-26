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
class Record_1624 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1624: FirstName is Cornell")
	void FirstNameOfRecord1624() {
		assertEquals("Cornell", customers.get(1623).getFirstName());
	}

	@Test
	@DisplayName("Record 1624: LastName is Genas")
	void LastNameOfRecord1624() {
		assertEquals("Genas", customers.get(1623).getLastName());
	}

	@Test
	@DisplayName("Record 1624: Company is Wesco")
	void CompanyOfRecord1624() {
		assertEquals("Wesco", customers.get(1623).getCompany());
	}

	@Test
	@DisplayName("Record 1624: Address is 2121 E Flamingo Rd")
	void AddressOfRecord1624() {
		assertEquals("2121 E Flamingo Rd", customers.get(1623).getAddress());
	}

	@Test
	@DisplayName("Record 1624: City is Las Vegas")
	void CityOfRecord1624() {
		assertEquals("Las Vegas", customers.get(1623).getCity());
	}

	@Test
	@DisplayName("Record 1624: County is Clark")
	void CountyOfRecord1624() {
		assertEquals("Clark", customers.get(1623).getCounty());
	}

	@Test
	@DisplayName("Record 1624: State is NV")
	void StateOfRecord1624() {
		assertEquals("NV", customers.get(1623).getState());
	}

	@Test
	@DisplayName("Record 1624: ZIP is 89119")
	void ZIPOfRecord1624() {
		assertEquals("89119", customers.get(1623).getZIP());
	}

	@Test
	@DisplayName("Record 1624: Phone is 702-733-9300")
	void PhoneOfRecord1624() {
		assertEquals("702-733-9300", customers.get(1623).getPhone());
	}

	@Test
	@DisplayName("Record 1624: Fax is 702-733-2005")
	void FaxOfRecord1624() {
		assertEquals("702-733-2005", customers.get(1623).getFax());
	}

	@Test
	@DisplayName("Record 1624: Email is cornell@genas.com")
	void EmailOfRecord1624() {
		assertEquals("cornell@genas.com", customers.get(1623).getEmail());
	}

	@Test
	@DisplayName("Record 1624: Web is http://www.cornellgenas.com")
	void WebOfRecord1624() {
		assertEquals("http://www.cornellgenas.com", customers.get(1623).getWeb());
	}
}
