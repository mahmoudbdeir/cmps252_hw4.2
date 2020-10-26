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

@Tag("41")
class Record_4596 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4596: FirstName is Morton")
	void FirstNameOfRecord4596() {
		assertEquals("Morton", customers.get(4595).getFirstName());
	}

	@Test
	@DisplayName("Record 4596: LastName is Angwin")
	void LastNameOfRecord4596() {
		assertEquals("Angwin", customers.get(4595).getLastName());
	}

	@Test
	@DisplayName("Record 4596: Company is Midland Title Security Inc")
	void CompanyOfRecord4596() {
		assertEquals("Midland Title Security Inc", customers.get(4595).getCompany());
	}

	@Test
	@DisplayName("Record 4596: Address is 1500 S Hwy 100  #-355")
	void AddressOfRecord4596() {
		assertEquals("1500 S Hwy 100  #-355", customers.get(4595).getAddress());
	}

	@Test
	@DisplayName("Record 4596: City is Minneapolis")
	void CityOfRecord4596() {
		assertEquals("Minneapolis", customers.get(4595).getCity());
	}

	@Test
	@DisplayName("Record 4596: County is Hennepin")
	void CountyOfRecord4596() {
		assertEquals("Hennepin", customers.get(4595).getCounty());
	}

	@Test
	@DisplayName("Record 4596: State is MN")
	void StateOfRecord4596() {
		assertEquals("MN", customers.get(4595).getState());
	}

	@Test
	@DisplayName("Record 4596: ZIP is 55416")
	void ZIPOfRecord4596() {
		assertEquals("55416", customers.get(4595).getZIP());
	}

	@Test
	@DisplayName("Record 4596: Phone is 952-525-0823")
	void PhoneOfRecord4596() {
		assertEquals("952-525-0823", customers.get(4595).getPhone());
	}

	@Test
	@DisplayName("Record 4596: Fax is 952-525-8335")
	void FaxOfRecord4596() {
		assertEquals("952-525-8335", customers.get(4595).getFax());
	}

	@Test
	@DisplayName("Record 4596: Email is morton@angwin.com")
	void EmailOfRecord4596() {
		assertEquals("morton@angwin.com", customers.get(4595).getEmail());
	}

	@Test
	@DisplayName("Record 4596: Web is http://www.mortonangwin.com")
	void WebOfRecord4596() {
		assertEquals("http://www.mortonangwin.com", customers.get(4595).getWeb());
	}
}
