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

@Tag("28")
class Record_439 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 439: FirstName is Selma")
	void FirstNameOfRecord439() {
		assertEquals("Selma", customers.get(438).getFirstName());
	}

	@Test
	@DisplayName("Record 439: LastName is Joosten")
	void LastNameOfRecord439() {
		assertEquals("Joosten", customers.get(438).getLastName());
	}

	@Test
	@DisplayName("Record 439: Company is Hub States Corp")
	void CompanyOfRecord439() {
		assertEquals("Hub States Corp", customers.get(438).getCompany());
	}

	@Test
	@DisplayName("Record 439: Address is 712 Richland St  #-h")
	void AddressOfRecord439() {
		assertEquals("712 Richland St  #-h", customers.get(438).getAddress());
	}

	@Test
	@DisplayName("Record 439: City is Columbia")
	void CityOfRecord439() {
		assertEquals("Columbia", customers.get(438).getCity());
	}

	@Test
	@DisplayName("Record 439: County is Richland")
	void CountyOfRecord439() {
		assertEquals("Richland", customers.get(438).getCounty());
	}

	@Test
	@DisplayName("Record 439: State is SC")
	void StateOfRecord439() {
		assertEquals("SC", customers.get(438).getState());
	}

	@Test
	@DisplayName("Record 439: ZIP is 29201")
	void ZIPOfRecord439() {
		assertEquals("29201", customers.get(438).getZIP());
	}

	@Test
	@DisplayName("Record 439: Phone is 803-799-3379")
	void PhoneOfRecord439() {
		assertEquals("803-799-3379", customers.get(438).getPhone());
	}

	@Test
	@DisplayName("Record 439: Fax is 803-799-1544")
	void FaxOfRecord439() {
		assertEquals("803-799-1544", customers.get(438).getFax());
	}

	@Test
	@DisplayName("Record 439: Email is selma@joosten.com")
	void EmailOfRecord439() {
		assertEquals("selma@joosten.com", customers.get(438).getEmail());
	}

	@Test
	@DisplayName("Record 439: Web is http://www.selmajoosten.com")
	void WebOfRecord439() {
		assertEquals("http://www.selmajoosten.com", customers.get(438).getWeb());
	}
}
