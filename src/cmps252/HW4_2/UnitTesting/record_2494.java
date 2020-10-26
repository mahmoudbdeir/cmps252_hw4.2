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
class Record_2494 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2494: FirstName is Wilbur")
	void FirstNameOfRecord2494() {
		assertEquals("Wilbur", customers.get(2493).getFirstName());
	}

	@Test
	@DisplayName("Record 2494: LastName is Govoni")
	void LastNameOfRecord2494() {
		assertEquals("Govoni", customers.get(2493).getLastName());
	}

	@Test
	@DisplayName("Record 2494: Company is Cable Network Inc")
	void CompanyOfRecord2494() {
		assertEquals("Cable Network Inc", customers.get(2493).getCompany());
	}

	@Test
	@DisplayName("Record 2494: Address is 62 Avocado St")
	void AddressOfRecord2494() {
		assertEquals("62 Avocado St", customers.get(2493).getAddress());
	}

	@Test
	@DisplayName("Record 2494: City is Springfield")
	void CityOfRecord2494() {
		assertEquals("Springfield", customers.get(2493).getCity());
	}

	@Test
	@DisplayName("Record 2494: County is Hampden")
	void CountyOfRecord2494() {
		assertEquals("Hampden", customers.get(2493).getCounty());
	}

	@Test
	@DisplayName("Record 2494: State is MA")
	void StateOfRecord2494() {
		assertEquals("MA", customers.get(2493).getState());
	}

	@Test
	@DisplayName("Record 2494: ZIP is 1104")
	void ZIPOfRecord2494() {
		assertEquals("1104", customers.get(2493).getZIP());
	}

	@Test
	@DisplayName("Record 2494: Phone is 413-734-8426")
	void PhoneOfRecord2494() {
		assertEquals("413-734-8426", customers.get(2493).getPhone());
	}

	@Test
	@DisplayName("Record 2494: Fax is 413-734-3923")
	void FaxOfRecord2494() {
		assertEquals("413-734-3923", customers.get(2493).getFax());
	}

	@Test
	@DisplayName("Record 2494: Email is wilbur@govoni.com")
	void EmailOfRecord2494() {
		assertEquals("wilbur@govoni.com", customers.get(2493).getEmail());
	}

	@Test
	@DisplayName("Record 2494: Web is http://www.wilburgovoni.com")
	void WebOfRecord2494() {
		assertEquals("http://www.wilburgovoni.com", customers.get(2493).getWeb());
	}
}
