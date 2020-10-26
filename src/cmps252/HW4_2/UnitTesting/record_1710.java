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

@Tag("9")
class Record_1710 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1710: FirstName is Silvia")
	void FirstNameOfRecord1710() {
		assertEquals("Silvia", customers.get(1709).getFirstName());
	}

	@Test
	@DisplayName("Record 1710: LastName is Patchen")
	void LastNameOfRecord1710() {
		assertEquals("Patchen", customers.get(1709).getLastName());
	}

	@Test
	@DisplayName("Record 1710: Company is Optronics Inc")
	void CompanyOfRecord1710() {
		assertEquals("Optronics Inc", customers.get(1709).getCompany());
	}

	@Test
	@DisplayName("Record 1710: Address is 500 Air Park Rd")
	void AddressOfRecord1710() {
		assertEquals("500 Air Park Rd", customers.get(1709).getAddress());
	}

	@Test
	@DisplayName("Record 1710: City is Ashland")
	void CityOfRecord1710() {
		assertEquals("Ashland", customers.get(1709).getCity());
	}

	@Test
	@DisplayName("Record 1710: County is Hanover")
	void CountyOfRecord1710() {
		assertEquals("Hanover", customers.get(1709).getCounty());
	}

	@Test
	@DisplayName("Record 1710: State is VA")
	void StateOfRecord1710() {
		assertEquals("VA", customers.get(1709).getState());
	}

	@Test
	@DisplayName("Record 1710: ZIP is 23005")
	void ZIPOfRecord1710() {
		assertEquals("23005", customers.get(1709).getZIP());
	}

	@Test
	@DisplayName("Record 1710: Phone is 804-798-8115")
	void PhoneOfRecord1710() {
		assertEquals("804-798-8115", customers.get(1709).getPhone());
	}

	@Test
	@DisplayName("Record 1710: Fax is 804-798-3509")
	void FaxOfRecord1710() {
		assertEquals("804-798-3509", customers.get(1709).getFax());
	}

	@Test
	@DisplayName("Record 1710: Email is silvia@patchen.com")
	void EmailOfRecord1710() {
		assertEquals("silvia@patchen.com", customers.get(1709).getEmail());
	}

	@Test
	@DisplayName("Record 1710: Web is http://www.silviapatchen.com")
	void WebOfRecord1710() {
		assertEquals("http://www.silviapatchen.com", customers.get(1709).getWeb());
	}
}
