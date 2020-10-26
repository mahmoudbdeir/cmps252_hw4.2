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

@Tag("44")
class Record_2434 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2434: FirstName is Luke")
	void FirstNameOfRecord2434() {
		assertEquals("Luke", customers.get(2433).getFirstName());
	}

	@Test
	@DisplayName("Record 2434: LastName is Bilodeau")
	void LastNameOfRecord2434() {
		assertEquals("Bilodeau", customers.get(2433).getLastName());
	}

	@Test
	@DisplayName("Record 2434: Company is Printed Matter Inc")
	void CompanyOfRecord2434() {
		assertEquals("Printed Matter Inc", customers.get(2433).getCompany());
	}

	@Test
	@DisplayName("Record 2434: Address is 225 Broadway")
	void AddressOfRecord2434() {
		assertEquals("225 Broadway", customers.get(2433).getAddress());
	}

	@Test
	@DisplayName("Record 2434: City is New York")
	void CityOfRecord2434() {
		assertEquals("New York", customers.get(2433).getCity());
	}

	@Test
	@DisplayName("Record 2434: County is New York")
	void CountyOfRecord2434() {
		assertEquals("New York", customers.get(2433).getCounty());
	}

	@Test
	@DisplayName("Record 2434: State is NY")
	void StateOfRecord2434() {
		assertEquals("NY", customers.get(2433).getState());
	}

	@Test
	@DisplayName("Record 2434: ZIP is 10007")
	void ZIPOfRecord2434() {
		assertEquals("10007", customers.get(2433).getZIP());
	}

	@Test
	@DisplayName("Record 2434: Phone is 212-385-0529")
	void PhoneOfRecord2434() {
		assertEquals("212-385-0529", customers.get(2433).getPhone());
	}

	@Test
	@DisplayName("Record 2434: Fax is 212-385-0235")
	void FaxOfRecord2434() {
		assertEquals("212-385-0235", customers.get(2433).getFax());
	}

	@Test
	@DisplayName("Record 2434: Email is luke@bilodeau.com")
	void EmailOfRecord2434() {
		assertEquals("luke@bilodeau.com", customers.get(2433).getEmail());
	}

	@Test
	@DisplayName("Record 2434: Web is http://www.lukebilodeau.com")
	void WebOfRecord2434() {
		assertEquals("http://www.lukebilodeau.com", customers.get(2433).getWeb());
	}
}
