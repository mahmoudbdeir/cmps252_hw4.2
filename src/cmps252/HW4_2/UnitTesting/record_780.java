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

@Tag("22")
class Record_780 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 780: FirstName is Frankie")
	void FirstNameOfRecord780() {
		assertEquals("Frankie", customers.get(779).getFirstName());
	}

	@Test
	@DisplayName("Record 780: LastName is Aurich")
	void LastNameOfRecord780() {
		assertEquals("Aurich", customers.get(779).getLastName());
	}

	@Test
	@DisplayName("Record 780: Company is Modern Pizza")
	void CompanyOfRecord780() {
		assertEquals("Modern Pizza", customers.get(779).getCompany());
	}

	@Test
	@DisplayName("Record 780: Address is 2961 W Liberty Ave")
	void AddressOfRecord780() {
		assertEquals("2961 W Liberty Ave", customers.get(779).getAddress());
	}

	@Test
	@DisplayName("Record 780: City is Pittsburgh")
	void CityOfRecord780() {
		assertEquals("Pittsburgh", customers.get(779).getCity());
	}

	@Test
	@DisplayName("Record 780: County is Allegheny")
	void CountyOfRecord780() {
		assertEquals("Allegheny", customers.get(779).getCounty());
	}

	@Test
	@DisplayName("Record 780: State is PA")
	void StateOfRecord780() {
		assertEquals("PA", customers.get(779).getState());
	}

	@Test
	@DisplayName("Record 780: ZIP is 15216")
	void ZIPOfRecord780() {
		assertEquals("15216", customers.get(779).getZIP());
	}

	@Test
	@DisplayName("Record 780: Phone is 412-341-7536")
	void PhoneOfRecord780() {
		assertEquals("412-341-7536", customers.get(779).getPhone());
	}

	@Test
	@DisplayName("Record 780: Fax is 412-341-2572")
	void FaxOfRecord780() {
		assertEquals("412-341-2572", customers.get(779).getFax());
	}

	@Test
	@DisplayName("Record 780: Email is frankie@aurich.com")
	void EmailOfRecord780() {
		assertEquals("frankie@aurich.com", customers.get(779).getEmail());
	}

	@Test
	@DisplayName("Record 780: Web is http://www.frankieaurich.com")
	void WebOfRecord780() {
		assertEquals("http://www.frankieaurich.com", customers.get(779).getWeb());
	}
}
