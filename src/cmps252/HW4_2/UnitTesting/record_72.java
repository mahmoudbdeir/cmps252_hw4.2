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

@Tag("13")
class Record_72 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 72: FirstName is Connie")
	void FirstNameOfRecord72() {
		assertEquals("Connie", customers.get(71).getFirstName());
	}

	@Test
	@DisplayName("Record 72: LastName is Greenhalgh")
	void LastNameOfRecord72() {
		assertEquals("Greenhalgh", customers.get(71).getLastName());
	}

	@Test
	@DisplayName("Record 72: Company is Norwesco Inc")
	void CompanyOfRecord72() {
		assertEquals("Norwesco Inc", customers.get(71).getCompany());
	}

	@Test
	@DisplayName("Record 72: Address is 19760 Cajon Blvd")
	void AddressOfRecord72() {
		assertEquals("19760 Cajon Blvd", customers.get(71).getAddress());
	}

	@Test
	@DisplayName("Record 72: City is San Bernardino")
	void CityOfRecord72() {
		assertEquals("San Bernardino", customers.get(71).getCity());
	}

	@Test
	@DisplayName("Record 72: County is San Bernardino")
	void CountyOfRecord72() {
		assertEquals("San Bernardino", customers.get(71).getCounty());
	}

	@Test
	@DisplayName("Record 72: State is CA")
	void StateOfRecord72() {
		assertEquals("CA", customers.get(71).getState());
	}

	@Test
	@DisplayName("Record 72: ZIP is 92407")
	void ZIPOfRecord72() {
		assertEquals("92407", customers.get(71).getZIP());
	}

	@Test
	@DisplayName("Record 72: Phone is 909-880-1790")
	void PhoneOfRecord72() {
		assertEquals("909-880-1790", customers.get(71).getPhone());
	}

	@Test
	@DisplayName("Record 72: Fax is 909-880-6088")
	void FaxOfRecord72() {
		assertEquals("909-880-6088", customers.get(71).getFax());
	}

	@Test
	@DisplayName("Record 72: Email is connie@greenhalgh.com")
	void EmailOfRecord72() {
		assertEquals("connie@greenhalgh.com", customers.get(71).getEmail());
	}

	@Test
	@DisplayName("Record 72: Web is http://www.conniegreenhalgh.com")
	void WebOfRecord72() {
		assertEquals("http://www.conniegreenhalgh.com", customers.get(71).getWeb());
	}
}
