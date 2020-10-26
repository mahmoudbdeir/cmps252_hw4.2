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

@Tag("39")
class Record_4844 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4844: FirstName is Donald")
	void FirstNameOfRecord4844() {
		assertEquals("Donald", customers.get(4843).getFirstName());
	}

	@Test
	@DisplayName("Record 4844: LastName is Woyahn")
	void LastNameOfRecord4844() {
		assertEquals("Woyahn", customers.get(4843).getLastName());
	}

	@Test
	@DisplayName("Record 4844: Company is Three Bond Of America")
	void CompanyOfRecord4844() {
		assertEquals("Three Bond Of America", customers.get(4843).getCompany());
	}

	@Test
	@DisplayName("Record 4844: Address is 699 8th St")
	void AddressOfRecord4844() {
		assertEquals("699 8th St", customers.get(4843).getAddress());
	}

	@Test
	@DisplayName("Record 4844: City is San Francisco")
	void CityOfRecord4844() {
		assertEquals("San Francisco", customers.get(4843).getCity());
	}

	@Test
	@DisplayName("Record 4844: County is San Francisco")
	void CountyOfRecord4844() {
		assertEquals("San Francisco", customers.get(4843).getCounty());
	}

	@Test
	@DisplayName("Record 4844: State is CA")
	void StateOfRecord4844() {
		assertEquals("CA", customers.get(4843).getState());
	}

	@Test
	@DisplayName("Record 4844: ZIP is 94103")
	void ZIPOfRecord4844() {
		assertEquals("94103", customers.get(4843).getZIP());
	}

	@Test
	@DisplayName("Record 4844: Phone is 415-255-4664")
	void PhoneOfRecord4844() {
		assertEquals("415-255-4664", customers.get(4843).getPhone());
	}

	@Test
	@DisplayName("Record 4844: Fax is 415-255-9593")
	void FaxOfRecord4844() {
		assertEquals("415-255-9593", customers.get(4843).getFax());
	}

	@Test
	@DisplayName("Record 4844: Email is donald@woyahn.com")
	void EmailOfRecord4844() {
		assertEquals("donald@woyahn.com", customers.get(4843).getEmail());
	}

	@Test
	@DisplayName("Record 4844: Web is http://www.donaldwoyahn.com")
	void WebOfRecord4844() {
		assertEquals("http://www.donaldwoyahn.com", customers.get(4843).getWeb());
	}
}
