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

@Tag("33")
class Record_4375 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4375: FirstName is Mara")
	void FirstNameOfRecord4375() {
		assertEquals("Mara", customers.get(4374).getFirstName());
	}

	@Test
	@DisplayName("Record 4375: LastName is Casumpang")
	void LastNameOfRecord4375() {
		assertEquals("Casumpang", customers.get(4374).getLastName());
	}

	@Test
	@DisplayName("Record 4375: Company is C D Hartnett Company")
	void CompanyOfRecord4375() {
		assertEquals("C D Hartnett Company", customers.get(4374).getCompany());
	}

	@Test
	@DisplayName("Record 4375: Address is 1819 Elm St")
	void AddressOfRecord4375() {
		assertEquals("1819 Elm St", customers.get(4374).getAddress());
	}

	@Test
	@DisplayName("Record 4375: City is Manchester")
	void CityOfRecord4375() {
		assertEquals("Manchester", customers.get(4374).getCity());
	}

	@Test
	@DisplayName("Record 4375: County is Hillsborough")
	void CountyOfRecord4375() {
		assertEquals("Hillsborough", customers.get(4374).getCounty());
	}

	@Test
	@DisplayName("Record 4375: State is NH")
	void StateOfRecord4375() {
		assertEquals("NH", customers.get(4374).getState());
	}

	@Test
	@DisplayName("Record 4375: ZIP is 3104")
	void ZIPOfRecord4375() {
		assertEquals("3104", customers.get(4374).getZIP());
	}

	@Test
	@DisplayName("Record 4375: Phone is 603-666-5433")
	void PhoneOfRecord4375() {
		assertEquals("603-666-5433", customers.get(4374).getPhone());
	}

	@Test
	@DisplayName("Record 4375: Fax is 603-666-1543")
	void FaxOfRecord4375() {
		assertEquals("603-666-1543", customers.get(4374).getFax());
	}

	@Test
	@DisplayName("Record 4375: Email is mara@casumpang.com")
	void EmailOfRecord4375() {
		assertEquals("mara@casumpang.com", customers.get(4374).getEmail());
	}

	@Test
	@DisplayName("Record 4375: Web is http://www.maracasumpang.com")
	void WebOfRecord4375() {
		assertEquals("http://www.maracasumpang.com", customers.get(4374).getWeb());
	}
}
