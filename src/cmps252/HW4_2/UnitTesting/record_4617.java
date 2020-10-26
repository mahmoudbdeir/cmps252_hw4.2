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

@Tag("25")
class Record_4617 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4617: FirstName is Earle")
	void FirstNameOfRecord4617() {
		assertEquals("Earle", customers.get(4616).getFirstName());
	}

	@Test
	@DisplayName("Record 4617: LastName is Delbridge")
	void LastNameOfRecord4617() {
		assertEquals("Delbridge", customers.get(4616).getLastName());
	}

	@Test
	@DisplayName("Record 4617: Company is Sparta Steel")
	void CompanyOfRecord4617() {
		assertEquals("Sparta Steel", customers.get(4616).getCompany());
	}

	@Test
	@DisplayName("Record 4617: Address is 116 W 32nd St")
	void AddressOfRecord4617() {
		assertEquals("116 W 32nd St", customers.get(4616).getAddress());
	}

	@Test
	@DisplayName("Record 4617: City is New York")
	void CityOfRecord4617() {
		assertEquals("New York", customers.get(4616).getCity());
	}

	@Test
	@DisplayName("Record 4617: County is New York")
	void CountyOfRecord4617() {
		assertEquals("New York", customers.get(4616).getCounty());
	}

	@Test
	@DisplayName("Record 4617: State is NY")
	void StateOfRecord4617() {
		assertEquals("NY", customers.get(4616).getState());
	}

	@Test
	@DisplayName("Record 4617: ZIP is 10001")
	void ZIPOfRecord4617() {
		assertEquals("10001", customers.get(4616).getZIP());
	}

	@Test
	@DisplayName("Record 4617: Phone is 212-564-1271")
	void PhoneOfRecord4617() {
		assertEquals("212-564-1271", customers.get(4616).getPhone());
	}

	@Test
	@DisplayName("Record 4617: Fax is 212-564-0341")
	void FaxOfRecord4617() {
		assertEquals("212-564-0341", customers.get(4616).getFax());
	}

	@Test
	@DisplayName("Record 4617: Email is earle@delbridge.com")
	void EmailOfRecord4617() {
		assertEquals("earle@delbridge.com", customers.get(4616).getEmail());
	}

	@Test
	@DisplayName("Record 4617: Web is http://www.earledelbridge.com")
	void WebOfRecord4617() {
		assertEquals("http://www.earledelbridge.com", customers.get(4616).getWeb());
	}
}
