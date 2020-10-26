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

@Tag("48")
class Record_98 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 98: FirstName is Clark")
	void FirstNameOfRecord98() {
		assertEquals("Clark", customers.get(97).getFirstName());
	}

	@Test
	@DisplayName("Record 98: LastName is Strothmann")
	void LastNameOfRecord98() {
		assertEquals("Strothmann", customers.get(97).getLastName());
	}

	@Test
	@DisplayName("Record 98: Company is Dann Ocean Towing Inc")
	void CompanyOfRecord98() {
		assertEquals("Dann Ocean Towing Inc", customers.get(97).getCompany());
	}

	@Test
	@DisplayName("Record 98: Address is 16 Filmore Pl")
	void AddressOfRecord98() {
		assertEquals("16 Filmore Pl", customers.get(97).getAddress());
	}

	@Test
	@DisplayName("Record 98: City is Freeport")
	void CityOfRecord98() {
		assertEquals("Freeport", customers.get(97).getCity());
	}

	@Test
	@DisplayName("Record 98: County is Nassau")
	void CountyOfRecord98() {
		assertEquals("Nassau", customers.get(97).getCounty());
	}

	@Test
	@DisplayName("Record 98: State is NY")
	void StateOfRecord98() {
		assertEquals("NY", customers.get(97).getState());
	}

	@Test
	@DisplayName("Record 98: ZIP is 11520")
	void ZIPOfRecord98() {
		assertEquals("11520", customers.get(97).getZIP());
	}

	@Test
	@DisplayName("Record 98: Phone is 516-223-1706")
	void PhoneOfRecord98() {
		assertEquals("516-223-1706", customers.get(97).getPhone());
	}

	@Test
	@DisplayName("Record 98: Fax is 516-223-5004")
	void FaxOfRecord98() {
		assertEquals("516-223-5004", customers.get(97).getFax());
	}

	@Test
	@DisplayName("Record 98: Email is clark@strothmann.com")
	void EmailOfRecord98() {
		assertEquals("clark@strothmann.com", customers.get(97).getEmail());
	}

	@Test
	@DisplayName("Record 98: Web is http://www.clarkstrothmann.com")
	void WebOfRecord98() {
		assertEquals("http://www.clarkstrothmann.com", customers.get(97).getWeb());
	}
}
