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

@Tag("40")
class Record_589 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 589: FirstName is Elisa")
	void FirstNameOfRecord589() {
		assertEquals("Elisa", customers.get(588).getFirstName());
	}

	@Test
	@DisplayName("Record 589: LastName is Jacinto")
	void LastNameOfRecord589() {
		assertEquals("Jacinto", customers.get(588).getLastName());
	}

	@Test
	@DisplayName("Record 589: Company is Horizon Supply")
	void CompanyOfRecord589() {
		assertEquals("Horizon Supply", customers.get(588).getCompany());
	}

	@Test
	@DisplayName("Record 589: Address is Box #-31173")
	void AddressOfRecord589() {
		assertEquals("Box #-31173", customers.get(588).getAddress());
	}

	@Test
	@DisplayName("Record 589: City is Walnut Creek")
	void CityOfRecord589() {
		assertEquals("Walnut Creek", customers.get(588).getCity());
	}

	@Test
	@DisplayName("Record 589: County is Contra Costa")
	void CountyOfRecord589() {
		assertEquals("Contra Costa", customers.get(588).getCounty());
	}

	@Test
	@DisplayName("Record 589: State is CA")
	void StateOfRecord589() {
		assertEquals("CA", customers.get(588).getState());
	}

	@Test
	@DisplayName("Record 589: ZIP is 94598")
	void ZIPOfRecord589() {
		assertEquals("94598", customers.get(588).getZIP());
	}

	@Test
	@DisplayName("Record 589: Phone is 925-934-7104")
	void PhoneOfRecord589() {
		assertEquals("925-934-7104", customers.get(588).getPhone());
	}

	@Test
	@DisplayName("Record 589: Fax is 925-934-0943")
	void FaxOfRecord589() {
		assertEquals("925-934-0943", customers.get(588).getFax());
	}

	@Test
	@DisplayName("Record 589: Email is elisa@jacinto.com")
	void EmailOfRecord589() {
		assertEquals("elisa@jacinto.com", customers.get(588).getEmail());
	}

	@Test
	@DisplayName("Record 589: Web is http://www.elisajacinto.com")
	void WebOfRecord589() {
		assertEquals("http://www.elisajacinto.com", customers.get(588).getWeb());
	}
}
