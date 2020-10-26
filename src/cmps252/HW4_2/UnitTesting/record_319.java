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

@Tag("8")
class Record_319 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 319: FirstName is Emmett")
	void FirstNameOfRecord319() {
		assertEquals("Emmett", customers.get(318).getFirstName());
	}

	@Test
	@DisplayName("Record 319: LastName is Board")
	void LastNameOfRecord319() {
		assertEquals("Board", customers.get(318).getLastName());
	}

	@Test
	@DisplayName("Record 319: Company is Gostanian Development")
	void CompanyOfRecord319() {
		assertEquals("Gostanian Development", customers.get(318).getCompany());
	}

	@Test
	@DisplayName("Record 319: Address is 302 34th St")
	void AddressOfRecord319() {
		assertEquals("302 34th St", customers.get(318).getAddress());
	}

	@Test
	@DisplayName("Record 319: City is Lubbock")
	void CityOfRecord319() {
		assertEquals("Lubbock", customers.get(318).getCity());
	}

	@Test
	@DisplayName("Record 319: County is Lubbock")
	void CountyOfRecord319() {
		assertEquals("Lubbock", customers.get(318).getCounty());
	}

	@Test
	@DisplayName("Record 319: State is TX")
	void StateOfRecord319() {
		assertEquals("TX", customers.get(318).getState());
	}

	@Test
	@DisplayName("Record 319: ZIP is 79404")
	void ZIPOfRecord319() {
		assertEquals("79404", customers.get(318).getZIP());
	}

	@Test
	@DisplayName("Record 319: Phone is 806-763-6594")
	void PhoneOfRecord319() {
		assertEquals("806-763-6594", customers.get(318).getPhone());
	}

	@Test
	@DisplayName("Record 319: Fax is 806-763-3277")
	void FaxOfRecord319() {
		assertEquals("806-763-3277", customers.get(318).getFax());
	}

	@Test
	@DisplayName("Record 319: Email is emmett@board.com")
	void EmailOfRecord319() {
		assertEquals("emmett@board.com", customers.get(318).getEmail());
	}

	@Test
	@DisplayName("Record 319: Web is http://www.emmettboard.com")
	void WebOfRecord319() {
		assertEquals("http://www.emmettboard.com", customers.get(318).getWeb());
	}
}
