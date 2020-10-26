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

@Tag("49")
class Record_1006 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1006: FirstName is Jude")
	void FirstNameOfRecord1006() {
		assertEquals("Jude", customers.get(1005).getFirstName());
	}

	@Test
	@DisplayName("Record 1006: LastName is Turvey")
	void LastNameOfRecord1006() {
		assertEquals("Turvey", customers.get(1005).getLastName());
	}

	@Test
	@DisplayName("Record 1006: Company is Frieze Advertising Inc")
	void CompanyOfRecord1006() {
		assertEquals("Frieze Advertising Inc", customers.get(1005).getCompany());
	}

	@Test
	@DisplayName("Record 1006: Address is 719 E 11th Ave")
	void AddressOfRecord1006() {
		assertEquals("719 E 11th Ave", customers.get(1005).getAddress());
	}

	@Test
	@DisplayName("Record 1006: City is Anchorage")
	void CityOfRecord1006() {
		assertEquals("Anchorage", customers.get(1005).getCity());
	}

	@Test
	@DisplayName("Record 1006: County is Anchorage")
	void CountyOfRecord1006() {
		assertEquals("Anchorage", customers.get(1005).getCounty());
	}

	@Test
	@DisplayName("Record 1006: State is AK")
	void StateOfRecord1006() {
		assertEquals("AK", customers.get(1005).getState());
	}

	@Test
	@DisplayName("Record 1006: ZIP is 99501")
	void ZIPOfRecord1006() {
		assertEquals("99501", customers.get(1005).getZIP());
	}

	@Test
	@DisplayName("Record 1006: Phone is 907-258-8993")
	void PhoneOfRecord1006() {
		assertEquals("907-258-8993", customers.get(1005).getPhone());
	}

	@Test
	@DisplayName("Record 1006: Fax is 907-258-7756")
	void FaxOfRecord1006() {
		assertEquals("907-258-7756", customers.get(1005).getFax());
	}

	@Test
	@DisplayName("Record 1006: Email is jude@turvey.com")
	void EmailOfRecord1006() {
		assertEquals("jude@turvey.com", customers.get(1005).getEmail());
	}

	@Test
	@DisplayName("Record 1006: Web is http://www.judeturvey.com")
	void WebOfRecord1006() {
		assertEquals("http://www.judeturvey.com", customers.get(1005).getWeb());
	}
}
