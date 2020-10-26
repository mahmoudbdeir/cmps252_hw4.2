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

@Tag("31")
class Record_1563 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1563: FirstName is Gordon")
	void FirstNameOfRecord1563() {
		assertEquals("Gordon", customers.get(1562).getFirstName());
	}

	@Test
	@DisplayName("Record 1563: LastName is Borza")
	void LastNameOfRecord1563() {
		assertEquals("Borza", customers.get(1562).getLastName());
	}

	@Test
	@DisplayName("Record 1563: Company is Yesports Packaging Co")
	void CompanyOfRecord1563() {
		assertEquals("Yesports Packaging Co", customers.get(1562).getCompany());
	}

	@Test
	@DisplayName("Record 1563: Address is 12675 E Us Highway 36")
	void AddressOfRecord1563() {
		assertEquals("12675 E Us Highway 36", customers.get(1562).getAddress());
	}

	@Test
	@DisplayName("Record 1563: City is Plainfield")
	void CityOfRecord1563() {
		assertEquals("Plainfield", customers.get(1562).getCity());
	}

	@Test
	@DisplayName("Record 1563: County is Hendricks")
	void CountyOfRecord1563() {
		assertEquals("Hendricks", customers.get(1562).getCounty());
	}

	@Test
	@DisplayName("Record 1563: State is IN")
	void StateOfRecord1563() {
		assertEquals("IN", customers.get(1562).getState());
	}

	@Test
	@DisplayName("Record 1563: ZIP is 46168")
	void ZIPOfRecord1563() {
		assertEquals("46168", customers.get(1562).getZIP());
	}

	@Test
	@DisplayName("Record 1563: Phone is 317-272-7235")
	void PhoneOfRecord1563() {
		assertEquals("317-272-7235", customers.get(1562).getPhone());
	}

	@Test
	@DisplayName("Record 1563: Fax is 317-272-9523")
	void FaxOfRecord1563() {
		assertEquals("317-272-9523", customers.get(1562).getFax());
	}

	@Test
	@DisplayName("Record 1563: Email is gordon@borza.com")
	void EmailOfRecord1563() {
		assertEquals("gordon@borza.com", customers.get(1562).getEmail());
	}

	@Test
	@DisplayName("Record 1563: Web is http://www.gordonborza.com")
	void WebOfRecord1563() {
		assertEquals("http://www.gordonborza.com", customers.get(1562).getWeb());
	}
}
