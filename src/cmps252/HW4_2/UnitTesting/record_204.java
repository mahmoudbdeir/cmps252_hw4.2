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

@Tag("8")
class Record_204 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 204: FirstName is Rosalee")
	void FirstNameOfRecord204() {
		assertEquals("Rosalee", customers.get(203).getFirstName());
	}

	@Test
	@DisplayName("Record 204: LastName is Quealy")
	void LastNameOfRecord204() {
		assertEquals("Quealy", customers.get(203).getLastName());
	}

	@Test
	@DisplayName("Record 204: Company is Honeycutt, John B Jr")
	void CompanyOfRecord204() {
		assertEquals("Honeycutt, John B Jr", customers.get(203).getCompany());
	}

	@Test
	@DisplayName("Record 204: Address is 231 Sand Island Accesse")
	void AddressOfRecord204() {
		assertEquals("231 Sand Island Accesse", customers.get(203).getAddress());
	}

	@Test
	@DisplayName("Record 204: City is Honolulu")
	void CityOfRecord204() {
		assertEquals("Honolulu", customers.get(203).getCity());
	}

	@Test
	@DisplayName("Record 204: County is Honolulu")
	void CountyOfRecord204() {
		assertEquals("Honolulu", customers.get(203).getCounty());
	}

	@Test
	@DisplayName("Record 204: State is HI")
	void StateOfRecord204() {
		assertEquals("HI", customers.get(203).getState());
	}

	@Test
	@DisplayName("Record 204: ZIP is 96819")
	void ZIPOfRecord204() {
		assertEquals("96819", customers.get(203).getZIP());
	}

	@Test
	@DisplayName("Record 204: Phone is 808-842-8387")
	void PhoneOfRecord204() {
		assertEquals("808-842-8387", customers.get(203).getPhone());
	}

	@Test
	@DisplayName("Record 204: Fax is 808-842-3166")
	void FaxOfRecord204() {
		assertEquals("808-842-3166", customers.get(203).getFax());
	}

	@Test
	@DisplayName("Record 204: Email is rosalee@quealy.com")
	void EmailOfRecord204() {
		assertEquals("rosalee@quealy.com", customers.get(203).getEmail());
	}

	@Test
	@DisplayName("Record 204: Web is http://www.rosaleequealy.com")
	void WebOfRecord204() {
		assertEquals("http://www.rosaleequealy.com", customers.get(203).getWeb());
	}
}
