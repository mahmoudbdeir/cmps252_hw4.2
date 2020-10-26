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
class Record_604 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 604: FirstName is Brianne")
	void FirstNameOfRecord604() {
		assertEquals("Brianne", customers.get(603).getFirstName());
	}

	@Test
	@DisplayName("Record 604: LastName is Haymond")
	void LastNameOfRecord604() {
		assertEquals("Haymond", customers.get(603).getLastName());
	}

	@Test
	@DisplayName("Record 604: Company is Hawthorn Suites Hotel")
	void CompanyOfRecord604() {
		assertEquals("Hawthorn Suites Hotel", customers.get(603).getCompany());
	}

	@Test
	@DisplayName("Record 604: Address is 312 E Poythress St")
	void AddressOfRecord604() {
		assertEquals("312 E Poythress St", customers.get(603).getAddress());
	}

	@Test
	@DisplayName("Record 604: City is Hopewell")
	void CityOfRecord604() {
		assertEquals("Hopewell", customers.get(603).getCity());
	}

	@Test
	@DisplayName("Record 604: County is Hopewell City")
	void CountyOfRecord604() {
		assertEquals("Hopewell City", customers.get(603).getCounty());
	}

	@Test
	@DisplayName("Record 604: State is VA")
	void StateOfRecord604() {
		assertEquals("VA", customers.get(603).getState());
	}

	@Test
	@DisplayName("Record 604: ZIP is 23860")
	void ZIPOfRecord604() {
		assertEquals("23860", customers.get(603).getZIP());
	}

	@Test
	@DisplayName("Record 604: Phone is 804-541-6530")
	void PhoneOfRecord604() {
		assertEquals("804-541-6530", customers.get(603).getPhone());
	}

	@Test
	@DisplayName("Record 604: Fax is 804-541-8011")
	void FaxOfRecord604() {
		assertEquals("804-541-8011", customers.get(603).getFax());
	}

	@Test
	@DisplayName("Record 604: Email is brianne@haymond.com")
	void EmailOfRecord604() {
		assertEquals("brianne@haymond.com", customers.get(603).getEmail());
	}

	@Test
	@DisplayName("Record 604: Web is http://www.briannehaymond.com")
	void WebOfRecord604() {
		assertEquals("http://www.briannehaymond.com", customers.get(603).getWeb());
	}
}
