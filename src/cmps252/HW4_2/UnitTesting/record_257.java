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

@Tag("0")
class Record_257 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 257: FirstName is Fran")
	void FirstNameOfRecord257() {
		assertEquals("Fran", customers.get(256).getFirstName());
	}

	@Test
	@DisplayName("Record 257: LastName is Sygle")
	void LastNameOfRecord257() {
		assertEquals("Sygle", customers.get(256).getLastName());
	}

	@Test
	@DisplayName("Record 257: Company is Travelodge")
	void CompanyOfRecord257() {
		assertEquals("Travelodge", customers.get(256).getCompany());
	}

	@Test
	@DisplayName("Record 257: Address is 135 Gay St")
	void AddressOfRecord257() {
		assertEquals("135 Gay St", customers.get(256).getAddress());
	}

	@Test
	@DisplayName("Record 257: City is Longmont")
	void CityOfRecord257() {
		assertEquals("Longmont", customers.get(256).getCity());
	}

	@Test
	@DisplayName("Record 257: County is Boulder")
	void CountyOfRecord257() {
		assertEquals("Boulder", customers.get(256).getCounty());
	}

	@Test
	@DisplayName("Record 257: State is CO")
	void StateOfRecord257() {
		assertEquals("CO", customers.get(256).getState());
	}

	@Test
	@DisplayName("Record 257: ZIP is 80501")
	void ZIPOfRecord257() {
		assertEquals("80501", customers.get(256).getZIP());
	}

	@Test
	@DisplayName("Record 257: Phone is 303-442-2573")
	void PhoneOfRecord257() {
		assertEquals("303-442-2573", customers.get(256).getPhone());
	}

	@Test
	@DisplayName("Record 257: Fax is 303-442-2196")
	void FaxOfRecord257() {
		assertEquals("303-442-2196", customers.get(256).getFax());
	}

	@Test
	@DisplayName("Record 257: Email is fran@sygle.com")
	void EmailOfRecord257() {
		assertEquals("fran@sygle.com", customers.get(256).getEmail());
	}

	@Test
	@DisplayName("Record 257: Web is http://www.fransygle.com")
	void WebOfRecord257() {
		assertEquals("http://www.fransygle.com", customers.get(256).getWeb());
	}
}
