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

@Tag("45")
class Record_1707 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1707: FirstName is Major")
	void FirstNameOfRecord1707() {
		assertEquals("Major", customers.get(1706).getFirstName());
	}

	@Test
	@DisplayName("Record 1707: LastName is Burgy")
	void LastNameOfRecord1707() {
		assertEquals("Burgy", customers.get(1706).getLastName());
	}

	@Test
	@DisplayName("Record 1707: Company is Perfex Corp")
	void CompanyOfRecord1707() {
		assertEquals("Perfex Corp", customers.get(1706).getCompany());
	}

	@Test
	@DisplayName("Record 1707: Address is 3304 Churchill Rd")
	void AddressOfRecord1707() {
		assertEquals("3304 Churchill Rd", customers.get(1706).getAddress());
	}

	@Test
	@DisplayName("Record 1707: City is Ralygh")
	void CityOfRecord1707() {
		assertEquals("Ralygh", customers.get(1706).getCity());
	}

	@Test
	@DisplayName("Record 1707: County is Wake")
	void CountyOfRecord1707() {
		assertEquals("Wake", customers.get(1706).getCounty());
	}

	@Test
	@DisplayName("Record 1707: State is NC")
	void StateOfRecord1707() {
		assertEquals("NC", customers.get(1706).getState());
	}

	@Test
	@DisplayName("Record 1707: ZIP is 27607")
	void ZIPOfRecord1707() {
		assertEquals("27607", customers.get(1706).getZIP());
	}

	@Test
	@DisplayName("Record 1707: Phone is 919-782-1323")
	void PhoneOfRecord1707() {
		assertEquals("919-782-1323", customers.get(1706).getPhone());
	}

	@Test
	@DisplayName("Record 1707: Fax is 919-782-3094")
	void FaxOfRecord1707() {
		assertEquals("919-782-3094", customers.get(1706).getFax());
	}

	@Test
	@DisplayName("Record 1707: Email is major@burgy.com")
	void EmailOfRecord1707() {
		assertEquals("major@burgy.com", customers.get(1706).getEmail());
	}

	@Test
	@DisplayName("Record 1707: Web is http://www.majorburgy.com")
	void WebOfRecord1707() {
		assertEquals("http://www.majorburgy.com", customers.get(1706).getWeb());
	}
}
