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

@Tag("18")
class Record_1247 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1247: FirstName is Duncan")
	void FirstNameOfRecord1247() {
		assertEquals("Duncan", customers.get(1246).getFirstName());
	}

	@Test
	@DisplayName("Record 1247: LastName is Kross")
	void LastNameOfRecord1247() {
		assertEquals("Kross", customers.get(1246).getLastName());
	}

	@Test
	@DisplayName("Record 1247: Company is Clark Welding Inc")
	void CompanyOfRecord1247() {
		assertEquals("Clark Welding Inc", customers.get(1246).getCompany());
	}

	@Test
	@DisplayName("Record 1247: Address is 71 Stevenson St")
	void AddressOfRecord1247() {
		assertEquals("71 Stevenson St", customers.get(1246).getAddress());
	}

	@Test
	@DisplayName("Record 1247: City is San Francisco")
	void CityOfRecord1247() {
		assertEquals("San Francisco", customers.get(1246).getCity());
	}

	@Test
	@DisplayName("Record 1247: County is San Francisco")
	void CountyOfRecord1247() {
		assertEquals("San Francisco", customers.get(1246).getCounty());
	}

	@Test
	@DisplayName("Record 1247: State is CA")
	void StateOfRecord1247() {
		assertEquals("CA", customers.get(1246).getState());
	}

	@Test
	@DisplayName("Record 1247: ZIP is 94105")
	void ZIPOfRecord1247() {
		assertEquals("94105", customers.get(1246).getZIP());
	}

	@Test
	@DisplayName("Record 1247: Phone is 415-750-7206")
	void PhoneOfRecord1247() {
		assertEquals("415-750-7206", customers.get(1246).getPhone());
	}

	@Test
	@DisplayName("Record 1247: Fax is 415-750-5706")
	void FaxOfRecord1247() {
		assertEquals("415-750-5706", customers.get(1246).getFax());
	}

	@Test
	@DisplayName("Record 1247: Email is duncan@kross.com")
	void EmailOfRecord1247() {
		assertEquals("duncan@kross.com", customers.get(1246).getEmail());
	}

	@Test
	@DisplayName("Record 1247: Web is http://www.duncankross.com")
	void WebOfRecord1247() {
		assertEquals("http://www.duncankross.com", customers.get(1246).getWeb());
	}
}
