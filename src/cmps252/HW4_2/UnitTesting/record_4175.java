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

@Tag("11")
class Record_4175 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4175: FirstName is Laura")
	void FirstNameOfRecord4175() {
		assertEquals("Laura", customers.get(4174).getFirstName());
	}

	@Test
	@DisplayName("Record 4175: LastName is Kulikowski")
	void LastNameOfRecord4175() {
		assertEquals("Kulikowski", customers.get(4174).getLastName());
	}

	@Test
	@DisplayName("Record 4175: Company is Intrntl Electro Mgntc Inc")
	void CompanyOfRecord4175() {
		assertEquals("Intrntl Electro Mgntc Inc", customers.get(4174).getCompany());
	}

	@Test
	@DisplayName("Record 4175: Address is 335 Madison Ave")
	void AddressOfRecord4175() {
		assertEquals("335 Madison Ave", customers.get(4174).getAddress());
	}

	@Test
	@DisplayName("Record 4175: City is New York")
	void CityOfRecord4175() {
		assertEquals("New York", customers.get(4174).getCity());
	}

	@Test
	@DisplayName("Record 4175: County is New York")
	void CountyOfRecord4175() {
		assertEquals("New York", customers.get(4174).getCounty());
	}

	@Test
	@DisplayName("Record 4175: State is NY")
	void StateOfRecord4175() {
		assertEquals("NY", customers.get(4174).getState());
	}

	@Test
	@DisplayName("Record 4175: ZIP is 10017")
	void ZIPOfRecord4175() {
		assertEquals("10017", customers.get(4174).getZIP());
	}

	@Test
	@DisplayName("Record 4175: Phone is 212-972-8960")
	void PhoneOfRecord4175() {
		assertEquals("212-972-8960", customers.get(4174).getPhone());
	}

	@Test
	@DisplayName("Record 4175: Fax is 212-972-2827")
	void FaxOfRecord4175() {
		assertEquals("212-972-2827", customers.get(4174).getFax());
	}

	@Test
	@DisplayName("Record 4175: Email is laura@kulikowski.com")
	void EmailOfRecord4175() {
		assertEquals("laura@kulikowski.com", customers.get(4174).getEmail());
	}

	@Test
	@DisplayName("Record 4175: Web is http://www.laurakulikowski.com")
	void WebOfRecord4175() {
		assertEquals("http://www.laurakulikowski.com", customers.get(4174).getWeb());
	}
}
