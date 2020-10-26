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

@Tag("3")
class Record_586 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 586: FirstName is Monica")
	void FirstNameOfRecord586() {
		assertEquals("Monica", customers.get(585).getFirstName());
	}

	@Test
	@DisplayName("Record 586: LastName is Guirand")
	void LastNameOfRecord586() {
		assertEquals("Guirand", customers.get(585).getLastName());
	}

	@Test
	@DisplayName("Record 586: Company is A Mac Aluminum Products")
	void CompanyOfRecord586() {
		assertEquals("A Mac Aluminum Products", customers.get(585).getCompany());
	}

	@Test
	@DisplayName("Record 586: Address is 1630 Collamer Ave")
	void AddressOfRecord586() {
		assertEquals("1630 Collamer Ave", customers.get(585).getAddress());
	}

	@Test
	@DisplayName("Record 586: City is Cleveland")
	void CityOfRecord586() {
		assertEquals("Cleveland", customers.get(585).getCity());
	}

	@Test
	@DisplayName("Record 586: County is Cuyahoga")
	void CountyOfRecord586() {
		assertEquals("Cuyahoga", customers.get(585).getCounty());
	}

	@Test
	@DisplayName("Record 586: State is OH")
	void StateOfRecord586() {
		assertEquals("OH", customers.get(585).getState());
	}

	@Test
	@DisplayName("Record 586: ZIP is 44110")
	void ZIPOfRecord586() {
		assertEquals("44110", customers.get(585).getZIP());
	}

	@Test
	@DisplayName("Record 586: Phone is 216-268-7362")
	void PhoneOfRecord586() {
		assertEquals("216-268-7362", customers.get(585).getPhone());
	}

	@Test
	@DisplayName("Record 586: Fax is 216-268-7332")
	void FaxOfRecord586() {
		assertEquals("216-268-7332", customers.get(585).getFax());
	}

	@Test
	@DisplayName("Record 586: Email is monica@guirand.com")
	void EmailOfRecord586() {
		assertEquals("monica@guirand.com", customers.get(585).getEmail());
	}

	@Test
	@DisplayName("Record 586: Web is http://www.monicaguirand.com")
	void WebOfRecord586() {
		assertEquals("http://www.monicaguirand.com", customers.get(585).getWeb());
	}
}
