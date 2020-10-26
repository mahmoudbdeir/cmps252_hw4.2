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

@Tag("40")
class Record_814 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 814: FirstName is Bessie")
	void FirstNameOfRecord814() {
		assertEquals("Bessie", customers.get(813).getFirstName());
	}

	@Test
	@DisplayName("Record 814: LastName is Delille")
	void LastNameOfRecord814() {
		assertEquals("Delille", customers.get(813).getLastName());
	}

	@Test
	@DisplayName("Record 814: Company is Simmons Business Services Corp")
	void CompanyOfRecord814() {
		assertEquals("Simmons Business Services Corp", customers.get(813).getCompany());
	}

	@Test
	@DisplayName("Record 814: Address is 4101 Jackson Rd")
	void AddressOfRecord814() {
		assertEquals("4101 Jackson Rd", customers.get(813).getAddress());
	}

	@Test
	@DisplayName("Record 814: City is Ann Arbor")
	void CityOfRecord814() {
		assertEquals("Ann Arbor", customers.get(813).getCity());
	}

	@Test
	@DisplayName("Record 814: County is Washtenaw")
	void CountyOfRecord814() {
		assertEquals("Washtenaw", customers.get(813).getCounty());
	}

	@Test
	@DisplayName("Record 814: State is MI")
	void StateOfRecord814() {
		assertEquals("MI", customers.get(813).getState());
	}

	@Test
	@DisplayName("Record 814: ZIP is 48103")
	void ZIPOfRecord814() {
		assertEquals("48103", customers.get(813).getZIP());
	}

	@Test
	@DisplayName("Record 814: Phone is 734-662-1825")
	void PhoneOfRecord814() {
		assertEquals("734-662-1825", customers.get(813).getPhone());
	}

	@Test
	@DisplayName("Record 814: Fax is 734-662-1378")
	void FaxOfRecord814() {
		assertEquals("734-662-1378", customers.get(813).getFax());
	}

	@Test
	@DisplayName("Record 814: Email is bessie@delille.com")
	void EmailOfRecord814() {
		assertEquals("bessie@delille.com", customers.get(813).getEmail());
	}

	@Test
	@DisplayName("Record 814: Web is http://www.bessiedelille.com")
	void WebOfRecord814() {
		assertEquals("http://www.bessiedelille.com", customers.get(813).getWeb());
	}
}
