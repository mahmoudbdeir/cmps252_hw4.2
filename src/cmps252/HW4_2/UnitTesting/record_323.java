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

@Tag("5")
class Record_323 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 323: FirstName is Pablo")
	void FirstNameOfRecord323() {
		assertEquals("Pablo", customers.get(322).getFirstName());
	}

	@Test
	@DisplayName("Record 323: LastName is Halsall")
	void LastNameOfRecord323() {
		assertEquals("Halsall", customers.get(322).getLastName());
	}

	@Test
	@DisplayName("Record 323: Company is Scott Douglass Luton")
	void CompanyOfRecord323() {
		assertEquals("Scott Douglass Luton", customers.get(322).getCompany());
	}

	@Test
	@DisplayName("Record 323: Address is 1456 Coney Island Ave")
	void AddressOfRecord323() {
		assertEquals("1456 Coney Island Ave", customers.get(322).getAddress());
	}

	@Test
	@DisplayName("Record 323: City is Brooklyn")
	void CityOfRecord323() {
		assertEquals("Brooklyn", customers.get(322).getCity());
	}

	@Test
	@DisplayName("Record 323: County is Kings")
	void CountyOfRecord323() {
		assertEquals("Kings", customers.get(322).getCounty());
	}

	@Test
	@DisplayName("Record 323: State is NY")
	void StateOfRecord323() {
		assertEquals("NY", customers.get(322).getState());
	}

	@Test
	@DisplayName("Record 323: ZIP is 11230")
	void ZIPOfRecord323() {
		assertEquals("11230", customers.get(322).getZIP());
	}

	@Test
	@DisplayName("Record 323: Phone is 718-258-7146")
	void PhoneOfRecord323() {
		assertEquals("718-258-7146", customers.get(322).getPhone());
	}

	@Test
	@DisplayName("Record 323: Fax is 718-258-1677")
	void FaxOfRecord323() {
		assertEquals("718-258-1677", customers.get(322).getFax());
	}

	@Test
	@DisplayName("Record 323: Email is pablo@halsall.com")
	void EmailOfRecord323() {
		assertEquals("pablo@halsall.com", customers.get(322).getEmail());
	}

	@Test
	@DisplayName("Record 323: Web is http://www.pablohalsall.com")
	void WebOfRecord323() {
		assertEquals("http://www.pablohalsall.com", customers.get(322).getWeb());
	}
}
