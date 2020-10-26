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

@Tag("23")
class Record_25 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 25: FirstName is Cortez")
	void FirstNameOfRecord25() {
		assertEquals("Cortez", customers.get(24).getFirstName());
	}

	@Test
	@DisplayName("Record 25: LastName is Blanks")
	void LastNameOfRecord25() {
		assertEquals("Blanks", customers.get(24).getLastName());
	}

	@Test
	@DisplayName("Record 25: Company is Hunter, Richard S Jr")
	void CompanyOfRecord25() {
		assertEquals("Hunter, Richard S Jr", customers.get(24).getCompany());
	}

	@Test
	@DisplayName("Record 25: Address is Tidland Rd")
	void AddressOfRecord25() {
		assertEquals("Tidland Rd", customers.get(24).getAddress());
	}

	@Test
	@DisplayName("Record 25: City is Oak Ridge")
	void CityOfRecord25() {
		assertEquals("Oak Ridge", customers.get(24).getCity());
	}

	@Test
	@DisplayName("Record 25: County is Passaic")
	void CountyOfRecord25() {
		assertEquals("Passaic", customers.get(24).getCounty());
	}

	@Test
	@DisplayName("Record 25: State is NJ")
	void StateOfRecord25() {
		assertEquals("NJ", customers.get(24).getState());
	}

	@Test
	@DisplayName("Record 25: ZIP is 7438")
	void ZIPOfRecord25() {
		assertEquals("7438", customers.get(24).getZIP());
	}

	@Test
	@DisplayName("Record 25: Phone is 973-208-1039")
	void PhoneOfRecord25() {
		assertEquals("973-208-1039", customers.get(24).getPhone());
	}

	@Test
	@DisplayName("Record 25: Fax is 973-208-3551")
	void FaxOfRecord25() {
		assertEquals("973-208-3551", customers.get(24).getFax());
	}

	@Test
	@DisplayName("Record 25: Email is cortez@blanks.com")
	void EmailOfRecord25() {
		assertEquals("cortez@blanks.com", customers.get(24).getEmail());
	}

	@Test
	@DisplayName("Record 25: Web is http://www.cortezblanks.com")
	void WebOfRecord25() {
		assertEquals("http://www.cortezblanks.com", customers.get(24).getWeb());
	}
}
