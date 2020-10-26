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

@Tag("26")
class Record_220 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 220: FirstName is Raymond")
	void FirstNameOfRecord220() {
		assertEquals("Raymond", customers.get(219).getFirstName());
	}

	@Test
	@DisplayName("Record 220: LastName is Kleeman")
	void LastNameOfRecord220() {
		assertEquals("Kleeman", customers.get(219).getLastName());
	}

	@Test
	@DisplayName("Record 220: Company is Tompkins Printing Equipment Co")
	void CompanyOfRecord220() {
		assertEquals("Tompkins Printing Equipment Co", customers.get(219).getCompany());
	}

	@Test
	@DisplayName("Record 220: Address is 122 W Pioneer Dr")
	void AddressOfRecord220() {
		assertEquals("122 W Pioneer Dr", customers.get(219).getAddress());
	}

	@Test
	@DisplayName("Record 220: City is Irving")
	void CityOfRecord220() {
		assertEquals("Irving", customers.get(219).getCity());
	}

	@Test
	@DisplayName("Record 220: County is Dallas")
	void CountyOfRecord220() {
		assertEquals("Dallas", customers.get(219).getCounty());
	}

	@Test
	@DisplayName("Record 220: State is TX")
	void StateOfRecord220() {
		assertEquals("TX", customers.get(219).getState());
	}

	@Test
	@DisplayName("Record 220: ZIP is 75061")
	void ZIPOfRecord220() {
		assertEquals("75061", customers.get(219).getZIP());
	}

	@Test
	@DisplayName("Record 220: Phone is 972-254-4274")
	void PhoneOfRecord220() {
		assertEquals("972-254-4274", customers.get(219).getPhone());
	}

	@Test
	@DisplayName("Record 220: Fax is 972-254-5667")
	void FaxOfRecord220() {
		assertEquals("972-254-5667", customers.get(219).getFax());
	}

	@Test
	@DisplayName("Record 220: Email is raymond@kleeman.com")
	void EmailOfRecord220() {
		assertEquals("raymond@kleeman.com", customers.get(219).getEmail());
	}

	@Test
	@DisplayName("Record 220: Web is http://www.raymondkleeman.com")
	void WebOfRecord220() {
		assertEquals("http://www.raymondkleeman.com", customers.get(219).getWeb());
	}
}
