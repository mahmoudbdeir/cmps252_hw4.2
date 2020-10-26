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

@Tag("39")
class Record_14 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 14: FirstName is Antionette")
	void FirstNameOfRecord14() {
		assertEquals("Antionette", customers.get(13).getFirstName());
	}

	@Test
	@DisplayName("Record 14: LastName is Shoobridge")
	void LastNameOfRecord14() {
		assertEquals("Shoobridge", customers.get(13).getLastName());
	}

	@Test
	@DisplayName("Record 14: Company is Dolfin International")
	void CompanyOfRecord14() {
		assertEquals("Dolfin International", customers.get(13).getCompany());
	}

	@Test
	@DisplayName("Record 14: Address is 3790 Nw 167th St")
	void AddressOfRecord14() {
		assertEquals("3790 Nw 167th St", customers.get(13).getAddress());
	}

	@Test
	@DisplayName("Record 14: City is Opa Locka")
	void CityOfRecord14() {
		assertEquals("Opa Locka", customers.get(13).getCity());
	}

	@Test
	@DisplayName("Record 14: County is Miami-Dade")
	void CountyOfRecord14() {
		assertEquals("Miami-Dade", customers.get(13).getCounty());
	}

	@Test
	@DisplayName("Record 14: State is FL")
	void StateOfRecord14() {
		assertEquals("FL", customers.get(13).getState());
	}

	@Test
	@DisplayName("Record 14: ZIP is 33054")
	void ZIPOfRecord14() {
		assertEquals("33054", customers.get(13).getZIP());
	}

	@Test
	@DisplayName("Record 14: Phone is 305-624-9608")
	void PhoneOfRecord14() {
		assertEquals("305-624-9608", customers.get(13).getPhone());
	}

	@Test
	@DisplayName("Record 14: Fax is 305-624-7118")
	void FaxOfRecord14() {
		assertEquals("305-624-7118", customers.get(13).getFax());
	}

	@Test
	@DisplayName("Record 14: Email is antionette@shoobridge.com")
	void EmailOfRecord14() {
		assertEquals("antionette@shoobridge.com", customers.get(13).getEmail());
	}

	@Test
	@DisplayName("Record 14: Web is http://www.antionetteshoobridge.com")
	void WebOfRecord14() {
		assertEquals("http://www.antionetteshoobridge.com", customers.get(13).getWeb());
	}
}
