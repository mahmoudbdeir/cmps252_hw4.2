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

@Tag("11")
class Record_1408 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1408: FirstName is Matt")
	void FirstNameOfRecord1408() {
		assertEquals("Matt", customers.get(1407).getFirstName());
	}

	@Test
	@DisplayName("Record 1408: LastName is Faulkenburg")
	void LastNameOfRecord1408() {
		assertEquals("Faulkenburg", customers.get(1407).getLastName());
	}

	@Test
	@DisplayName("Record 1408: Company is Tri State Carpet Outlet Inc")
	void CompanyOfRecord1408() {
		assertEquals("Tri State Carpet Outlet Inc", customers.get(1407).getCompany());
	}

	@Test
	@DisplayName("Record 1408: Address is 1879 Old Cuthbert Rd")
	void AddressOfRecord1408() {
		assertEquals("1879 Old Cuthbert Rd", customers.get(1407).getAddress());
	}

	@Test
	@DisplayName("Record 1408: City is Cherry Hill")
	void CityOfRecord1408() {
		assertEquals("Cherry Hill", customers.get(1407).getCity());
	}

	@Test
	@DisplayName("Record 1408: County is Camden")
	void CountyOfRecord1408() {
		assertEquals("Camden", customers.get(1407).getCounty());
	}

	@Test
	@DisplayName("Record 1408: State is NJ")
	void StateOfRecord1408() {
		assertEquals("NJ", customers.get(1407).getState());
	}

	@Test
	@DisplayName("Record 1408: ZIP is 8034")
	void ZIPOfRecord1408() {
		assertEquals("8034", customers.get(1407).getZIP());
	}

	@Test
	@DisplayName("Record 1408: Phone is 856-428-8703")
	void PhoneOfRecord1408() {
		assertEquals("856-428-8703", customers.get(1407).getPhone());
	}

	@Test
	@DisplayName("Record 1408: Fax is 856-428-4415")
	void FaxOfRecord1408() {
		assertEquals("856-428-4415", customers.get(1407).getFax());
	}

	@Test
	@DisplayName("Record 1408: Email is matt@faulkenburg.com")
	void EmailOfRecord1408() {
		assertEquals("matt@faulkenburg.com", customers.get(1407).getEmail());
	}

	@Test
	@DisplayName("Record 1408: Web is http://www.mattfaulkenburg.com")
	void WebOfRecord1408() {
		assertEquals("http://www.mattfaulkenburg.com", customers.get(1407).getWeb());
	}
}
