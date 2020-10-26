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
class Record_4589 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4589: FirstName is Faith")
	void FirstNameOfRecord4589() {
		assertEquals("Faith", customers.get(4588).getFirstName());
	}

	@Test
	@DisplayName("Record 4589: LastName is Cessor")
	void LastNameOfRecord4589() {
		assertEquals("Cessor", customers.get(4588).getLastName());
	}

	@Test
	@DisplayName("Record 4589: Company is Excalibur Investigative Svc")
	void CompanyOfRecord4589() {
		assertEquals("Excalibur Investigative Svc", customers.get(4588).getCompany());
	}

	@Test
	@DisplayName("Record 4589: Address is 1101 Us Highway 9")
	void AddressOfRecord4589() {
		assertEquals("1101 Us Highway 9", customers.get(4588).getAddress());
	}

	@Test
	@DisplayName("Record 4589: City is Old Bridge")
	void CityOfRecord4589() {
		assertEquals("Old Bridge", customers.get(4588).getCity());
	}

	@Test
	@DisplayName("Record 4589: County is Middlesex")
	void CountyOfRecord4589() {
		assertEquals("Middlesex", customers.get(4588).getCounty());
	}

	@Test
	@DisplayName("Record 4589: State is NJ")
	void StateOfRecord4589() {
		assertEquals("NJ", customers.get(4588).getState());
	}

	@Test
	@DisplayName("Record 4589: ZIP is 8857")
	void ZIPOfRecord4589() {
		assertEquals("8857", customers.get(4588).getZIP());
	}

	@Test
	@DisplayName("Record 4589: Phone is 732-721-5919")
	void PhoneOfRecord4589() {
		assertEquals("732-721-5919", customers.get(4588).getPhone());
	}

	@Test
	@DisplayName("Record 4589: Fax is 732-721-4916")
	void FaxOfRecord4589() {
		assertEquals("732-721-4916", customers.get(4588).getFax());
	}

	@Test
	@DisplayName("Record 4589: Email is faith@cessor.com")
	void EmailOfRecord4589() {
		assertEquals("faith@cessor.com", customers.get(4588).getEmail());
	}

	@Test
	@DisplayName("Record 4589: Web is http://www.faithcessor.com")
	void WebOfRecord4589() {
		assertEquals("http://www.faithcessor.com", customers.get(4588).getWeb());
	}
}
