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

@Tag("23")
class Record_2043 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2043: FirstName is Randal")
	void FirstNameOfRecord2043() {
		assertEquals("Randal", customers.get(2042).getFirstName());
	}

	@Test
	@DisplayName("Record 2043: LastName is Alegria")
	void LastNameOfRecord2043() {
		assertEquals("Alegria", customers.get(2042).getLastName());
	}

	@Test
	@DisplayName("Record 2043: Company is Wheeler Law Office")
	void CompanyOfRecord2043() {
		assertEquals("Wheeler Law Office", customers.get(2042).getCompany());
	}

	@Test
	@DisplayName("Record 2043: Address is 73 Veronica Ave")
	void AddressOfRecord2043() {
		assertEquals("73 Veronica Ave", customers.get(2042).getAddress());
	}

	@Test
	@DisplayName("Record 2043: City is Somerset")
	void CityOfRecord2043() {
		assertEquals("Somerset", customers.get(2042).getCity());
	}

	@Test
	@DisplayName("Record 2043: County is Somerset")
	void CountyOfRecord2043() {
		assertEquals("Somerset", customers.get(2042).getCounty());
	}

	@Test
	@DisplayName("Record 2043: State is NJ")
	void StateOfRecord2043() {
		assertEquals("NJ", customers.get(2042).getState());
	}

	@Test
	@DisplayName("Record 2043: ZIP is 8873")
	void ZIPOfRecord2043() {
		assertEquals("8873", customers.get(2042).getZIP());
	}

	@Test
	@DisplayName("Record 2043: Phone is 732-828-7151")
	void PhoneOfRecord2043() {
		assertEquals("732-828-7151", customers.get(2042).getPhone());
	}

	@Test
	@DisplayName("Record 2043: Fax is 732-828-3578")
	void FaxOfRecord2043() {
		assertEquals("732-828-3578", customers.get(2042).getFax());
	}

	@Test
	@DisplayName("Record 2043: Email is randal@alegria.com")
	void EmailOfRecord2043() {
		assertEquals("randal@alegria.com", customers.get(2042).getEmail());
	}

	@Test
	@DisplayName("Record 2043: Web is http://www.randalalegria.com")
	void WebOfRecord2043() {
		assertEquals("http://www.randalalegria.com", customers.get(2042).getWeb());
	}
}
