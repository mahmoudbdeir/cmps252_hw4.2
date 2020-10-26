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
class Record_2812 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2812: FirstName is Quinn")
	void FirstNameOfRecord2812() {
		assertEquals("Quinn", customers.get(2811).getFirstName());
	}

	@Test
	@DisplayName("Record 2812: LastName is Fryler")
	void LastNameOfRecord2812() {
		assertEquals("Fryler", customers.get(2811).getLastName());
	}

	@Test
	@DisplayName("Record 2812: Company is Heating & Cooling Wholesalers")
	void CompanyOfRecord2812() {
		assertEquals("Heating & Cooling Wholesalers", customers.get(2811).getCompany());
	}

	@Test
	@DisplayName("Record 2812: Address is 3318 Ne Wasco St")
	void AddressOfRecord2812() {
		assertEquals("3318 Ne Wasco St", customers.get(2811).getAddress());
	}

	@Test
	@DisplayName("Record 2812: City is Portland")
	void CityOfRecord2812() {
		assertEquals("Portland", customers.get(2811).getCity());
	}

	@Test
	@DisplayName("Record 2812: County is Multnomah")
	void CountyOfRecord2812() {
		assertEquals("Multnomah", customers.get(2811).getCounty());
	}

	@Test
	@DisplayName("Record 2812: State is OR")
	void StateOfRecord2812() {
		assertEquals("OR", customers.get(2811).getState());
	}

	@Test
	@DisplayName("Record 2812: ZIP is 97232")
	void ZIPOfRecord2812() {
		assertEquals("97232", customers.get(2811).getZIP());
	}

	@Test
	@DisplayName("Record 2812: Phone is 503-236-7195")
	void PhoneOfRecord2812() {
		assertEquals("503-236-7195", customers.get(2811).getPhone());
	}

	@Test
	@DisplayName("Record 2812: Fax is 503-236-7004")
	void FaxOfRecord2812() {
		assertEquals("503-236-7004", customers.get(2811).getFax());
	}

	@Test
	@DisplayName("Record 2812: Email is quinn@fryler.com")
	void EmailOfRecord2812() {
		assertEquals("quinn@fryler.com", customers.get(2811).getEmail());
	}

	@Test
	@DisplayName("Record 2812: Web is http://www.quinnfryler.com")
	void WebOfRecord2812() {
		assertEquals("http://www.quinnfryler.com", customers.get(2811).getWeb());
	}
}
