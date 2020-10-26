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

@Tag("24")
class Record_819 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 819: FirstName is Lyf")
	void FirstNameOfRecord819() {
		assertEquals("Lyf", customers.get(818).getFirstName());
	}

	@Test
	@DisplayName("Record 819: LastName is Tingle")
	void LastNameOfRecord819() {
		assertEquals("Tingle", customers.get(818).getLastName());
	}

	@Test
	@DisplayName("Record 819: Company is Rosenbach Museum & Library")
	void CompanyOfRecord819() {
		assertEquals("Rosenbach Museum & Library", customers.get(818).getCompany());
	}

	@Test
	@DisplayName("Record 819: Address is 827 Black Oak Ridge Rd")
	void AddressOfRecord819() {
		assertEquals("827 Black Oak Ridge Rd", customers.get(818).getAddress());
	}

	@Test
	@DisplayName("Record 819: City is Wayne")
	void CityOfRecord819() {
		assertEquals("Wayne", customers.get(818).getCity());
	}

	@Test
	@DisplayName("Record 819: County is Passaic")
	void CountyOfRecord819() {
		assertEquals("Passaic", customers.get(818).getCounty());
	}

	@Test
	@DisplayName("Record 819: State is NJ")
	void StateOfRecord819() {
		assertEquals("NJ", customers.get(818).getState());
	}

	@Test
	@DisplayName("Record 819: ZIP is 07470")
	void ZIPOfRecord819() {
		assertEquals("07470", customers.get(818).getZIP());
	}

	@Test
	@DisplayName("Record 819: Phone is 973-835-0994")
	void PhoneOfRecord819() {
		assertEquals("973-835-0994", customers.get(818).getPhone());
	}

	@Test
	@DisplayName("Record 819: Fax is 973-835-6063")
	void FaxOfRecord819() {
		assertEquals("973-835-6063", customers.get(818).getFax());
	}

	@Test
	@DisplayName("Record 819: Email is lyf@tingle.com")
	void EmailOfRecord819() {
		assertEquals("lyf@tingle.com", customers.get(818).getEmail());
	}

	@Test
	@DisplayName("Record 819: Web is http://www.lyftingle.com")
	void WebOfRecord819() {
		assertEquals("http://www.lyftingle.com", customers.get(818).getWeb());
	}
}
