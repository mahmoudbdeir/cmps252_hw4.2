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

@Tag("40")
class Record_2954 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2954: FirstName is Lyndon")
	void FirstNameOfRecord2954() {
		assertEquals("Lyndon", customers.get(2953).getFirstName());
	}

	@Test
	@DisplayName("Record 2954: LastName is Babbin")
	void LastNameOfRecord2954() {
		assertEquals("Babbin", customers.get(2953).getLastName());
	}

	@Test
	@DisplayName("Record 2954: Company is Mathews Click beaman Inc")
	void CompanyOfRecord2954() {
		assertEquals("Mathews Click beaman Inc", customers.get(2953).getCompany());
	}

	@Test
	@DisplayName("Record 2954: Address is 103 9th Ave Sw")
	void AddressOfRecord2954() {
		assertEquals("103 9th Ave Sw", customers.get(2953).getAddress());
	}

	@Test
	@DisplayName("Record 2954: City is Ephrata")
	void CityOfRecord2954() {
		assertEquals("Ephrata", customers.get(2953).getCity());
	}

	@Test
	@DisplayName("Record 2954: County is Grant")
	void CountyOfRecord2954() {
		assertEquals("Grant", customers.get(2953).getCounty());
	}

	@Test
	@DisplayName("Record 2954: State is WA")
	void StateOfRecord2954() {
		assertEquals("WA", customers.get(2953).getState());
	}

	@Test
	@DisplayName("Record 2954: ZIP is 98823")
	void ZIPOfRecord2954() {
		assertEquals("98823", customers.get(2953).getZIP());
	}

	@Test
	@DisplayName("Record 2954: Phone is 509-754-6005")
	void PhoneOfRecord2954() {
		assertEquals("509-754-6005", customers.get(2953).getPhone());
	}

	@Test
	@DisplayName("Record 2954: Fax is 509-754-7545")
	void FaxOfRecord2954() {
		assertEquals("509-754-7545", customers.get(2953).getFax());
	}

	@Test
	@DisplayName("Record 2954: Email is lyndon@babbin.com")
	void EmailOfRecord2954() {
		assertEquals("lyndon@babbin.com", customers.get(2953).getEmail());
	}

	@Test
	@DisplayName("Record 2954: Web is http://www.lyndonbabbin.com")
	void WebOfRecord2954() {
		assertEquals("http://www.lyndonbabbin.com", customers.get(2953).getWeb());
	}
}
