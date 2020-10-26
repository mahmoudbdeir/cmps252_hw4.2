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
class Record_489 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 489: FirstName is Fletcher")
	void FirstNameOfRecord489() {
		assertEquals("Fletcher", customers.get(488).getFirstName());
	}

	@Test
	@DisplayName("Record 489: LastName is Kampmann")
	void LastNameOfRecord489() {
		assertEquals("Kampmann", customers.get(488).getLastName());
	}

	@Test
	@DisplayName("Record 489: Company is Mail Boxes Etc")
	void CompanyOfRecord489() {
		assertEquals("Mail Boxes Etc", customers.get(488).getCompany());
	}

	@Test
	@DisplayName("Record 489: Address is 550 S Hill St  #-660")
	void AddressOfRecord489() {
		assertEquals("550 S Hill St  #-660", customers.get(488).getAddress());
	}

	@Test
	@DisplayName("Record 489: City is Los Angeles")
	void CityOfRecord489() {
		assertEquals("Los Angeles", customers.get(488).getCity());
	}

	@Test
	@DisplayName("Record 489: County is Los Angeles")
	void CountyOfRecord489() {
		assertEquals("Los Angeles", customers.get(488).getCounty());
	}

	@Test
	@DisplayName("Record 489: State is CA")
	void StateOfRecord489() {
		assertEquals("CA", customers.get(488).getState());
	}

	@Test
	@DisplayName("Record 489: ZIP is 90013")
	void ZIPOfRecord489() {
		assertEquals("90013", customers.get(488).getZIP());
	}

	@Test
	@DisplayName("Record 489: Phone is 213-627-1316")
	void PhoneOfRecord489() {
		assertEquals("213-627-1316", customers.get(488).getPhone());
	}

	@Test
	@DisplayName("Record 489: Fax is 213-627-4599")
	void FaxOfRecord489() {
		assertEquals("213-627-4599", customers.get(488).getFax());
	}

	@Test
	@DisplayName("Record 489: Email is fletcher@kampmann.com")
	void EmailOfRecord489() {
		assertEquals("fletcher@kampmann.com", customers.get(488).getEmail());
	}

	@Test
	@DisplayName("Record 489: Web is http://www.fletcherkampmann.com")
	void WebOfRecord489() {
		assertEquals("http://www.fletcherkampmann.com", customers.get(488).getWeb());
	}
}
