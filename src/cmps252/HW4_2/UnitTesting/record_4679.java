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
class Record_4679 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4679: FirstName is Catalina")
	void FirstNameOfRecord4679() {
		assertEquals("Catalina", customers.get(4678).getFirstName());
	}

	@Test
	@DisplayName("Record 4679: LastName is Wernex")
	void LastNameOfRecord4679() {
		assertEquals("Wernex", customers.get(4678).getLastName());
	}

	@Test
	@DisplayName("Record 4679: Company is Kgci K 98 Adult Fm")
	void CompanyOfRecord4679() {
		assertEquals("Kgci K 98 Adult Fm", customers.get(4678).getCompany());
	}

	@Test
	@DisplayName("Record 4679: Address is 25 Stillman St")
	void AddressOfRecord4679() {
		assertEquals("25 Stillman St", customers.get(4678).getAddress());
	}

	@Test
	@DisplayName("Record 4679: City is San Francisco")
	void CityOfRecord4679() {
		assertEquals("San Francisco", customers.get(4678).getCity());
	}

	@Test
	@DisplayName("Record 4679: County is San Francisco")
	void CountyOfRecord4679() {
		assertEquals("San Francisco", customers.get(4678).getCounty());
	}

	@Test
	@DisplayName("Record 4679: State is CA")
	void StateOfRecord4679() {
		assertEquals("CA", customers.get(4678).getState());
	}

	@Test
	@DisplayName("Record 4679: ZIP is 94107")
	void ZIPOfRecord4679() {
		assertEquals("94107", customers.get(4678).getZIP());
	}

	@Test
	@DisplayName("Record 4679: Phone is 415-543-2938")
	void PhoneOfRecord4679() {
		assertEquals("415-543-2938", customers.get(4678).getPhone());
	}

	@Test
	@DisplayName("Record 4679: Fax is 415-543-5828")
	void FaxOfRecord4679() {
		assertEquals("415-543-5828", customers.get(4678).getFax());
	}

	@Test
	@DisplayName("Record 4679: Email is catalina@wernex.com")
	void EmailOfRecord4679() {
		assertEquals("catalina@wernex.com", customers.get(4678).getEmail());
	}

	@Test
	@DisplayName("Record 4679: Web is http://www.catalinawernex.com")
	void WebOfRecord4679() {
		assertEquals("http://www.catalinawernex.com", customers.get(4678).getWeb());
	}
}
