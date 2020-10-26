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

@Tag("15")
class Record_2580 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2580: FirstName is Francis")
	void FirstNameOfRecord2580() {
		assertEquals("Francis", customers.get(2579).getFirstName());
	}

	@Test
	@DisplayName("Record 2580: LastName is Kerry")
	void LastNameOfRecord2580() {
		assertEquals("Kerry", customers.get(2579).getLastName());
	}

	@Test
	@DisplayName("Record 2580: Company is Stawasz Public Relations")
	void CompanyOfRecord2580() {
		assertEquals("Stawasz Public Relations", customers.get(2579).getCompany());
	}

	@Test
	@DisplayName("Record 2580: Address is 115 Clemente St")
	void AddressOfRecord2580() {
		assertEquals("115 Clemente St", customers.get(2579).getAddress());
	}

	@Test
	@DisplayName("Record 2580: City is Holyoke")
	void CityOfRecord2580() {
		assertEquals("Holyoke", customers.get(2579).getCity());
	}

	@Test
	@DisplayName("Record 2580: County is Hampden")
	void CountyOfRecord2580() {
		assertEquals("Hampden", customers.get(2579).getCounty());
	}

	@Test
	@DisplayName("Record 2580: State is MA")
	void StateOfRecord2580() {
		assertEquals("MA", customers.get(2579).getState());
	}

	@Test
	@DisplayName("Record 2580: ZIP is 1040")
	void ZIPOfRecord2580() {
		assertEquals("1040", customers.get(2579).getZIP());
	}

	@Test
	@DisplayName("Record 2580: Phone is 413-532-4957")
	void PhoneOfRecord2580() {
		assertEquals("413-532-4957", customers.get(2579).getPhone());
	}

	@Test
	@DisplayName("Record 2580: Fax is 413-532-9192")
	void FaxOfRecord2580() {
		assertEquals("413-532-9192", customers.get(2579).getFax());
	}

	@Test
	@DisplayName("Record 2580: Email is francis@kerry.com")
	void EmailOfRecord2580() {
		assertEquals("francis@kerry.com", customers.get(2579).getEmail());
	}

	@Test
	@DisplayName("Record 2580: Web is http://www.franciskerry.com")
	void WebOfRecord2580() {
		assertEquals("http://www.franciskerry.com", customers.get(2579).getWeb());
	}
}
