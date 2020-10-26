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

@Tag("33")
class Record_2168 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2168: FirstName is Zane")
	void FirstNameOfRecord2168() {
		assertEquals("Zane", customers.get(2167).getFirstName());
	}

	@Test
	@DisplayName("Record 2168: LastName is Wicks")
	void LastNameOfRecord2168() {
		assertEquals("Wicks", customers.get(2167).getLastName());
	}

	@Test
	@DisplayName("Record 2168: Company is Presley Companies")
	void CompanyOfRecord2168() {
		assertEquals("Presley Companies", customers.get(2167).getCompany());
	}

	@Test
	@DisplayName("Record 2168: Address is 5206 N Detroit Ave")
	void AddressOfRecord2168() {
		assertEquals("5206 N Detroit Ave", customers.get(2167).getAddress());
	}

	@Test
	@DisplayName("Record 2168: City is Toledo")
	void CityOfRecord2168() {
		assertEquals("Toledo", customers.get(2167).getCity());
	}

	@Test
	@DisplayName("Record 2168: County is Lucas")
	void CountyOfRecord2168() {
		assertEquals("Lucas", customers.get(2167).getCounty());
	}

	@Test
	@DisplayName("Record 2168: State is OH")
	void StateOfRecord2168() {
		assertEquals("OH", customers.get(2167).getState());
	}

	@Test
	@DisplayName("Record 2168: ZIP is 43612")
	void ZIPOfRecord2168() {
		assertEquals("43612", customers.get(2167).getZIP());
	}

	@Test
	@DisplayName("Record 2168: Phone is 419-478-5320")
	void PhoneOfRecord2168() {
		assertEquals("419-478-5320", customers.get(2167).getPhone());
	}

	@Test
	@DisplayName("Record 2168: Fax is 419-478-1927")
	void FaxOfRecord2168() {
		assertEquals("419-478-1927", customers.get(2167).getFax());
	}

	@Test
	@DisplayName("Record 2168: Email is zane@wicks.com")
	void EmailOfRecord2168() {
		assertEquals("zane@wicks.com", customers.get(2167).getEmail());
	}

	@Test
	@DisplayName("Record 2168: Web is http://www.zanewicks.com")
	void WebOfRecord2168() {
		assertEquals("http://www.zanewicks.com", customers.get(2167).getWeb());
	}
}
