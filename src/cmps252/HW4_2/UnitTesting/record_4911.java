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

@Tag("1")
class Record_4911 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4911: FirstName is Rosario")
	void FirstNameOfRecord4911() {
		assertEquals("Rosario", customers.get(4910).getFirstName());
	}

	@Test
	@DisplayName("Record 4911: LastName is Bacman")
	void LastNameOfRecord4911() {
		assertEquals("Bacman", customers.get(4910).getLastName());
	}

	@Test
	@DisplayName("Record 4911: Company is Auld Sign Co")
	void CompanyOfRecord4911() {
		assertEquals("Auld Sign Co", customers.get(4910).getCompany());
	}

	@Test
	@DisplayName("Record 4911: Address is Se Financial")
	void AddressOfRecord4911() {
		assertEquals("Se Financial", customers.get(4910).getAddress());
	}

	@Test
	@DisplayName("Record 4911: City is Miami")
	void CityOfRecord4911() {
		assertEquals("Miami", customers.get(4910).getCity());
	}

	@Test
	@DisplayName("Record 4911: County is Miami-Dade")
	void CountyOfRecord4911() {
		assertEquals("Miami-Dade", customers.get(4910).getCounty());
	}

	@Test
	@DisplayName("Record 4911: State is FL")
	void StateOfRecord4911() {
		assertEquals("FL", customers.get(4910).getState());
	}

	@Test
	@DisplayName("Record 4911: ZIP is 33131")
	void ZIPOfRecord4911() {
		assertEquals("33131", customers.get(4910).getZIP());
	}

	@Test
	@DisplayName("Record 4911: Phone is 305-371-9313")
	void PhoneOfRecord4911() {
		assertEquals("305-371-9313", customers.get(4910).getPhone());
	}

	@Test
	@DisplayName("Record 4911: Fax is 305-371-9669")
	void FaxOfRecord4911() {
		assertEquals("305-371-9669", customers.get(4910).getFax());
	}

	@Test
	@DisplayName("Record 4911: Email is rosario@bacman.com")
	void EmailOfRecord4911() {
		assertEquals("rosario@bacman.com", customers.get(4910).getEmail());
	}

	@Test
	@DisplayName("Record 4911: Web is http://www.rosariobacman.com")
	void WebOfRecord4911() {
		assertEquals("http://www.rosariobacman.com", customers.get(4910).getWeb());
	}
}
