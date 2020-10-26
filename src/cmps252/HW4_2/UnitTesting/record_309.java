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
class Record_309 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 309: FirstName is Jana")
	void FirstNameOfRecord309() {
		assertEquals("Jana", customers.get(308).getFirstName());
	}

	@Test
	@DisplayName("Record 309: LastName is Thorsen")
	void LastNameOfRecord309() {
		assertEquals("Thorsen", customers.get(308).getLastName());
	}

	@Test
	@DisplayName("Record 309: Company is Cameron Street Signs")
	void CompanyOfRecord309() {
		assertEquals("Cameron Street Signs", customers.get(308).getCompany());
	}

	@Test
	@DisplayName("Record 309: Address is 13970 Sw 72nd Ave")
	void AddressOfRecord309() {
		assertEquals("13970 Sw 72nd Ave", customers.get(308).getAddress());
	}

	@Test
	@DisplayName("Record 309: City is Portland")
	void CityOfRecord309() {
		assertEquals("Portland", customers.get(308).getCity());
	}

	@Test
	@DisplayName("Record 309: County is Washington")
	void CountyOfRecord309() {
		assertEquals("Washington", customers.get(308).getCounty());
	}

	@Test
	@DisplayName("Record 309: State is OR")
	void StateOfRecord309() {
		assertEquals("OR", customers.get(308).getState());
	}

	@Test
	@DisplayName("Record 309: ZIP is 97223")
	void ZIPOfRecord309() {
		assertEquals("97223", customers.get(308).getZIP());
	}

	@Test
	@DisplayName("Record 309: Phone is 503-233-8776")
	void PhoneOfRecord309() {
		assertEquals("503-233-8776", customers.get(308).getPhone());
	}

	@Test
	@DisplayName("Record 309: Fax is 503-233-9071")
	void FaxOfRecord309() {
		assertEquals("503-233-9071", customers.get(308).getFax());
	}

	@Test
	@DisplayName("Record 309: Email is jana@thorsen.com")
	void EmailOfRecord309() {
		assertEquals("jana@thorsen.com", customers.get(308).getEmail());
	}

	@Test
	@DisplayName("Record 309: Web is http://www.janathorsen.com")
	void WebOfRecord309() {
		assertEquals("http://www.janathorsen.com", customers.get(308).getWeb());
	}
}
