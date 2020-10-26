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

@Tag("12")
class Record_430 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 430: FirstName is Carmela")
	void FirstNameOfRecord430() {
		assertEquals("Carmela", customers.get(429).getFirstName());
	}

	@Test
	@DisplayName("Record 430: LastName is Cronwell")
	void LastNameOfRecord430() {
		assertEquals("Cronwell", customers.get(429).getLastName());
	}

	@Test
	@DisplayName("Record 430: Company is Wallace Tallmadge Hahn Smith")
	void CompanyOfRecord430() {
		assertEquals("Wallace Tallmadge Hahn Smith", customers.get(429).getCompany());
	}

	@Test
	@DisplayName("Record 430: Address is Calais Rd")
	void AddressOfRecord430() {
		assertEquals("Calais Rd", customers.get(429).getAddress());
	}

	@Test
	@DisplayName("Record 430: City is Randolph")
	void CityOfRecord430() {
		assertEquals("Randolph", customers.get(429).getCity());
	}

	@Test
	@DisplayName("Record 430: County is Morris")
	void CountyOfRecord430() {
		assertEquals("Morris", customers.get(429).getCounty());
	}

	@Test
	@DisplayName("Record 430: State is NJ")
	void StateOfRecord430() {
		assertEquals("NJ", customers.get(429).getState());
	}

	@Test
	@DisplayName("Record 430: ZIP is 7869")
	void ZIPOfRecord430() {
		assertEquals("7869", customers.get(429).getZIP());
	}

	@Test
	@DisplayName("Record 430: Phone is 973-895-7938")
	void PhoneOfRecord430() {
		assertEquals("973-895-7938", customers.get(429).getPhone());
	}

	@Test
	@DisplayName("Record 430: Fax is 973-895-8935")
	void FaxOfRecord430() {
		assertEquals("973-895-8935", customers.get(429).getFax());
	}

	@Test
	@DisplayName("Record 430: Email is carmela@cronwell.com")
	void EmailOfRecord430() {
		assertEquals("carmela@cronwell.com", customers.get(429).getEmail());
	}

	@Test
	@DisplayName("Record 430: Web is http://www.carmelacronwell.com")
	void WebOfRecord430() {
		assertEquals("http://www.carmelacronwell.com", customers.get(429).getWeb());
	}
}
