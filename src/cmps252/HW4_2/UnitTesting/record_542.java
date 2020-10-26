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

@Tag("47")
class Record_542 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 542: FirstName is Arturo")
	void FirstNameOfRecord542() {
		assertEquals("Arturo", customers.get(541).getFirstName());
	}

	@Test
	@DisplayName("Record 542: LastName is Lagrasse")
	void LastNameOfRecord542() {
		assertEquals("Lagrasse", customers.get(541).getLastName());
	}

	@Test
	@DisplayName("Record 542: Company is Tabs Et Cetera Inc")
	void CompanyOfRecord542() {
		assertEquals("Tabs Et Cetera Inc", customers.get(541).getCompany());
	}

	@Test
	@DisplayName("Record 542: Address is 4242 W Clarendon Ave")
	void AddressOfRecord542() {
		assertEquals("4242 W Clarendon Ave", customers.get(541).getAddress());
	}

	@Test
	@DisplayName("Record 542: City is Phoenix")
	void CityOfRecord542() {
		assertEquals("Phoenix", customers.get(541).getCity());
	}

	@Test
	@DisplayName("Record 542: County is Maricopa")
	void CountyOfRecord542() {
		assertEquals("Maricopa", customers.get(541).getCounty());
	}

	@Test
	@DisplayName("Record 542: State is AZ")
	void StateOfRecord542() {
		assertEquals("AZ", customers.get(541).getState());
	}

	@Test
	@DisplayName("Record 542: ZIP is 85019")
	void ZIPOfRecord542() {
		assertEquals("85019", customers.get(541).getZIP());
	}

	@Test
	@DisplayName("Record 542: Phone is 602-269-7567")
	void PhoneOfRecord542() {
		assertEquals("602-269-7567", customers.get(541).getPhone());
	}

	@Test
	@DisplayName("Record 542: Fax is 602-269-1642")
	void FaxOfRecord542() {
		assertEquals("602-269-1642", customers.get(541).getFax());
	}

	@Test
	@DisplayName("Record 542: Email is arturo@lagrasse.com")
	void EmailOfRecord542() {
		assertEquals("arturo@lagrasse.com", customers.get(541).getEmail());
	}

	@Test
	@DisplayName("Record 542: Web is http://www.arturolagrasse.com")
	void WebOfRecord542() {
		assertEquals("http://www.arturolagrasse.com", customers.get(541).getWeb());
	}
}
