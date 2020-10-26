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

@Tag("1")
class Record_4373 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4373: FirstName is Jaqueline")
	void FirstNameOfRecord4373() {
		assertEquals("Jaqueline", customers.get(4372).getFirstName());
	}

	@Test
	@DisplayName("Record 4373: LastName is Haman")
	void LastNameOfRecord4373() {
		assertEquals("Haman", customers.get(4372).getLastName());
	}

	@Test
	@DisplayName("Record 4373: Company is Karlin, Jeremy S Esq")
	void CompanyOfRecord4373() {
		assertEquals("Karlin, Jeremy S Esq", customers.get(4372).getCompany());
	}

	@Test
	@DisplayName("Record 4373: Address is 529 E Town St")
	void AddressOfRecord4373() {
		assertEquals("529 E Town St", customers.get(4372).getAddress());
	}

	@Test
	@DisplayName("Record 4373: City is Columbus")
	void CityOfRecord4373() {
		assertEquals("Columbus", customers.get(4372).getCity());
	}

	@Test
	@DisplayName("Record 4373: County is Franklin")
	void CountyOfRecord4373() {
		assertEquals("Franklin", customers.get(4372).getCounty());
	}

	@Test
	@DisplayName("Record 4373: State is OH")
	void StateOfRecord4373() {
		assertEquals("OH", customers.get(4372).getState());
	}

	@Test
	@DisplayName("Record 4373: ZIP is 43215")
	void ZIPOfRecord4373() {
		assertEquals("43215", customers.get(4372).getZIP());
	}

	@Test
	@DisplayName("Record 4373: Phone is 614-461-5854")
	void PhoneOfRecord4373() {
		assertEquals("614-461-5854", customers.get(4372).getPhone());
	}

	@Test
	@DisplayName("Record 4373: Fax is 614-461-9851")
	void FaxOfRecord4373() {
		assertEquals("614-461-9851", customers.get(4372).getFax());
	}

	@Test
	@DisplayName("Record 4373: Email is jaqueline@haman.com")
	void EmailOfRecord4373() {
		assertEquals("jaqueline@haman.com", customers.get(4372).getEmail());
	}

	@Test
	@DisplayName("Record 4373: Web is http://www.jaquelinehaman.com")
	void WebOfRecord4373() {
		assertEquals("http://www.jaquelinehaman.com", customers.get(4372).getWeb());
	}
}
