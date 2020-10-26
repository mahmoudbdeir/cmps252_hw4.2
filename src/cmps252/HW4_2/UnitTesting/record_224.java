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
class Record_224 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 224: FirstName is Santiago")
	void FirstNameOfRecord224() {
		assertEquals("Santiago", customers.get(223).getFirstName());
	}

	@Test
	@DisplayName("Record 224: LastName is Rector")
	void LastNameOfRecord224() {
		assertEquals("Rector", customers.get(223).getLastName());
	}

	@Test
	@DisplayName("Record 224: Company is Kutters Korner")
	void CompanyOfRecord224() {
		assertEquals("Kutters Korner", customers.get(223).getCompany());
	}

	@Test
	@DisplayName("Record 224: Address is 106 Ashland Ave")
	void AddressOfRecord224() {
		assertEquals("106 Ashland Ave", customers.get(223).getAddress());
	}

	@Test
	@DisplayName("Record 224: City is West Orange")
	void CityOfRecord224() {
		assertEquals("West Orange", customers.get(223).getCity());
	}

	@Test
	@DisplayName("Record 224: County is Essex")
	void CountyOfRecord224() {
		assertEquals("Essex", customers.get(223).getCounty());
	}

	@Test
	@DisplayName("Record 224: State is NJ")
	void StateOfRecord224() {
		assertEquals("NJ", customers.get(223).getState());
	}

	@Test
	@DisplayName("Record 224: ZIP is 7052")
	void ZIPOfRecord224() {
		assertEquals("7052", customers.get(223).getZIP());
	}

	@Test
	@DisplayName("Record 224: Phone is 973-736-0277")
	void PhoneOfRecord224() {
		assertEquals("973-736-0277", customers.get(223).getPhone());
	}

	@Test
	@DisplayName("Record 224: Fax is 973-736-8594")
	void FaxOfRecord224() {
		assertEquals("973-736-8594", customers.get(223).getFax());
	}

	@Test
	@DisplayName("Record 224: Email is santiago@rector.com")
	void EmailOfRecord224() {
		assertEquals("santiago@rector.com", customers.get(223).getEmail());
	}

	@Test
	@DisplayName("Record 224: Web is http://www.santiagorector.com")
	void WebOfRecord224() {
		assertEquals("http://www.santiagorector.com", customers.get(223).getWeb());
	}
}
