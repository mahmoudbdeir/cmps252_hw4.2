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

@Tag("43")
class Record_1424 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1424: FirstName is Doug")
	void FirstNameOfRecord1424() {
		assertEquals("Doug", customers.get(1423).getFirstName());
	}

	@Test
	@DisplayName("Record 1424: LastName is Fleeting")
	void LastNameOfRecord1424() {
		assertEquals("Fleeting", customers.get(1423).getLastName());
	}

	@Test
	@DisplayName("Record 1424: Company is Fechhymer Bros Co")
	void CompanyOfRecord1424() {
		assertEquals("Fechhymer Bros Co", customers.get(1423).getCompany());
	}

	@Test
	@DisplayName("Record 1424: Address is 24 E 81st St")
	void AddressOfRecord1424() {
		assertEquals("24 E 81st St", customers.get(1423).getAddress());
	}

	@Test
	@DisplayName("Record 1424: City is New York")
	void CityOfRecord1424() {
		assertEquals("New York", customers.get(1423).getCity());
	}

	@Test
	@DisplayName("Record 1424: County is New York")
	void CountyOfRecord1424() {
		assertEquals("New York", customers.get(1423).getCounty());
	}

	@Test
	@DisplayName("Record 1424: State is NY")
	void StateOfRecord1424() {
		assertEquals("NY", customers.get(1423).getState());
	}

	@Test
	@DisplayName("Record 1424: ZIP is 10028")
	void ZIPOfRecord1424() {
		assertEquals("10028", customers.get(1423).getZIP());
	}

	@Test
	@DisplayName("Record 1424: Phone is 212-288-5191")
	void PhoneOfRecord1424() {
		assertEquals("212-288-5191", customers.get(1423).getPhone());
	}

	@Test
	@DisplayName("Record 1424: Fax is 212-288-8968")
	void FaxOfRecord1424() {
		assertEquals("212-288-8968", customers.get(1423).getFax());
	}

	@Test
	@DisplayName("Record 1424: Email is doug@fleeting.com")
	void EmailOfRecord1424() {
		assertEquals("doug@fleeting.com", customers.get(1423).getEmail());
	}

	@Test
	@DisplayName("Record 1424: Web is http://www.dougfleeting.com")
	void WebOfRecord1424() {
		assertEquals("http://www.dougfleeting.com", customers.get(1423).getWeb());
	}
}
