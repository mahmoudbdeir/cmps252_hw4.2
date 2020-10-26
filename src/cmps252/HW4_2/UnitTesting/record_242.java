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
class Record_242 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 242: FirstName is Dydre")
	void FirstNameOfRecord242() {
		assertEquals("Dydre", customers.get(241).getFirstName());
	}

	@Test
	@DisplayName("Record 242: LastName is Dunlap")
	void LastNameOfRecord242() {
		assertEquals("Dunlap", customers.get(241).getLastName());
	}

	@Test
	@DisplayName("Record 242: Company is Gitano Group Inc")
	void CompanyOfRecord242() {
		assertEquals("Gitano Group Inc", customers.get(241).getCompany());
	}

	@Test
	@DisplayName("Record 242: Address is 17 W 17th St")
	void AddressOfRecord242() {
		assertEquals("17 W 17th St", customers.get(241).getAddress());
	}

	@Test
	@DisplayName("Record 242: City is New York")
	void CityOfRecord242() {
		assertEquals("New York", customers.get(241).getCity());
	}

	@Test
	@DisplayName("Record 242: County is New York")
	void CountyOfRecord242() {
		assertEquals("New York", customers.get(241).getCounty());
	}

	@Test
	@DisplayName("Record 242: State is NY")
	void StateOfRecord242() {
		assertEquals("NY", customers.get(241).getState());
	}

	@Test
	@DisplayName("Record 242: ZIP is 10011")
	void ZIPOfRecord242() {
		assertEquals("10011", customers.get(241).getZIP());
	}

	@Test
	@DisplayName("Record 242: Phone is 212-675-5054")
	void PhoneOfRecord242() {
		assertEquals("212-675-5054", customers.get(241).getPhone());
	}

	@Test
	@DisplayName("Record 242: Fax is 212-675-9741")
	void FaxOfRecord242() {
		assertEquals("212-675-9741", customers.get(241).getFax());
	}

	@Test
	@DisplayName("Record 242: Email is dydre@dunlap.com")
	void EmailOfRecord242() {
		assertEquals("dydre@dunlap.com", customers.get(241).getEmail());
	}

	@Test
	@DisplayName("Record 242: Web is http://www.dydredunlap.com")
	void WebOfRecord242() {
		assertEquals("http://www.dydredunlap.com", customers.get(241).getWeb());
	}
}
