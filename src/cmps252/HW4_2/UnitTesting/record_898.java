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
class Record_898 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 898: FirstName is Latisha")
	void FirstNameOfRecord898() {
		assertEquals("Latisha", customers.get(897).getFirstName());
	}

	@Test
	@DisplayName("Record 898: LastName is Reynolds")
	void LastNameOfRecord898() {
		assertEquals("Reynolds", customers.get(897).getLastName());
	}

	@Test
	@DisplayName("Record 898: Company is Pembroke Construction Co Inc")
	void CompanyOfRecord898() {
		assertEquals("Pembroke Construction Co Inc", customers.get(897).getCompany());
	}

	@Test
	@DisplayName("Record 898: Address is 401 E Northern Lights Blvd")
	void AddressOfRecord898() {
		assertEquals("401 E Northern Lights Blvd", customers.get(897).getAddress());
	}

	@Test
	@DisplayName("Record 898: City is Anchorage")
	void CityOfRecord898() {
		assertEquals("Anchorage", customers.get(897).getCity());
	}

	@Test
	@DisplayName("Record 898: County is Anchorage")
	void CountyOfRecord898() {
		assertEquals("Anchorage", customers.get(897).getCounty());
	}

	@Test
	@DisplayName("Record 898: State is AK")
	void StateOfRecord898() {
		assertEquals("AK", customers.get(897).getState());
	}

	@Test
	@DisplayName("Record 898: ZIP is 99503")
	void ZIPOfRecord898() {
		assertEquals("99503", customers.get(897).getZIP());
	}

	@Test
	@DisplayName("Record 898: Phone is 907-277-3416")
	void PhoneOfRecord898() {
		assertEquals("907-277-3416", customers.get(897).getPhone());
	}

	@Test
	@DisplayName("Record 898: Fax is 907-277-8751")
	void FaxOfRecord898() {
		assertEquals("907-277-8751", customers.get(897).getFax());
	}

	@Test
	@DisplayName("Record 898: Email is latisha@reynolds.com")
	void EmailOfRecord898() {
		assertEquals("latisha@reynolds.com", customers.get(897).getEmail());
	}

	@Test
	@DisplayName("Record 898: Web is http://www.latishareynolds.com")
	void WebOfRecord898() {
		assertEquals("http://www.latishareynolds.com", customers.get(897).getWeb());
	}
}
