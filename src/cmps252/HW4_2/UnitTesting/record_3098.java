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
class Record_3098 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3098: FirstName is Addie")
	void FirstNameOfRecord3098() {
		assertEquals("Addie", customers.get(3097).getFirstName());
	}

	@Test
	@DisplayName("Record 3098: LastName is Jinkens")
	void LastNameOfRecord3098() {
		assertEquals("Jinkens", customers.get(3097).getLastName());
	}

	@Test
	@DisplayName("Record 3098: Company is Shavelson, Sunny L Esq")
	void CompanyOfRecord3098() {
		assertEquals("Shavelson, Sunny L Esq", customers.get(3097).getCompany());
	}

	@Test
	@DisplayName("Record 3098: Address is 4550 N Brady St")
	void AddressOfRecord3098() {
		assertEquals("4550 N Brady St", customers.get(3097).getAddress());
	}

	@Test
	@DisplayName("Record 3098: City is Davenport")
	void CityOfRecord3098() {
		assertEquals("Davenport", customers.get(3097).getCity());
	}

	@Test
	@DisplayName("Record 3098: County is Scott")
	void CountyOfRecord3098() {
		assertEquals("Scott", customers.get(3097).getCounty());
	}

	@Test
	@DisplayName("Record 3098: State is IA")
	void StateOfRecord3098() {
		assertEquals("IA", customers.get(3097).getState());
	}

	@Test
	@DisplayName("Record 3098: ZIP is 52806")
	void ZIPOfRecord3098() {
		assertEquals("52806", customers.get(3097).getZIP());
	}

	@Test
	@DisplayName("Record 3098: Phone is 563-386-5526")
	void PhoneOfRecord3098() {
		assertEquals("563-386-5526", customers.get(3097).getPhone());
	}

	@Test
	@DisplayName("Record 3098: Fax is 563-386-5852")
	void FaxOfRecord3098() {
		assertEquals("563-386-5852", customers.get(3097).getFax());
	}

	@Test
	@DisplayName("Record 3098: Email is addie@jinkens.com")
	void EmailOfRecord3098() {
		assertEquals("addie@jinkens.com", customers.get(3097).getEmail());
	}

	@Test
	@DisplayName("Record 3098: Web is http://www.addiejinkens.com")
	void WebOfRecord3098() {
		assertEquals("http://www.addiejinkens.com", customers.get(3097).getWeb());
	}
}
