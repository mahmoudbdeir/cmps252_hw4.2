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

@Tag("34")
class Record_3688 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3688: FirstName is Frits")
	void FirstNameOfRecord3688() {
		assertEquals("Frits", customers.get(3687).getFirstName());
	}

	@Test
	@DisplayName("Record 3688: LastName is Hogue")
	void LastNameOfRecord3688() {
		assertEquals("Hogue", customers.get(3687).getLastName());
	}

	@Test
	@DisplayName("Record 3688: Company is Sci Tech Glass Blowing Co")
	void CompanyOfRecord3688() {
		assertEquals("Sci Tech Glass Blowing Co", customers.get(3687).getCompany());
	}

	@Test
	@DisplayName("Record 3688: Address is 441 S Robson  #-108")
	void AddressOfRecord3688() {
		assertEquals("441 S Robson  #-108", customers.get(3687).getAddress());
	}

	@Test
	@DisplayName("Record 3688: City is Mesa")
	void CityOfRecord3688() {
		assertEquals("Mesa", customers.get(3687).getCity());
	}

	@Test
	@DisplayName("Record 3688: County is Maricopa")
	void CountyOfRecord3688() {
		assertEquals("Maricopa", customers.get(3687).getCounty());
	}

	@Test
	@DisplayName("Record 3688: State is AZ")
	void StateOfRecord3688() {
		assertEquals("AZ", customers.get(3687).getState());
	}

	@Test
	@DisplayName("Record 3688: ZIP is 85210")
	void ZIPOfRecord3688() {
		assertEquals("85210", customers.get(3687).getZIP());
	}

	@Test
	@DisplayName("Record 3688: Phone is 480-964-5450")
	void PhoneOfRecord3688() {
		assertEquals("480-964-5450", customers.get(3687).getPhone());
	}

	@Test
	@DisplayName("Record 3688: Fax is 480-964-5254")
	void FaxOfRecord3688() {
		assertEquals("480-964-5254", customers.get(3687).getFax());
	}

	@Test
	@DisplayName("Record 3688: Email is frits@hogue.com")
	void EmailOfRecord3688() {
		assertEquals("frits@hogue.com", customers.get(3687).getEmail());
	}

	@Test
	@DisplayName("Record 3688: Web is http://www.fritshogue.com")
	void WebOfRecord3688() {
		assertEquals("http://www.fritshogue.com", customers.get(3687).getWeb());
	}
}
