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

@Tag("31")
class Record_4513 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4513: FirstName is Evan")
	void FirstNameOfRecord4513() {
		assertEquals("Evan", customers.get(4512).getFirstName());
	}

	@Test
	@DisplayName("Record 4513: LastName is Funchess")
	void LastNameOfRecord4513() {
		assertEquals("Funchess", customers.get(4512).getLastName());
	}

	@Test
	@DisplayName("Record 4513: Company is Instacopy Printing")
	void CompanyOfRecord4513() {
		assertEquals("Instacopy Printing", customers.get(4512).getCompany());
	}

	@Test
	@DisplayName("Record 4513: Address is 28530 Reynolds St")
	void AddressOfRecord4513() {
		assertEquals("28530 Reynolds St", customers.get(4512).getAddress());
	}

	@Test
	@DisplayName("Record 4513: City is Inkster")
	void CityOfRecord4513() {
		assertEquals("Inkster", customers.get(4512).getCity());
	}

	@Test
	@DisplayName("Record 4513: County is Wayne")
	void CountyOfRecord4513() {
		assertEquals("Wayne", customers.get(4512).getCounty());
	}

	@Test
	@DisplayName("Record 4513: State is MI")
	void StateOfRecord4513() {
		assertEquals("MI", customers.get(4512).getState());
	}

	@Test
	@DisplayName("Record 4513: ZIP is 48141")
	void ZIPOfRecord4513() {
		assertEquals("48141", customers.get(4512).getZIP());
	}

	@Test
	@DisplayName("Record 4513: Phone is 313-728-5977")
	void PhoneOfRecord4513() {
		assertEquals("313-728-5977", customers.get(4512).getPhone());
	}

	@Test
	@DisplayName("Record 4513: Fax is 313-728-4779")
	void FaxOfRecord4513() {
		assertEquals("313-728-4779", customers.get(4512).getFax());
	}

	@Test
	@DisplayName("Record 4513: Email is evan@funchess.com")
	void EmailOfRecord4513() {
		assertEquals("evan@funchess.com", customers.get(4512).getEmail());
	}

	@Test
	@DisplayName("Record 4513: Web is http://www.evanfunchess.com")
	void WebOfRecord4513() {
		assertEquals("http://www.evanfunchess.com", customers.get(4512).getWeb());
	}
}
