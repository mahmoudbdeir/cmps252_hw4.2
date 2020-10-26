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

@Tag("6")
class Record_1362 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1362: FirstName is Nathaniel")
	void FirstNameOfRecord1362() {
		assertEquals("Nathaniel", customers.get(1361).getFirstName());
	}

	@Test
	@DisplayName("Record 1362: LastName is Shillings")
	void LastNameOfRecord1362() {
		assertEquals("Shillings", customers.get(1361).getLastName());
	}

	@Test
	@DisplayName("Record 1362: Company is Syther & Chry Quad Cities Inc")
	void CompanyOfRecord1362() {
		assertEquals("Syther & Chry Quad Cities Inc", customers.get(1361).getCompany());
	}

	@Test
	@DisplayName("Record 1362: Address is 1319 Memorial Ave")
	void AddressOfRecord1362() {
		assertEquals("1319 Memorial Ave", customers.get(1361).getAddress());
	}

	@Test
	@DisplayName("Record 1362: City is Atlantic City")
	void CityOfRecord1362() {
		assertEquals("Atlantic City", customers.get(1361).getCity());
	}

	@Test
	@DisplayName("Record 1362: County is Atlantic")
	void CountyOfRecord1362() {
		assertEquals("Atlantic", customers.get(1361).getCounty());
	}

	@Test
	@DisplayName("Record 1362: State is NJ")
	void StateOfRecord1362() {
		assertEquals("NJ", customers.get(1361).getState());
	}

	@Test
	@DisplayName("Record 1362: ZIP is 8401")
	void ZIPOfRecord1362() {
		assertEquals("8401", customers.get(1361).getZIP());
	}

	@Test
	@DisplayName("Record 1362: Phone is 609-348-8134")
	void PhoneOfRecord1362() {
		assertEquals("609-348-8134", customers.get(1361).getPhone());
	}

	@Test
	@DisplayName("Record 1362: Fax is 609-348-6892")
	void FaxOfRecord1362() {
		assertEquals("609-348-6892", customers.get(1361).getFax());
	}

	@Test
	@DisplayName("Record 1362: Email is nathaniel@shillings.com")
	void EmailOfRecord1362() {
		assertEquals("nathaniel@shillings.com", customers.get(1361).getEmail());
	}

	@Test
	@DisplayName("Record 1362: Web is http://www.nathanielshillings.com")
	void WebOfRecord1362() {
		assertEquals("http://www.nathanielshillings.com", customers.get(1361).getWeb());
	}
}
