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

@Tag("29")
class Record_3557 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3557: FirstName is Marco")
	void FirstNameOfRecord3557() {
		assertEquals("Marco", customers.get(3556).getFirstName());
	}

	@Test
	@DisplayName("Record 3557: LastName is Farish")
	void LastNameOfRecord3557() {
		assertEquals("Farish", customers.get(3556).getLastName());
	}

	@Test
	@DisplayName("Record 3557: Company is Bug Press")
	void CompanyOfRecord3557() {
		assertEquals("Bug Press", customers.get(3556).getCompany());
	}

	@Test
	@DisplayName("Record 3557: Address is 255 W")
	void AddressOfRecord3557() {
		assertEquals("255 W", customers.get(3556).getAddress());
	}

	@Test
	@DisplayName("Record 3557: City is San Jose")
	void CityOfRecord3557() {
		assertEquals("San Jose", customers.get(3556).getCity());
	}

	@Test
	@DisplayName("Record 3557: County is Santa Clara")
	void CountyOfRecord3557() {
		assertEquals("Santa Clara", customers.get(3556).getCounty());
	}

	@Test
	@DisplayName("Record 3557: State is CA")
	void StateOfRecord3557() {
		assertEquals("CA", customers.get(3556).getState());
	}

	@Test
	@DisplayName("Record 3557: ZIP is 95110")
	void ZIPOfRecord3557() {
		assertEquals("95110", customers.get(3556).getZIP());
	}

	@Test
	@DisplayName("Record 3557: Phone is 408-294-0294")
	void PhoneOfRecord3557() {
		assertEquals("408-294-0294", customers.get(3556).getPhone());
	}

	@Test
	@DisplayName("Record 3557: Fax is 408-294-4872")
	void FaxOfRecord3557() {
		assertEquals("408-294-4872", customers.get(3556).getFax());
	}

	@Test
	@DisplayName("Record 3557: Email is marco@farish.com")
	void EmailOfRecord3557() {
		assertEquals("marco@farish.com", customers.get(3556).getEmail());
	}

	@Test
	@DisplayName("Record 3557: Web is http://www.marcofarish.com")
	void WebOfRecord3557() {
		assertEquals("http://www.marcofarish.com", customers.get(3556).getWeb());
	}
}
