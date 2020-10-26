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

@Tag("39")
class Record_524 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 524: FirstName is Sally")
	void FirstNameOfRecord524() {
		assertEquals("Sally", customers.get(523).getFirstName());
	}

	@Test
	@DisplayName("Record 524: LastName is Pebbles")
	void LastNameOfRecord524() {
		assertEquals("Pebbles", customers.get(523).getLastName());
	}

	@Test
	@DisplayName("Record 524: Company is Triton Tool & Supply Inc")
	void CompanyOfRecord524() {
		assertEquals("Triton Tool & Supply Inc", customers.get(523).getCompany());
	}

	@Test
	@DisplayName("Record 524: Address is 148 W Broadway")
	void AddressOfRecord524() {
		assertEquals("148 W Broadway", customers.get(523).getAddress());
	}

	@Test
	@DisplayName("Record 524: City is San Diego")
	void CityOfRecord524() {
		assertEquals("San Diego", customers.get(523).getCity());
	}

	@Test
	@DisplayName("Record 524: County is San Diego")
	void CountyOfRecord524() {
		assertEquals("San Diego", customers.get(523).getCounty());
	}

	@Test
	@DisplayName("Record 524: State is CA")
	void StateOfRecord524() {
		assertEquals("CA", customers.get(523).getState());
	}

	@Test
	@DisplayName("Record 524: ZIP is 92101")
	void ZIPOfRecord524() {
		assertEquals("92101", customers.get(523).getZIP());
	}

	@Test
	@DisplayName("Record 524: Phone is 619-234-1050")
	void PhoneOfRecord524() {
		assertEquals("619-234-1050", customers.get(523).getPhone());
	}

	@Test
	@DisplayName("Record 524: Fax is 619-234-8585")
	void FaxOfRecord524() {
		assertEquals("619-234-8585", customers.get(523).getFax());
	}

	@Test
	@DisplayName("Record 524: Email is sally@pebbles.com")
	void EmailOfRecord524() {
		assertEquals("sally@pebbles.com", customers.get(523).getEmail());
	}

	@Test
	@DisplayName("Record 524: Web is http://www.sallypebbles.com")
	void WebOfRecord524() {
		assertEquals("http://www.sallypebbles.com", customers.get(523).getWeb());
	}
}
