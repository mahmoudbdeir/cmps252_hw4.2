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

@Tag("27")
class Record_1939 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1939: FirstName is Zachery")
	void FirstNameOfRecord1939() {
		assertEquals("Zachery", customers.get(1938).getFirstName());
	}

	@Test
	@DisplayName("Record 1939: LastName is Willinghurst")
	void LastNameOfRecord1939() {
		assertEquals("Willinghurst", customers.get(1938).getLastName());
	}

	@Test
	@DisplayName("Record 1939: Company is Huffy Corp")
	void CompanyOfRecord1939() {
		assertEquals("Huffy Corp", customers.get(1938).getCompany());
	}

	@Test
	@DisplayName("Record 1939: Address is 41 E 42nd St")
	void AddressOfRecord1939() {
		assertEquals("41 E 42nd St", customers.get(1938).getAddress());
	}

	@Test
	@DisplayName("Record 1939: City is New York")
	void CityOfRecord1939() {
		assertEquals("New York", customers.get(1938).getCity());
	}

	@Test
	@DisplayName("Record 1939: County is New York")
	void CountyOfRecord1939() {
		assertEquals("New York", customers.get(1938).getCounty());
	}

	@Test
	@DisplayName("Record 1939: State is NY")
	void StateOfRecord1939() {
		assertEquals("NY", customers.get(1938).getState());
	}

	@Test
	@DisplayName("Record 1939: ZIP is 10017")
	void ZIPOfRecord1939() {
		assertEquals("10017", customers.get(1938).getZIP());
	}

	@Test
	@DisplayName("Record 1939: Phone is 212-687-6032")
	void PhoneOfRecord1939() {
		assertEquals("212-687-6032", customers.get(1938).getPhone());
	}

	@Test
	@DisplayName("Record 1939: Fax is 212-687-7377")
	void FaxOfRecord1939() {
		assertEquals("212-687-7377", customers.get(1938).getFax());
	}

	@Test
	@DisplayName("Record 1939: Email is zachery@willinghurst.com")
	void EmailOfRecord1939() {
		assertEquals("zachery@willinghurst.com", customers.get(1938).getEmail());
	}

	@Test
	@DisplayName("Record 1939: Web is http://www.zacherywillinghurst.com")
	void WebOfRecord1939() {
		assertEquals("http://www.zacherywillinghurst.com", customers.get(1938).getWeb());
	}
}
