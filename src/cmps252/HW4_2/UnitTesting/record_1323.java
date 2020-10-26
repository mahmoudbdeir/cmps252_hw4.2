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

@Tag("16")
class Record_1323 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1323: FirstName is Therese")
	void FirstNameOfRecord1323() {
		assertEquals("Therese", customers.get(1322).getFirstName());
	}

	@Test
	@DisplayName("Record 1323: LastName is Warholic")
	void LastNameOfRecord1323() {
		assertEquals("Warholic", customers.get(1322).getLastName());
	}

	@Test
	@DisplayName("Record 1323: Company is Utter Company Inc")
	void CompanyOfRecord1323() {
		assertEquals("Utter Company Inc", customers.get(1322).getCompany());
	}

	@Test
	@DisplayName("Record 1323: Address is 1214 West Ave")
	void AddressOfRecord1323() {
		assertEquals("1214 West Ave", customers.get(1322).getAddress());
	}

	@Test
	@DisplayName("Record 1323: City is Ocean City")
	void CityOfRecord1323() {
		assertEquals("Ocean City", customers.get(1322).getCity());
	}

	@Test
	@DisplayName("Record 1323: County is Cape May")
	void CountyOfRecord1323() {
		assertEquals("Cape May", customers.get(1322).getCounty());
	}

	@Test
	@DisplayName("Record 1323: State is NJ")
	void StateOfRecord1323() {
		assertEquals("NJ", customers.get(1322).getState());
	}

	@Test
	@DisplayName("Record 1323: ZIP is 8226")
	void ZIPOfRecord1323() {
		assertEquals("8226", customers.get(1322).getZIP());
	}

	@Test
	@DisplayName("Record 1323: Phone is 609-399-2600")
	void PhoneOfRecord1323() {
		assertEquals("609-399-2600", customers.get(1322).getPhone());
	}

	@Test
	@DisplayName("Record 1323: Fax is 609-399-8843")
	void FaxOfRecord1323() {
		assertEquals("609-399-8843", customers.get(1322).getFax());
	}

	@Test
	@DisplayName("Record 1323: Email is therese@warholic.com")
	void EmailOfRecord1323() {
		assertEquals("therese@warholic.com", customers.get(1322).getEmail());
	}

	@Test
	@DisplayName("Record 1323: Web is http://www.theresewarholic.com")
	void WebOfRecord1323() {
		assertEquals("http://www.theresewarholic.com", customers.get(1322).getWeb());
	}
}
