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
class Record_3530 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3530: FirstName is Willard")
	void FirstNameOfRecord3530() {
		assertEquals("Willard", customers.get(3529).getFirstName());
	}

	@Test
	@DisplayName("Record 3530: LastName is Washpun")
	void LastNameOfRecord3530() {
		assertEquals("Washpun", customers.get(3529).getLastName());
	}

	@Test
	@DisplayName("Record 3530: Company is Building Industry Assn Hi")
	void CompanyOfRecord3530() {
		assertEquals("Building Industry Assn Hi", customers.get(3529).getCompany());
	}

	@Test
	@DisplayName("Record 3530: Address is 30 E Main St")
	void AddressOfRecord3530() {
		assertEquals("30 E Main St", customers.get(3529).getAddress());
	}

	@Test
	@DisplayName("Record 3530: City is Freehold")
	void CityOfRecord3530() {
		assertEquals("Freehold", customers.get(3529).getCity());
	}

	@Test
	@DisplayName("Record 3530: County is Monmouth")
	void CountyOfRecord3530() {
		assertEquals("Monmouth", customers.get(3529).getCounty());
	}

	@Test
	@DisplayName("Record 3530: State is NJ")
	void StateOfRecord3530() {
		assertEquals("NJ", customers.get(3529).getState());
	}

	@Test
	@DisplayName("Record 3530: ZIP is 7728")
	void ZIPOfRecord3530() {
		assertEquals("7728", customers.get(3529).getZIP());
	}

	@Test
	@DisplayName("Record 3530: Phone is 732-577-2352")
	void PhoneOfRecord3530() {
		assertEquals("732-577-2352", customers.get(3529).getPhone());
	}

	@Test
	@DisplayName("Record 3530: Fax is 732-577-6881")
	void FaxOfRecord3530() {
		assertEquals("732-577-6881", customers.get(3529).getFax());
	}

	@Test
	@DisplayName("Record 3530: Email is willard@washpun.com")
	void EmailOfRecord3530() {
		assertEquals("willard@washpun.com", customers.get(3529).getEmail());
	}

	@Test
	@DisplayName("Record 3530: Web is http://www.willardwashpun.com")
	void WebOfRecord3530() {
		assertEquals("http://www.willardwashpun.com", customers.get(3529).getWeb());
	}
}
