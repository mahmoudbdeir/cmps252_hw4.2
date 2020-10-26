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

@Tag("46")
class Record_4681 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4681: FirstName is Lavonne")
	void FirstNameOfRecord4681() {
		assertEquals("Lavonne", customers.get(4680).getFirstName());
	}

	@Test
	@DisplayName("Record 4681: LastName is Kallstrom")
	void LastNameOfRecord4681() {
		assertEquals("Kallstrom", customers.get(4680).getLastName());
	}

	@Test
	@DisplayName("Record 4681: Company is Crown Inc")
	void CompanyOfRecord4681() {
		assertEquals("Crown Inc", customers.get(4680).getCompany());
	}

	@Test
	@DisplayName("Record 4681: Address is 2428 Bridge Ave")
	void AddressOfRecord4681() {
		assertEquals("2428 Bridge Ave", customers.get(4680).getAddress());
	}

	@Test
	@DisplayName("Record 4681: City is Point Pleasant Beach")
	void CityOfRecord4681() {
		assertEquals("Point Pleasant Beach", customers.get(4680).getCity());
	}

	@Test
	@DisplayName("Record 4681: County is Ocean")
	void CountyOfRecord4681() {
		assertEquals("Ocean", customers.get(4680).getCounty());
	}

	@Test
	@DisplayName("Record 4681: State is NJ")
	void StateOfRecord4681() {
		assertEquals("NJ", customers.get(4680).getState());
	}

	@Test
	@DisplayName("Record 4681: ZIP is 8742")
	void ZIPOfRecord4681() {
		assertEquals("8742", customers.get(4680).getZIP());
	}

	@Test
	@DisplayName("Record 4681: Phone is 732-892-5690")
	void PhoneOfRecord4681() {
		assertEquals("732-892-5690", customers.get(4680).getPhone());
	}

	@Test
	@DisplayName("Record 4681: Fax is 732-892-0024")
	void FaxOfRecord4681() {
		assertEquals("732-892-0024", customers.get(4680).getFax());
	}

	@Test
	@DisplayName("Record 4681: Email is lavonne@kallstrom.com")
	void EmailOfRecord4681() {
		assertEquals("lavonne@kallstrom.com", customers.get(4680).getEmail());
	}

	@Test
	@DisplayName("Record 4681: Web is http://www.lavonnekallstrom.com")
	void WebOfRecord4681() {
		assertEquals("http://www.lavonnekallstrom.com", customers.get(4680).getWeb());
	}
}
