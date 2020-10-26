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

@Tag("19")
class Record_2688 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2688: FirstName is Tameka")
	void FirstNameOfRecord2688() {
		assertEquals("Tameka", customers.get(2687).getFirstName());
	}

	@Test
	@DisplayName("Record 2688: LastName is Palau")
	void LastNameOfRecord2688() {
		assertEquals("Palau", customers.get(2687).getLastName());
	}

	@Test
	@DisplayName("Record 2688: Company is Pegasus Tex Ltd")
	void CompanyOfRecord2688() {
		assertEquals("Pegasus Tex Ltd", customers.get(2687).getCompany());
	}

	@Test
	@DisplayName("Record 2688: Address is 3255 E Washington St")
	void AddressOfRecord2688() {
		assertEquals("3255 E Washington St", customers.get(2687).getAddress());
	}

	@Test
	@DisplayName("Record 2688: City is Phoenix")
	void CityOfRecord2688() {
		assertEquals("Phoenix", customers.get(2687).getCity());
	}

	@Test
	@DisplayName("Record 2688: County is Maricopa")
	void CountyOfRecord2688() {
		assertEquals("Maricopa", customers.get(2687).getCounty());
	}

	@Test
	@DisplayName("Record 2688: State is AZ")
	void StateOfRecord2688() {
		assertEquals("AZ", customers.get(2687).getState());
	}

	@Test
	@DisplayName("Record 2688: ZIP is 85034")
	void ZIPOfRecord2688() {
		assertEquals("85034", customers.get(2687).getZIP());
	}

	@Test
	@DisplayName("Record 2688: Phone is 602-275-1604")
	void PhoneOfRecord2688() {
		assertEquals("602-275-1604", customers.get(2687).getPhone());
	}

	@Test
	@DisplayName("Record 2688: Fax is 602-275-9309")
	void FaxOfRecord2688() {
		assertEquals("602-275-9309", customers.get(2687).getFax());
	}

	@Test
	@DisplayName("Record 2688: Email is tameka@palau.com")
	void EmailOfRecord2688() {
		assertEquals("tameka@palau.com", customers.get(2687).getEmail());
	}

	@Test
	@DisplayName("Record 2688: Web is http://www.tamekapalau.com")
	void WebOfRecord2688() {
		assertEquals("http://www.tamekapalau.com", customers.get(2687).getWeb());
	}
}
