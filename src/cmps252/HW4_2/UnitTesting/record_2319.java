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
class Record_2319 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2319: FirstName is Mary")
	void FirstNameOfRecord2319() {
		assertEquals("Mary", customers.get(2318).getFirstName());
	}

	@Test
	@DisplayName("Record 2319: LastName is Throneberry")
	void LastNameOfRecord2319() {
		assertEquals("Throneberry", customers.get(2318).getLastName());
	}

	@Test
	@DisplayName("Record 2319: Company is Schedule")
	void CompanyOfRecord2319() {
		assertEquals("Schedule", customers.get(2318).getCompany());
	}

	@Test
	@DisplayName("Record 2319: Address is 6240b Clark Rd")
	void AddressOfRecord2319() {
		assertEquals("6240b Clark Rd", customers.get(2318).getAddress());
	}

	@Test
	@DisplayName("Record 2319: City is Paradise")
	void CityOfRecord2319() {
		assertEquals("Paradise", customers.get(2318).getCity());
	}

	@Test
	@DisplayName("Record 2319: County is Butte")
	void CountyOfRecord2319() {
		assertEquals("Butte", customers.get(2318).getCounty());
	}

	@Test
	@DisplayName("Record 2319: State is CA")
	void StateOfRecord2319() {
		assertEquals("CA", customers.get(2318).getState());
	}

	@Test
	@DisplayName("Record 2319: ZIP is 95969")
	void ZIPOfRecord2319() {
		assertEquals("95969", customers.get(2318).getZIP());
	}

	@Test
	@DisplayName("Record 2319: Phone is 530-877-9059")
	void PhoneOfRecord2319() {
		assertEquals("530-877-9059", customers.get(2318).getPhone());
	}

	@Test
	@DisplayName("Record 2319: Fax is 530-877-8909")
	void FaxOfRecord2319() {
		assertEquals("530-877-8909", customers.get(2318).getFax());
	}

	@Test
	@DisplayName("Record 2319: Email is mary@throneberry.com")
	void EmailOfRecord2319() {
		assertEquals("mary@throneberry.com", customers.get(2318).getEmail());
	}

	@Test
	@DisplayName("Record 2319: Web is http://www.marythroneberry.com")
	void WebOfRecord2319() {
		assertEquals("http://www.marythroneberry.com", customers.get(2318).getWeb());
	}
}
