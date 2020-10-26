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

@Tag("36")
class Record_537 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 537: FirstName is Chadwick")
	void FirstNameOfRecord537() {
		assertEquals("Chadwick", customers.get(536).getFirstName());
	}

	@Test
	@DisplayName("Record 537: LastName is Vanclief")
	void LastNameOfRecord537() {
		assertEquals("Vanclief", customers.get(536).getLastName());
	}

	@Test
	@DisplayName("Record 537: Company is Petro Chem Environ Svc Inc")
	void CompanyOfRecord537() {
		assertEquals("Petro Chem Environ Svc Inc", customers.get(536).getCompany());
	}

	@Test
	@DisplayName("Record 537: Address is 733 W Henry St")
	void AddressOfRecord537() {
		assertEquals("733 W Henry St", customers.get(536).getAddress());
	}

	@Test
	@DisplayName("Record 537: City is Indianapolis")
	void CityOfRecord537() {
		assertEquals("Indianapolis", customers.get(536).getCity());
	}

	@Test
	@DisplayName("Record 537: County is Marion")
	void CountyOfRecord537() {
		assertEquals("Marion", customers.get(536).getCounty());
	}

	@Test
	@DisplayName("Record 537: State is IN")
	void StateOfRecord537() {
		assertEquals("IN", customers.get(536).getState());
	}

	@Test
	@DisplayName("Record 537: ZIP is 46225")
	void ZIPOfRecord537() {
		assertEquals("46225", customers.get(536).getZIP());
	}

	@Test
	@DisplayName("Record 537: Phone is 317-639-7338")
	void PhoneOfRecord537() {
		assertEquals("317-639-7338", customers.get(536).getPhone());
	}

	@Test
	@DisplayName("Record 537: Fax is 317-639-5674")
	void FaxOfRecord537() {
		assertEquals("317-639-5674", customers.get(536).getFax());
	}

	@Test
	@DisplayName("Record 537: Email is chadwick@vanclief.com")
	void EmailOfRecord537() {
		assertEquals("chadwick@vanclief.com", customers.get(536).getEmail());
	}

	@Test
	@DisplayName("Record 537: Web is http://www.chadwickvanclief.com")
	void WebOfRecord537() {
		assertEquals("http://www.chadwickvanclief.com", customers.get(536).getWeb());
	}
}
