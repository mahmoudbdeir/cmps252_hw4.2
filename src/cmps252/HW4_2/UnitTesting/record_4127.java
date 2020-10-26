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

@Tag("35")
class Record_4127 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4127: FirstName is Marcy")
	void FirstNameOfRecord4127() {
		assertEquals("Marcy", customers.get(4126).getFirstName());
	}

	@Test
	@DisplayName("Record 4127: LastName is Hullum")
	void LastNameOfRecord4127() {
		assertEquals("Hullum", customers.get(4126).getLastName());
	}

	@Test
	@DisplayName("Record 4127: Company is Esquire Magazine")
	void CompanyOfRecord4127() {
		assertEquals("Esquire Magazine", customers.get(4126).getCompany());
	}

	@Test
	@DisplayName("Record 4127: Address is 2320 Keystone Dr")
	void AddressOfRecord4127() {
		assertEquals("2320 Keystone Dr", customers.get(4126).getAddress());
	}

	@Test
	@DisplayName("Record 4127: City is Omaha")
	void CityOfRecord4127() {
		assertEquals("Omaha", customers.get(4126).getCity());
	}

	@Test
	@DisplayName("Record 4127: County is Douglas")
	void CountyOfRecord4127() {
		assertEquals("Douglas", customers.get(4126).getCounty());
	}

	@Test
	@DisplayName("Record 4127: State is NE")
	void StateOfRecord4127() {
		assertEquals("NE", customers.get(4126).getState());
	}

	@Test
	@DisplayName("Record 4127: ZIP is 68134")
	void ZIPOfRecord4127() {
		assertEquals("68134", customers.get(4126).getZIP());
	}

	@Test
	@DisplayName("Record 4127: Phone is 402-391-7577")
	void PhoneOfRecord4127() {
		assertEquals("402-391-7577", customers.get(4126).getPhone());
	}

	@Test
	@DisplayName("Record 4127: Fax is 402-391-8946")
	void FaxOfRecord4127() {
		assertEquals("402-391-8946", customers.get(4126).getFax());
	}

	@Test
	@DisplayName("Record 4127: Email is marcy@hullum.com")
	void EmailOfRecord4127() {
		assertEquals("marcy@hullum.com", customers.get(4126).getEmail());
	}

	@Test
	@DisplayName("Record 4127: Web is http://www.marcyhullum.com")
	void WebOfRecord4127() {
		assertEquals("http://www.marcyhullum.com", customers.get(4126).getWeb());
	}
}
