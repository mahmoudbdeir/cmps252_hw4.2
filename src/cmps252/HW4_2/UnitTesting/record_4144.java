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

@Tag("25")
class Record_4144 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4144: FirstName is Shelley")
	void FirstNameOfRecord4144() {
		assertEquals("Shelley", customers.get(4143).getFirstName());
	}

	@Test
	@DisplayName("Record 4144: LastName is Harootunian")
	void LastNameOfRecord4144() {
		assertEquals("Harootunian", customers.get(4143).getLastName());
	}

	@Test
	@DisplayName("Record 4144: Company is Ringer, Deborah J")
	void CompanyOfRecord4144() {
		assertEquals("Ringer, Deborah J", customers.get(4143).getCompany());
	}

	@Test
	@DisplayName("Record 4144: Address is 5665 State Route 31")
	void AddressOfRecord4144() {
		assertEquals("5665 State Route 31", customers.get(4143).getAddress());
	}

	@Test
	@DisplayName("Record 4144: City is Cicero")
	void CityOfRecord4144() {
		assertEquals("Cicero", customers.get(4143).getCity());
	}

	@Test
	@DisplayName("Record 4144: County is Onondaga")
	void CountyOfRecord4144() {
		assertEquals("Onondaga", customers.get(4143).getCounty());
	}

	@Test
	@DisplayName("Record 4144: State is NY")
	void StateOfRecord4144() {
		assertEquals("NY", customers.get(4143).getState());
	}

	@Test
	@DisplayName("Record 4144: ZIP is 13039")
	void ZIPOfRecord4144() {
		assertEquals("13039", customers.get(4143).getZIP());
	}

	@Test
	@DisplayName("Record 4144: Phone is 315-699-6923")
	void PhoneOfRecord4144() {
		assertEquals("315-699-6923", customers.get(4143).getPhone());
	}

	@Test
	@DisplayName("Record 4144: Fax is 315-699-4903")
	void FaxOfRecord4144() {
		assertEquals("315-699-4903", customers.get(4143).getFax());
	}

	@Test
	@DisplayName("Record 4144: Email is shelley@harootunian.com")
	void EmailOfRecord4144() {
		assertEquals("shelley@harootunian.com", customers.get(4143).getEmail());
	}

	@Test
	@DisplayName("Record 4144: Web is http://www.shelleyharootunian.com")
	void WebOfRecord4144() {
		assertEquals("http://www.shelleyharootunian.com", customers.get(4143).getWeb());
	}
}
