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

@Tag("13")
class Record_3154 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3154: FirstName is Forest")
	void FirstNameOfRecord3154() {
		assertEquals("Forest", customers.get(3153).getFirstName());
	}

	@Test
	@DisplayName("Record 3154: LastName is Garcilazo")
	void LastNameOfRecord3154() {
		assertEquals("Garcilazo", customers.get(3153).getLastName());
	}

	@Test
	@DisplayName("Record 3154: Company is Packaging Resources Inc")
	void CompanyOfRecord3154() {
		assertEquals("Packaging Resources Inc", customers.get(3153).getCompany());
	}

	@Test
	@DisplayName("Record 3154: Address is Hwy 31")
	void AddressOfRecord3154() {
		assertEquals("Hwy 31", customers.get(3153).getAddress());
	}

	@Test
	@DisplayName("Record 3154: City is Flemington")
	void CityOfRecord3154() {
		assertEquals("Flemington", customers.get(3153).getCity());
	}

	@Test
	@DisplayName("Record 3154: County is Hunterdon")
	void CountyOfRecord3154() {
		assertEquals("Hunterdon", customers.get(3153).getCounty());
	}

	@Test
	@DisplayName("Record 3154: State is NJ")
	void StateOfRecord3154() {
		assertEquals("NJ", customers.get(3153).getState());
	}

	@Test
	@DisplayName("Record 3154: ZIP is 8822")
	void ZIPOfRecord3154() {
		assertEquals("8822", customers.get(3153).getZIP());
	}

	@Test
	@DisplayName("Record 3154: Phone is 908-782-9777")
	void PhoneOfRecord3154() {
		assertEquals("908-782-9777", customers.get(3153).getPhone());
	}

	@Test
	@DisplayName("Record 3154: Fax is 908-782-2026")
	void FaxOfRecord3154() {
		assertEquals("908-782-2026", customers.get(3153).getFax());
	}

	@Test
	@DisplayName("Record 3154: Email is forest@garcilazo.com")
	void EmailOfRecord3154() {
		assertEquals("forest@garcilazo.com", customers.get(3153).getEmail());
	}

	@Test
	@DisplayName("Record 3154: Web is http://www.forestgarcilazo.com")
	void WebOfRecord3154() {
		assertEquals("http://www.forestgarcilazo.com", customers.get(3153).getWeb());
	}
}
