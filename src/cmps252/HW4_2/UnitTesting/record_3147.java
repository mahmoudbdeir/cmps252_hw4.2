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
class Record_3147 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3147: FirstName is Yvette")
	void FirstNameOfRecord3147() {
		assertEquals("Yvette", customers.get(3146).getFirstName());
	}

	@Test
	@DisplayName("Record 3147: LastName is Henken")
	void LastNameOfRecord3147() {
		assertEquals("Henken", customers.get(3146).getLastName());
	}

	@Test
	@DisplayName("Record 3147: Company is Tile Collection")
	void CompanyOfRecord3147() {
		assertEquals("Tile Collection", customers.get(3146).getCompany());
	}

	@Test
	@DisplayName("Record 3147: Address is 1 Sheafe Rd")
	void AddressOfRecord3147() {
		assertEquals("1 Sheafe Rd", customers.get(3146).getAddress());
	}

	@Test
	@DisplayName("Record 3147: City is Wappingers Falls")
	void CityOfRecord3147() {
		assertEquals("Wappingers Falls", customers.get(3146).getCity());
	}

	@Test
	@DisplayName("Record 3147: County is Dutchess")
	void CountyOfRecord3147() {
		assertEquals("Dutchess", customers.get(3146).getCounty());
	}

	@Test
	@DisplayName("Record 3147: State is NY")
	void StateOfRecord3147() {
		assertEquals("NY", customers.get(3146).getState());
	}

	@Test
	@DisplayName("Record 3147: ZIP is 12590")
	void ZIPOfRecord3147() {
		assertEquals("12590", customers.get(3146).getZIP());
	}

	@Test
	@DisplayName("Record 3147: Phone is 845-462-8754")
	void PhoneOfRecord3147() {
		assertEquals("845-462-8754", customers.get(3146).getPhone());
	}

	@Test
	@DisplayName("Record 3147: Fax is 845-462-1256")
	void FaxOfRecord3147() {
		assertEquals("845-462-1256", customers.get(3146).getFax());
	}

	@Test
	@DisplayName("Record 3147: Email is yvette@henken.com")
	void EmailOfRecord3147() {
		assertEquals("yvette@henken.com", customers.get(3146).getEmail());
	}

	@Test
	@DisplayName("Record 3147: Web is http://www.yvettehenken.com")
	void WebOfRecord3147() {
		assertEquals("http://www.yvettehenken.com", customers.get(3146).getWeb());
	}
}
