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

@Tag("9")
class Record_2037 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2037: FirstName is Seymour")
	void FirstNameOfRecord2037() {
		assertEquals("Seymour", customers.get(2036).getFirstName());
	}

	@Test
	@DisplayName("Record 2037: LastName is Virant")
	void LastNameOfRecord2037() {
		assertEquals("Virant", customers.get(2036).getLastName());
	}

	@Test
	@DisplayName("Record 2037: Company is Whhm Radio Station")
	void CompanyOfRecord2037() {
		assertEquals("Whhm Radio Station", customers.get(2036).getCompany());
	}

	@Test
	@DisplayName("Record 2037: Address is 410 State St")
	void AddressOfRecord2037() {
		assertEquals("410 State St", customers.get(2036).getAddress());
	}

	@Test
	@DisplayName("Record 2037: City is New Haven")
	void CityOfRecord2037() {
		assertEquals("New Haven", customers.get(2036).getCity());
	}

	@Test
	@DisplayName("Record 2037: County is New Haven")
	void CountyOfRecord2037() {
		assertEquals("New Haven", customers.get(2036).getCounty());
	}

	@Test
	@DisplayName("Record 2037: State is CT")
	void StateOfRecord2037() {
		assertEquals("CT", customers.get(2036).getState());
	}

	@Test
	@DisplayName("Record 2037: ZIP is 6510")
	void ZIPOfRecord2037() {
		assertEquals("6510", customers.get(2036).getZIP());
	}

	@Test
	@DisplayName("Record 2037: Phone is 203-287-8835")
	void PhoneOfRecord2037() {
		assertEquals("203-287-8835", customers.get(2036).getPhone());
	}

	@Test
	@DisplayName("Record 2037: Fax is 203-287-2686")
	void FaxOfRecord2037() {
		assertEquals("203-287-2686", customers.get(2036).getFax());
	}

	@Test
	@DisplayName("Record 2037: Email is seymour@virant.com")
	void EmailOfRecord2037() {
		assertEquals("seymour@virant.com", customers.get(2036).getEmail());
	}

	@Test
	@DisplayName("Record 2037: Web is http://www.seymourvirant.com")
	void WebOfRecord2037() {
		assertEquals("http://www.seymourvirant.com", customers.get(2036).getWeb());
	}
}
