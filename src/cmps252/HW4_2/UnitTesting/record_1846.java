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

@Tag("8")
class Record_1846 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1846: FirstName is Shawna")
	void FirstNameOfRecord1846() {
		assertEquals("Shawna", customers.get(1845).getFirstName());
	}

	@Test
	@DisplayName("Record 1846: LastName is Gerstenberger")
	void LastNameOfRecord1846() {
		assertEquals("Gerstenberger", customers.get(1845).getLastName());
	}

	@Test
	@DisplayName("Record 1846: Company is Freezer Services Of Arizona")
	void CompanyOfRecord1846() {
		assertEquals("Freezer Services Of Arizona", customers.get(1845).getCompany());
	}

	@Test
	@DisplayName("Record 1846: Address is 5406 N Elston Ave")
	void AddressOfRecord1846() {
		assertEquals("5406 N Elston Ave", customers.get(1845).getAddress());
	}

	@Test
	@DisplayName("Record 1846: City is Chicago")
	void CityOfRecord1846() {
		assertEquals("Chicago", customers.get(1845).getCity());
	}

	@Test
	@DisplayName("Record 1846: County is Cook")
	void CountyOfRecord1846() {
		assertEquals("Cook", customers.get(1845).getCounty());
	}

	@Test
	@DisplayName("Record 1846: State is IL")
	void StateOfRecord1846() {
		assertEquals("IL", customers.get(1845).getState());
	}

	@Test
	@DisplayName("Record 1846: ZIP is 60630")
	void ZIPOfRecord1846() {
		assertEquals("60630", customers.get(1845).getZIP());
	}

	@Test
	@DisplayName("Record 1846: Phone is 773-545-9343")
	void PhoneOfRecord1846() {
		assertEquals("773-545-9343", customers.get(1845).getPhone());
	}

	@Test
	@DisplayName("Record 1846: Fax is 773-545-1177")
	void FaxOfRecord1846() {
		assertEquals("773-545-1177", customers.get(1845).getFax());
	}

	@Test
	@DisplayName("Record 1846: Email is shawna@gerstenberger.com")
	void EmailOfRecord1846() {
		assertEquals("shawna@gerstenberger.com", customers.get(1845).getEmail());
	}

	@Test
	@DisplayName("Record 1846: Web is http://www.shawnagerstenberger.com")
	void WebOfRecord1846() {
		assertEquals("http://www.shawnagerstenberger.com", customers.get(1845).getWeb());
	}
}
