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

@Tag("23")
class Record_1394 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1394: FirstName is Bethany")
	void FirstNameOfRecord1394() {
		assertEquals("Bethany", customers.get(1393).getFirstName());
	}

	@Test
	@DisplayName("Record 1394: LastName is Kassell")
	void LastNameOfRecord1394() {
		assertEquals("Kassell", customers.get(1393).getLastName());
	}

	@Test
	@DisplayName("Record 1394: Company is Infiniti Authorized Dealer")
	void CompanyOfRecord1394() {
		assertEquals("Infiniti Authorized Dealer", customers.get(1393).getCompany());
	}

	@Test
	@DisplayName("Record 1394: Address is 1025 Connecticut Ave Nw")
	void AddressOfRecord1394() {
		assertEquals("1025 Connecticut Ave Nw", customers.get(1393).getAddress());
	}

	@Test
	@DisplayName("Record 1394: City is Washington")
	void CityOfRecord1394() {
		assertEquals("Washington", customers.get(1393).getCity());
	}

	@Test
	@DisplayName("Record 1394: County is District of Columbia")
	void CountyOfRecord1394() {
		assertEquals("District of Columbia", customers.get(1393).getCounty());
	}

	@Test
	@DisplayName("Record 1394: State is DC")
	void StateOfRecord1394() {
		assertEquals("DC", customers.get(1393).getState());
	}

	@Test
	@DisplayName("Record 1394: ZIP is 20036")
	void ZIPOfRecord1394() {
		assertEquals("20036", customers.get(1393).getZIP());
	}

	@Test
	@DisplayName("Record 1394: Phone is 202-467-3695")
	void PhoneOfRecord1394() {
		assertEquals("202-467-3695", customers.get(1393).getPhone());
	}

	@Test
	@DisplayName("Record 1394: Fax is 202-467-7813")
	void FaxOfRecord1394() {
		assertEquals("202-467-7813", customers.get(1393).getFax());
	}

	@Test
	@DisplayName("Record 1394: Email is bethany@kassell.com")
	void EmailOfRecord1394() {
		assertEquals("bethany@kassell.com", customers.get(1393).getEmail());
	}

	@Test
	@DisplayName("Record 1394: Web is http://www.bethanykassell.com")
	void WebOfRecord1394() {
		assertEquals("http://www.bethanykassell.com", customers.get(1393).getWeb());
	}
}
