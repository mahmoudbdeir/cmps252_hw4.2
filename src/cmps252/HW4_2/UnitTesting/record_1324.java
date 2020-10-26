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

@Tag("42")
class Record_1324 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1324: FirstName is Valencia")
	void FirstNameOfRecord1324() {
		assertEquals("Valencia", customers.get(1323).getFirstName());
	}

	@Test
	@DisplayName("Record 1324: LastName is Boulter")
	void LastNameOfRecord1324() {
		assertEquals("Boulter", customers.get(1323).getLastName());
	}

	@Test
	@DisplayName("Record 1324: Company is Birdie Pak Prdts")
	void CompanyOfRecord1324() {
		assertEquals("Birdie Pak Prdts", customers.get(1323).getCompany());
	}

	@Test
	@DisplayName("Record 1324: Address is 12268 Warwick Blvd")
	void AddressOfRecord1324() {
		assertEquals("12268 Warwick Blvd", customers.get(1323).getAddress());
	}

	@Test
	@DisplayName("Record 1324: City is Newport News")
	void CityOfRecord1324() {
		assertEquals("Newport News", customers.get(1323).getCity());
	}

	@Test
	@DisplayName("Record 1324: County is Newport News City")
	void CountyOfRecord1324() {
		assertEquals("Newport News City", customers.get(1323).getCounty());
	}

	@Test
	@DisplayName("Record 1324: State is VA")
	void StateOfRecord1324() {
		assertEquals("VA", customers.get(1323).getState());
	}

	@Test
	@DisplayName("Record 1324: ZIP is 23606")
	void ZIPOfRecord1324() {
		assertEquals("23606", customers.get(1323).getZIP());
	}

	@Test
	@DisplayName("Record 1324: Phone is 757-595-7580")
	void PhoneOfRecord1324() {
		assertEquals("757-595-7580", customers.get(1323).getPhone());
	}

	@Test
	@DisplayName("Record 1324: Fax is 757-595-0107")
	void FaxOfRecord1324() {
		assertEquals("757-595-0107", customers.get(1323).getFax());
	}

	@Test
	@DisplayName("Record 1324: Email is valencia@boulter.com")
	void EmailOfRecord1324() {
		assertEquals("valencia@boulter.com", customers.get(1323).getEmail());
	}

	@Test
	@DisplayName("Record 1324: Web is http://www.valenciaboulter.com")
	void WebOfRecord1324() {
		assertEquals("http://www.valenciaboulter.com", customers.get(1323).getWeb());
	}
}
