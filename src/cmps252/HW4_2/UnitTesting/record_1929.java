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

@Tag("6")
class Record_1929 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1929: FirstName is Jarred")
	void FirstNameOfRecord1929() {
		assertEquals("Jarred", customers.get(1928).getFirstName());
	}

	@Test
	@DisplayName("Record 1929: LastName is Enman")
	void LastNameOfRecord1929() {
		assertEquals("Enman", customers.get(1928).getLastName());
	}

	@Test
	@DisplayName("Record 1929: Company is Monroe Public Library")
	void CompanyOfRecord1929() {
		assertEquals("Monroe Public Library", customers.get(1928).getCompany());
	}

	@Test
	@DisplayName("Record 1929: Address is 40 Cuttermill Rd")
	void AddressOfRecord1929() {
		assertEquals("40 Cuttermill Rd", customers.get(1928).getAddress());
	}

	@Test
	@DisplayName("Record 1929: City is Great Neck")
	void CityOfRecord1929() {
		assertEquals("Great Neck", customers.get(1928).getCity());
	}

	@Test
	@DisplayName("Record 1929: County is Nassau")
	void CountyOfRecord1929() {
		assertEquals("Nassau", customers.get(1928).getCounty());
	}

	@Test
	@DisplayName("Record 1929: State is NY")
	void StateOfRecord1929() {
		assertEquals("NY", customers.get(1928).getState());
	}

	@Test
	@DisplayName("Record 1929: ZIP is 11021")
	void ZIPOfRecord1929() {
		assertEquals("11021", customers.get(1928).getZIP());
	}

	@Test
	@DisplayName("Record 1929: Phone is 516-829-8392")
	void PhoneOfRecord1929() {
		assertEquals("516-829-8392", customers.get(1928).getPhone());
	}

	@Test
	@DisplayName("Record 1929: Fax is 516-829-2979")
	void FaxOfRecord1929() {
		assertEquals("516-829-2979", customers.get(1928).getFax());
	}

	@Test
	@DisplayName("Record 1929: Email is jarred@enman.com")
	void EmailOfRecord1929() {
		assertEquals("jarred@enman.com", customers.get(1928).getEmail());
	}

	@Test
	@DisplayName("Record 1929: Web is http://www.jarredenman.com")
	void WebOfRecord1929() {
		assertEquals("http://www.jarredenman.com", customers.get(1928).getWeb());
	}
}
