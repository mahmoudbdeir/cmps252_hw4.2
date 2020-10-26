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

@Tag("9")
class Record_1251 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1251: FirstName is Kate")
	void FirstNameOfRecord1251() {
		assertEquals("Kate", customers.get(1250).getFirstName());
	}

	@Test
	@DisplayName("Record 1251: LastName is Hastedt")
	void LastNameOfRecord1251() {
		assertEquals("Hastedt", customers.get(1250).getLastName());
	}

	@Test
	@DisplayName("Record 1251: Company is Tate, David L Esq")
	void CompanyOfRecord1251() {
		assertEquals("Tate, David L Esq", customers.get(1250).getCompany());
	}

	@Test
	@DisplayName("Record 1251: Address is Carrboro Plaza Hwy 54")
	void AddressOfRecord1251() {
		assertEquals("Carrboro Plaza Hwy 54", customers.get(1250).getAddress());
	}

	@Test
	@DisplayName("Record 1251: City is Chapel Hill")
	void CityOfRecord1251() {
		assertEquals("Chapel Hill", customers.get(1250).getCity());
	}

	@Test
	@DisplayName("Record 1251: County is Orange")
	void CountyOfRecord1251() {
		assertEquals("Orange", customers.get(1250).getCounty());
	}

	@Test
	@DisplayName("Record 1251: State is NC")
	void StateOfRecord1251() {
		assertEquals("NC", customers.get(1250).getState());
	}

	@Test
	@DisplayName("Record 1251: ZIP is 27514")
	void ZIPOfRecord1251() {
		assertEquals("27514", customers.get(1250).getZIP());
	}

	@Test
	@DisplayName("Record 1251: Phone is 919-933-7213")
	void PhoneOfRecord1251() {
		assertEquals("919-933-7213", customers.get(1250).getPhone());
	}

	@Test
	@DisplayName("Record 1251: Fax is 919-933-2392")
	void FaxOfRecord1251() {
		assertEquals("919-933-2392", customers.get(1250).getFax());
	}

	@Test
	@DisplayName("Record 1251: Email is kate@hastedt.com")
	void EmailOfRecord1251() {
		assertEquals("kate@hastedt.com", customers.get(1250).getEmail());
	}

	@Test
	@DisplayName("Record 1251: Web is http://www.katehastedt.com")
	void WebOfRecord1251() {
		assertEquals("http://www.katehastedt.com", customers.get(1250).getWeb());
	}
}
