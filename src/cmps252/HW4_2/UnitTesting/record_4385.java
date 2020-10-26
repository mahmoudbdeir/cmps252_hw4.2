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
class Record_4385 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4385: FirstName is Theron")
	void FirstNameOfRecord4385() {
		assertEquals("Theron", customers.get(4384).getFirstName());
	}

	@Test
	@DisplayName("Record 4385: LastName is Megahan")
	void LastNameOfRecord4385() {
		assertEquals("Megahan", customers.get(4384).getLastName());
	}

	@Test
	@DisplayName("Record 4385: Company is Renaissance Developers Inc")
	void CompanyOfRecord4385() {
		assertEquals("Renaissance Developers Inc", customers.get(4384).getCompany());
	}

	@Test
	@DisplayName("Record 4385: Address is 41 Sutton Ln")
	void AddressOfRecord4385() {
		assertEquals("41 Sutton Ln", customers.get(4384).getAddress());
	}

	@Test
	@DisplayName("Record 4385: City is Worcester")
	void CityOfRecord4385() {
		assertEquals("Worcester", customers.get(4384).getCity());
	}

	@Test
	@DisplayName("Record 4385: County is Worcester")
	void CountyOfRecord4385() {
		assertEquals("Worcester", customers.get(4384).getCounty());
	}

	@Test
	@DisplayName("Record 4385: State is MA")
	void StateOfRecord4385() {
		assertEquals("MA", customers.get(4384).getState());
	}

	@Test
	@DisplayName("Record 4385: ZIP is 1603")
	void ZIPOfRecord4385() {
		assertEquals("1603", customers.get(4384).getZIP());
	}

	@Test
	@DisplayName("Record 4385: Phone is 508-755-3247")
	void PhoneOfRecord4385() {
		assertEquals("508-755-3247", customers.get(4384).getPhone());
	}

	@Test
	@DisplayName("Record 4385: Fax is 508-755-5271")
	void FaxOfRecord4385() {
		assertEquals("508-755-5271", customers.get(4384).getFax());
	}

	@Test
	@DisplayName("Record 4385: Email is theron@megahan.com")
	void EmailOfRecord4385() {
		assertEquals("theron@megahan.com", customers.get(4384).getEmail());
	}

	@Test
	@DisplayName("Record 4385: Web is http://www.theronmegahan.com")
	void WebOfRecord4385() {
		assertEquals("http://www.theronmegahan.com", customers.get(4384).getWeb());
	}
}
