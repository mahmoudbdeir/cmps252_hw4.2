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
class Record_1808 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1808: FirstName is Joe")
	void FirstNameOfRecord1808() {
		assertEquals("Joe", customers.get(1807).getFirstName());
	}

	@Test
	@DisplayName("Record 1808: LastName is Esque")
	void LastNameOfRecord1808() {
		assertEquals("Esque", customers.get(1807).getLastName());
	}

	@Test
	@DisplayName("Record 1808: Company is Community Research Inc")
	void CompanyOfRecord1808() {
		assertEquals("Community Research Inc", customers.get(1807).getCompany());
	}

	@Test
	@DisplayName("Record 1808: Address is 702 Coleman Ave")
	void AddressOfRecord1808() {
		assertEquals("702 Coleman Ave", customers.get(1807).getAddress());
	}

	@Test
	@DisplayName("Record 1808: City is San Jose")
	void CityOfRecord1808() {
		assertEquals("San Jose", customers.get(1807).getCity());
	}

	@Test
	@DisplayName("Record 1808: County is Santa Clara")
	void CountyOfRecord1808() {
		assertEquals("Santa Clara", customers.get(1807).getCounty());
	}

	@Test
	@DisplayName("Record 1808: State is CA")
	void StateOfRecord1808() {
		assertEquals("CA", customers.get(1807).getState());
	}

	@Test
	@DisplayName("Record 1808: ZIP is 95110")
	void ZIPOfRecord1808() {
		assertEquals("95110", customers.get(1807).getZIP());
	}

	@Test
	@DisplayName("Record 1808: Phone is 408-947-5619")
	void PhoneOfRecord1808() {
		assertEquals("408-947-5619", customers.get(1807).getPhone());
	}

	@Test
	@DisplayName("Record 1808: Fax is 408-947-6164")
	void FaxOfRecord1808() {
		assertEquals("408-947-6164", customers.get(1807).getFax());
	}

	@Test
	@DisplayName("Record 1808: Email is joe@esque.com")
	void EmailOfRecord1808() {
		assertEquals("joe@esque.com", customers.get(1807).getEmail());
	}

	@Test
	@DisplayName("Record 1808: Web is http://www.joeesque.com")
	void WebOfRecord1808() {
		assertEquals("http://www.joeesque.com", customers.get(1807).getWeb());
	}
}
