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

@Tag("10")
class Record_247 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 247: FirstName is Sung")
	void FirstNameOfRecord247() {
		assertEquals("Sung", customers.get(246).getFirstName());
	}

	@Test
	@DisplayName("Record 247: LastName is Theel")
	void LastNameOfRecord247() {
		assertEquals("Theel", customers.get(246).getLastName());
	}

	@Test
	@DisplayName("Record 247: Company is Taral Plastic Container Co")
	void CompanyOfRecord247() {
		assertEquals("Taral Plastic Container Co", customers.get(246).getCompany());
	}

	@Test
	@DisplayName("Record 247: Address is 135 Gay St")
	void AddressOfRecord247() {
		assertEquals("135 Gay St", customers.get(246).getAddress());
	}

	@Test
	@DisplayName("Record 247: City is Longmont")
	void CityOfRecord247() {
		assertEquals("Longmont", customers.get(246).getCity());
	}

	@Test
	@DisplayName("Record 247: County is Boulder")
	void CountyOfRecord247() {
		assertEquals("Boulder", customers.get(246).getCounty());
	}

	@Test
	@DisplayName("Record 247: State is CO")
	void StateOfRecord247() {
		assertEquals("CO", customers.get(246).getState());
	}

	@Test
	@DisplayName("Record 247: ZIP is 80501")
	void ZIPOfRecord247() {
		assertEquals("80501", customers.get(246).getZIP());
	}

	@Test
	@DisplayName("Record 247: Phone is 303-442-3448")
	void PhoneOfRecord247() {
		assertEquals("303-442-3448", customers.get(246).getPhone());
	}

	@Test
	@DisplayName("Record 247: Fax is 303-442-0872")
	void FaxOfRecord247() {
		assertEquals("303-442-0872", customers.get(246).getFax());
	}

	@Test
	@DisplayName("Record 247: Email is sung@theel.com")
	void EmailOfRecord247() {
		assertEquals("sung@theel.com", customers.get(246).getEmail());
	}

	@Test
	@DisplayName("Record 247: Web is http://www.sungtheel.com")
	void WebOfRecord247() {
		assertEquals("http://www.sungtheel.com", customers.get(246).getWeb());
	}
}
