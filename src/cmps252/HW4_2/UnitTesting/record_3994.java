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

@Tag("3")
class Record_3994 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3994: FirstName is Daron")
	void FirstNameOfRecord3994() {
		assertEquals("Daron", customers.get(3993).getFirstName());
	}

	@Test
	@DisplayName("Record 3994: LastName is Ludd")
	void LastNameOfRecord3994() {
		assertEquals("Ludd", customers.get(3993).getLastName());
	}

	@Test
	@DisplayName("Record 3994: Company is Automated Office Systems")
	void CompanyOfRecord3994() {
		assertEquals("Automated Office Systems", customers.get(3993).getCompany());
	}

	@Test
	@DisplayName("Record 3994: Address is 816 Harding St")
	void AddressOfRecord3994() {
		assertEquals("816 Harding St", customers.get(3993).getAddress());
	}

	@Test
	@DisplayName("Record 3994: City is Lafayette")
	void CityOfRecord3994() {
		assertEquals("Lafayette", customers.get(3993).getCity());
	}

	@Test
	@DisplayName("Record 3994: County is Lafayette")
	void CountyOfRecord3994() {
		assertEquals("Lafayette", customers.get(3993).getCounty());
	}

	@Test
	@DisplayName("Record 3994: State is LA")
	void StateOfRecord3994() {
		assertEquals("LA", customers.get(3993).getState());
	}

	@Test
	@DisplayName("Record 3994: ZIP is 70503")
	void ZIPOfRecord3994() {
		assertEquals("70503", customers.get(3993).getZIP());
	}

	@Test
	@DisplayName("Record 3994: Phone is 337-261-9384")
	void PhoneOfRecord3994() {
		assertEquals("337-261-9384", customers.get(3993).getPhone());
	}

	@Test
	@DisplayName("Record 3994: Fax is 337-261-8414")
	void FaxOfRecord3994() {
		assertEquals("337-261-8414", customers.get(3993).getFax());
	}

	@Test
	@DisplayName("Record 3994: Email is daron@ludd.com")
	void EmailOfRecord3994() {
		assertEquals("daron@ludd.com", customers.get(3993).getEmail());
	}

	@Test
	@DisplayName("Record 3994: Web is http://www.daronludd.com")
	void WebOfRecord3994() {
		assertEquals("http://www.daronludd.com", customers.get(3993).getWeb());
	}
}
